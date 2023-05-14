package stepdefinitions;

import hooks.DriverInit;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hooks2_Steps extends DriverInit {
    @Given("user navigates to the webpage after entering URL")
    public void userNavigatesToTheWebpageAfterEnteringURL() {
        driver=new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @Given("{string} and {string} entered by the user")
    public void andEnteredByTheUser(String Username, String password) throws InterruptedException {

        driver.findElement(By.xpath("//*[@id='username']")).sendKeys(Username);
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
        Thread.sleep(3000);
    }

    @When("login button gets clicked by the user")
    public void loginButtonGetsClickedByTheUser() throws InterruptedException {
        driver.findElement(By.id("submit")).click();
        System.out.println("Button Clicked");
        Thread.sleep(3000);
    }

    @Then("login page gets opened up")
    public void loginPageGetsOpenedUp() throws InterruptedException {
        System.out.println(driver.findElement(By.xpath("(//*[contains(text(),'Logged In Successfully')])[3]")).getText());
     Thread.sleep(4000);
    }

    @And("logout button gets clicked")
    public void logoutButtonGetsClicked() throws InterruptedException {
        driver.findElement(By.xpath("//*[contains(text(),'Log out')]")).click();
        Thread.sleep(3000);
    }

    @And("invalid credentials {string} and {string}")
    public void invalidCredentials(String Username, String password) throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys(Username);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(5000);
    }

    @When("login button is been clicked by a user")
    public void loginButtonIsBeenClickedByAUser() throws InterruptedException {
        driver.findElement(By.id("submit")).click();
        System.out.println("Button Clicked");
        Thread.sleep(3000);
    }

    @Then("error occured regarding the credentials")
    public void errorOccuredRegardingTheCredentials() throws InterruptedException {
        String errormessage = driver.findElement(By.id("error")).getText();
        System.out.println(errormessage);
        Thread.sleep(3000);
    }


}
