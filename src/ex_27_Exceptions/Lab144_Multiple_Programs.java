package ex_27_Exceptions;

public class Lab144_Multiple_Programs {
    public static void main(String[] args) {

        int a = 0;
        int c = 0;
        try {
            c = 10/a;
            String s1 = null;
            s1.trim();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
