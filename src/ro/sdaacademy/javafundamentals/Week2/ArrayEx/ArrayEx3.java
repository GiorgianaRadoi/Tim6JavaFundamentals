package ro.sdaacademy.javafundamentals.Week2.ArrayEx;

public class ArrayEx3 {
    public static void main (String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7},
        };
        for(int i = 0; i<a.length; i++){
            for (int j : a[i]){
                // a[i] element in array
                System.out.println(j);
            }
        }
    }
}
