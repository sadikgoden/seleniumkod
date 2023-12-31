package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_driverManageMethodari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.Chrome.driver","kurulumdosyalari/choremeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // gorev odakli calisir, 15 saniye maximum bekleme suresidir
        // gorev daha once tamamlanirsa, yoluna devam eder
        // 15 saiye icinde gorev tamamlanmazsa hata verir
        // gorev : sayfanin acilmasi ve kullanilacak webelementlerin bulunmasidir

        System.out.println("maximize size :"+ driver.manage().window().getSize());
        System.out.println("maximize konum : " + driver.manage().window().getPosition());
        // window'u fullscreen yapin
        driver.manage().window().fullscreen();

        // window'un baslangic konumunu (200,300) ve boyutunu (500,500) yapin
        driver.manage().window().setPosition(new Point(200,300));
        driver.manage().window().setSize(new Dimension(500,500));

        System.out.println("mmmrrrrrrreeeeeeeeeeeeeeeeeeeeee");

        Thread.sleep(3000);  // java'dan gelir ve kodlari bekletir
        driver.close();

    }
}
