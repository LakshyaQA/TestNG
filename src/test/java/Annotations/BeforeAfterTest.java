package Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class BeforeAfterTest {
    @BeforeClass    //1
    void beforeClass(){
        System.out.println("its BEFORECLASS");
    }
    @BeforeMethod() //a  //method
    void beforeMethod() {
        System.out.println("BEFOREMETHOD");//before every test,
    }
    @BeforeTest
    void beforeTest()
    {
        System.out.println("BeforeTest");
    }
    @AfterMethod    //d //method
    void afterMethod() {
        System.out.println("AFTERMETHOD");
    }
    @AfterClass     //2
    void afterClass(){
        System.out.println("its AFTERCLASS");
    }
    @AfterTest
    void afterTest()
    {
        System.out.println("AfterTest");
    }
    @Test()         //b
    void Test3() {
        System.out.println("Test3 will run now");
    }
    @Test()         //c
    void Test4() {   //method
        System.out.println("Test4 wil run now");
    }
}
