package lesson19.testsuite;

import org.testng.annotations.Test;

public class SecondClass {

    @Test(groups = {"regression"})
    public void thirdTest() {
        System.out.println("it is third test");
    }
}
