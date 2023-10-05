package hw33;

import static com.codeborne.selenide.Selenide.page;

public class HeaderSelenide extends Selectors {

    public String getCounterBasket (){
      String counterBasket = basketCounter.getAttribute("innerText");
        return counterBasket;
    }

    public BasketSelenide goToBasket(){
        basket.click();
        return page(BasketSelenide.class);

    }

}
