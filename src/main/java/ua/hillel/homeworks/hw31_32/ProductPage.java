package ua.hillel.homeworks.hw31_32;

import org.openqa.selenium.WebDriver;
import ua.hillel.homeworks.hw31_32.Locators;

public class ProductPage extends Locators {

    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkShowTopSalesFlag(){
        boolean flagIsShow = driver.findElement(topSaleasFlagProductPage).isDisplayed();
        return flagIsShow;
    }

}
