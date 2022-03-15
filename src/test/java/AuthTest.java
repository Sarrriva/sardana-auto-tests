import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import pages.GitHubPages;

import static com.codeborne.selenide.Selenide.open;

public class AuthTest {

    @Test
    public void shouldAuthorizeTest() {
        //1. Открыть страницу https://github.com
        open("https://github.com");

        //2. Кликнуть на кнопку Sign in
        GitHubPages.gitHubWelcomePage.loginButton()
                .click();

        //3. Заполнить поля Логина и Пароля
        GitHubPages.gitHubLoginPage.loginField()
                .sendKeys("Sarrriva");
        GitHubPages.gitHubLoginPage.passwordField()
                .sendKeys("Patipuka123");

        //4.Нажать кнопку Sign in
        GitHubPages.gitHubLoginPage.signInButton()
                .click();

        //5. Проверить авторизацию
        GitHubPages.gitHubMainPage.profileHeaderBlock()
                .shouldBe(Condition.visible);

        //6. Перейти на страницу профиля
        GitHubPages.gitHubMainPage.avatarButton()
                .click();
        GitHubPages.gitHubMainPage.myProfileButton()
                .click();

        //7. Проверить открытие страницы профиля
        GitHubPages.gitHubProfilePage.userProfileName()
                .shouldBe(Condition.visible);
    }

}
