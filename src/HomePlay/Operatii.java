package HomePlay;

public class Operatii {
    public static void main (String[] args) {
        int x = 4;
        System.out.println(x++);
        System.out.println(--x);
        System.out.println(x%3);
        System.out.println(11%2);
        System.out.println(7%x++);
        System.out.println(x==4);
        System.out.println(x!=4);
        x = 10;
        int y = 5;
        System.out.println(x==10&&y<=5);
        System.out.println(x<=y&&y>5);
        System.out.println("\"abc\" instance of String");

        int myInt = 9;
        long myLong = myInt;


    }
}
