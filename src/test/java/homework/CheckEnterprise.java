package homework;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CheckEnterprise {

    @Test
    void checkEnterprisePageInSolutionDirectoryTest() {
        open("https://github.com/");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $(".h1-mktg.mb-3").shouldHave(text("Build like the best"));
    }
}
