package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class GitHubReleasesPage {

    public SelenideElement searchReleasesField() {
        return $("[placeholder='Find a release']").as("поле для поиска релиза");
    }

    public SelenideElement searchResultFirstMarkedEntry() {
        return $(".hx_keyword-hl", 0).as("первый помеченный результат поиска");
    }
}
