package lesson18;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

public class MtsTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private MTS mts;

    @BeforeClass
    void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        mts = new MTS(driver);
        mts.cancelCookies();
    }

    @Test
    @Step("Проверка текста плейсхолдеров 'Услуги связи'")
    void communicationServiceTest() {
        Assert.assertEquals(mts.getConnectionPhoneField().getAttribute("placeholder"), "Номер телефона",
                "Ожидаемый текст внутри незаполненного поля: Номер телефона");

        Assert.assertEquals(mts.getConnectionSumField().getAttribute("placeholder"),
                "Сумма", "Ожидаемый текст внутри незаполненного поля: Сумма");

        Assert.assertEquals(mts.getConnectionEmailField().getAttribute("placeholder"), "E-mail для отправки чека",
                "Ожидаемый текст внутри незаполненного поля: E-mail для отправки чека");
    }

    @Test
    void homeInternetTest() {
        mts.clickServiceButton();

        Assert.assertEquals(mts.getInternetUserNumberField().getAttribute("placeholder"), "Номер абонента",
                "Ожидаемый текст внутри незаполненного поля: ");

        Assert.assertEquals(mts.getInternetSumField().getAttribute("placeholder"),
                "Сумма", "Ожидаемый текст внутри незаполненного поля: Сумма");

        Assert.assertEquals(mts.getInternetEmailField().getAttribute("placeholder"), "E-mail для отправки чека",
                "Ожидаемый текст внутри незаполненного поля: E-mail для отправки чека");
    }

    @Test
    void installmentPlanTest() {
        mts.clickServiceButton();
        wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//p[@class='select__option'][text()='Рассрочка']"))).click();

        Assert.assertEquals(mts.getScoreInstalmentField().getAttribute("placeholder"), "Номер счета на 44",
                "Ожидаемый текст внутри незаполненного поля: Номер счета на 44");

        Assert.assertEquals(mts.getSumInstalmentField().getAttribute("placeholder"),
                "Сумма", "Ожидаемый текст внутри незаполненного поля: Сумма");

        Assert.assertEquals(mts.getEmailInstalmentField().getAttribute("placeholder"), "E-mail для отправки чека",
                "Ожидаемый текст внутри незаполненного поля: E-mail для отправки чека");
    }

    @Test
    void debtTest() {
        mts.clickServiceButton();
        wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//p[@class='select__option'][text()='Задолженность']"))).click();

        Assert.assertEquals(mts.getScoreArrearsField().getAttribute("placeholder"), "Номер счета на 2073",
                "Ожидаемый текст внутри незаполненного поля: Номер счета на 2073");

        Assert.assertEquals(mts.getArrearsSumField().getAttribute("placeholder"), "Сумма",
                "Ожидаемый текст внутри незаполненного поля: Сумма");

        Assert.assertEquals(mts.getArrearsEmailField().getAttribute("placeholder"), "E-mail для отправки чека",
                "Ожидаемый текст внутри незаполненного поля: E-mail для отправки чека");
    }

    @Test
    void nextWindowTest() {
        mts.clickServiceButton();
        wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//p[@class='select__option'][text()='Услуги связи']"))).click();

        mts.getConnectionPhoneField().sendKeys("297777777");
        mts.getConnectionSumField().sendKeys("10");
        mts.clickContinueButton();

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(mts.getPaymentIframe()));

        Assert.assertEquals("10.00 BYN", wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.cssSelector(".pay-description__cost > span:nth-child(1)"))).getText());
        Assert.assertEquals("Оплата: Услуги связи Номер:375297777777", driver.findElement
                (By.cssSelector(".pay-description__text > span")).getText());
        Assert.assertEquals("Оплатить 10.00 BYN", driver.findElement
                (By.cssSelector(".colored.disabled")).getText());

        Assert.assertEquals("Номер карты",
                wait.until(ExpectedConditions.visibilityOfElementLocated
                        (By.xpath("//label[text()='Номер карты']"))).getText());
        Assert.assertEquals("Срок действия",
                wait.until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//label[text()='Срок действия']"))).getText());
        Assert.assertEquals("CVC",
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='CVC']"))).getText());
        Assert.assertEquals("Имя держателя (как на карте)",
                wait.until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//label[text()='Имя держателя (как на карте)']"))).getText());

        ArrayList<String> paymentIcons = new ArrayList<>(Arrays.
                asList("assets/images/payment-icons/card-types/mastercard-system.svg",
                        "assets/images/payment-icons/card-types/visa-system.svg",
                        "assets/images/payment-icons/card-types/belkart-system.svg",
                        "assets/images/payment-icons/card-types/mir-system-ru.svg",
                        "assets/images/payment-icons/card-types/maestro-system.svg"));
        for (String paymentIcon : paymentIcons) {
            Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated
                    (By.xpath("//img[@src='" + paymentIcon + "']"))).isDisplayed());
        }
    }

    @AfterClass
    void exit() {
        driver.quit();
    }
}