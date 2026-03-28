package utils;
 
import com.microsoft.playwright.*;
import java.util.*;
 
public class BrowserUtils {
    public static Playwright playwright;
    public static Browser browser;
    public static BrowserContext context;
    public static Page page;
 
    public static void launchBrowser() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        context = browser.newContext();
        page = context.newPage();
    }
 
    public static void closeBrowser() {
        if (page != null) page.close();
        if (context != null) context.close();
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
    }
}

 
