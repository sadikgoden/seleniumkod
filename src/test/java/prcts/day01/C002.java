package prcts.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C002 {
    public static void main(String[] args) {
        //1-Driver oluşturalim
        //2-Java class'imiza chnomedriver.exet i tanitalim
        System.setProperty("webDriver.Chrome.driver","kurulm/chrm/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //3-Driver'in tum ekranı kaplamasini saglayalim
        driver.manage().window().maximize();
        //4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim.
        // Egen oncesinde sayfa Yüklenirse, beklemeyi bıraksın
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        //"https://www.otto.de" adresine gidelim
        driver.get("https://www.otto.de");
        //BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
        System.out.println(driver.getTitle());
        //Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim
        if (driver.getTitle().contains("OTTO")&&driver.getCurrentUrl().contains("OTTO")){
            System.out.println("TEST PASSED ");
        }else{
            System.out.println("TEST FAILED");
        }
        //Ardindan "https://wisequarter.com/" adresine gidip
        driver.navigate().to("https://wisequarter.com/");
        //BU adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini
        // kontrol edelim

        if ( driver.getTitle().contains("Quarter")){
            System.out.println("Test passed: wisequarter candır ");
        }else{
            System.out.println("Test Faıled :wisequarter her zaman candır ");
        }
        //Bir onceki web sayfamiza geri donelim
     driver.navigate().back();
        //Sayfayı yenileyelim
       driver.navigate().refresh();
       //-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
     driver.navigate().back();
    //En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.quit();

    }
}
