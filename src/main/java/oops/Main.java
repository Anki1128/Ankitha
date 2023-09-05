package oops;


public class Main extends Child {
    private int numberProtected;
    private int numberPublic;

    public static void main(String[] args) {
        Main m = new Main();

        int numberProtected1 = m.numberProtected;
        int numberPublic1 = m.numberPublic;
    }


}