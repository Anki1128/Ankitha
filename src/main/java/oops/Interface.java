package oops;

public class Interface implements InterfaceA, InterfaceB{
    public void print()
    {
        System.out.println("Inside InterfaceA");
    }
    /*public int print(String str)
    {
        System.out.println("Inside InterfaceB");
        return 5;
    }*/

    public static void main(String[] args) {
        InterfaceA a = new Interface();
        a.print();

        InterfaceB b = new Interface();
        b.print();
    }

}
