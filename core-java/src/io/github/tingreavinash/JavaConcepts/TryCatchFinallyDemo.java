package io.github.tingreavinash.JavaConcepts;

public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        String result = checkCriteria(17);
        System.out.println(result);
    }

    public static String checkCriteria(int age) {
        try {
            if (age > 18) {
                System.out.println("Inside if checkCriteria");
                return "Adult"; // Due to this, finally block will be normally executed and then value is returned.
            }
            System.out.println("Outside if checkCriteria");

            System.exit(0); // Due to this, finally block won't be executed

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("In finally block");
        }
        return "Default Value";
    }
}
