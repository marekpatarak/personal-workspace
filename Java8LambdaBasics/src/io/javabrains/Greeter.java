package io.javabrains;

public class Greeter {

  public void greet(Greeting greeting) {
    greeting.perform();
  }

  public static void main(String[] args){
    Greeter greeter = new Greeter();
    HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
    Greeting myLambdaFunction = () -> System.out.println("Hello lambda");

    Greeting innerClassGreeting = new Greeting() {
      @Override
      public void perform() {
        System.out.println("Hello inner world");
      }
    };

    greeter.greet(helloWorldGreeting);
    greeter.greet(myLambdaFunction);

    helloWorldGreeting.perform();
    myLambdaFunction.perform();

    innerClassGreeting.perform();
    greeter.greet(innerClassGreeting);

  }
}
