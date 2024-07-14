import org.testng.ITestListener;
import org.testng.annotations.Test;

public class ListenerDemo implements ITestListener, ListerDemo1 {
    @Override
    public <ITestResult> void onTestSuccess(ITestResult result)
    {
        System.out.println("Listener test passed");;
    }
    @Test(dependsOnMethods = "SubmitOrder")
    public void OrderHistory()
    {
        System.out.println("Order history depends on submit order");
    }
}
