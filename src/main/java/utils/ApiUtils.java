package utils;
 
import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.APIResponse;
import com.microsoft.playwright.Playwright;
 
public class ApiUtils {
    public static APIRequestContext request;
 
    public static void init(Playwright playwright) {
        request = playwright.request().newContext();
    }
 
    public static APIResponse getRequest(String url) {
        return request.get(url);
    }
 
    public static APIResponse postRequest(String url, String data) {
        return request.post(url, APIRequest.NewContextOptions().setData(data));
    }
 
    public static void close() {
        if (request != null) request.dispose();
    }
}
