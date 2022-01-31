package task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        List<String> listStudents = new ArrayList<>(13);
        writeNamesInList(listStudents);

        System.out.println(listStudents.stream()
                .filter(x -> x.equalsIgnoreCase("Aleksandr"))
                .count());

        System.out.println(Arrays.toString(listStudents.stream()
                .filter(x -> x.charAt(0) == 'a' || x.charAt(0) == 'A')
                .toArray()));

        System.out.println(listStudents.stream()
                .sorted()
                .findFirst().orElse("Empty"));

//        System.out.println(Arrays.toString(listStudents.toArray()));

    }

    private static void writeNamesInList(List<String> listStudents) {
        String[] nameAndNumberOfStudents;
        for (StudentNames name : StudentNames.values()) {
            nameAndNumberOfStudents = name.toString().split("_");
            for (int i = 0; i < Integer.parseInt(nameAndNumberOfStudents[1]); i++) {
                listStudents.add(nameAndNumberOfStudents[0]);
            }
        }
    }

}
