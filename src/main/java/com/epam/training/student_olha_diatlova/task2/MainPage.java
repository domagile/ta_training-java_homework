package com.epam.training.student_olha_diatlova.task2;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class MainPage extends BasePage {
    private static final String HOMEPAGE_URL = "https://paste.ee";

    @FindBy(xpath = "//span[@data-select2-id='1']//span[contains(@class, 'select2-selection--single')]")
    private WebElement expirationDropdown;

    @FindBy(xpath = "//li[text()='1 hour']")
    private WebElement expirationValueOneHour;

    @FindBy(xpath = "//ul[contains(@class, 'select2-results__options')]")
    private WebElement dropdownList;

    @FindBy(xpath = "//span[(@class=\"select2-selection__rendered\") and contains (text(), 'Text')]")
    private WebElement syntaxDropdown;

    @FindBy(xpath = "//input[contains(@class, 'select2-search__field')]")
    private WebElement inputInDropdown;

    @FindBy(id = "paste[section1][name]")
    private WebElement titleInput;

    @FindBy(xpath = "//div[@class=\'tx-editor\']//textarea")
    private WebElement pasteInput;

    @FindBy(xpath = "//input[@class='btn btn-primary mousetrap']")
    private WebElement submitButton;

    @FindBy(xpath = "//a[@class= 'section-title']")
    private WebElement createdPasteTitle;

    @FindBy(xpath = "//pre[@class= 'editor lang-bash']")
    private WebElement createdPasteText;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public MainPage selectExpirationOneHour() {
        wait.until(ExpectedConditions.elementToBeClickable(expirationDropdown)).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = 0", dropdownList);
        wait.until(ExpectedConditions.elementToBeClickable(expirationValueOneHour)).click();
        return this;
    }

    public MainPage selectBashOption() {
        wait.until(ExpectedConditions.elementToBeClickable(syntaxDropdown)).click();
        wait.until(ExpectedConditions.elementToBeClickable(inputInDropdown)).sendKeys("Bash", Keys.ENTER);
        return this;
    }

    public MainPage enterPasteTitle(String pasteTitle) {
        titleInput.click();
        titleInput.sendKeys(pasteTitle);
        return this;
    }

    public MainPage enterPasteText(String text) {
        pasteInput.sendKeys(text);
        return this;
    }

    public MainPage clickSubmitButton() {
        submitButton.click();
        return this;
    }

    public String getPasteTitleText() {
        return createdPasteTitle.getText();
    }

    public String getPasteText() {
        return createdPasteText.getText();
    }

    public String getBrowserPageTitle(){
        return driver.getTitle();
    }
}
