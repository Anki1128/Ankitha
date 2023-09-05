package oops;

class Parent1{

    void fun(){
        System.out.println("Parent1");
    }
}

class Parent2{

    void fun(){
        System.out.println("Parent2");
    }
}
class MultipleInheritance extends Parent1{

    public static void main(String[] args) {
        MultipleInheritance t = new MultipleInheritance();
        t.fun();
    }

}

