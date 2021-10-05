import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

    public static void main(String[] args) throws InterruptedException {
        //Set the property of the Chrome driver
        System.setProperty("webdriver.chrome.driver", "/home/gershon/Downloads/chrome/chromedriver");

        //Create the instance of the chrome driver
        WebDriver driver = new ChromeDriver();
        ///html/body/div/div/div/a[11]

        //Visit Formy site
        driver.get("https://formy-project.herokuapp.com/dropdown");

        //1555 Park Blvd, Palo Alto, CA, USA
        WebElement dropdownMenuButton = driver.findElement(By.id("dropdownMenuButton"));
        dropdownMenuButton.click();

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.click();




        driver.quit();
    }
}
