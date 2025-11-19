package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageDefine {

    WebDriver driver = new ChromeDriver();


    @Given("I am on the Demo Web Shop")
    public void i_am_on_the_demo_web_shop() throws InterruptedException{
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(5000);
    }

    @When("I click on the {string} link")
    public void i_click_on_the_link(String linkText) {
        driver.findElement(By.xpath("//a[text()='" + linkText + "']")).click();
    }
    @When("I enter the registration details")
    public void i_enter_the_registration_details() {
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("Parmod");
        driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("Dhiman");
        driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("pakkam@123gmail.com");
        driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("Dhiman12345");
        driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("Dhiman12345");
    }
    @When("I click on {string} button")
    public void i_click_on_button(String buttonText) {
        driver.findElement(By.xpath("//input[@value='" + buttonText + "']")).click();

    }
    @Then("I should see the message {string}")
    public void i_should_see_the_message(String expected) {
        String actual = driver.findElement(By.className("result")).getText();
        Assert.assertEquals(expected, actual);

        driver.quit();
    }
}
