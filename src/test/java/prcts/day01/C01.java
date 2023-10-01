package prcts.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {
    public static void main(String[] args) throws InterruptedException {

        //Create a new class with main method
        //    Set Path
        //    Create a chrome driver

        System.setProperty("webDriver.Chrome.driver","kurulm/chrm/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

       //Maximize window
        driver.manage().window().maximize();;
        //Open google home page https://www.google.com
        driver.get("https://www.google.com");

        //On the same class, navigate to amazon home page https://www.amazon.com
        // and navigate back to google
         driver.navigate().to("https://www.amazon.com" );
         driver.navigate().back();
         // Wait about 4 sn
        Thread.sleep(4000);
        //Navigate forward to amazon
        driver.navigate().forward();
       //  Refresh page
        driver.navigate().refresh();
        Thread.sleep(2000);
       // Close/quit the browser
        driver.quit();
       // And Last step print "All is well" on console
        System.out.println("All is well");
    }
}






