import com.microsoft.playwright.*;
import org.testng.annotations.Test;


public class PlaywrightClass
{
    @Test
    public void firstprogram()
    {
        Playwright playwright = Playwright.create();
        BrowserType browserType = Playwright.create().chromium();
        Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext = browser.newContext();
        Page page = browserContext.newPage();

//        Page page = Playwright.create().chromium().launch().newContext().newPage();
        page.navigate("https://playwright.dev/");
        System.out.println(page.title());
    }
}
