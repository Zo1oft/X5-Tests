package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchPage {
    //locator
    SelenideElement
            searchHeader = $(".search-results-header__title"),
            searchResults = $(".search-results__item");

    //action

    public void searchPageCheck() {
        searchHeader.shouldHave(Condition.text("Результаты поиска"));

    }
    public void searchResultsCheck() {
        searchResults.shouldHave(Condition.text("заказать продукты"));

    }
}
