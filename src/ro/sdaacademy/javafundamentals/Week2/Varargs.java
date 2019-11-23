package ro.sdaacademy.javafundamentals.Week2;

public class Varargs {
    public static int getSum(int... args) {
        int sum = 0;

        for (int arg : args) {
            sum += arg;

        }
        return sum;

    }
}
