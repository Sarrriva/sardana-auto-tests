import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import pages.GitHubPages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class GitHubJUnitRepositoryTest {

    @BeforeEach
    public void before() {
        //1. Открыть страницу https://github.com/junit-team/junit4
        open("https://github.com/junit-team/junit4");
    }

    @Test
    public void shouldSwitchToFixturesBranch() {
        //2. Кликнуть на кнопку выбора ветки
        GitHubPages.gitHubMainPage.branchButton().click();

        //3. Выбрать ветку с именем fixtures
        GitHubPages.gitHubMainPage.fixturesBranchLink().click();

        //4. Проверить название текущей ветки на кнопке выбора ветки
        GitHubPages.gitHubMainPage.branchButton().shouldHave(text("fixtures"));
    }

    @Test
    public void shouldSearchReleaseByName() {
        //2. Кликнуть на ссылку релизов
        GitHubPages.gitHubMainPage.releasesLink().click();

        //3. Ввести в поле для поиска текст "4.12"
        GitHubPages.gitHubReleasesPage.searchReleasesField().sendKeys("4.12" + Keys.ENTER);

        //4. Проверить содержимое первого помеченного результата поиска
        GitHubPages.gitHubReleasesPage.searchResultFirstMarkedEntry().shouldHave(text("4.12"));
    }

}
