package ex_03_Literals;

public class Lab20_Char_Literals {
    public static void main(String[] args) {

        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
        //char c = "A"; // "" == String = Bunch of Char

        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Sireesha");
        System.out.println("Siri"+new_line+"M");
        System.out.println("Siri\nM");
        System.out.println("Siri"+tab_line+"M");
        System.out.println("Siri"+back_space+"M");
        System.out.println( " ----- ");

        System.out.println("Siri is "+carriage_return+"M");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");


        char c10 = 'A';
        // ASCII, (limited numbers) - A -> 65

        char rupees = '₹';
        System.out.println(rupees);

        char my_laugh_smiley = '\u1f60'; // :)
        System.out.println(my_laugh_smiley);

        char c11  = '\u1F60';
    }
}
