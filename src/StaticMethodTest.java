class Parent {
     void staticMethod() {
        System.out.println("Static method in Parent");
    }
}

class Child extends Parent {
//     void staticMethod() {
//        System.out.println("Static method in Child");
//    }
}



public class StaticMethodTest {
    public static void main(String[] args) {
//        Parent.staticMethod();           // (1)
//        Child.staticMethod();            // (2)
        Parent parent = new Child();
        parent.staticMethod();           // (3)
    }
}
