import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteJavaScript {

    public static void main(String[] args) throws InterruptedException {
        //Set the property of the Chrome driver
        System.setProperty("webdriver.chrome.driver", "/home/gershon/Downloads/chrome/chromedriver");

        //Create the instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        //Visit Formy site
        driver.get("https://formy-project.herokuapp.com/modal");

        //1555 Park Blvd, Palo Alto, CA, USA
        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();
        Thread.sleep(2000);

        WebElement closeButton = driver.findElement(By.id("close-button"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", closeButton);


        driver.quit();
    }
}
