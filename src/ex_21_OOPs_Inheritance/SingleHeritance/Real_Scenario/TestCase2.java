package ex_21_OOPs_Inheritance.SingleHeritance.Real_Scenario;

public class TestCase2 extends CommonToAllTestCases {

    void runningTC2(){
        startBrowser();
        readExcelFile();
        readDataBaseFile();
        System.out.println("Running TC2");
        closeBrowser();
    }
}