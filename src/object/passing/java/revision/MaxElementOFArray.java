package object.passing.java.revision;

public class MaxElementOFArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,8,9,10};
        int max = a[0];
        for(int i = 1; i<a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("max element array : " + max);
    }
}
