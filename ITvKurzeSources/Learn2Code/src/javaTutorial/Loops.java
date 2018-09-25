package javaTutorial;

public class Loops {

    public static void main(String args[]) {
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            System.out.print( x );
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names = {"James", "Larry", "Tom", "Lacy"};

        for( String name : names ) {
            System.out.print( name );
            System.out.print(",");
        }

        System.out.println();
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

