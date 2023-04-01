package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestingCase {
    @Test(priority = 2)
    void setup(){                              //method
        System.out.println("opening browser");// output msg // selenium code
    }
    @Test(priority = 1)
    void searchCustomer(){
        System.out.println("This is search customer test");
    }
    @Test(priority = 3)
    void addCustomer(){
        System.out.println("This is add customer test");
    }
    @Test(priority = 4)
    void close(){
        System.out.println("close browser");
        Assert.assertTrue(true);
    }
}


