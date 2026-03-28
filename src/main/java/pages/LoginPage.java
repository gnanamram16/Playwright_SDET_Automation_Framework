package pages;
 
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Locator;
 
public class LoginPage {
 
    private Page page;
 
    // Locators
    private Locator usernameInput;
    private Locator passwordInput;
    private Locator loginButton;
 
    // Constructor
    public LoginPage(Page page) {
        this.page = page;
        this.usernameInput = page.locator("#username");
        this.passwordInput = page.locator("#password");
        this.loginButton = page.locator("#loginBtn");
    }
 
    // Actions
    public void enterUsername(String username) {
        usernameInput.fill(username);
    }
 
    public void enterPassword(String password) {
        passwordInput.fill(password);
    }
 
    public void clickLogin() {
        loginButton.click();
    }
 
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}
