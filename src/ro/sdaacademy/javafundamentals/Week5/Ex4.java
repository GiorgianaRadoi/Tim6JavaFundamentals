package ro.sdaacademy.javafundamentals.Week5;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner firstScanner = new Scanner( System.in );
        String text = firstScanner.nextLine();
        System.out.println( text );
        char[] litere = new char[text.length()];
        int [] count = new int[text.length()];

        for (int i = 0; i < text.length(); i++) {
            //  litere[i] = text.charAt( i );
            if(text.charAt( i )==' '){
                continue;
            }
            boolean isDuplicate = false;
            for (int j = 0; j <= i; j++) {
                if (litere[j] == text.charAt( i )) {
                    count[j]++;
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate==false) {
                for (int j = 0; j <litere.length; j++) {
                    if(litere[j]==0){
                        litere[j] = text.charAt( i );
                        count[j] = 1;
                        break;
                    }
                }
            }
        }

        afisare( litere );
        afisare( count );
    }

    private static void afisare(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] +" ");
        }
        System.out.println();
    }
    private static void afisare(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i]==0){
                break;
            }
            System.out.print( array[i]+ " " );

        }
        System.out.println();
    }

}

