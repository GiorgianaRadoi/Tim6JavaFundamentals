package HomePlay;

import java.util.Scanner;

public class Faintimpce {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String ss = in.nextLine();

        int name = 1;
        do{
            System.out.println(ss);
            name++;
        }
        while(name <=5);

        int j = ss.length();
        do{
            System.out.print(ss.charAt(j-1));
            j--;
        }
        while(j >0);
    }
}
