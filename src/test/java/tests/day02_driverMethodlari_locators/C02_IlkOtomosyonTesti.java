package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkOtomosyonTesti {
    public static void main(String[] args) throws InterruptedException {
      /*  2. Yeni bir class olusturalim : C03_GetMethods
        3. Amazon sayfasina gidelim. https://www.amazon.com/
        4. Sayfa basligini(title) yazdirin
        5. Sayfa basliginin “Amazon” icerdigini test edin
        6. Sayfa adresini(url) yazdirin
        7. Sayfa url’inin “amazon” icerdigini test edin.
        8. Sayfa handle degerini yazdirin
        9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        10. Sayfayi kapatin
       */
        System.setProperty("webdriver.chrome.driver", "kurulumdosyalari/choremeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Yeni bir class olusturalim : C03_GetMethods
        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //4. Sayfa basligini(title) yazdirin
        System.out.println("Sayfanın Başlığı :  " + driver.getTitle());  //Sayfanın Başlığı :  Amazon.com. Spend less. Smile more.

        //5. Sayfa basliginin “Amazon” icerdigini test edin
        String expectedIcerik = "Amazon";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedIcerik )){
            System.out.println("Title Testi PASSED");
        }else {
            System.out.println("Title testi FAILED");
            System.out.println("Sayfadaki actual title : " + actualTitle);
        };
        //6. Sayfa adresini(url) yazdirin
        System.out.println("Actual sayfa Url'i : " +driver.getCurrentUrl());

        //7. Sayfa url’inin “amazon” icerdigini test edin.
        String expectedUrlIcerik = "amazon";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("url Testi PASSED");
        }else {
            System.out.println("Url testi FAILED");
        }
        //8. Sayfa handle degerini yazdirin
        System.out.println("handle değeri : " +driver.getWindowHandle());

        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        String expectedSayfaIcerigi = "alisveris";
        String actualSayfaKaynakKodlari = driver.getPageSource();
        if (actualSayfaKaynakKodlari.contains(expectedSayfaIcerigi)){
            System.out.println("Sayfa kaynagi testi PASSED");
        }else {
            System.out.println("Sayfa kaynagi testi FAILED");
            System.out.println("Sayfa kaynak kodlari '" + expectedSayfaIcerigi + "' kelimesi icermiyor");
        }
        Thread.sleep(3000);
        driver.close();
    }
}
