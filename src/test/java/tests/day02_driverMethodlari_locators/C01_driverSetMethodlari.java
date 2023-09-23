package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverSetMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.ChromeDriver","kurulumdosyalari/choremeDriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        System.out.println("Title" + driver.getTitle());
        System.out.println("Url  :  " + driver.getCurrentUrl());
        System.out.println("=====================================");

        System.out.println(driver.getPageSource());
        System.out.println("windows handle degeri  :  " + driver.getWindowHandle()); //CDwindow-FA3F2B2FEB7656A8080169EB8B15CDE5
        System.out.println("windows handle değerleri seti  :  " + driver.getWindowHandles()); // [CDwindow-FA3F2B2FEB7656A8080169EB8B15CDE5]
        /*
        Webdriver her pencereye unique bir window handle degeri atamasi yapar

            Bir test class'i calismaya basladiktan sonra
            birden fazla pencere de acabilir

            bu durumda tek bir window handle degeri degil
            acilan sayfa adedince window handle degerlerimiz olur
            Birden fazla element olunca Selenium onlari set'e koymayi uygun gormus
         */
        Thread.sleep(4000);
        driver.close();
    }
}
