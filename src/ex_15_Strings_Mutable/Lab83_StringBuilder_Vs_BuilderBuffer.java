package ex_15_Strings_Mutable;

public class Lab83_StringBuilder_Vs_BuilderBuffer {
    public static void main(String[] args) {

        //StringBuilder and StringBuffer are Mutable(We can change)
        // String - 90%
        String s0 = "Siri";
        String s1 = new String("Siri");

        // less than <10% used.

        //StringBuffer is thread-safe(slow), it is safer to use in multi-threaded environments.
        StringBuffer stringBuffer = new StringBuffer("Siri");

        //StringBuilder is not thread-safe, it is faster** and more efficient in single-threaded environments
        StringBuilder stringBuilder = new StringBuilder("Siri");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());
    }
}
