package hw32;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;
import java.time.Duration;

public class Sorting extends Locators {
    private WebDriver driver;

    public Sorting(WebDriver driver) {
        this.driver = driver;
    }

    public Sorting chooseSeller(){
        driver.findElement(sellerRozetka).click();
        return new Sorting(driver);
    }

    public Sorting chooseMaxPrice(String price){
        WebElement maxPriceInput = driver.findElement(maxPriceFild);
        maxPriceInput.clear();
        maxPriceInput.sendKeys(String.valueOf(price));
        return new Sorting(driver);
    }

    public Sorting submitSorting  (){
        driver.findElement(submitButton).click();
        return new Sorting(driver);
    }



}
