package ro.sdaacademy.javafundamentals.Week2;

public class StringsExample {
    public static void main (String[] args) {
        String str = "Ana are mere";
        System.out.println(str.length());
        System.out.println(str.substring(str.indexOf("are"),str.indexOf("are")+3));
        System.out.println(str.substring(str.indexOf("mere"),str.indexOf("mere")+4));
        System.out.println(str.substring(str.indexOf("Ana"),str.indexOf("Ana")+3));

        str.replace("are", "avea");// nu se poate inlocui un string
        System.out.println(str);
        System.out.println(str.replace("are", "avea")); // a inlocuit soar valoarea, nu stringul


        String st1 = "aAaz";
        String st2 = new String("aaZz");
        System.out.println(st1.compareTo(st2));
int firstIndex = str.indexOf('e');
int lastIndex = str.lastIndexOf('e');
String subStr = str.substring(firstIndex +1 , lastIndex - 1);
        System.out.println(firstIndex + 1 + subStr.indexOf('e'));
        System.out.println(str.charAt(9));

        StringBuilder builder = new StringBuilder();
        builder.append("ana ");
        builder.append("are ");
        builder.append("mere ");

        System.out.println(builder);
        builder.replace(builder.indexOf("are"), builder.indexOf("are")+3, "avea");
        System.out.println(builder);


        String s = null;
        s.length();
    }
}
