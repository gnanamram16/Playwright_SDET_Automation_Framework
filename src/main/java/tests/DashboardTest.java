package tests;
 
import com.microsoft.playwright.*;
import org.testng.annotations.*;
import pages.DashboardPage;
import utils.BrowserUtils;
 
public class DashboardTest {
 
    @BeforeClass
    public void setup() {
        BrowserUtils.launchBrowser();
        BrowserUtils.page.navigate("https://example.com/login");
        // Login first
        pages.LoginPage loginPage = new pages.LoginPage(BrowserUtils.page);
        loginPage.login("testuser", "testpassword");
    }
 
    @Test
    public void testWelcomeMessage() {
        DashboardPage dashboardPage = new DashboardPage(BrowserUtils.page);
        String message = dashboardPage.getWelcomeMessage();
        System.out.println("Welcome Message: " + message);
        // Add assertion if needed
    }
 
    @Test
    public void testLogout() {
        DashboardPage dashboardPage = new DashboardPage(BrowserUtils.page);
        dashboardPage.clickLogout();
        System.out.println("Logout executed");
    }
 
    @AfterClass
    public void tearDown() {
        BrowserUtils.closeBrowser();
    }
}
