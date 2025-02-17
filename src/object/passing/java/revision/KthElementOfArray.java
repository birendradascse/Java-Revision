package object.passing.java.revision;

public class KthElementOfArray {
    public static void main(String[] args) {
        int a[] = {1, 12, 3, 8, 9, 10};
        int k = 4;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                //for min use > in if
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            //for checking kth value index 0-3/4
            if (i == k-1) {
                System.out.println(k + " kth largest element of arr" + a[i]);
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+"");
        }
    }
}