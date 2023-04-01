package groupingtest;

import org.testng.annotations.Test;

public class GroupingExample {
    @Test(groups ={"Sanity"})
    void Test1(){
        System.out.println("Test1");
    }
    @Test(groups ={"Sanity"})
    void Test2(){
        System.out.println("Test2");
    }
    @Test(groups ={"regression"})
    void Test3(){
        System.out.println("Test3");
    }
    @Test(groups ={"regression"})
    void Test4(){
        System.out.println("Test4");
    }
    @Test(groups ={"Sanity","regression"})
    void Test5(){
        System.out.println("Test5");
    }
}
