package collections;

import java.util.*;
import java.util.stream.Collectors;

class Person {
    public int id;
    public String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class ObjectsToMap {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Ankitha")); 
        personList.add(new Person(2, "Suman"));
        personList.add(new Person(1, "Ramya"));
        personList.add(new Person(4, "Akhil"));
        personList.add(new Person(5, "Priyatham"));


        Map<Integer, String> personMap = personList.stream().collect(Collectors.toMap(Person::getId,Person::getName,
                (duplicateValues, newValue) -> duplicateValues ));

        for (Map.Entry<Integer, String> entry : personMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
