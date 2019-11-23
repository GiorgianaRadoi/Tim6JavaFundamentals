package ro.sdaacademy.javafundamentals.Week3.DateTime;

import java.time.LocalDateTime;

public class Ex4 {
    //get date and time after 2 weeks and 10 min
    public static void main(String[] args) {
        LocalDateTime astaziAcum = LocalDateTime.now();
       LocalDateTime raspuns = astaziAcum.plusWeeks(2).plusMinutes(10);
        System.out.println(raspuns);
    }
}
