package hw_13_Jenkins_Property.pages.components;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationResultsModal {
    @Step("Проверяем, что открылась форма с веденными данными Thanks for submitting the form")
    public RegistrationResultsModal verifyModalAppears() {
        $(".modal-dialog").should(appear);
        $(".modal-content").shouldHave(text("Thanks for submitting the form"));
        return this;
    }
    @Step("Проверяем, что в поле {key} введены верные данные {value}")
    public RegistrationResultsModal verifyResult(String key, String value) {
        $(".table-responsive").$(byText(key)).parent().shouldHave(text(value));
        return this;
    }

}
