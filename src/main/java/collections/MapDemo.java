package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Suman");
        map.put(2,"Laxmi");
        map.put(2,"Akhil");

        System.out.println(map.size());


        for (Map.Entry<Integer, String> entries :map.entrySet() ) {
            System.out.println(entries.getKey()+"---"+ entries.getValue());
        }

        System.out.println(map.get(2).hashCode());

        HashMap<Integer,Employee> empMap = new HashMap<>();

        Employee emp1 = new Employee();
        emp1.setEmpName("Ramya");
        emp1.setEmpId(1);

        Employee emp2 = new Employee();
        emp2.setEmpName("Suman");
        emp2.setEmpId(2);

        Employee emp3 = new Employee();
        emp3.setEmpName("Ankitha");
        emp3.setEmpId(3);

        empMap.put(emp1.getEmpId(),emp1);
        empMap.put(emp2.getEmpId(),emp2);
        empMap.put(emp3.getEmpId(),emp3);


        Employee empDetails =getEmployeeDetails(3,empMap);
        System.out.println(empDetails.getEmpName());
        System.out.println(empDetails.getEmpId());

    }

    private static Employee getEmployeeDetails(int empId, HashMap<Integer, Employee> empMap) {

        return empMap.get(empId);

    }


}
