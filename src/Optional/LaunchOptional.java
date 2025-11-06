package Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LaunchOptional {
    static void main() {
        List<String> courses = Arrays.asList("Java", "Spring Boot", "Spring AI", "Microservices");

        // we create a stream when you want to work with collection of data,
        // without effecting the original collection
        Optional<String> optionalCourses = courses.stream().filter(str -> str.contains("sql")).findFirst();
        // System.out.println(optionalCourses.get()); --> this will cause exception

        if (optionalCourses.isPresent()) {
            System.out.println("Course Name : " + optionalCourses.get());
        } else {
            System.out.println("No Course Name found");
        }

        System.out.println(optionalCourses.orElse("Not found"));
    }
}
