package Streams;

import java.util.Arrays;
import java.util.List;

public class LaunchStream01 {
    static void main() {
        List<Integer> nums = Arrays.asList(1, 3, 4, 6, 7, 9, 10);

        int sum = 0;
        for (int n : nums) {
            if (n % 2 == 1) {
                sum = sum + n*2;
            }
        }
        System.out.println(sum);

        int sumStream = nums
                .stream()
                .filter(n -> n % 2 == 1)
                .map(n -> n*2)
                .reduce(0, (a, b) -> a+b);

        // .reduce(0, Integer::sum);

        System.out.println(sumStream);
    }
}
