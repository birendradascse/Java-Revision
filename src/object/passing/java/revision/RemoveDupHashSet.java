package object.passing.java.revision;
import java.util.HashSet;

public class RemoveDupHashSet {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 5, 5};
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < a.length-1; i++) {
            hs.add(a[i]);
        }
        for (int obj : hs) {
            System.out.println(obj);
        }
    }
}