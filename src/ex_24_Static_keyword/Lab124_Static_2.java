package ex_24_Static_keyword;

public class Lab124_Static_2 {
    public static void main(String[] args) {

        ATB siri = new ATB(987654321,"Siri");
        ATB sanju = new ATB(987654387,"Sanju");
        System.out.println(siri.phone_np);
        System.out.println(sanju.name);
        System.out.println(ATB.course_name);
        System.out.println(ATB.course_name);
        ATB.markAttendance();
    }
}

class ATB{

    int phone_np;
    String name;
    static String course_name = "ATB";

    public ATB(int phone_np, String name) {
        this.phone_np = phone_np;
        this.name = name;
    }

    void display(){
        System.out.println(this.phone_np + this.name + course_name);
    }

    static void markAttendance(){
        System.out.println("Mark Attendance");
    }
}
