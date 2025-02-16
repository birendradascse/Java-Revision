package object.passing.hackerrank;
import java.util.HashMap;
import java.util.Scanner;
public class HashMapValue {
    public static void main(String args[] ) throws Exception {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            int studentId = scanner.nextInt();
            String studentName = scanner.nextLine();
            studentMap.put(studentId, studentName);
        }
        int searchId = scanner.nextInt();
        //System.out.println(studentMap);
        if (studentMap.containsKey(searchId))
        {
            //System.out.println(searchId + " " + studentMap.get(searchId));
            System.out.println(studentMap.get(searchId).trim());
        } else {
            System.out.println("-1");
        }
        scanner.close();
    }
}