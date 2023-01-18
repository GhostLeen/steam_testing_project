package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class CommunityPageTests extends TestBase {

    @BeforeEach
    void openSteamCommunityPage() {
        open("https://steamcommunity.com/");
    }

    @ParameterizedTest(name = "Check if header name {1} in locale {0}")
    @CsvSource(value = {
            "Русский (Russian), Активность сообщества",
            "Suomi (Finnish), Yhteisön toiminta",
            "Deutsch (German), Communityaktivität"
    })
    @Tag("UI_tests")
    void languageChangeTest(String language, String expectedHeader) {
        step("Choose language " + language, () -> {
            $("#language_pulldown").click();
            $("#language_dropdown").find(byText((language))).click();
        });
        step("Check presence of header" + expectedHeader, () -> {
            $(".community_home_title").shouldHave(text(expectedHeader));
        });
//        sleep(3000);
    }


    @Test
    @Tag("UI_tests")
    @DisplayName("Checking transition to the Store main page by clicking logo Steam")
    void moveToStorePageByLogoButtonTest() {
        step("Click on logo Steam", () -> $(".logo").click());
        step("Check if 'Your Store' section presents", () -> {
            $(".pulldown_desktop").shouldHave(text("Your Store"));
        });
    }

    @Test
    @Tag("UI_tests")
    @DisplayName("Checking open 'Discussions' page from drop-down Community menu")
    void discussionOpenPageTest() {
        step("Click on 'Discussion' section", () -> {
            $(".supernav_container").find(byText(("COMMUNITY"))).hover();
            $(".supernav_content").find(byText(("Discussions"))).click();
        });
        step("Check header of 'Discussions' page", () ->
                $(".large_title").shouldHave(text("Welcome to the Steam Discussions"))
        );
    }
}
