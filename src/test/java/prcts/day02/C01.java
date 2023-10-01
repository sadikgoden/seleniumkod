package prcts.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) throws InterruptedException {
        // 1-Driver oluşturalim
        // 2-Java class'imiza chnomedriver. exetyi tanitalim
        //3-Driver'in tum ekranı kaplamasini saglayalim
        // 4-Driverla sayfanın yuklenmesini 10.809 milisaniye (10 saniye) boyunca beklesini söyleyelim.
        System.setProperty("webDriver.Chrome.driver", "kurulumdosyalari/choremeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 5-Navigate to http://www.babayigit.net/murat/testpage.html
        driver.get("http://www.babayigit.net/murat/testpage.html");

        // 6-first name, surname, age, Your Job, Birth Palace, Last graduated school, Number of Children
        //   alanlarına gerekli bilgileri yazsın
        driver.findElement(By.id("ad")).sendKeys("Sadık");
        driver.findElement(By.id("soyad")).sendKeys("GÖDEN");
        driver.findElement(By.id("yas")).sendKeys("40");
        driver.findElement(By.id("meslek")).sendKeys("Ögretmen");
        driver.findElement(By.name("dogum_yeri")).sendKeys("Karaisalı");
        driver.findElement(By.name("mezun_okul")).sendKeys("Atatürk Üniversitesi");
        driver.findElement(By.id("cocuk_sayisi")).sendKeys("1");

        // 7-Submit tuşuna bassın.
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        // 8- All information was entered correctly.. yazısının göründüğünü test etsin ve yazan yazıyı yazdırsın
        String expectedYazi = "All information was entered correctly";
        String actualYazi = driver.findElement(By.xpath("//p[text()='All information was entered correctly..']")).getText();
        if (expectedYazi.equals(actualYazi)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }
        // 9- Clear butonu ile tüm alanları temizlesin
        driver.findElement(By.xpath("//input[@type='reset']")).click();
        Thread.sleep(5000);
        driver.close();
    }
}