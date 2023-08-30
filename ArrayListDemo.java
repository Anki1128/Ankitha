package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Suman");
        list.add("Pritam");
        list.add("Ankit");
        list.add("Ankit");
        System.out.println(list.size());
        list.remove(0);
        System.out.println(list.size());

        for (String res: list) {
            if(res.equalsIgnoreCase("suman"));
        }


        /* Functional interface - SAM(single abstract method); */
        Predicate<String> nameFilter = (res) -> res.equalsIgnoreCase("suman");

       List<String> list2 =   list.stream().filter(nameFilter).collect(Collectors.toList());
       System.out.println(list2);

       //list.stream().map();




        ArrayList<Employee> empList = new ArrayList<>();
        Employee e1= new Employee();
        e1.setEmpId(1);
        e1.setEmpName("Ramya");

        empList.add(e1);
        empList.add(null);
        System.out.println(empList.size());

        for (Employee emp:empList) {
            System.out.println(emp.getEmpName());
            System.out.println(emp.getEmpId());

        }
        System.out.println(empList.get(0).getEmpId());


    }
}
