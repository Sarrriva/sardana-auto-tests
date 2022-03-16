package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class GitHubWelcomePage {

    public SelenideElement loginButton() {
        return $("[href='/login']").as("кнопка логина");
    }

}
