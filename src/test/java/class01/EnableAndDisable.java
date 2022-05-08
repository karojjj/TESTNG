package class01;

import org.testng.annotations.Test;

public class EnableAndDisable {
    @Test(enabled = false)
    public void FirstTest(){
        System.out.println("1");
    }
    @Test(enabled = true)
    public void SecondTest(){
        System.out.println("2");
    }
    @Test(enabled = true)
    public void ThirdTest(){
        System.out.println("3");
    }
}


