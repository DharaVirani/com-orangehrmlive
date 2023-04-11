package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "fIREFOX";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
//  Open the Url
        driver.get(baseUrl);
//    Maximise the window
        driver.manage().window().maximize();
//    Print the title
        System.out.println("The title of the Page is: " + driver.getTitle());
//        Print the current Url
        System.out.println("Current Url is: " + driver.getCurrentUrl());
//        Print the Page source
        System.out.println("Page source: " + driver.getPageSource());
//        Enter the email to email field
        driver.findElement(By.name("username")).sendKeys("abc567@gmail.com");
//        Enter the password to password
        driver.findElement(By.name("password")).sendKeys("abc567");
//        Closing the browser
        driver.close();
    }
}
