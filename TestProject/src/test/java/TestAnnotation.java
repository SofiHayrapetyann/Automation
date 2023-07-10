
import org.example.Main;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class TestAnnotation{
    @Test
    public void testMethod(){
        System.out.println("Test method");
    }
    @BeforeTest
    public  void beforeTestMethod(){
        System.out.println("Before test method");
    }
    @AfterTest
    void afterTestMethod(){
        System.out.println("After test method");
    }
 @AfterClass
    void afterClassMethod(){
     System.out.println("After class method");
 }
 @AfterMethod
    void afterMethod(){
     System.out.println("after method method");
 }
    @Test(dataProvider = "testData")
    public void test(int a, int b, int expected) {
        System.out.println("dghuish");
        Main main = new Main();
        Assert.assertEquals(Main.divide(a,b), expected);
    }
    @Test(dataProvider = "testData")
    public  void test2(int a,int b,int expected){
        System.out.println(a);
    }
    @DataProvider(name = "testData")
    public Object[][] testDataProvider() {
        return new Object[][] {
                {8,2,4},
                {4,2,2}
        };
    }
    @Test(groups={"smoke"})
    public void testPrintln(){

    }

}
