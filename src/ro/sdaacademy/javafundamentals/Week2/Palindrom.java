package ro.sdaacademy.javafundamentals.Week2;

public class Palindrom {
    public static void main(String[] args){
        String palindrom="Rotator";
        for(int i=0;i<palindrom.length();i++){
            if(String.valueOf(palindrom.charAt(i)).equalsIgnoreCase(String.valueOf(palindrom.charAt(palindrom.length()-i-1)))){
                System.out.println("Nu este palindrom" + palindrom.charAt(i) + " != " + palindrom.charAt(palindrom.length()-i-1));
                //valoarea stringului convertit in caracter este egala cu valoarea cealalta
                break;
            }
        }
    }
}

