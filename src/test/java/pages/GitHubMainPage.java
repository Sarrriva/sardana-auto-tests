package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class GitHubMainPage {

    public SelenideElement profileHeaderBlock() {
        return $(".Header").as("шапка профиля");
    }

    public SelenideElement avatarButton() {
        return $("[aria-label='View profile and more']").as("кнопка с аватаром");
    }

    public SelenideElement myProfileButton() {
        return $(byText ("Your profile")).as("кнопка перехода на страницу профиля");
    }

    public SelenideElement branchButton() {
        return $("#branch-select-menu").as("кнопка выбора ветки");
    }

    public SelenideElement fixturesBranchLink() {
        return $(byText("fixtures")).as("ссылка на переход в ветку fixtures");
    }

    public SelenideElement releasesLink() {
        return $(".Layout-sidebar").find(byText("Releases")).as("ссылка на релизы");
    }

}
