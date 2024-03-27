package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PrincipalPage;
import org.testng.Assert;
import java.lang.Thread;

public class LiverpoolStepDefinition {
    PrincipalPage landingPage = new PrincipalPage();


    @Given("I navigate to liverpool page")
    public void navigation(){
        landingPage.navigateToLiverpool();
    }

    @When("I search the products {string}")
    public void findeElement(String value){
        landingPage.clickInsertEnterPagePrincipal(value);
    }
    
    @Then("Validate that playstation 5 and consola is displayed")
    public void findPlayandConsola(){
        int num = landingPage.findPlayandConsolaPrincipalPage();
        Assert.assertTrue(num>0);
    }

    @Then("I select a playstation 5 in the result listened")
    public void findProductoPlayStation5(){
        landingPage.findProductoPlayStation5PrincipalPage();
    }

    @And("I validate the {word} of the item displayed")
    public void validateTitle(String value){
        String cad = landingPage.validateTitlePrincipalPage(value);
        String description = "Control gamepad Sony";
        String cantidad = "$7,099";
        if(value.equals("title")){
            Assert.assertTrue(cad.contains(description));
        }else{
            Assert.assertTrue(cad.contains(cantidad));
        }
    }

    @Then("Validate that {string} is displayed")
    public void validateSizePrice(String value) throws InterruptedException{
        String new_string = "Precios";
        Thread.sleep(10000);
        String wordSizeFound = landingPage.validateSizePricePrincipalPage();
        Thread.sleep(10000);
        Assert.assertEquals(new_string,wordSizeFound);
    }
    
    @Then("I filter the result by 55 inches")
    public void click55inches() throws InterruptedException{
        landingPage.clickSeeMorePrincipalPage();
        Thread.sleep(6000);
        landingPage.click55inchesPrincipalPage();
    }
 
    @Then("I filter the result by price greater than 10000")
    public void clickOnPrice() throws InterruptedException{
        Thread.sleep(6000);
        landingPage.clickOnPricePrincipalPage();
    }
 
    @Then("I filter the result by brand sony")
    public void clickOnBrand() throws InterruptedException{
        Thread.sleep(7000);
        landingPage.clickOnBrandPrincipalPage();
    }
 
    @And("I validate the result count")
    public void ValidateResultCount() throws InterruptedException{
        Thread.sleep(6000);
        int result = landingPage.ValidateResultCountPrincipalPage();
        Assert.assertTrue(result==4);
    }

    @When("I select categorias menu")
    public void clickOnCategorias(){
        landingPage.clickOnCategoriasPrincipalPage();
    }

    @Then("I select belleza")
    public void clickOnBelleza(){
        landingPage.clickOnBellezaPrincipalPage();
    }

    @Then("I select perfumes de hombre")
    public void clickOnPerfumeHombre(){
        landingPage.clickOnPerfumeHombrePrincipalPage();
    }

    @And("I select by dior brand filter")
    public void selectDiorFilter(){
        landingPage.selectDiorFilterPagePrincipal();
    }
}
