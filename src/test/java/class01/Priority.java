package class01;

import org.testng.annotations.Test;

public class Priority {
    @Test(priority=3)
    public void FirstTest(){
        System.out.println("1");
    }
    @Test(priority=2)
    public void SecondTest(){
        System.out.println("2");
    }
    @Test(priority=1)
    public void ThirdTest(){
        System.out.println("3");
    }
}
