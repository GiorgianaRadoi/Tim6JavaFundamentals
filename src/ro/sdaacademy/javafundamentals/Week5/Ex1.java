package ro.sdaacademy.javafundamentals.Week5;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Ex1();

        Scanner in = new Scanner(System.in);
        int nr1 = in.nextInt();
        System.out.println("First printed nr is:" + nr1);
        int nr2 = in.nextInt();
        System.out.println("Second printed nr is:" + nr2);
        while(nr1<0 || nr2<0){
            System.out.println("First printed nr is:" + nr1);
            nr1 = Integer.parseInt( in.nextLine() );
            System.out.println("First printed nr is:" + nr2);
            nr2 = Integer.parseInt( in.nextLine() );
        }
        Ex2(nr1, nr2);
       long x=  System.currentTimeMillis();


    }

    private static void Ex2(int nr1, int nr2) {
        long x =  System.currentTimeMillis();
        int i;
        for(i=1; i!=nr2; i=i+nr1){
            System.out.println(i);
            if(System.currentTimeMillis()-x > 10000){
                break;
            }
        }
    }


    private static void Ex1() {
        int i;
        for(i=0; i<=1000; i=i+5) {
            if(i==5||i==55||i==555||i==1000){
                System.out.println( i );
            }
        }
    }
}
