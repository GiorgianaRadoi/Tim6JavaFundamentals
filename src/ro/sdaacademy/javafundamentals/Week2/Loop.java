package ro.sdaacademy.javafundamentals.Week2;

public class Loop {
    public static void main(String[] args) {

        int x = 0;
        do {
            System.out.println(x);

            if (x == 5) {
                continue;
            }

            if (x == 3) {
                break;
            }
            x++;
        } while (x <10);
    }
}
