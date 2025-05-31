package interview_QnA;

public class Lab18_Reverse_String_Without_BuiltIn {
    public static void main(String[] args) {

        String s = "Javaprogram";

        for(int i=s.length()-1; i>=0; i--)
        {
            System.out.print(s.charAt(i));
        }

        System.out.println("");

        //With using StringBuffer methods also we can reverse a string
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse());
    }
}
