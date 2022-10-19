package homework;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MoveElements {


    @Test
    void moveDragAndDropElement() {
        open("https://the-internet.herokuapp.com/drag_and_drop");

        // Элемент захватывается, но никакого перемещения не происходит:
//        actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(20, 10).release().perform();

        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }
}


