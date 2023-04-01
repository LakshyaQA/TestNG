package Annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeAfterSuite {
    @BeforeSuite
    void beforeSuite() {
        System.out.println("Before suite");
    }
    @AfterSuite
    void afterSuite()
    {
        System.out.println("AfterSuite");
    }
}

