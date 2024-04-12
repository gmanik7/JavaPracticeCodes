package JavaStreamProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,5,3,6,48,4,5,4);




      //  nums.stream().sorted().forEach(System.out::println);

      //  nums.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
      //  nums.stream().filter(i->i%5 == 0).forEach(System.out::println);
//        int max = nums.stream().max(Comparator.naturalOrder()).get();
//        System.out.println(max);
//
//        int min = nums.stream().min(Comparator.naturalOrder()).get();
//        System.out.println(min);


        nums.stream().distinct().forEach(System.out::println);

    }
}
