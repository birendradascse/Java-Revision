package object.passing.java.revision;

public class MinElementOfArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,8,9,10};
        int min = a[0];
        for(int i = 1; i<a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("max element array : " + min);
    }
}
