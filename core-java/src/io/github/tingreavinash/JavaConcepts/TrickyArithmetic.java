package io.github.tingreavinash.JavaConcepts;

public class TrickyArithmetic {
    public static void main(String[] args) {
        //doubleTypeDivision();
        NaNEqualityExpression();

    }

    private static void NaNEqualityExpression() {
        Double x = Double.NaN;
        System.out.println(x == Double.NaN);
        System.out.println(Double.isNaN(x));
    }

    public static void doubleTypeDivision() {
        try {
            System.out.println(1.0 / 0.0); // It will not throw exception, It will return Double.Infinity
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
