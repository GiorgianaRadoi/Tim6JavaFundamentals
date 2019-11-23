package ro.sdaacademy.javafundamentals.Week2;

public class E2 {
    public static void main(String[] args) {
        byte oneByte = 23;
        int intVar = oneByte;
        float oneFloat = oneByte;
        /**
         *
         * using printf write hexa of the value above in format xx xx xx xx
         */


        System.out.printf("%08x%n", intVar);
    }
}
