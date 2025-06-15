package ex_25_Enum;

public class Lab129_Enum_p2 {
    public static void main(String[] args) {

        System.out.println(URLS.katalon);
        if (URLS.katalon.equals("katalon")) {
            System.out.println("I want to do somethings");
        }
    }
}

// Enum is nothing
enum URLS {
    google, restassured, katalon, vwo
}
