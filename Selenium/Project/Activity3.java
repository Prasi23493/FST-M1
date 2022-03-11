import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("orange");
        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(" orangepassword123");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        System.out.println(driver.getTitle().equalsIgnoreCase("OrangeHRM"));
        driver.quit();


    }
}
