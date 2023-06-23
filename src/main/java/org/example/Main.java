package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static ChromeDriver driver = new ChromeDriver();
    static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));

    public static void main(String[] args) throws InterruptedException {


        driver.get("https://www.demoblaze.com/#");

//                             assignment 2

        //WebElement gmail = driver.findElement(By.xpath("//a[text()='Cart']"));
        //WebElement home = driver.findElement(By.xpath("//a[text()='Home ']"));
        //WebElement contact = driver.findElement(By.xpath("/a[text()='Contact']"));
        // WebElement about = driver.findElement(By.xpath("//a[text()='About us']"));
        //WebElement login = driver.findElement(By.xpath("//a[text()='Log in']"));
        //WebElement signup = driver.findElement(By.xpath("//a[text()='Sign up']"));
        //WebElement cate = driver.findElement(By.xpath("//a[text()='CATEGORIES']"));
        //WebElement phone = driver.findElement(By.xpath("//a[text()='Phones']"));
        //WebElement laptop = driver.findElement(By.xpath("//a[text()='Laptops']"));
        //WebElement monitors = driver.findElement(By.xpath("//a[text()='Monitors']"));
        //WebElement nokia1520 = driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']"));
        //WebElement galaxys7 = driver.findElement(By.xpath("//a[text()='Samsung galaxy s7']"));
        //WebElement hinhs7 = driver.findElement(By.xpath("//a[@href=\"prod.html?idp_=4\"]/img[contains(@class, 'card-img-top') and contains(@class, 'img-fluid') and @src='imgs/galaxy_s6.jpg']"));
        //WebElement lumia1520= driver.findElement(By.xpath("//a[@href=\"prod.html?idp_=2\"]/img[contains(@class, 'card-img-top') and contains(@class, 'img-fluid') and @src='imgs/Lumia_1520.jpg']"));
        //WebElement prev = driver.findElement(By.xpath("//span[contains(@class, 'carousel-control-prev-icon') and @aria-hidden='true']"));
        //WebElement next = driver.findElement(By.xpath("//span[contains(@class, 'carousel-control-next-icon') and @aria-hidden='true']"));
        //System.out.println(next.getText());

        driver.manage().window().maximize();

        WebElement login = driver.findElement(By.xpath("//a[@class=\"nav-link\" and @href=\"#\" and @id=\"login2\" and @data-toggle=\"modal\" and @data-target=\"#logInModal\"]"));
        wait.until(ExpectedConditions.visibilityOf(login));
        wait.until(ExpectedConditions.elementToBeClickable(login));
        login.click();

        WebElement name = driver.findElement(By.xpath("//input[@type=\"text\" and @class=\"form-control\" and @id=\"loginusername\"]"));
        wait.until(ExpectedConditions.visibilityOf(name));
        wait.until(ExpectedConditions.elementToBeClickable(name));
        name.click();
        WebElement username = driver.findElement(By.id("loginusername"));
        username.sendKeys("nam249vn");


        WebElement pass = driver.findElement(By.xpath("//input[@type=\"password\" and @class=\"form-control\" and @id=\"loginpassword\"]"));
        wait.until(ExpectedConditions.visibilityOf(pass));
        wait.until(ExpectedConditions.elementToBeClickable(pass));
        pass.click();
        WebElement password = driver.findElement(By.id("loginpassword"));
        password.sendKeys("123");


        WebElement btnlogin = driver.findElement(By.xpath("//button[text()=\"Log in\" and @type=\"button\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnlogin));
        wait.until(ExpectedConditions.elementToBeClickable(btnlogin));
        btnlogin.click();
        Thread.sleep(5000);

//thay
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[starts-with(text(),'Welcome')]")));
        String galaxys6 = "//a[contains(@href, 'prod.html?idp_=1') and contains(text(), 'Samsung galaxy s6')]";
        click(galaxys6);
        String add = "//a[text()='Add to cart']\n";
        click(add);
        // accepting javascript alert
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement teminal = driver.findElement(By.xpath("//h2[@class=\"name\"]"));
        System.out.println(teminal.getText());
        WebElement teminal1 = driver.findElement(By.xpath("//h3[@class=\"price-container\"]"));
        System.out.println(teminal1.getText());
        WebElement teminal2 = driver.findElement(By.xpath("//div[@class=\"tab-pane fade active in\" and @id=\"more-information\"]\n"));
        System.out.println(teminal2.getText());
        //driver.quit();
        String cart = "//a[@id=\"cartur\"]";
        click(cart);
        String delete = "//a[contains(@onclick, \"deleteItem\")]";
        click(delete);
        Thread.sleep(2000);
        String home = "//a[@class=\"nav-link\" and @href=\"index.html\"]";
        click(home);
        String nokia = "//a[@href=\"prod.html?idp_=2\" and @class=\"hrefch\"]";
        click(nokia);
        String add1 = "//a[@href=\"#\" and @onclick=\"addToCart(2)\" and contains(@class, \"btn\") and contains(@class, \"btn-success\") and contains(@class, \"btn-lg\")]";
        click(add1);
        String cart1 = "//a[@id=\"cartur\"]";
        click(cart1);
        String place = "//button[@type=\"button\" and contains(@class, \"btn-success\") and @data-toggle=\"modal\" and @data-target=\"#orderModal\"]";
        click(place);
        Thread.sleep(2000);
        String name1 = "//input[@type=\"text\" and contains(@class, \"form-control\") and @id=\"name\"]";
        click(name1);
        WebElement username1 = driver.findElement(By.id("name"));
        username1.sendKeys("Nguyen Minh Man");
        String Country = "//input[@type=\"text\" and contains(@class, \"form-control\") and @id=\"country\"]";
        click(Country);
        WebElement country = driver.findElement(By.id("country"));
        country.sendKeys("Viet Nam ");
        Thread.sleep(2000);
        String close = "//div[@id='orderModal']//button[@type='button'][normalize-space()='Close']";
        click(close);
        Thread.sleep(2000);
        String logout = "//a[@class=\"nav-link\" and @id=\"logout2\" and text()=\"Log out\"]";
        click(logout);


        Thread.sleep(4000);
        WebElement teminal3 = driver.findElement(By.xpath("//td[text()=\"Nokia lumia 1520\"]"));
        System.out.println(teminal3.getText());
        WebElement teminal4 = driver.findElement(By.xpath("//td[text()=\"820\"]"));
        System.out.println(teminal4.getText());

    }

    public static void click(String xpath){
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        WebElement element = driver.findElement(By.xpath(xpath));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

}