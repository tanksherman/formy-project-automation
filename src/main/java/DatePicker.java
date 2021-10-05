import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

    public static void main(String[] args) throws InterruptedException {
        //Set the property of the Chrome driver
        System.setProperty("webdriver.chrome.driver", "/home/gershon/Downloads/chrome/chromedriver");

        //Create the instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        //Visit Formy site
        driver.get("https://formy-project.herokuapp.com/datepicker");

        //1555 Park Blvd, Palo Alto, CA, USA
        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("01/01/21");
        dateField.sendKeys(Keys.RETURN);



        driver.quit();
    }
}
