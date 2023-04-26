package utils;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;

public interface Locator {

    By lsignup=By.xpath("//a[@href='/login']");
    By lLogout=By.xpath("//a[@href='/logout']");
    By lemail=By.cssSelector(".login-form input[name='email']");
    By lPassword=By.cssSelector(".login-form input[name='password']");
    By lLoginButton =By.cssSelector(".login-form button[type='submit']");
    By lName=By.xpath("//form[@method='POST']//input[@name='name']");
    By lSinupEmail=By.xpath("//form[@method='POST']//input[@data-qa='signup-email']");
    By lsinupLoginButton=By.cssSelector(".signup-form button[type='submit']");
    By lFormPassword=By.id("password");
    By lFormDay=By.xpath("//div[@id='uniform-days']/select");
    By lFormMonths=By.xpath("//div[@id='uniform-months']/select");
    By lFormYears=By.xpath("//div[@id='uniform-years']/select");
    By lCheckBox=By.id("newsletter");
    By lCheckBox2=By.id("optin");
    By lContinueButton= By.xpath("//a[text()='Continue']");
    By lDeledeAccount=By.xpath("//a[contains(@href,'account')]");





}
