package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager webDriverManager = WebDriverManager.chromedriver();
        webDriverManager.setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/#");
        Thread.sleep(10000);
        WebElement gmail = driver.findElement(By.xpath("//a[text()='Home ']"));
                gmail.click();
        System.out.println(gmail.getText());

        }
    }
