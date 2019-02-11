import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class SampleTest {

    public static void main(String[] args) {

        while(true) {
            FirefoxDriver firefoxDriver = new FirefoxDriver();
            firefoxDriver.get("http://www.google.com");
            String id;
            WebElement searchElement = firefoxDriver.findElement(By.name("q"));
            searchElement.sendKeys("arul suju");
            searchElement.submit();

            firefoxDriver.quit();
        }



    }
}
