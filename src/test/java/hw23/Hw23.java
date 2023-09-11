
package hw23;

import init.InitialDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Hw23 extends InitialDriver {
    @Test
    public void findFirstTopSale() throws InterruptedException {
        driver.get("https://rozetka.com.ua/ua/");
        WebElement laptopsAndComputers = driver
                .findElement(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]"));
        laptopsAndComputers.click();
        WebElement laptops = driver.findElement(By.xpath("//a[@title='Ноутбуки']"));
        laptops.click();
        WebElement sellerRozetka = driver.findElement(By.xpath("//a[@data-id='Rozetka']"));
        sellerRozetka.click();
        WebElement maxPrice = driver
                .findElement(By.xpath("//input[@formcontrolname='max']"));
        maxPrice.clear();
        maxPrice.sendKeys("100000");
        WebElement submitPrice = driver.findElement(By.xpath("//rz-scrollbar//button[@type='submit']"));
        submitPrice.click();
        WebElement topSales = driver
                .findElement(By
                        .xpath("//span[contains(text(),'ТОП ПРОДАЖ')]/ancestor::div[@class='goods-tile__inner']"));
        topSales.click();
        WebElement topSaleasOnProductCard = driver
                .findElement(By
                        .xpath("(//*[@class='simple-slider__holder carousel']//span[contains(text(),'ТОП ПРОДАЖ')])[2]"));
        // xpath довгий, але він обмежує вибір лише в слайдері, не чіпаючи інші блоки
        Assert.assertTrue(topSaleasOnProductCard.isDisplayed(), "ТОП ПРОДАЖ is not displayed");

    }

}