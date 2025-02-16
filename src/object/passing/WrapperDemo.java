package object.passing;

public class WrapperDemo {
    static String doubleValue = "156.5";
    public static void main(String[] args) {
        Double doubleObj = Double.parseDouble(doubleValue);
        var byteValue = doubleObj.byteValue();
        var intValue = doubleObj.intValue();
        var floatValue = doubleObj.floatValue();
        var stringValue = doubleObj.toString();

        System.out.println(byteValue);
        System.out.println(intValue);
        System.out.println(floatValue);
        System.out.println(stringValue);

    }
}
