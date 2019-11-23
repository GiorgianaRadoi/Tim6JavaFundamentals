package HomePlay;

import java.util.Scanner;

public class MatriciSizeDefUtilizator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int j = scanner.nextInt();
        int[] array =  new int [j];

            System.out.println("Enter the elements:");
        for (int i = 0; i < j; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i : array) {
            sum += i;

        }

        System.out.println("Sum of array elements is:" + sum);
    }
}
