package MethodReference;

import java.util.Arrays;
import java.util.List;

public class LaunchMethodRef {
    static void main() {
        List<String> courses = Arrays.asList("Java", "Spring Boot", "Spring AI", "Microservices");

        List<String> upperCourses = courses.stream().map(course -> course.toUpperCase()).toList();
        System.out.println(upperCourses);

        System.out.println(courses.stream().map(String::toUpperCase).toList());

        courses.forEach(System.out::println);
    }
}
