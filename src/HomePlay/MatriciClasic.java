package HomePlay;

public class MatriciClasic {
    public static void main(String[] args) {
        int[] arrayOfInts = {10, 15, 20, 25, 30};
        int sum = 0;
        for (int i : arrayOfInts) { // (int i = 0; i<5; i++)
            System.out.print(i + " ");
        }

        System.out.println("\n");
        for (int num: arrayOfInts) {
            sum = sum + num;
        }
        System.out.println("The sum of array elem is " + sum);


    }
}
