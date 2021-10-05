import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSample {
    public static void main(String[] args) {
        //Set the property of the Chrome driver
        System.setProperty("webdriver.chrome.driver", "/home/gershon/Downloads/chrome/chromedriver");

        //Create the instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        //Visit Google
        driver.get("https://www.google.com/");

        //Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        //Enter something to search
        element.sendKeys("Cheese!");

        //Submit the form
        element.submit();

        //Browser close
        driver.close();
    }
}
