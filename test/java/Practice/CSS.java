package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {
        findByClass();
        findByMultipleClasses();
        findByNestedClass();
        findById();
        findByTagName();
        findByTagAndClass();
        findByAttributeEquals();
        findByAttributeContainsWord();
        findByAttributeStartsWith();
        findByAttributeEndsWith();
        findByAttributeContainsSubstring();
    }


    public static void findByClass() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector(".submit-button"));
        driver.findElement(By.cssSelector(".login-box"));
    }

    public static void findByMultipleClasses() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector(".input_error.form_input"));
    }

    public static void findByNestedClass() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector(".form_group .input_error"));
    }

    public static void findById() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("#user-name"));
        driver.findElement(By.cssSelector("#login-button"));
    }


    public static void findByTagName() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("input"));
        driver.findElement(By.cssSelector("form"));
    }

    public static void findByTagAndClass() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("input.form_input"));
    }

    public static void findByAttributeEquals() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("[type='submit']"));
        driver.findElement(By.cssSelector("[placeholder='Username']"));
    }

    public static void findByAttributeContainsWord() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("[class~='btn_action']"));
    }

    public static void findByAttributeStartsWith() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("[placeholder^='User']"));
    }

    public static void findByAttributeEndsWith() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("[id$='name']"));
    }

    public static void findByAttributeContainsSubstring() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("[placeholder*='word']"));
    }
}