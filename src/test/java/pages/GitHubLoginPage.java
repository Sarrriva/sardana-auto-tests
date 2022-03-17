package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class GitHubLoginPage {

    public SelenideElement signInButton() {
        return $(".js-sign-in-button").as("кнопка входа");
    }

    public SelenideElement loginField() {
        return $("[id='login_field']").as("поле логина");
    }

    public SelenideElement passwordField() {
        return $("[id='password']").as("поле пароля");
    }

}
