package ua.hillel.homeworks.hw33_selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.page;

public class MainPageSelenide extends Selectors {

    public CategoryPageSelenide goToCategory(String categoryTitle ){
        SelenideElement filteredCategories = categories.
                filterBy(Condition.text(categoryTitle))
                .first();
        filteredCategories.click();
        return Selenide.page(CategoryPageSelenide.class);
    }

}
