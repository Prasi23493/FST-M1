import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        WebElement el=driver.findElement(By.xpath("//div[@id=\"divLogo\"]/img"));
        System.out.println(el.getAttribute("src"));
        driver.quit();

    }
    }
