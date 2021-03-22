import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




    public class SuccessfulLogin {
        public String successfully(WebDriver driver, String Username, String Pass)
        {
            driver.findElement(By.id("txtUsername")).click();
            driver.findElement(By.id("txtUsername")).sendKeys(Username);
            driver.findElement(By.id("txtPassword")).click();
            driver.findElement(By.id("txtPassword")).sendKeys(Pass);
            driver.findElement(By.name("Submit")).click();
            String validText = driver.findElement(By.id("Subscriber_link"));

            return validText;
        }
    }
