package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    //locators
    SelenideElement
            searchButton = $(".header-search__search-btn"),
            searchInput = $("#search-term-header"),
            searchLaunch = $(".header-search__submit-btn"),
            customersPageButton = $$(".header__nav-link").findBy(Condition.text("Покупателю"));

    //actions
    public MainPage openPage() {
        open("https://www.x5.ru/ru/");
        return this;
    }

    public void searchPrepare() {
        searchButton.click();


    }
    public void searchStart() {
        searchInput.setValue("Заказать продукты");
        searchLaunch.click();

    }

    public void customersPageTransfer() {
        customersPageButton.click();
    }
}
