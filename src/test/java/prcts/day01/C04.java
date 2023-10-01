package prcts.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04 {
    public static void main(String[] args) {

        System.setProperty("webDriver.Chrome.driver","kurulm/chrm/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        //   Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        //Click on  Calculater under Micro Apps
        driver.findElement(By.id("calculatetest")).click();
        // Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("20");
        //Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("60");
        //Click on Calculate
        driver.findElement(By.className("styled-click-button")).click();
        // Get the result
        //    Print the result
        System.out.println("20+60="+driver.findElement(By.id("answer")).getText());
        driver.close();
    }
}
