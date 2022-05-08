package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotations {
    @Test //this annotation will test our code now we can run the test
    public void cfirstTest(){
        System.out.println("this is my first testcase");
    }
    // in order to run testcase we need to use annotations
    @Test
    public void asecondTest(){
        System.out.println("this is my second testcase");
    }
    @Test
    public void bthirdCase(){
        System.out.println("this is my third case");
    }
    @BeforeMethod
    public void beforeMethod(){ //we have three test case before this test case so it will execute three times
        System.out.println("**********I am precondition********");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("**********I am post condition ********");
    }
}
//when we run all three test cases it runs alphabetically
