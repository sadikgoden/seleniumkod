package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_IlkTestotomasyonu {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.Chrome.driver","kurulumdosyalari/choremeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

         // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        // arama kutusuna "Nutella" yazdirip aratin
        // once arama kutusunu findElement() ve Locator ile driver'a tanitip
        // o webelemnti bu class'da kullanabilecegim sekilde kaydetmeliyim


        WebElement aramaKutusu  = driver.findElement(By.id("twotabsearchtextbox"));

        //aramaKutusu.sendKeys("Nutella");
       // aramaKutusu.submit();
        // arama sonuclarinin "Nutella" icerdigini test edin

           aramaKutusu.sendKeys("Nutella");
            aramaKutusu.submit();

         // By.className locator'i class attribute'unun degeri bosluk icerdiginde
        // saglikli CALISMAZ
        // Cogunlukla class ismi ayni ozelliklerdeki webelementleri gruplandirmak icin kullanilir
        // Biz de class degeri sg-col-inner arattigimizda 73 tane webelement buldu

        //***WebElement aramaSonucElementi = driver.findElement(By.className("a-section a-spacing-small a-spacing-top-small"));
        // *****System.out.println(aramaSonucElementi.getText());

        //WebElement aramaSonucElementi= driver.findElement(By.className("sg-col-inner"));


        // arama sonuclarinin "Nutella" icerdigini test edin
        List<WebElement> elementlerListesi = driver.findElements(By.className("sg-col-inner"));
        String actualaramaSonucu = elementlerListesi.get(0).getText();
        String exceptedIcerik ="Nutella";
       // System.out.println(actualaramaSonucu);
        if (actualaramaSonucu.contains("Nutella")){
            System.out.println("Ilk otomasyon testi PASSED");
        }else {
            System.out.println("Ilk otomasyon testi FAILED");
        }
        Thread.sleep(4000);
        driver.close();




    }
}


/*

        Thread.sleep(5000);
        driver.close();
 */
