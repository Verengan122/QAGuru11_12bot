package testPositiveAndNegative;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPN {

    @Test
    @Step("Тест 1")
    void test01() {
        assertTrue(true);
    }

    @Test
    @Step("Тест 2")
    void test02() {
        assertTrue(true);
    }

    @Test
    @Step("Тест 3")
    void test03() {
        assertTrue(true);
    }
//
//    @Test
//    @Step("Тест 4")
//    void test04() {
//        assertTrue(false);
//    }
//
//    @Test
//    @Step("Тест 5")
//    void test05() {
//        assertTrue(false);
//    }
//
//    @Test
//    @Step("Тест 6")
//    void test06() {
//        assertTrue(false);
//    }


}

