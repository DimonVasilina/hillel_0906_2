package hw32;

import org.openqa.selenium.WebDriver;

public class POSubCategoryPage extends Locators {

    private WebDriver driver;

    public POSubCategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleFirstProduct() {
        return driver.findElement(titleProduct).getText();
    }

    public POSubCategoryPage addToBasketFromCard() {
        driver.findElement(addToBasketOnItemCard)
                .click();
        return new POSubCategoryPage(driver);
    }
    public ProductPage getTopSalesFirstCard(){
        driver.findElement(topSalesFlag).click();
        return new ProductPage(driver);
    }

}