package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {
    public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    driver.get("https://www.training-support.net/selenium/dynamic-attributes");
    WebElement userName = driver.findElement(By.xpath("//input[contains(@class, '-username')]"));
    WebElement password = driver.findElement(By.xpath("//input[contains(@class, '-password')]"));
    WebElement confirmPassword = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input"));
    WebElement email = driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input"));
    userName.sendKeys("NewPrasi");
    password.sendKeys("1234567");
    confirmPassword.sendKeys("1234567");
    email.sendKeys("abcd@xyz.com");
    driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
    String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
    System.out.println("Login message: " + loginMessage);
    driver.close();
}
}
