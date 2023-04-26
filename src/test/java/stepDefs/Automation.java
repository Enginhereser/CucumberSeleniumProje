package stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utils.Base;

import java.util.Map;

import static utils.Locator.*;

public class Automation extends Base {
    @Given("user on {string}")
    public void userOn(String url) {
        driver.get(url);
    }

    @When("user click Login Sign button")
    public void userClickLoginSignButton() {
        click(lsignup);
    }

    @And("user login with the following credentials")
    public void userLoginWithTheFollowingCredentials(DataTable table) {
       Map<String,String> map = table.asMap();
        sendKeys(lemail,map.get("username"));
        sendKeys(lPassword,map.get("password"));
        click(lLoginButton);

    }

    @Then("login should be successfull")
    public void loginShouldBeSuccessfull() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lLogout));
    }

    @And("Verify {string} is visible")
    public void verifyNewUserSignupIsVisible(String text) {
        WebElement element = driver.findElement(By.xpath("//h2[text()='" + text + "']"));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    String name="Guider";
    String email="guider@gmail";
    @And("Enter name and email address")
    public void enterNameAndEmailAddress() {
        sendKeys(lName,name);
        sendKeys(lSinupEmail,email);

    }



    @Then("Verify that {string} is visible")
    public void verifyThaIsVisible(String text) {
        WebElement element = driver.findElement(By.xpath("//b[contains(.,'"+text+"')]"));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    @And("Fill details: Title, Name, Email, Password, Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth() {
        sendKeys(lFormPassword,"Engin");
        WebElement day = driver.findElement(lFormDay);
        Select sl=new Select(day);
        sl.selectByValue("10");
        WebElement months = driver.findElement(lFormMonths);
        sl=new Select(months);
        sl.selectByValue("10");
        WebElement years = driver.findElement(lFormYears);
        sl=new Select(years);
        sl.selectByValue("2000");


    }

    @And("Select checkbox 'Sign up for our newsletter!'")
    public void selectCheckboxSignUpForOurNewsletter() {
        click(lCheckBox);

    }

    @And("Fill details: First name, Last name, Company, Address, Address, Country, State, City, Zipcode, Mobile Number")
    public void fillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber() {
        sendKeys(locator("first_name"),"Engin");
        sendKeys(locator("last_name"),"Eser");
        sendKeys(locator("company"),"Guider");
        sendKeys(locator("address1"),"Germany");
        sendKeys(locator("address2"),"hessen");
        sendKeys(locator("state"),"Germany");
        sendKeys(locator("city"),"limburg");
        sendKeys(locator("zipcode"),"65549");
        sendKeys(locator("mobile_number"),"0179512");
    }

    @And("Click {string} button" )
    public void clickCreateAccountButton(String text) {
        WebElement element = driver.findElement(By.xpath("//button[text()='" + text + "']"));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }



    @And("Select checkbox 'Receive special offers from our partners!'")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        click(lCheckBox2);
    }


    @And("Click Continue button")
    public void clickContinueButton() {
        click(lContinueButton);
    }

    @And("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        By lLoggedInAsUsername=By.xpath("//a[contains(.,'Logged in as "+name+"')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(lLoggedInAsUsername));
    }

    @And("Click Delete Account button")
    public void clickDeleteAccountButton() {
        click(lDeledeAccount);
    }
}
