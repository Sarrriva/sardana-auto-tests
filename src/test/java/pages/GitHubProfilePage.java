package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class GitHubProfilePage {

    public SelenideElement userProfileName() {
        return $(".vcard-names").as("карточка с именем аккаунта");
    }

}
