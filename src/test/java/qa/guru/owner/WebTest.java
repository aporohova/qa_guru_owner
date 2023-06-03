package qa.guru.owner;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class WebTest extends TestBase {
    @Test
    void wikiTest(){
        open("/");
        $(".mw-headline").shouldHave(text("Добро пожаловать в Википедию"));

    }
}
