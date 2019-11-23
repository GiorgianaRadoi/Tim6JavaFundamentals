package HomePlay;

import java.util.Scanner;

import static java.lang.System.*;

public class InTimpCe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ss = in.nextLine();

        //Print as long as the condition is true
        int counter = 1;
        while (counter <=5){
            System.out.println(ss);
            counter++;
        }
        //print in reverse with command print not printline
        int i = ss.length();
        while(i>0){
            System.out.print(ss.charAt(i-1));
            i--;
        }




    }
}
