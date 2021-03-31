import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
    static String relativePath = "/resources/drivers/windows/chromedriver.exe";
    static String chromeDriverPath = System.getProperty("user.dir") + relativePath;
    public static String URL = "https://amazon.com/";
    static WebDriver driver;

    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        driver.manage().deleteAllCookies();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
