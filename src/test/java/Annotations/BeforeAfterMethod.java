package Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {
    @BeforeMethod()//1
    void beforeMethod() {  //method
        System.out.println("Test1 and then Test2 will run");//before every test,
    }
    @Test()//2
    void Test1() {
        ChromeOptions ops;
        ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "G:/selinium/chromedriver_win32/chromedriver.exe/");
        WebDriver driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        System.out.println("Test1 will run now website opened");
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        // Thread.sleep(3000);  ///hi this to check syncxx1234556000000
        driver.close();
    }
    @Test()//3
    void Test2() {   //method
        System.out.println("Test2 Setup running fine");
    }
    @AfterMethod//4 //method
    void afterMethod() {
        System.out.println("Confirmed This test run successfully After execution");
    }
}
