package ro.sdaacademy.javafundamentals.Week2;

import java.util.Scanner;

public class SwitchEx {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String ss = in.nextLine();
        System.out.println("You entered string " + ss);

        /**
         * read from keyboard CNP
         * verify first digit and print
         *
         * 1 digit of CNP
         * 1,3,5 Male
         * 2,4,6 female
         */
        switch (ss.charAt(0)){
            case '1':
            case '5':
            case '3':
                System.out.println("Male");
                break;
            case '4':
            case '6':
            case '2':
                System.out.println("Female");
                break;
            default:
                System.out.println("Undefined");

        }

    }
}
