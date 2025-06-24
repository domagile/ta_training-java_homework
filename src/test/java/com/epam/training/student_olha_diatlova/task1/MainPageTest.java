package com.epam.training.student_olha_diatlova.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainPageTest extends BasePageTest {

    @Test
    public void createNewPaste() {
        mainPage.openPage();
        mainPage.selectExpirationOneHour();
        mainPage.enterPasteTitle("helloweb");
        mainPage.enterPasteText("Hello from WebDriver");
        mainPage.clickSubmitButton();

        assertEquals("helloweb", mainPage.getPasteTitleText());
        assertEquals("Hello from WebDriver", mainPage.getPasteText());
    }
}
