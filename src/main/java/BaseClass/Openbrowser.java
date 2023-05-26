package BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {
    public static WebDriver driver;

    public static void NavToWeb(String url){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    public static void CloseBrowser(){ driver.close();}

    public static void QuitDriver(){driver.quit();}

}
