package object.passing.hackerrank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCharCount {

public static int charSearch(String str,char ch){
    //complete the code
    str = str.toLowerCase();
    ch = Character.toLowerCase(ch);
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == ch) {
            count++;
        }
    }
    return count;
}
public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String str = reader.readLine();
    char ch = (char)reader.read();
    System.out.println(charSearch(str,ch));
}
    }

