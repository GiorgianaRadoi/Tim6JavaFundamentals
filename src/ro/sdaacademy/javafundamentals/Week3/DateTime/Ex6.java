package ro.sdaacademy.javafundamentals.Week3.DateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex6 {
    //the date after reading years, months and days from the console
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Year:");
        String year = in.nextLine();

        System.out.println("Month:");
        String month = in.nextLine();

        System.out.println("Day:");
        String day = in.nextLine();

        System.out.println(year + " " + month + " " + day);
        LocalDate adate  = LocalDate.of (Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));


    }
}
