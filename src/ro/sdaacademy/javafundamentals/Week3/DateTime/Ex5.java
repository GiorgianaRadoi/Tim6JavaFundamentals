package ro.sdaacademy.javafundamentals.Week3.DateTime;

import java.time.LocalDate;
import java.time.Month;

public class Ex5 {
    // the months remaining in a year
    public static void main(String[] args) {
        LocalDate astazi= LocalDate.now();
        int totalLuni = 12;
        int luniRamase = totalLuni-astazi.getMonthValue();

        System.out.println(luniRamase);
    }
}
