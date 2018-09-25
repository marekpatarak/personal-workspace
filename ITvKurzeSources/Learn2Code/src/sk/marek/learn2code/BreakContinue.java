package sk.marek.learn2code;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i =0; i < 10; i++){
            if (i==5) {
                System.out.println("break");
                break;
            }
            System.out.println(i);
        }
//break ukoncuje cely cyklus

        System.out.println("\n//////////////////////////");

        for (int i = 0; i < 10; i++) {
            if (i==5) {
                System.out.println("continue");
                continue;
            }
            System.out.println(i);
            System.out.println("whatever");
//continue ukoncuje jedno kolo cyklu
        }
        navestie:
        for (int i =0; i < 10; i++){
            if (i==5) {
                System.out.println("break");
                break navestie;
            }
            System.out.println(i);
        }

        navestie2:
        for (int i=0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j==1) {
                    System.out.println("continue");
                    continue  navestie2;
                }
                System.out.println("j " +j);
            }
            System.out.println("i " +i);
        }
    }
}
