package io.javabrains;

public class TypeInferenceExample {
  public static void main(String[] args) {
    //dont need to specify type, not even () if only one argument
    StringLengthLambda lambda = s -> s.length();
    System.out.println(lambda.getLength("Hello lambda"));
  }

  interface StringLengthLambda {
    int getLength(String s);
  }


}
