package hw31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POSubCategoryPage {
    By titleProduct = By.cssSelector(".goods-tile__inner >a >span");
    By addToBasketOnItemCard = By.cssSelector(" app-buy-button");
    private WebDriver driver;

    public POSubCategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleProductFirstProduct (){
        return driver.findElement(titleProduct).getText().trim();
    }

    public POSubCategoryPage addToBasketFromCard (){
    driver.findElement(addToBasketOnItemCard)
            .click();
        return new POSubCategoryPage(driver);
    }



}