package task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10  ; i++) {
            list.add((int)(Math.random() * 26));
        }

        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println("--------------------------");

        System.out.println(Arrays.toString(list.stream()
                .distinct()
                .filter(x -> x % 2 == 0)
                .filter(x -> x >= 7 && x <= 17)
                .toArray()));

        System.out.println(Arrays.toString(list.stream()
                .map(x -> x * 2)
                .sorted()
                .limit(4)
                .toArray()));

        System.out.println(list.stream().count());

        System.out.println(list.stream()
                .mapToInt(Integer::intValue)
                .average().getAsDouble());
//
//                .count();
//
//        System.out.println("Number of items in stream: " + numberOfItems);

//        System.out.println(Arrays.stream(array)
//                .average

    }

}
