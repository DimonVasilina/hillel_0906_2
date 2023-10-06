package hw33;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.page;

public class MainPageSelenide extends Selectors{

    public CategoryPageSelenide goToCategory(String categoryTitle ){
        SelenideElement filteredCategories = categories.
                filterBy(Condition.text(categoryTitle))
                .first();
        filteredCategories.click();
        return page(CategoryPageSelenide.class);
    }

}
