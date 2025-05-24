package ex_09_Switch_Condition;

import java.util.Scanner;

public class Lab46_Real_Switch {
    public static void main(String[] args) {

            // String browser  = args[0];

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the browser");
            String browser = scanner.next();
            browser = browser.toLowerCase(); // lower(Chrome, CHROME, CHrome) == chrome

            switch (browser) {
                case "chrome":
                    System.out.println("Starting the chrome browser");
                    break;

                case "firefox":
                    System.out.println("Starting the firefox browser");
                    break;

                case "edge":
                    System.out.println("Execute the Edge browser");
                    break;

                default:
                    System.out.println("I have no idea which browser is this");
                    break;
            }
        }
    }