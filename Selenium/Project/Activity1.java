import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        String title = driver.getTitle();
        System.out.println("Title of the page is: " + title);
        if (title.equalsIgnoreCase("OrangeHRM")) {
            driver.quit();
        }
    }
}