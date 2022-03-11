import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AuthTest {

    @Test
    public void shouldAuthorizeTest() {
        //1. Открыть страницу https://github.com/

        open("https://github.com/");

        //2. Кликнуть на кнопку Sign in

        $("[href='/login']").click();

        //3. Заполнить поля Логина и Пароля

        $("[id='login_field']").sendKeys("Sarrriva");
        $("[id='password']").sendKeys("Patipuka123");

        //4.Нажать кнопку Sign in

        $(".js-sign-in-button").click();

        //5. Проверить авторизацию

        $(".Header").shouldBe(Condition.visible);

        //6. Перейти на страницу профиля

        $("[aria-label='View profile and more']").click();
        $(byText ("Your profile")).click();

        //7. Проверить открытие страницы профиля

        $(".vcard-names").shouldBe(Condition.visible);
    }
}
