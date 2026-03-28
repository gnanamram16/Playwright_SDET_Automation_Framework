package tests;
 
import com.microsoft.playwright.*;
import com.microsoft.playwright.APIResponse;
import org.testng.annotations.*;
import utils.ApiUtils;
 
public class ApiTest {
 
    Playwright playwright;
 
    @BeforeClass
    public void setup() {
        playwright = Playwright.create();
        ApiUtils.init(playwright);
    }
 
    @Test
    public void testGetRequest() {
        APIResponse response = ApiUtils.getRequest("https://jsonplaceholder.typicode.com/posts/1");
        System.out.println("Status: " + response.status());
        System.out.println("Body: " + response.text());
        // Add assertions if needed
    }
 
    @Test
    public void testPostRequest() {
        String data = "{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }";
        APIResponse response = ApiUtils.postRequest("https://jsonplaceholder.typicode.com/posts", data);
        System.out.println("Status: " + response.status());
        System.out.println("Body: " + response.text());
    }
 
    @AfterClass
    public void tearDown() {
        ApiUtils.close();
        if (playwright != null) playwright.close();
    }
}
