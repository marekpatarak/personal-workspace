package sk.marek.learn2code;

public class DoWhileFor {
    public static void main(String[] args) {

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        int j = 0;
        do {
            System.out.println(j);
            j++;
        }while(j <= 10);

        for (int g=0;g<10;g++){
            System.out.println(g);
        }
    }
}
