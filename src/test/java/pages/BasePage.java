package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import org.openqa.selenium.TimeoutException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
    public static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

    static{
        WebDriverManager.chromiumdriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }        

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
    }

    public static void navigateTo(String url){
        driver.get(url);
    }

    public static void closeBrowser(){
        driver.close();
    }

    private WebElement Find(String locator){
        WebElement ele = null;
    	try {
    		ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));	
    	}catch(TimeoutException  ex) {
    		System.out.println("WebElement :"+locator+" Not found");
    	}
        return ele;
    }

    public void clickElement(String locator){
        Find(locator).click();
    }

    public void write(String locator,String value){
        Find(locator).clear();
        Find(locator).sendKeys(value);
        Find(locator).sendKeys(Keys.ENTER);
    }
  
    public String validateTitlePriceBasePage(String locator){
        String FindTitle = Find(locator).getText();
        return FindTitle;
    }

    public int findPlayandConsolaBasePage(String locator1,String locator2){
        Find(locator1);
        Find(locator2);
        List<WebElement> lista1 = driver.findElements(By.xpath(locator1));
        List<WebElement> lista2 = driver.findElements(By.xpath(locator2));
        int val =0;
        if(lista1.size()>0 && lista2.size()>0){
            val =1;
        }else{
            val =0;
        }
        return val;

    }

    public void findValidMove(String locator){
        WebElement ele = Find(locator);
    	Actions action = new Actions(driver);
    	action.moveToElement(ele).perform();
    }



    public String validateSizePriceBasePage(String locator){
        String FindTitle = Find(locator).getText();
        return FindTitle;
    }

    public int validateResultCountBasePage(String locator){
        Find(locator);
        List<WebElement> lista = driver.findElements(By.xpath(locator));
        if(lista.size()>0){
            return lista.size();
        }else{
            return 0;
        }
    }
}
