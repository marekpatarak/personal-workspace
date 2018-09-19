package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class TopicService {

  private static List<Topic> topics;
  static {
    topics = new ArrayList<>();
    topics.add(new Topic("1","topic1" ,"description1"));
    topics.add(new Topic("2","topic2" ,"description2"));
    topics.add(new Topic("3","topic3" ,"description3"));}

  public List<Topic> getAllTopics() {
    return topics;
  }

  public Topic getTopic(String id) {
    return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
  }

  public void createTopic(String id, String name, String description) {
    topics.add(new Topic(id,name,description));
  }

  public void updateTopic(Topic topic, String id) {
    for (int i =0; i<topics.size(); i++) {
      Topic t = topics.get(i);

      if(t.getId().equals(id)) {
        t.setId(topic.getId());
        t.setDescription(topic.getDescription());
        t.setName(topic.getName());
      }
    }

  }

  public void deleteTopic (String id) {
    topics.removeIf(t -> t.getId().equals(id));
  }

}
