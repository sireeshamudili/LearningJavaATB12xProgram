package ex_14_Strings;

public class Lab80_String_Functions2 {
    public static void main(String[] args) {

        String name = "Sonal";
        System.out.println(name.charAt(3));
       // System.out.println(name.charAt(10)); // java.lang.StringIndexOutOfBoundsException: Index 10 ou

        // 2. concat()
        System.out.println(name.concat(" Patel"));

        // 3. contains()
        System.out.println(name.contains("om"));

        // 4. equals()
        System.out.println(name.equals("Sonal"));

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sonal"));

        // 6. indexOf() //  sonal -> ? o
        System.out.println(name.indexOf('o'));

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));

        // 7. length()
        System.out.println(name.length());

        // 8. replace( , )
        System.out.println(name.replace('n', 'N'));

        // 10. substring( , )
        System.out.println(name.substring(1, 3));

        // 11. toLowerCase()
        System.out.println("SONAL".toLowerCase());

        // 12. toUpperCase()
        System.out.println("sonal".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("S"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));

        // 16. trim()
        String name3 = "    Sonal Patil     ";
        System.out.println(name3.trim());

        // 17. compareTo()
        System.out.println(name.compareTo("Sonal"));

        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);

        String s11 = "Siri";
        String s21 = s11.concat("sha");
        System.out.println(s21);
    }
}
