package ro.sdaacademy.javafundamentals.Week3;

import java.util.Scanner;

public class Interchange {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("x=");
        int x = in.nextInt();
        System.out.print("y=");
        int y = in.nextInt();

        int z = x;
        x=y;
        y=z;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.printf("x=%d y=%d %n",x,y);
    }
}
