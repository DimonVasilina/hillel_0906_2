package ua.hillel.homeworks.hw33_selenide;

public class BasketSelenide extends Selectors {

        public String getTitleInBasket(){
            String title = "-1";
            int countBasketHeader = Integer.valueOf(new HeaderSelenide().getCounterBasket());
            if(countBasketHeader ==itemTitleInBasket.size()){
               title = itemTitleInBasket.first().getText();
            } else {
                System.out.println("Item`s count more then Expected");
                }
            return title;
        }

        public String getCountItem(){
           String count = countOfItemInTheBasket.getAttribute("value");
           return count;
        }
}
