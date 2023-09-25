import hw31.*;
import init.InitialDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class СheckBasketPO extends InitialDriver {
    @Test
    public void checkAddToBasket() {

        int countProductCards;
        int basketCountInt;
        SoftAssert softAssert = new SoftAssert();
        driver.get("https://rozetka.com.ua/ua/");
        String titleFirstCard = new POMainP(driver)
                .categoryClick().goToSubCategoryClick()
                .getTitleProductFirstProduct();
        new POSubCategoryPage(driver).addToBasketFromCard();
        String headerBasketCount = new POHeader(driver).getBasketCounter();
        new POHeader(driver).goToBasket();
        countProductCards = new PObasket(driver).countProductsInBasket();
        basketCountInt = Integer.valueOf(headerBasketCount);
            softAssert.assertEquals(basketCountInt,countProductCards,
                    "Product`s count in the basket isn`t equal to have chosen count");
        String titleItemInBasket = new PObasket(driver).titleProductInBasket();
        softAssert.assertEquals(titleItemInBasket, titleFirstCard,
                "Product title in the basket different from chosen Product title");
        String countOfItem = new PObasket(driver).countOfItemInBasket();
        softAssert.assertEquals(countOfItem, headerBasketCount,
                "Product`s count in the basket aren`t equal to have chosen count");
        softAssert.assertAll();
    }
}
