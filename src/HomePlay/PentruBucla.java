package HomePlay;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class PentruBucla {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String ss = in.nextLine();

        for (int g = 0; g <= 5; g++) {
            System.out.println(ss);
        }

        for ( int num = ss.length(); num >0; num--){
            System.out.print(ss.charAt(num-1));
        }

        int number, i, k, count = 1;
        number = 5;
        count = number - 1;
        for (k = 1; k <= number; k++)
        {
            for (i = 1; i <= count; i++)
                System.out.print(" ");
            count--;
            for (i = 1; i <= 2 * k - 1; i++)
                System.out.print("*");
            System.out.println();
        }
        count = 1;
        for (k = 1; k <= number - 1; k++)
        {
            for (i = 1; i <= count; i++)
                System.out.print(" ");
            count++;
            for (i = 1; i <= 2 * (number - k) - 1; i++)
                System.out.print("*");
            System.out.println();
        }
    }

    }



