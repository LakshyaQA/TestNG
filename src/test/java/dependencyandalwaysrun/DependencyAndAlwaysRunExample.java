package dependencyandalwaysrun;

import org.testng.annotations.Test;

public class DependencyAndAlwaysRunExample {
    @Test
    //@Test(enabled = false)
    void startCar(){
        System.out.println("Car started");
        //Assert.fail("failed");
    }
    @Test(dependsOnMethods = {"startCar"})
    void driveCar(){    //method depends on previous or above one
        System.out.println("Car driving");
    }
    @Test(dependsOnMethods ={"driveCar"})
    void stopCar(){
        System.out.println("Car stopped");
    }
    @Test(dependsOnMethods = {"dirveCar,stopCar"},alwaysRun = true)
    void parkCar(){
        System.out.println("Car parked");
    }
}