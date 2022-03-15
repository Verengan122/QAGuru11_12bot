import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static io.qameta.allure.Allure.step;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class LambdaTest {
    @Test
    public void lambdaStepsThroughStepName() {
        step("Открываем главную страницу" , () -> {
            open("https://github.com/");
        });

        step("Ищем пользователя" , () -> {
            $(".header-search-input").setValue("Verengan122/QAguru.Test-1").pressEnter();
        });

        step("Выбираем репозиторий" , () -> {
            $$(".repo-list").first().$("a").click();
        });

        step("Открываем IssueTab" , () -> {
            $("#issues-tab").click();
        });

        step("Проверяем наличие Issue с номером " , () -> {
            $(withText("#1")).should(Condition.visible);
        });
    }
    @Attachment(value = "Screenshot", type = "text/html", fileExtension = "html")
    public byte[] attachPageSource() {
        return WebDriverRunner.source().getBytes(StandardCharsets.UTF_8);
    }

}
