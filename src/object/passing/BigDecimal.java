package object.passing;

import java.util.Optional;

public class BigDecimal {

    public BigDecimal(String stringValue) {
        
    }

    public static void main(String[] args) {
        var valueX = 0.012;
        double pSum = valueX+ valueX+ valueX;
        System.out.println(pSum);
        var stringValue = Double.toString(valueX);
        System.out.println(stringValue);
        var bigValue = new BigDecimal(stringValue);
        System.out.println(bigValue);
        var bigSum = bigValue.add(bigValue).add(bigValue);
        System.out.println(Optional.ofNullable(bigSum));
        var sum = bigSum.doubleValue();
        System.out.println(sum);


    }

    private Object doubleValue() {
        return doubleValue();
    }

    private BigDecimal add(BigDecimal bigValue) {
        return bigValue;
    }
}
