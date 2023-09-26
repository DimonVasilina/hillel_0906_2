package hw32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMainP {

    By laptopsAndComputersByMenu = By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]");


    private WebDriver driver;
    public POMainP(WebDriver driver) {
        this.driver = driver;
    }

    public POCategoryPage selectCategory(){
        driver.findElement(laptopsAndComputersByMenu).click();
        return new POCategoryPage(driver);
    }
}
