package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LinkText_PartiallinkText {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "kurulumdosyalari/choremeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        // Gift Cards linkine tiklayin
      // driver.findElement(By.linkText("Gift Cards")).click();
      driver.findElement(By.partialLinkText("Gift")).click();

      // linkin bizi Gift Cards sayfasina yonlendirdigini test edin

        WebElement giftCardyaziElementi = driver.findElement(By.className("nav-menu-logo"));

        if (giftCardyaziElementi.isDisplayed()){
            System.out.println("Gift Cards testi PASSED");
        }else {
            System.out.println("Gift Cards testi FAILED");
        }

        Thread.sleep(3000);
      driver.close();
    }
}

