package object.passing.java.revision;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumFormat {
    public static void main(String[] args) {
        double number = 12345.6789;

        // Example 1: Format as a decimal number
        NumberFormat decimalFormat = NumberFormat.getNumberInstance();
        System.out.println("Decimal format: " + decimalFormat.format(number));

        // Example 2: Format as a currency
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        System.out.println("Currency format: " + currencyFormat.format(number));

        // Example 3: Format as a percentage
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        System.out.println("Percent format: " + percentFormat.format(number));

        // Example 4: Format with a specific locale
        NumberFormat frenchFormat = NumberFormat.getNumberInstance(Locale.FRANCE);
        System.out.println("French format: " + frenchFormat.format(number));

        // Example 5: Format with a specific number of decimal places
        NumberFormat decimalFormat2 = NumberFormat.getNumberInstance();
        decimalFormat2.setMinimumFractionDigits(2);
        decimalFormat2.setMaximumFractionDigits(2);
        System.out.println("Decimal format with 2 decimal places: " + decimalFormat2.format(number));

        var doubleValue = 10_000_000.55;
        var numF = NumberFormat.getNumberInstance();
        System.out.println("Number: " + numF.format(doubleValue));

        var intF = NumberFormat.getNumberInstance();
        System.out.println("Number: " + intF.format(doubleValue));

        intF.setGroupingUsed(false);
        System.out.println("Number: " + intF.format(doubleValue));

//        var locale = Locale.getDefault();
//        var localeFormatter = NumberFormat.getNumberInstance(locale);
//        System.out.println("Number: "+ localeFormatter.format(doubleValue));

        var locale = new Locale("de", "DE");
        var localeFormatter = NumberFormat.getNumberInstance(locale);
        System.out.println("Number: "+ localeFormatter.format(doubleValue));

        var currencyFormatter = NumberFormat.getCurrencyInstance();
        System.out.println(currencyFormatter.format(doubleValue));

        var df = new DecimalFormat("$00.00");
        System.out.println(df.format(1));
    }
}

