package ex_30_Collections.List;

import java.util.ArrayList;
import java.util.List;

public class Lab173_AL_ClassElement {
    public static void main(String[] args) {

        Lab174_Student s1 = new Lab174_Student("Amit","1");
        Lab174_Student s2 = new Lab174_Student("Ritwik","2");
        Lab174_Student s3 = new Lab174_Student("Shubham","3");

        List<Lab174_Student> myStudents =new ArrayList<>();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        System.out.println(myStudents);
        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
    }
}
