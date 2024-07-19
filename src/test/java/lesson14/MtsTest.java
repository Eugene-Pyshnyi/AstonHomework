package lesson14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class MtsTest {
    private WebDriver driver;

    @BeforeTest
    void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement click = driver.findElement(By.xpath("//button[contains(@class, \"cookie__cancel\")]"));
        click.click();
    }

    @Test
    void communicationServiceFieldTest() {
        WebElement phoneNumber = driver.findElement(By.xpath("//input[@placeholder='Номер телефона']"));
        Assert.assertEquals(phoneNumber.getText(), "Номер телефона", "Different actual result");
    }

    @AfterTest
    void exit() {
        driver.quit();
    }
}
