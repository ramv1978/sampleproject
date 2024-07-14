import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDemo
{
    @BeforeTest
            public void setup()
    {
        System.out.println("Before Test");
    }

    @Test
    public void first()
    {
        System.out.println("First Test");
    }

    @Test
    public void second()
    {
        System.out.println("second Test");
    }

    @Test
    public void third()
    {
        System.out.println("third Test");
    }

    @Test (enabled = false)
    public void fourth()
    {
        System.out.println("fourth Test");
    }

    @Test(timeOut = 50)
    public void ooauth()
    {
        System.out.println("Oath authentication");
    }
//    @Parameters({"Browser"})
//    @Test
//    public void RestAssured(String Browsername)
//    {
//        System.out.println("Rest Assured demo");
//        System.out.println("Browsername is " + Browsername);
//    }

    @Test(dataProvider="getData")
    public void MobilesignoutcarLoan(String username,String password)
    {
        //Appium
        System.out.println("Mobile SIGN OUT");
        System.out.println(username);
        System.out.println(password);

    }
    @DataProvider
    public Object[][] getData() {
        //1st combination - username password - good credit history= row
        //2nd - username password  - no credit history
        // 3rd - fraudulent credit history
        Object[][] data = new Object[1][2];
        //1st set
        data[0][0] = "firstsetusername";
        data[0][1] = "firstpassword";
        return data;
    }
}

