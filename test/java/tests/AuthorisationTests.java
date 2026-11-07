package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AuthorisationTests extends BaseTest {

    private static final By userNameInput = By.id("user-name");
    private static final By passwordNameInput = By.id("password");
    private static final By loginButton = By.id("login-button");

    private static final By firstItemName = By.xpath("(//div[@class='inventory_item_name'])[1]");
    private static final By firstItemPrice = By.xpath("(//div[@class='inventory_item_price'])[1]");
    private static final By addToCartButton = By.xpath("(//button[text()='Add to cart'])[1]");
    private static final By cartIcon = By.className("shopping_cart_link");

    private static final By cartItemName = By.className("inventory_item_name");
    private static final By cartItemPrice = By.className("inventory_item_price");

    private static String valueUserName = "standard_user";
    private static String valuePassword = "secret_sauce";

    @Test
    public void checkItemNameAndPriceInCart() {

        driver.get(Base_URL);
        driver.findElement(userNameInput).sendKeys(valueUserName);
        driver.findElement(passwordNameInput).sendKeys(valuePassword);
        driver.findElement(loginButton).click();

        String expectedName = driver.findElement(firstItemName).getText();
        String expectedPrice = driver.findElement(firstItemPrice).getText();

        driver.findElement(addToCartButton).click();

        driver.findElement(cartIcon).click();

        String actualName = driver.findElement(cartItemName).getText();
        String actualPrice = driver.findElement(cartItemPrice).getText();

        assertEquals(actualName, expectedName, "Имя товара в корзине не совпадает");
        assertEquals(actualPrice, expectedPrice, "Цена товара в корзине не совпадает");
    }
}