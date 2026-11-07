package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        findByAttribute();
        findByText();
        findByPartialAttribute();
        findByPartialText();
        findByAxisAncestor();
        findByAxisDescendant();
        findByAxisFollowing();
        findByAxisParent();
        findByAxisPreceding();
        findByAndCondition();
        findByCss();
    }
    public static void findByAttribute() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@id='user-name']"));
        driver.findElement(By.xpath("//input[@type='submit']"));
    }


    public static void findByText() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//div[text()='Swag Labs']"));
        driver.findElement(By.xpath("//input[text()='Login']"));
    }

    public static void findByPartialAttribute() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
    }

    public static void findByPartialText() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//div[contains(text(),'Swag')]"));
    }


    public static void findByAxisAncestor() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//*[text()='Swag Labs']//ancestor::div"));
    }

    public static void findByAxisDescendant() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//form//descendant::input"));
    }

    public static void findByAxisFollowing() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@id='user-name']//following::input"));
    }

    public static void findByAxisParent() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@id='user-name']//parent::div"));
    }

    public static void findByAxisPreceding() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@id='user-name']//preceding::div"));
    }

    public static void findByAndCondition() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@type='text' and @id='user-name']"));
    }


    public static void findByCss() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("#user-name"));
        driver.findElement(By.cssSelector(".submit-button"));
    }
}