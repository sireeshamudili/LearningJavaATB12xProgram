package interview_QnA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab22_Try_Catch {
    public static void main(String[] args) {

        try {
            FileReader f = new FileReader(new File("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
