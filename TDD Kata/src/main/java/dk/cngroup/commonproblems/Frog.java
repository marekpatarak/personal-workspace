package dk.cngroup.commonproblems;

class TestFrog {
    private static int frogCount;
    static int getCount() {
        return frogCount;
    }

    public TestFrog(){
        frogCount += 1;
        System.out.println("new testfrog");

    }
}
public class Frog extends TestFrog {

    Frog () {
        System.out.println("new frog");
    }
    public static void main(String[] args) {
        new TestFrog();
        new TestFrog();
        new TestFrog();
        System.out.println("from static" + TestFrog.getCount());

        new TestFrog();

        new Frog().go();
        TestFrog frog = new TestFrog();
        System.out.println("use var ref " + frog.getCount());

        TestFrog f = new TestFrog();

//        Frog fr = (Frog) f;

        TestFrog tt = new Frog();

        Frog af = (Frog)tt;
        tt = new TestFrog();
//        af = (Frog)tt;

    }

    void go(){
        System.out.println("from instance" + TestFrog.getCount());

    }
}
