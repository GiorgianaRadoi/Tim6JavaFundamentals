package ro.sdaacademy.javafundamentals.Week5;

public class Ex3 {
    public static void main(String[] args) {

        int[] array;
        array= initArray ( 100 );
        printArray( array );
        array = initArray( 200 );
        printArray( array );
    }

    private static void printArray(int[] array) {
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * Metoda initArray returneaza un array cu primele limit nr divizibile cu 11
     * @param limit reprezinta cate nr sa contina array-ul
     * @return un array cu primele 100 nr divizivibile cu 11
     */

    private static int[] initArray(int limit) {
      int[]  array = new int[limit];
      int count = 0;
        for (int i = 0; count < limit; i++) {
            if (i % 11 == 0) {
                array[count++] = i;
            }
        }return array;
    }

}
