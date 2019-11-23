package ro.sdaacademy.javafundamentals.Week3.DateTime;

import java.time.LocalDate;
import java.time.Month;

public class Ex2 {
    // number of days in current month
    public static void main(String[] args) {
        LocalDate astazi = LocalDate.now();
        Month lunaCorespunzatoareZileiDeAzi = astazi.getMonth();
        int numarulDeZile = lunaCorespunzatoareZileiDeAzi.maxLength();
        System.out.println(numarulDeZile);

        System.out.println(astazi.getMonth().maxLength());
    }
}
