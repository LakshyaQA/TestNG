package TestNG;

import org.testng.annotations.Test;

//setup open browser
//login
//close browser
//Method anoted by ! @Test
public class TestCasePriority { //automation code test suite>test case.test step

    @Test(priority = -1)
    void setup(){                              //method
        System.out.println("opening browser");// output msg // selenium code
    }
    @Test(priority = -2)
    void login(){
        System.out.println("This is login test");
    }
    @Test(priority = -3)
    void close(){
        System.out.println("close browser");
    }
}
