package TestNG;

import org.testng.annotations.Test;

//setup open browser
//login
//close browser
//Method anoted by ! @Test
public class TestingCase { //automation code test suite>test case.test step

    @Test
    void setup(){                              //method
        System.out.println("opening browser");// output msg // selenium code
    }
    @Test
    void login(){
        System.out.println("This is login test");
    }
    @Test
    void close(){
        System.out.println("close browser");
    }
}
