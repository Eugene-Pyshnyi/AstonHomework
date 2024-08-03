package lesson18;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MTS {

    @Getter
    @FindBy(xpath = "//div[@class='cookie__wrapper']")
    private WebElement cookieWrapper;

    @Getter
    @FindBy(xpath = "//button[contains(@class, 'cookie__cancel')]")
    private WebElement cookieCancelButton;

    @Getter
    @FindBy(xpath = "//button[@class='select__header']")
    private WebElement serviceButton;

    @Getter
    @FindBy(xpath = "//input[@id='connection-phone']")
    private WebElement connectionPhoneField;

    @Getter
    @FindBy(xpath = "//input[@id='connection-sum']")
    private WebElement connectionSumField;

    @Getter
    @FindBy(xpath = "//input[@id='connection-email']")
    private WebElement connectionEmailField;

    @Getter
    @FindBy(xpath = "//*[@id='pay-connection']/button")
    private WebElement continueButton;

    @Getter
    @FindBy(xpath = "//input[@id='internet-phone']")
    private WebElement internetUserNumberField;

    @Getter
    @FindBy(xpath = "//input[@id='internet-sum']")
    private WebElement internetSumField;

    @Getter
    @FindBy(xpath = "//input[@id='internet-email']")
    private WebElement internetEmailField;

    @Getter
    @FindBy(xpath = "//input[@id='score-instalment']")
    private WebElement scoreInstalmentField;

    @Getter
    @FindBy(xpath = "//input[@id='instalment-sum']")
    private WebElement sumInstalmentField;

    @Getter
    @FindBy(xpath = "//input[@id='instalment-email']")
    private WebElement emailInstalmentField;

    @Getter
    @FindBy(xpath = "//input[@id='score-arrears']")
    private WebElement scoreArrearsField;

    @Getter
    @FindBy(xpath = "//input[@id='arrears-sum']")
    private WebElement arrearsSumField;

    @Getter
    @FindBy(xpath = "//input[@id='arrears-email']")
    private WebElement arrearsEmailField;

    @Getter
    @FindBy(xpath = "//iframe[@class='bepaid-iframe']")
    private WebElement paymentIframe;

    public MTS(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void cancelCookies() {
        cookieWrapper.isDisplayed();
        cookieCancelButton.click();
    }

    public void clickServiceButton() {
        serviceButton.click();
    }
    public void clickContinueButton() {
        continueButton.click();
    }
}