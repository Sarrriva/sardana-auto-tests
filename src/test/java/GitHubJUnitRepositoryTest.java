import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import pages.GitHubPages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Feature("Github")
@Owner("Sarrriva")

public class GitHubJUnitRepositoryTest {

    @BeforeEach
    public void before() {
        step("Открыть страницу https://github.com/junit-team/junit4", () -> {
            open("https://github.com/junit-team/junit4");
        });
    }

    @Test
    @Story("Смена ветки")
    public void shouldSwitchToFixturesBranch() {
        step("Кликнуть на кнопку выбора ветки", () -> {
            GitHubPages.gitHubMainPage.branchButton().click();
        });

        step("Выбрать ветку с именем fixtures", () -> {
            GitHubPages.gitHubMainPage.fixturesBranchLink().click();
        });

        step("Проверить название текущей ветки на кнопке выбора ветки", () -> {
            GitHubPages.gitHubMainPage.branchButton().shouldHave(text("fixtures"));
        });
    }

    @Test
    @Story("Поиск релиза")
    public void shouldSearchReleaseByName() {
        step("Кликнуть на ссылку релизов", () -> {
            GitHubPages.gitHubMainPage.releasesLink().click();
        });

        step("Ввести в поле для поиска текст '4.12'", () -> {
            GitHubPages.gitHubReleasesPage.searchReleasesField().sendKeys("4.12" + Keys.ENTER);
        });

        step("Проверить содержимое первого помеченного результата поиска", () -> {
            GitHubPages.gitHubReleasesPage.searchResultFirstMarkedEntry().shouldHave(text("4.12"));
        });
    }
}
