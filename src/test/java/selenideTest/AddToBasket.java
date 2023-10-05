package selenideTest;

import com.codeborne.selenide.Condition;
import hw33.BasketSelenide;
import hw33.HeaderSelenide;
import hw33.MainPageSelenide;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class AddToBasket {

    @Test
    public void checkAddToBasketSelenide() {
        open("https://www.rozetka.com.ua/");
        String titleFirstProduct = new MainPageSelenide().goToCategory("Ноутбуки и компьютеры")
                .goToSubCategory("Ноутбуки").addToBasket().getTitleProduct();
        String counterBasket = new HeaderSelenide().getCounterBasket();
        counterBasket.equals("1");
        String titleProductInBasket = new HeaderSelenide().goToBasket().getTitleInBasket();
        String countOfItemInBasket = new BasketSelenide().getCountItem();
        Assert.assertEquals(titleFirstProduct, titleProductInBasket, "Title aren`t equals");
        Assert.assertEquals(counterBasket, countOfItemInBasket, "Added to Basket mostly");
    }
}
