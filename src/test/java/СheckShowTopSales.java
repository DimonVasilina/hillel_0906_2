import hw32.*;
import init.InitialDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class СheckShowTopSales extends InitialDriver {

    @Test
    public void СheckShowTopSalesOnProductPage() {
        driver.get("https://rozetka.com.ua/ua/");
        new POMainP(driver)
                .selectCategory().selectSubCategory();
        new Sorting(driver).chooseSeller().chooseMaxPrice("100000").submitSorting();
        boolean flagTopSales = new POSubCategoryPage(driver).getTopSalesFirstCard().checkShowTopSalesFlag();
        Assert.assertTrue (flagTopSales, "ТОП ПРОДАЖ is not displayed");

    }

}

