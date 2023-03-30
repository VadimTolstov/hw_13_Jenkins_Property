package hw_13_Jenkins_Property.pages;

import com.codeborne.selenide.SelenideElement;
import hw_13_Jenkins_Property.pages.components.CalendarComponent;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPageFaker {

    CalendarComponent calendarComponent = new CalendarComponent();

    private final String TITLE_TEXT = "Student Registration Form",
            REMOVE_BANNER_INPUT = "$('#fixedban').remove()",
            REMOVE_FOOTER_INPUT = "$('footer').remove()",
            ADDRESS_REGISTRATION_FORM = "/automation-practice-form";

    private final SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("[id=lastName]"),
            userEmailInput = $("#userEmail"),
            dateOfBirthInput = $("#dateOfBirthInput"),
            genderInput = $("#genterWrapper"),
            userPhoneInput = $("#userNumber"),
            subjectsInput = $("#subjectsInput"),
            hobbyInput = $("#hobbiesWrapper"),
            filePathInput = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            stateClickInput = $("#state"),
            stateInput = $("#stateCity-wrapper"),
            cityClickInput = $("#city"),
            cityInput = $("#stateCity-wrapper"),
            registerFormClickInput = $("#submit"),
            titleTextInput = $(".practice-form-wrapper");

    @Step("Открываем форму регистации студентов")
    public RegistrationPageFaker openPage() {
        open(ADDRESS_REGISTRATION_FORM);
        titleTextInput.shouldHave(text(TITLE_TEXT));

        return this;
    }
    @Step("Убераем банер")
    public RegistrationPageFaker removeBanner() {
        executeJavaScript(REMOVE_BANNER_INPUT);

        return this;
    }
    @Step("Убераем footer")
    public RegistrationPageFaker removeFooter() {
        executeJavaScript(REMOVE_FOOTER_INPUT);

        return this;
    }
    @Step("Вводим firstName {firstName}")
    public RegistrationPageFaker setFirstName(String firstName) {
        firstNameInput.setValue(firstName);

        return this;

    }
    @Step("Вводим lastName {lastName}")
    public RegistrationPageFaker setLastName(String lastName) {
        lastNameInput.setValue(lastName);

        return this;

    }
    @Step("Вводим userEmail {userEmail}")
    public RegistrationPageFaker setUserEmail(String userEmail) {
        userEmailInput.setValue(userEmail);

        return this;

    }
    @Step("Вводим gender {gender}")
    public RegistrationPageFaker setGender(String gender) {
        genderInput.$(byText(gender)).click();

        return this;

    }
    @Step("Вводим userPhone {userPhone}")
    public RegistrationPageFaker setUserPhone(String userPhone) {
        userPhoneInput.setValue(userPhone);

        return this;

    }
    @Step("Вводим BirthData {day} {month} {year}")
    public RegistrationPageFaker setBirthData(String day, String month, String year) {
        dateOfBirthInput.click();
        calendarComponent.setDate(day, month, year);

        return this;

    }
    @Step("Вводим subjects {subjects}")
    public RegistrationPageFaker setSubjects(String subjects) {
        subjectsInput.setValue(subjects).pressEnter();

        return this;

    }
    @Step("Вводим hobby {hobby}")
    public RegistrationPageFaker setHobby(String hobby) {
        hobbyInput.$(byText(hobby)).click();

        return this;

    }
    @Step("Загружаем файл {filePath}")
    public RegistrationPageFaker setUploadImage(String filePath) {
        filePathInput.uploadFromClasspath(filePath);

        return this;

    }
    @Step("Вводим address {address}")
    public RegistrationPageFaker setAddress(String address) {
        addressInput.setValue(address);

        return this;

    }
    @Step("Выбераем State {state}")
    public RegistrationPageFaker setState(String state) {
        stateClickInput.click();
        stateInput.$(byText(state)).click();

        return this;

    }
    @Step("Выбераем City {city}")
    public RegistrationPageFaker setCity(String city) {
        cityClickInput.click();
        cityInput.$(byText(city)).click();

        return this;

    }
    @Step("Регистрируем форму")
    public void registerForm() {
        registerFormClickInput.click();

    }

}