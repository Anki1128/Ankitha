package strings;

public class Child1 extends Parent{
    void display() {
        System.out.println("child overriding default");
    }


    protected void show(int value) {
        System.out.println("child overloading protected" + value);
    }
}

