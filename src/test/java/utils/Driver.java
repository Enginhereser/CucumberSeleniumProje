package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public Driver(){
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            wait=new WebDriverWait(driver, Duration.ofSeconds(10));

    }
}
