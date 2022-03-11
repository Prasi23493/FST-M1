import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("orange");
        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("orangepassword123");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();
        driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("prasi");
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("s");
        driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();
        driver.quit();
    }
}

