package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class TopicService {

  @Autowired
  private TopicRepository topicRepository;

  public List<Topic> getAllTopics() {

    return (List<Topic>)topicRepository.findAll();
  }

  public Topic getTopic(String id) {
    return topicRepository.findOne(id);
  }

  public void createTopic(Topic topic) {
    topicRepository.save(topic);
  }

  public void updateTopic(Topic topic, String id) {
    topicRepository.save(topic);

  }

  public void deleteTopic (String id) {
    topicRepository.delete(id);
  }

}
