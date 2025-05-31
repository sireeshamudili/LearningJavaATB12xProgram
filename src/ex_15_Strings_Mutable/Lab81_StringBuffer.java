package ex_15_Strings_Mutable;

public class Lab81_StringBuffer {
    public static void main(String[] args) {

        //By using StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Nithya");
        stringBuffer.append("Menon");
        System.out.println(stringBuffer);

        //By using String
        String s1 = "Nithya";
        s1 = s1+ "Menon";
        System.out.println(s1);

        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);
        sb.delete(5,16); // Delete the substring
        System.out.println(sb);

        sb.replace(0, 4, "C++");
        System.out.println(sb);
    }
}
