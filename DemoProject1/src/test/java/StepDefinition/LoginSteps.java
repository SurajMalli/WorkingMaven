package StepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginSteps {


    WebDriver driver;
    @Given("user is in login page")
    public void user_is_in_login_page(){

        System.setProperty("webdriver.chrome.driver","src/main/resources/Driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("user is in login page");
    }
    @When("user enters username and password")
    public void user_enters_username_and_password(){
        System.out.println("user enters username and password");
    }
    @And ("clicks on login button")
    public void clicks_on_login_button(){
        System.out.println("clicks on login button");
    }
    @Then("user is logged in successfully")
    public void user_is_logged_in_successfully(){
        driver.quit();
        System.out.println("user is logged in successfully");

    }

}
