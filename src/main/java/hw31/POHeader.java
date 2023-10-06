package hw31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POHeader {
    By basketCounter = By.xpath("//rz-icon-badge//span");
    By basket =  By.xpath("//rz-cart//button");
    private WebDriver driver;
    public  POHeader (WebDriver driver) {
        this.driver = driver;
    }
    public String getBasketCounter (){
        return driver.findElement(basketCounter).getAttribute("innerText");
    }
    public PObasket goToBasket(){
        driver.findElement(basket).click();
        return new PObasket(driver);
    }

}
