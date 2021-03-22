import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testChrome {
    public testChrome() {
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WrongUsername ls = new WrongUsername();
        String invalidText = ls.invalidCredentials(driver, "wwww", "admin123");
        if (invalidText.equalsIgnoreCase("Invalid credentials")) {
            System.out.println("Pass Error message is displayed");
        } else {
            System.out.println("Fail error message is not appeared");
        }
        MissingData ms = new MissingData();
        String missingCredentials = ms.missingCredentials(driver, "", "");
        if (missingCredentials.equalsIgnoreCase("Username cannot be empty")) {
            System.out.println("Pass Alert message displayed");
        } else {
            System.out.println("Fail alert message is not appeared");
        }

        WrongPassword wp = new WrongPassword();
        String WrongPassword = wp.wrongPassword(driver, "admin", "admin1234");
        if (WrongPassword.equalsIgnoreCase("Invalid credentials")) {
            System.out.println("Pass Error message is displayed");
        } else {
            System.out.println("Fail error message is not appeared");

        }


        SuccessfulLogin sl = new SuccessfulLogin();
        String successfully = sl.successfully(driver, "Admin", "admin123");
        if (successfully.equalsIgnoreCase("OrangeHRM"))
        {
            System.out.println("Congratulation you are at dashboard");

        }
        else {
            System.out.println("Sorry check your credentials");

        }
    }
}
