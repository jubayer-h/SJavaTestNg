import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest {

    @Test(priority = 1)
    void setup() {
        System.out.println("hi");
    }

    @Test(priority = 2)
    void SearchCustomer() {
        System.out.println("Search customer");
    }
    @Test(priority = 3)
    void Addcustomer() {
        System.out.println("this is add customer");
        Assert.assertEquals(1,1);
    }
    @Test
    void Newtest(){
        System.out.println("neww add");
    }
    @Test
    void new1tesr(){
        System.out.println("hello");
    }
    @Test(priority = 4,groups = {"sanity"})
    void teardown() {
        System.out.println("close brower");
        System.out.println("i add grops testcase");
    }

}
