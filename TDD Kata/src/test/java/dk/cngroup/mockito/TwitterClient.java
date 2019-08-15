package dk.cngroup.mockito;

public class TwitterClient {

  public  void sendTweet(ITweet tweet) {
    String message = tweet.getMessage();
  }

}
