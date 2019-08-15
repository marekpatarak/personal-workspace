package dk.cngroup.commonproblems;

import java.util.Arrays;

public class CommonProblems {


  public static void main(String[] args) {

    CommonProblems cp = new CommonProblems();
    cp.fibonaci100();
  }

  public int sumForLoop (int [] input) {
    int sum = 0;
    for (int i = 0; i < input.length; i++) {
      sum += input[i];
    }
    return sum;
  }

  public int sumWhileLoop (int [] input) {
    int sum = 0;
    int inpLen = 0;

    while (inpLen < input.length) {
        sum += input[inpLen];
        inpLen++;
      }

      return sum;
  }

  public int sumRecursion (int [] input) {

    int sum = 0;
    if (input.length == 0) return sum;
    int[] subAr = Arrays.copyOfRange(input,0,input.length);

    while (subAr.length>0) {
      sum+=subAr[0];
      subAr = Arrays.copyOfRange(subAr,1,subAr.length);
    }

    return sum;
  }

  public char[] combineLists(char[] inp1, char[] inp2) {
    char[] pole = new char[inp1.length + inp2.length];

    for (int i = 0; i <= inp1.length - 1; i++) {

        pole[i*2] = inp1[i];
        pole[(i*2) + 1] = inp2[i];

    }
      return pole;
  }

    public void fibonaci100() {
      double elem1 = 0;
      double elem2 = 1;
      double sum = elem1 + elem2;

      System.out.println(elem1 +" ");
      System.out.println(elem2 + " ");
      System.out.println(sum + " ");

      for (int i = 1; i <= 97; i++) {
          elem1 = sum;
          sum = sum + elem2;
          elem2 = elem1;

          System.out.println(sum + " ");

      }

    }

  }









