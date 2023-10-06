package ua.hillel.homeworks.hw33_selenide;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.page;

public class HeaderSelenide extends Selectors {

    public String getCounterBasket (){
      String counterBasket = basketCounter.getAttribute("innerText");
        return counterBasket;
    }

    public BasketSelenide goToBasket(){
        basket.click();
        return Selenide.page(BasketSelenide.class);

    }

}
