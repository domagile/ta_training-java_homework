package com.epam.training.student_olha_diatlova.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPageTest extends BasePageTest {

    @Test
    public void createNewPaste() {
        String expectedTitleText = "how to gain dominance among developers";
        String expectedBrowserPageTitleRegExp = "Paste\\.ee.*View paste.*";
        String expectedCode = """
                git config --global user.name  "New Sheriff in Town"
                git reset $(git commit-tree HEAD^{tree} -m "Legacy code")
                git push origin master --force""";

        mainPage
                .openPage()
                .selectExpirationOneHour()
                .enterPasteTitle("how to gain dominance among developers")
                .selectBashOption()
                .enterPasteText(expectedCode)
                .clickSubmitButton();

        assertEquals(expectedTitleText, mainPage.getPasteTitleText());
        assertEquals(expectedCode, mainPage.getPasteText());
        assertTrue(mainPage.getBrowserPageTitle().matches(expectedBrowserPageTitleRegExp));
    }
}