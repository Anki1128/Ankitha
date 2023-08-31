package collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Suman");
        set.add("Suman");
        set.add("Akhil");
        set.add(null);

        System.out.println(set.size());
        for (String s: set) {
            System.out.println(s);
        }

        Set<Employee> empSet = new HashSet<>();

        Employee e1 = new Employee();
        e1.setEmpId(1);
        e1.setEmpName("Ramya");

        empSet.add(e1);
        empSet.add(e1);

        for (Employee s: empSet) {
            System.out.println(s.getEmpId());
        }

    }
}

