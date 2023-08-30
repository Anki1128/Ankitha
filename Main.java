package core;

public class Main {
    public static void main(String[] args) {

        Child c = new Child();
        int numberDefault = c.numberDefault;
        int numberProtected = c.numberProtected;

        //c.numberPrivate // compilation error
        int numberPublic = c.numberPublic;
    }
}
