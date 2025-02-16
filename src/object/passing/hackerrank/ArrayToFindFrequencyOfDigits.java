package object.passing.hackerrank;
import java.util.Scanner;
public class ArrayToFindFrequencyOfDigits {
    public static void frequency(int number) {
        String numString = String.valueOf(number);
        int[] digitCount = new int[10];
        for(int i = 0; i < numString.length(); i++){
            int digit = numString.charAt(i)-'0';
            digitCount[digit]++;
        }
        for(int i = 0; i < digitCount.length; i++) {
            if (digitCount[i] > 0) {
                System.out.println(i + ": " + digitCount[i]);
            }
        }
    }
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        frequency(number);
        sc.close();
    }
}
