package tests.day04_xpathveCssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_XPath_TextKullanimi {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.Chorome.driver","kurulumdosyalari/choremeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(3000);
        // 2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[text() = 'Add Element']")).click();

        Thread.sleep(3000);
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//*[text() = 'Delete']"));

        if (deleteButonu.isDisplayed()){
            System.out.println("test PASSED");
        }else {
            System.out.println("test FAILEd");
        }
        //4- Delete tusuna basin
        deleteButonu.click();
        Thread.sleep(2000);
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveYaziElementi = driver.findElement(By.xpath("//*[text() = 'Add/Remove Elements']"));
        if (addRemoveYaziElementi.isDisplayed()){
            System.out.println("test PASSED");
        }else {
            System.out.println("test FAILED");
        }
        Thread.sleep(2000);
        driver.close();
    }
}
