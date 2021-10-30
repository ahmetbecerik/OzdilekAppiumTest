package org.example;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.Random;


public class StepImplementation extends BaseTest {

    public StepImplementation() {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 30);
    }

    @Step("<time> saniye bekle")
    public void waitTime(int time) throws InterruptedException {
        Thread.sleep(1000 * time);
    }

    @Step("<Key> İd'li elemente tıkla")
    public void clickElementByid(String Key) {
        driver.findElement(By.id(Key)).click();
        System.out.println(Key + "Elenitine tıklandı");
    }

    @Step("<Key> İd'li elemente <keywordc> değerini yaz")
    public void SendkeyElementByid(String Key, String keywordc) {
        driver.findElement(By.id(Key)).sendKeys(keywordc);
        System.out.println(Key + "Elenitine tıklandı");

    }

    @Step("<Key> xpath'li elemente tıkla")
    public void clickElementByxpath(String Key) {
        if (36 == 36) {
            driver.findElement(By.xpath(Key)).click();
            System.out.println(Key + "Elementine tiklandi");
        } else if (28 == 28) {
            driver.findElement(By.xpath(Key)).click();
            System.out.println(Key + "Elementine tiklandi");
        }
    }

    @Step("<Key>size xpath elemente tıkla")
    public void clickElementByxpath2(String Key) {
        if (36 == 36) {
            driver.findElement(By.xpath(Key)).click();
            System.out.println(Key + "Elementine tiklandi");
        } else if (28 == 28) {
            driver.findElement(By.xpath(Key)).click();
            System.out.println(Key + "Elementine tiklandi");
        }
    }

    @Step("<Key> xpath'li elemente <keywordc> değerini yaz")
    public void SendkeyElementByxpath(String Key, String keywordc) {
        driver.findElement(By.xpath(Key)).sendKeys(keywordc);
        System.out.println(Key + "Elenitine tıklandı");

    }

    @Step("<Key> id'li elemente tikla")
    public void clickElementById(String Key) {
        driver.findElement(By.id(Key)).click();
    }

    @Step("ID ile <by> ile elementi bul ve <text> ile kontrol et.")
    public void pageCurrentText(String by, String text) {
        WebElement control;
        control = findElement(By.id(by));
        Assert.assertEquals(text, control.getText());
    }

    @Step("XPATH ile <by> ile elementi bul ve <text> ile kontrol et.")
    public void pageCurrentTexts(String by, String text) {
        WebElement control;
        control = findElement(By.xpath(by));
        Assert.assertEquals(text, control.getText());
    }

    @Step("scroll et")
    public void ScrollRandomPos() {
        Dimension dimension = driver.manage().window().getSize();
        int start_x = (int) (dimension.width * 0.5);
        int start_y = (int) (dimension.height * 0.8);

        int end_x = (int) (dimension.width * 0.2);
        int end_y = (int) (dimension.height * 0.2);

        TouchAction touch = new TouchAction(driver);
        touch.press(PointOption.point(start_x, start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x, end_y)).release().perform();
    }

    @Step("<Key> random bir ürün seç")
    public void findAllProducts(String Key) {
        List<MobileElement> productList = driver.findElementsByXPath(Key);
        int size = productList.size();
        Random rnd = new Random();
        int randNum = rnd.nextInt(size);
        productList.get(randNum).click();

    }

    @Step("Sepete ekle")
    public void addToBasket() {
        clickElementByxpath("//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=0]");
        clickElementByid("com.ozdilek.ozdilekteyim:id/relLayAddCartBtn");
    }
}