package strings;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child1 child1 = new Child1();
        SecondChild second = new SecondChild();


        parent.display();
        parent.show();

        child1.display();
        child1.show(123);

        //second.privatemethod();
    }
}
