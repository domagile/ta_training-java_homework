package com.epam.training.student_olha_diatlova.task1;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class MainPage extends BasePage {
    private static final String HOMEPAGE_URL = "https://paste.ee";

    @FindBy(xpath = "//span[@data-select2-id='1']//span[contains(@class, 'select2-selection--single')]")
    private WebElement expirationDropdown;

    @FindBy(xpath = "//ul[contains(@class, 'select2-results__options')]")
    private WebElement dropdownList;

    @FindBy(xpath = "//li[text()='1 hour']")
    private WebElement expirationValueOneHour;

    @FindBy(id = "paste[section1][name]")
    private WebElement titleInput;

    @FindBy(xpath = "//div[@class=\'tx-editor\']//textarea")
    private WebElement pasteInput;

    @FindBy(xpath = "//input[@class='btn btn-primary mousetrap']")
    private WebElement submitButton;

    @FindBy(xpath = "//a[@class= 'section-title']")
    private WebElement createdPasteTitle;

    @FindBy(xpath = "//pre[@class= 'editor no-highlight']")
    private WebElement createdPasteText;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(HOMEPAGE_URL);
    }

    public void selectExpirationOneHour() {
        wait.until(ExpectedConditions.elementToBeClickable(expirationDropdown)).click();

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = 0", dropdownList);
        wait.until(ExpectedConditions.elementToBeClickable(expirationValueOneHour)).click();
    }

    public void enterPasteTitle(String pasteTitle) {
        titleInput.click();
        titleInput.sendKeys(pasteTitle);
    }

    public void enterPasteText(String text) {
        pasteInput.sendKeys(text);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public String getPasteTitleText() {
        return createdPasteTitle.getText();
    }

    public String getPasteText() {
        return createdPasteText.getText();
    }
}
