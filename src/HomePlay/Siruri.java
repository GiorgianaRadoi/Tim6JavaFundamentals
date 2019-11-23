package HomePlay;

public class Siruri {
    public static void main (String[] args) {
        String Astr = "Alex are castraveti";
        System.out.println(Astr.length());
        System.out.println(Astr.substring(Astr.indexOf("Alex"),Astr.indexOf("Alex")+4));
        System.out.println(Astr.substring(Astr.indexOf("castraveti"),Astr.indexOf("castraveti")+10));

        Astr.replace("castraveti", "ciocolata");
        System.out.println(Astr);
        System.out.println(Astr.replace("castraveti","ciocolata"));
        System.out.println(Astr.charAt(1));

        String big = "Lorem ipsum dolor sit amet, consecteur adipiscing elit";
        System.out.println(big.toLowerCase());
        System.out.println(big.toUpperCase());
        big.replace("o","z");
        System.out.println(big.replace("o","z"));
        System.out.println(big.endsWith("elit"));
        System.out.println(big.substring(big.indexOf("Lorem"),big.indexOf("Lorem")+5));
        System.out.println(big.lastIndexOf("elit"));
        System.out.println(big.length());
        System.out.println(big.startsWith("L"));
        System.out.println(big.equalsIgnoreCase(Astr));

        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(b==c);
        System.out.println(b.equals(c));



    }
}
