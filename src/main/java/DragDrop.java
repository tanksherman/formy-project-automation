import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

    public static void main(String[] args) throws InterruptedException {
        //Set the property of the Chrome driver
        System.setProperty("webdriver.chrome.driver", "/home/gershon/Downloads/chrome/chromedriver");

        //Create the instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        //Visit Formy site
        driver.get("https://formy-project.herokuapp.com/dragdrop");

        //1555 Park Blvd, Palo Alto, CA, USA
        WebElement image = driver.findElement(By.id("image"));

        Thread.sleep(2000);

        WebElement box = driver.findElement(By.id("box"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(image,box).build().perform();
        Thread.sleep(2000);


        driver.quit();
    }
}
