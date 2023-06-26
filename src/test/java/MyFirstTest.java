import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstTest {
    int a = 6;

    @Test
    public void  Check_a_IsEven() {
        System.out.println("Inside check_a_IsEven");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Inside afterTest");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Inside beforeTest");
    }


}
