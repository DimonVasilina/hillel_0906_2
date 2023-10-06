package hw33;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import javax.swing.text.Element;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public

class Selectors {
    ElementsCollection categories =
            $$(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li"));
    ElementsCollection subCategories = $$(By.xpath("//rz-list-tile"));
    ElementsCollection titleProduct = $$(By.cssSelector(".goods-tile__inner >a >span"));
    ElementsCollection addToBasketOnItemCard = $$(By.cssSelector(" app-buy-button"));

    SelenideElement basketCounter = $(By.xpath("//rz-icon-badge//span"));
    SelenideElement basket = $(By.xpath("//rz-cart//button"));

    ElementsCollection itemTitleInBasket = $$(By.xpath("//a[@data-testid='title']"));
    SelenideElement countOfItemInTheBasket = $(By.xpath("//input[@formcontrolname='quantity']"));

}
