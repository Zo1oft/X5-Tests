package zoloft.tests.tests;

import zoloft.tests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class X5Tests extends TestBase {

    @Test
    @Description("Проверка работы поиска на сайте")
    @DisplayName("Поиск")
    void careerPageTest() {
        step("Открываем сайт X5 Retail Group", () -> {
           mainPage.openPage();
        });

        step("Вводим в поиске 'Заказать продукты'", () -> {
            mainPage.searchPrepare();
            mainPage.searchStart();
        });

        step("Проверяем, что мы на верной странице и есть релевантная выдача", () -> {
            searchPage.searchPageCheck();
            searchPage.searchResultsCheck();
        });
    }

    @Test
    @Description("Проверка работы станицы 'Покупателю'")
    @DisplayName("Покупателю")
    void casesPageTest() {
        step("Открываем сайт X5 Retail Group", () -> {
            mainPage.openPage();
        });

        step("Переходим на страницу 'Покупателям'", () -> {
            mainPage.customersPageTransfer();
        });

        step("Проверяем наличие блока 'Планирование'", () -> {
            customersPage.planningBlockCheck();
        });

        step("Проверяем наличие блока 'Покупка'", () -> {
            customersPage.shoppingBlockCheck();
        });

        step("Проверяем наличие блока 'Доставка'", () -> {
            customersPage.deliveryBlockCheck();
        });

        step("Проверяем наличие блока 'Сервисы'", () -> {
            customersPage.servicesBlockCheck();
        });
    }

    @Test
    @Description("Проверка наличия Title на странице")
    @DisplayName("Работоспособность сайта")
    void titleTest() {
        step("Открываем сайт X5 Retail Group", () -> {
            mainPage.openPage();
        });
        step("Проверяем наличие Title", () -> {
            String expectedTitle = "Главная - X5 Group";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Проверка наличия ошибок в консоли")
    @DisplayName("Логи консоли страницы не должны содержать ошибок")
    void consoleShouldNotHaveErrorsTest() {
        step("Открываем сайт X5 Retail Group", () -> {
            mainPage.openPage();
        });

        step("Логи в консоле не должны иметь 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}