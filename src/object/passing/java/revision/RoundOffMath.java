package object.passing.java.revision;
import java.math.BigDecimal;

public class RoundOffMath {
    static boolean showExpectedResult = false;
    static boolean showHints = true;
    //Receive a String , return a round double number
    static double roundNumber(double value){
        //Round to 2 decimal places
        return Math.round(value*100.0) / 100.0;
    }

    static double roundNumberBigDecimal(double value, int decimalPlaces){
        BigDecimal bd = new BigDecimal(String.valueOf(value));
        bd = bd.setScale(decimalPlaces, BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue();
    }
    public static void main(String[] args) {
        double value = 10.41210;
        System.out.println("Round of randomValue " + roundNumber(value));
        System.out.println("Round of randomValue " + roundNumberBigDecimal(value, 3));

    }
}
