package sk.marek.learn2code;

public class Switch {
    public static void main(String[] args) {

        Day den = Day.PONDELOK;
        switch (den){
            case PONDELOK:
                System.out.println("Pondelok"); break;
            case UTOROK :
                System.out.println("Utorok"); break;
            case STREDA:
                System.out.println("Streda"); break;
            case STVRTOK:
                System.out.println("Stvrtok"); break;
            case PIATOK:
                System.out.println("Piatok"); break;
            default:
                System.out.println("ziadny den nevyhovuje");
            break;
        }

        for (int i = 1; i <= 9; i++){
            switch (i){
                case 1:
                    System.out.println("Pondelok"); break;
                case 2 :
                    System.out.println("Utorok"); break;
                case 3:
                    System.out.println("Streda"); break;
                case 4:
                    System.out.println("Stvrtok"); break;
                case 5:
                    System.out.println("Piatok"); break;
                case 6:
                case 7:
                    System.out.println("Vikend"); break;
                default:
                    System.out.println("tyyden ma len 7 dni");
                    break;
            }
        }

    }

enum Day{
        PONDELOK, UTOROK, STREDA, STVRTOK, PIATOK;
}

}
