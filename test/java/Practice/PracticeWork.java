package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWork {

    // Создаем драйвер на уровне класса
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        findById();
        findByName();
        findByClassName();
        findByTagName();
        findByLinkText();
        findByPartialLinkText();

    }

    public static void findById() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name"));
        driver.findElement(By.id("login-button"));
    }


    public static void findByName() {
        driver.findElement(By.name("password"));
    }


    public static void findByClassName() {
        driver.findElement(By.className("btn_inventory"));
        driver.findElement(By.className("inventory_item"));
    }

    public static void findByTagName() {
        driver.findElement(By.tagName("input"));
        driver.findElement(By.tagName("button"));
    }


    public static void findByLinkText() {
        driver.findElement(By.linkText("Twitter"));
        driver.findElement(By.linkText("LinkedIn"));
    }

    public static void findByPartialLinkText() {
        driver.findElement(By.partialLinkText("Sauce Labs"));
        driver.findElement(By.partialLinkText("Backpack"));
    }
}