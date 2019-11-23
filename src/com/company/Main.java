package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.swing.*;

public class Main {

    public static void main1(String[] args) {
        // write your code here
        // this command writes a text to the console
        /*
        comment on multiple lines
         */
        System.out.println("Hello World");

        //everyvariable has a name, followed by;
        boolean firstBoolean; // this is called a declaration
        firstBoolean = true; // this is called assigning the value true to first Boolean

        System.out.println(firstBoolean);

        boolean hasChildren = false; // declaration and assignment in a single line
        System.out.println(hasChildren);

        // at compund names the second is written with big letter named cammel
        boolean hasThreeChildren = true;
        boolean has3Children = true;

        // this will work

        byte firstByteDeclaration = 23;

        System.out.println(firstByteDeclaration);
        firstByteDeclaration = -12;
        System.out.println(firstByteDeclaration);

        firstByteDeclaration = 0;
        System.out.println(firstByteDeclaration - 1);

        firstByteDeclaration = 127;
        System.out.println(firstByteDeclaration + 120);

        firstByteDeclaration = (byte) (firstByteDeclaration + 1);
        System.out.println(firstByteDeclaration);

        // (byte) is named cast;

        System.out.println("********************");
        System.out.println("Byte max and min value");

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);


        System.out.println("********************");
        System.out.println("Short Datatype");
        short variableOn16Bits = 16000;
        variableOn16Bits = (short) (variableOn16Bits * 2);
        System.out.println(variableOn16Bits);

        System.out.println("********************");
        System.out.println("Integer Datatype");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int myIntNumber = 2_000_000;
        System.out.println(myIntNumber);


        System.out.println("********************");
        System.out.println("Long datatype");
        long aVeryLargeValue = variableOn16Bits * myIntNumber;
        System.out.println(aVeryLargeValue);


        System.out.println("********************");
        System.out.println("Real datatypes");
        float aFloatValue = 6;
        System.out.println(aFloatValue);
        System.out.println(aFloatValue / 5);

        int testDivision = 6 / 4;
        System.out.println(testDivision);

        aFloatValue = (float) 6.3;
        aFloatValue = 63.F;

        float periodValue = (float) 2 / 3;
        // float periodValue = 2f/3;
        System.out.println(periodValue);

        double periodValueDouble = (double) 2 / 3;
        System.out.println(periodValueDouble);


    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 5;
        System.out.println(a + b + c);
        int sum = a + b + c;
        System.out.println(sum);

        int product = a * b;
        System.out.println(product);

        double division = (double) b / c;
        System.out.println(division);

        int diff = c - a;
        System.out.print("c - a ="); // does not jump to next line if you cut ln
        System.out.println(diff);

        System.out.println("*********************");
        System.out.println("a");
        System.out.println(a);
        a = a + 2; // la a adun 2, apoi un nou rez i-l atribui lui 2;
        a += 2; // the same with a=a+2
        System.out.println(a);

        System.out.println("**************************");
        b -= 1;
        System.out.println(b);

        c *= 2; // same with c/=2
        System.out.println(c);
        c /= 2;
        System.out.println(c);

        a += 1; //a=a+1
        a++;  // a= a+1
        System.out.println(a);


        a = 7;
        b = 9;
        int newSum = ++a + b++;
        System.out.println(newSum);
        System.out.println(a);
        System.out.println(b);

        String text = "sir de caractere";
        char character = 's';

        System.out.println("**************************");

        int d = 2;
        int e = 3;
        int f = ++d;
        System.out.println(f);


    }
}
