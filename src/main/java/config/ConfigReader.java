package config;
 
import java.util.Properties;
 
public class ConfigReader {
    private static Properties prop = new Properties();
 
    static {
        try {
            prop.load(ConfigReader.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public static String get(String key) {
        return prop.getProperty(key);
    }
}
 
