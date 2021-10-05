import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {

    public static void main(String[] args) throws InterruptedException {
        //Set the property of the Chrome driver
        System.setProperty("webdriver.chrome.driver", "/home/gershon/Downloads/chrome/chromedriver");

        //Create the instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        //Visit Formy site
        driver.get("https://formy-project.herokuapp.com/switch-window");

        //1555 Park Blvd, Palo Alto, CA, USA
        WebElement alertTabButton = driver.findElement(By.id("alert-button"));
        alertTabButton.click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.quit();
    }
}
