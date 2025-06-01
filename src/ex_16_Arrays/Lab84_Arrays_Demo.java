package ex_16_Arrays;

public class Lab84_Arrays_Demo {
    public static void main(String[] args) {

        int a = 10;
        int[] marks = {91, 90, 51, 100, 98, 92, 89};
        boolean [] is_married_people = {true,true,false};

        System.out.println(marks.length);
        System.out.println(marks[4]);
        // System.out.println(marks[-1]); // ArrayIndexOutOfBoundsException
        // System.out.println(marks[10]); // ArrayIndexOutOfBoundsException
    }
}
