package pages;
 
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Locator;
 
public class DashboardPage {
 
    private Page page;
 
    // Locators
    private Locator welcomeMessage;
    private Locator logoutButton;
 
    // Constructor
    public DashboardPage(Page page) {
        this.page = page;
        this.welcomeMessage = page.locator("#welcomeMsg");
        this.logoutButton = page.locator("#logoutBtn");
    }
 
    // Actions
    public String getWelcomeMessage() {
        return welcomeMessage.textContent();
    }
 
    public void clickLogout() {
        logoutButton.click();
    }
}
