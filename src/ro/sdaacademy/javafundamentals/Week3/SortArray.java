package ro.sdaacademy.javafundamentals.Week3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Random;

public class SortArray {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[]{
                rnd.nextInt(9),
                rnd.nextInt(9),
                rnd.nextInt(9),
                rnd.nextInt(9),
                rnd.nextInt(9),
        };
        boolean sorted =false;
        while(!sorted) {
            sorted = true;// in mom in care nu mai gaseste iteratii false sa intrerupa bucla while
            System.out.println(Arrays.toString(array));
                for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    sorted = false; //sa sorteze pana nu mai gaseste iteratii false
                }
                Arrays.sort(array); // sortare automata
            }
            System.out.println(Arrays.toString(array));
        }
    }



}




