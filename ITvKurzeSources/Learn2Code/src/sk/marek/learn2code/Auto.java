package sk.marek.learn2code;

class Auto {
    static int pocetAut = 0;
    String znacka;
    String farba;

    public Auto() {
        pocetAut++;
    }

    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.znacka = "ford";
        auto.farba = "cervena";

        Auto auto2 = new Auto();
        Auto auto3 = new Auto();

        System.out.println(Auto.pocetAut);

        auto.startuj();
    }

    int startuj(){
        int cislo = 0;
        System.out.println("startuj int");
        return cislo;
    }

    void startuj2(){
        System.out.println("startuj void");
    }
}
