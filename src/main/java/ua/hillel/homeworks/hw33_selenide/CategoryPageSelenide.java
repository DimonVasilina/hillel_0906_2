package ua.hillel.homeworks.hw33_selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.page;

public class CategoryPageSelenide extends Selectors {
    public SubCategoryPageSelenide goToSubCategory (String subCategoryTitle) {
        SelenideElement filteredSubCategories = subCategories.filterBy(Condition.text(subCategoryTitle)).first();
        filteredSubCategories.click();
        return page(SubCategoryPageSelenide.class);
    }
}
