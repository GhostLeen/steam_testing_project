package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class StorePageTests extends TestBase {
    @Test
    @Tag("UI_tests")
    @DisplayName("Checking displaying of top and sidebar sections on main Store page")
    void sectionDisplayOnStorePageTest() {
        step("Open main Steam community page", () ->
                open("https://store.steampowered.com/"));
        step("Check top sections", () -> {
            $(".store_nav").shouldHave(text("Your Store"), text("New & Noteworthy"),
                    text("Categories"), text("Points Shop"), text("News"), text("Labs"));
        });
        step("Check sidebar sections", () -> {
            $(".home_page_gutter").shouldHave(text("GIFT CARDS"), text("RECOMMENDED"),
                    text("DISCOVERY QUEUES"), text("BROWSE CATEGORIES"), text("BROWSE BY GENRE"));
        });
    }

    @Test
    @Tag("UI_tests")
    @DisplayName("Adding game to the cart checking")
    void searchFieldTest() {
        step("Open main Steam community page", () ->
                open("https://store.steampowered.com/"));
        step("Find game by search field", () -> {
            $("#store_nav_search_term").setValue("Stray").pressEnter();
        });
        step("Click on game with name 'Stray'", () -> {
            $(".responsive_search_name_combined").find(byText("Stray")).click();
        });
        step("Add to cart", () -> {
            $(".btn_addtocart").find(byText("Add to Cart")).click();
        });
        step("Check that game was added to cart", () -> {
            $(".pageheader").shouldHave(text("YOUR SHOPPING CART"));
            $(".cart_item").shouldHave(text("Stray"));
            $(".cart_status_message").shouldHave(text("Your item has been added!"));
        });
    }
}
