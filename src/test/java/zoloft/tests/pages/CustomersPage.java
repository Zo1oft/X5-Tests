package zoloft.tests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CustomersPage {
    //locators
    SelenideElement
    planningBlock = $("div[data-slide='planning']"),
    shoppingBlock = $("div[data-slide='shopping']"),
    deliveryBlock = $("div[data-slide='delivery']"),
    servicesBlock = $("div[data-slide='services']");


    //actions
    public void planningBlockCheck() {
        planningBlock.shouldHave(Condition.text("Планирование"));
    }

    public void shoppingBlockCheck() {
        shoppingBlock.shouldHave(Condition.text("Покупка"));
    }

    public void deliveryBlockCheck() {
        deliveryBlock.shouldHave(Condition.text("Доставка"));
    }

    public void servicesBlockCheck() {
        servicesBlock.shouldHave(Condition.text("Сервисы"));
    }
}
