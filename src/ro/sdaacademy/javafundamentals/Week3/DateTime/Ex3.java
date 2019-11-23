package ro.sdaacademy.javafundamentals.Week3.DateTime;

import org.omg.DynamicAny.DynAnySeqHelper;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.YEARS;

public class Ex3 {
    //the date 10 dates before and after
    public static void main(String[] args) {
        LocalDate astazu = LocalDate.now();
        LocalDate acumZeceZile;
        LocalDate dupaZeceZile;
        acumZeceZile = astazu.minus(10, DAYS);
        dupaZeceZile =astazu.plus(10,DAYS);
        LocalDate acumUnAn = astazu.minus(1, YEARS);

        acumZeceZile = acumZeceZile.minusDays(10);
        dupaZeceZile = dupaZeceZile.plusDays(10);


        System.out.println(astazu);
        System.out.println(acumZeceZile);
        System.out.println(dupaZeceZile);
        System.out.println(acumUnAn);

    }
}
