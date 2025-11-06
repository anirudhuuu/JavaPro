package ConstructorReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    String name;

    public Student(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + "]";
    }
}

public class LaunchConstructorRef {
    static void main() {
        List<String> names = Arrays.asList("Praveen", "Rohan", "Anirudh");

        List<Student> students = new ArrayList<>();

        // i want to add all names into this students
        // we can use for-each and do .add() on each value
        for  (String name : names) {
            students.add(new Student(name));
        }

        students.forEach(System.out::println);
        System.out.println("*****");

        // better option to do is,
        names.stream().map(Student::new).toList().forEach(System.out::println);

        // Student::new --> this is called as constructor reference
        // System.out::println --> this is called as method reference
    }
}
