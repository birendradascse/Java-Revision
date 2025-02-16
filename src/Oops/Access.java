package Oops;

public class Access {
    private int a;
    private int b;

    public void Add(){
        System.out.println("Sum of A and B :" + (a+b));
    }
    public void Sub(){
        System.out.println("Sub of A and B :" +(a-b));
    }

    public static void main(String[] args) {
        Access obj = new Access();  //class Access contain 2 var is access n updated by creating instance obj
        obj.a = 10;
        obj.b = 20;

        obj.Add();
        obj.Sub();
    }
}
