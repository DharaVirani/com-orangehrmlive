package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {

    public static void main(String[] args) {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        WebDriver driver = new ChromeDriver();
//  Open the Url
        driver.get(baseUrl);
//  Maximise Url
        driver.manage().window().maximize();
//  Give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//  Print the title of the page
        System.out.println("The title of the page is: " + driver.getTitle());
//  Print the current Url
        System.out.println("The Current URL is: " + driver.getCurrentUrl());
//  Print the page source
        System.out.println("Page source is: " + driver.getPageSource());
//  Enter the email to email field
        driver.findElement(By.name("username")).sendKeys("abc567@gmail.com");
//  Enter password to password field
        driver.findElement(By.name("password")).sendKeys("abc567");
//  Close the browser
        driver.close();
    }
}
