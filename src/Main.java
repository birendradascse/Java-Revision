import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
//        int [] arr={1,2,3,4,5};
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<5;i++){
            arr.add(i+1);
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        System.out.println(arr);
    }
}


