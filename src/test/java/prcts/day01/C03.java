package prcts.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03 {
    public static void main(String[] args) {
        System.setProperty("webDriver.Chrome.driver","kurulm/chrm/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        driver.get("http://practice.automationtesting.in");
        System.out.println(driver.getCurrentUrl());
        if (driver.getTitle().contains("Practice")){
            System.out.println(" başlık içerisinde Practice kelimesi vardır : Test PASSED");
        }else {
            System.out.println(" başlık içerisinde Practice kelimesi yoktur : Test FAILED");
        }
        if (driver.getCurrentUrl().contains("practice")){
            System.out.println(" Url içerisinde Practice kelimesi vardır : Test PASSED");
        }else {
            System.out.println("içerisinde Practice kelimesi YOKTUR : Test FAILED");
        }
        System.out.println("===================2. yontem===========");
        if (driver.getTitle().contains("Practice") && driver.getCurrentUrl().contains("practice")){
            System.out.println("test PASSED");
        }else {
            System.out.println("test FAILED");
        }
        driver.quit();

    }
}
