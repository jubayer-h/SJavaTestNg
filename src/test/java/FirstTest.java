import org.testng.annotations.Test;

public class FirstTest {
    @Test(priority = 1)
    void setup() {
        System.out.println("hi");
    }

    @Test(priority = 2)
    void login() {
        System.out.println("logini");
    }

    @Test(priority = 3)
    void teardown() {
        System.out.println("close brower");
    }


}
