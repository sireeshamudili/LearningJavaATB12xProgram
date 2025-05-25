package ex_13_Functions;

public class Lab70_Methods {
    public static void main(String[] args) {

        // No return or void does not return
        non_return_type_func();

        String a = return_type_func();
        System.out.println(a);
    }

    // Known return type function does not return anything, only printing.
    static void non_return_type_func(){
        System.out.println("Hi, Non Return Type");
    }

    // Return type function, it will return a particular data type.
    static  String return_type_func(){
        System.out.println("Hi, Non Return Type");
        return "siri";
    }

    static boolean return_boolean(){
        return true;
    }

    static float return_float_pi_value(){
        return 3.14f;
    }

    static byte return_byte(){
        return 100;
    }

    static long return_long(){
        return 10l;

    }
}
