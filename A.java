package collections;

public class A {
    static boolean a;

    A(float a){
       a =10.2f;
        System.out.println(a);
    }
    A(int a){
        a = 10;
        System.out.println(a);
    }
    A(char a){
       a = 'A';
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println("Static variable a: " + a);

        int a = 1;
        System.out.println("Local variable a: " + a);

        A obj1 = new A(10.9f);


        A obj2 = new A(10);


        A obj3 = new A('A');

    }
}

