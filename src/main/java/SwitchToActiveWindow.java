import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {

    public static void main(String[] args) throws InterruptedException {
        //Set the property of the Chrome driver
        System.setProperty("webdriver.chrome.driver", "/home/gershon/Downloads/chrome/chromedriver");

        //Create the instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        //Visit Formy site
        driver.get("https://formy-project.herokuapp.com/switch-window");

        //1555 Park Blvd, Palo Alto, CA, USA
        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        Thread.sleep(2000);

        newTabButton.click();
        String originalHandle = driver.getWindowHandle();

        for (String handle1 : driver.getWindowHandles()
        ) {
            Thread.sleep(3000);
            driver.switchTo().window(handle1);
        }
        driver.switchTo().window(originalHandle);

        driver.quit();
    }
}
