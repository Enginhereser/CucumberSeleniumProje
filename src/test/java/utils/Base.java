package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Base extends Driver{



    public void click(By locator){
        WebElement element = driver.findElement(locator);
        scroll(element);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public void sendKeys(By locator,String text){
        WebElement element = driver.findElement(locator);
        scroll(element);
        driver.findElement(locator).sendKeys(text);
    }
    public By locator(String text){
        return By.xpath("//div[@class='login-form']//p/input[contains(@id,'"+text+"')]");
    }

    public Object scroll(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        return js.executeScript("arguments[0].scrollIntoView();", element);
    }

}
