package hw33;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SubCategoryPageSelenide extends Selectors{



    public String getTitleProduct(){
        SelenideElement titleFirstProduct = titleProduct.first();
        return titleFirstProduct.getText();
    }
    public SubCategoryPageSelenide addToBasket(){
        addToBasketOnItemCard.first().click();
        return page(SubCategoryPageSelenide.class);
    }

}
