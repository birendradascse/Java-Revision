package object.passing.interview;

import java.util.ArrayList;
import java.util.List;

public class FlattenNestedArray {

    public static void main(String[] args) {
        // Example input: [[[1], 2], [3, 4]]
        List<Object> nestedList = new ArrayList<>();
        List<Object> inner1 = new ArrayList<>();
        List<Object> inner2 = new ArrayList<>();
        List<Object> inner3 = new ArrayList<>();

        inner1.add(1);  // [1]
//        System.out.println(inner1.size());
        inner2.add(inner1); // [[1]]
        inner2.add(2); // [[1], 2]
        inner3.add(3);
        inner3.add(4); // [3, 4]

        nestedList.add(inner2);
        nestedList.add(inner3); // [[[1], 2], [3, 4]]

        // Flatten the list
        List<Integer> flattened = flatten(nestedList);

        // Print output
        System.out.println(flattened); // Expected output: [1, 2, 3, 4]
    }

    public static List<Integer> flatten(List<Object> nestedList) {
        List<Integer> result = new ArrayList<>();
        for (Object element : nestedList) {
            if (element instanceof List) {
                // Recursive call to flatten nested lists
                result.addAll(flatten((List<Object>) element));
            } else if (element instanceof Integer) {
                // Add the number directly
                result.add((Integer) element);
            }
        }
        return result;
    }
}
