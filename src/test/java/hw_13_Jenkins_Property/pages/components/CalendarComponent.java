package hw_13_Jenkins_Property.pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    public void setDate(String day, String month, String year) {

        $(".react-datepicker__month-dropdown-container").$(byText(month)).click();
        $(".react-datepicker__year-select").selectOption(year);

        if (day.length() == 1) {
            $(".react-datepicker__day--00" + day + ":not(.react-datepicker__day--outside-month)").click();
        } else {
            $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month)").click();

        }
    }
}
