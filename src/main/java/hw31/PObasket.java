package hw31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PObasket {
    By itemsInBasket = By.xpath("//a[@data-testid='title']");
    By itemTitleInBasket = By.xpath("//a[@data-testid='title']");
    By itemCountInTheBasket = By.xpath("//input[@formcontrolname='quantity']");
    private WebDriver driver;

    public PObasket(WebDriver driver) {
        this.driver = driver;
    }

    public String titleProductInBasket(){

        return driver.findElement(itemTitleInBasket).getText();
    }

    public String countOfItemInBasket(){

        return driver.findElement(itemCountInTheBasket).getAttribute("value");
    }
    public int countProductsInBasket (){
        List<WebElement> elements = driver.findElements(itemsInBasket);
        int countProductCards = elements.size();
        return countProductCards;
    }
}
