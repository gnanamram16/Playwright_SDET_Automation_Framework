package tests;
 
import com.microsoft.playwright.*;
import org.testng.annotations.*;
import pages.LoginPage;
import utils.BrowserUtils;
 
public class LoginTest {
 
    @BeforeClass
    public void setup() {
        BrowserUtils.launchBrowser();
    }
 
    @Test
    public void testLogin() {
        BrowserUtils.page.navigate("https://example.com/login");
        LoginPage loginPage = new LoginPage(BrowserUtils.page);
        loginPage.login("testuser", "testpassword");
        // You can add assertions here
        System.out.println("Login test executed");
    }
 
    @AfterClass
    public void tearDown() {
        BrowserUtils.closeBrowser();
    }
}
