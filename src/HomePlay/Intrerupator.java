package HomePlay;

import java.util.Scanner;

public class Intrerupator {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String ss = in.nextLine();
        System.out.println("You entered string " + ss);

        switch (ss.charAt(0)){
            case '0':
                System.out.println("*");
                break;
            case '1':
                System.out.println("$");
                break;
            case '2':
                System.out.println("%");
                break;
            default:
                System.out.println("Error");

        }

    }
}
