package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest4 {
    public static void main(String[] args) {
        Integer[] inputArr = {50, 40, 60, 70, 30};
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

        for (Integer s : set) {
            if (s > 40) {
                System.out.println(s);
            }
        }
    }
}
