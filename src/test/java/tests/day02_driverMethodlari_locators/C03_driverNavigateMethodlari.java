package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C03_driverNavigateMethodlari {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver(); // selenium kendi driverini kullanır
        driver.manage().window().maximize();
        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        //sayfa başlıgının "smile more" içerdiğini test edin
        String expectedTitleIcerik=" smile more";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Amazon Title Testi PASSED");
        }else {
            System.out.println("Amazon Title Testi FAILED");
        }


        // youtube anasayfaya gidin
        driver.navigate().to("https://www.youtube.com");
        // Url nin "youtube" içerdigini test edin
       String expectedUrlIcerik = "youtube";
       String actualurl = driver.getCurrentUrl();
       if (actualurl.contains(expectedUrlIcerik)){
           System.out.println("Youtube Testi PASSED");
       }else {
           System.out.println("Youtube Testi FALLED");
       }
        // tekrar  amazon anasayfaya gidin url nin "ramazan" içermediğini test edin
        driver.navigate().back();
       String unexpectedIcerik = "ramozon";
       String actualUrl = driver.getCurrentUrl();
       if (actualurl.contains(unexpectedIcerik)){
           System.out.println("Amazon Title Testi FAILED");}
       else {
           System.out.println("Amazon Title Testi PASSED");
       }
        //tekrar youtube ansayfaya gidin
        driver.navigate().forward();
        // sayfa kaynak kodlarinda "music" gectigini test edin
        String expectedIcerik = "music";
        String actualKaynakKodlari= driver.getPageSource();
        if (actualKaynakKodlari.contains(expectedIcerik)){
            System.out.println("Youtube kaynak kodu testi PASSED");
        }else {
            System.out.println("Youtube kaynak kodu testi FAILED");
        }
        // sayfayi kapatin
        System.out.println("ffff");
        driver.close();
    }
}
