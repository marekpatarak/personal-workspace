package dk.cngroup.mockito;

import java.util.LinkedList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.*;

public class TwitterClientTest {


  @Test
  public void testSendingTweet() {
    TwitterClient twClient = new TwitterClient();
    ITweet iTweet = mock(ITweet.class);

    when(iTweet.getMessage()).thenReturn("Using Mockito is great");

    twClient.sendTweet(iTweet);


    verify(iTweet, atLeastOnce()).getMessage();

  }
  @Test
  public void testLinkedListSpyCorrect() {
    // Lets mock a LinkedList
    List<String> list = new LinkedList<>();
    List<String> spy = spy(list);

    // You have to use doReturn() for stubbing
    doReturn("foo").when(spy).get(0);
    doReturn("daco").when(spy).get(1);

    assertEquals("foo", spy.get(0));
    assertEquals("daco", spy.get(1));
  }
}
