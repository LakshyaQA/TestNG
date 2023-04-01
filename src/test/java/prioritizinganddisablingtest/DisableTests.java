package prioritizinganddisablingtest;

import org.testng.annotations.Test;

public class DisableTests {
    @Test(priority =0)
    void TestA() {
        System.out.println("this is TestA");
    }

    @Test(priority = 1)
    void TestB() {
        System.out.println("this is TestB");
    }

    @Test(priority = 2)
    void TestC() {
        System.out.println("this is TestC");
    }

    @Test(priority = 3,enabled = false)
    void TestD() {
        System.out.println("this is TestD");
    }
}
