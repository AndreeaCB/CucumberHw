package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {
    WebDriver webDr;

    @Given("^I go on the petclinic site on the Pet Type Tab$")
    public void iGoOnThePetclinicSite() throws Throwable {
        webDr = new ChromeDriver();
        webDr.get("http://bhdtest.endava.com/petclinic/pettypes");
        webDr.manage().window().maximize();
        webDr.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

    }

    @When("^I click on the Add Button AND I complete the Name field as \"([^\"]*)\"$")
    public void iClickOnTheAddButtonANDICompleteTheNameFieldAs(String arg0) throws Throwable {
        webDr.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
        webDr.findElement(By.xpath("//input[@id='name']")).sendKeys("TestPet");
    }

    @Then("^I click on the Save Button$")
    public void iClickOnTheSaveButton() throws Throwable {
        webDr.findElement(By.xpath("//button[@type='submit']")).click();
    }

    //second Scenario

    @Given("^I go on the petclinic site on the Add Veterinarian Tab$")
    public void iGoOnThePetclinicSiteOnTheAddVeterinarianTab() throws Throwable {
        webDr = new ChromeDriver();
        webDr.get("http://bhdtest.endava.com/petclinic/vets/add");
        webDr.manage().window().maximize();
        webDr.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    }

    @When("^I complete the firstName field as \"([^\"]*)\" AND lastName field as \"([^\"]*)\" AND click on the Type Dropdpwn AND select a value from Dropdown$")
    public void iCompleteTheFirstNameFieldAsANDLastNameFieldAsANDClickOnTheTypeDropdpwnANDSelectAValueFromDropdown(String arg0, String arg1) throws Throwable {
        webDr.findElement(By.xpath("//input[@id='firstName']")).sendKeys("First Name Vet Cucumber");
        webDr.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Last Name Vet Cucumber");
        webDr.findElement(By.xpath("//select[@id='specialties']")).click();
        webDr.findElement(By.xpath("//option[@value='0: Object']")).click();

    }

    @Then("^I click on the SaveVet Button$")
    public void iClickOnTheSaveVetButton() throws Throwable {
        webDr.findElement(By.xpath("//button[@type='submit']")).click();
        webDr.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
