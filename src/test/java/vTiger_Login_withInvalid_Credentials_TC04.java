import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vTiger_Login_withInvalid_Credentials_TC04 {
    public static void main(String args[]){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:100");
//        driver.manage().window().maximize();

        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin123");
        driver.findElement(By.name("Login")).click();

        WebElement text = driver.findElement(By.className("currentTab"));

        if(text.isDisplayed())
        {
            System.out.println("Login successful");
        }
        else
        {
            System.out.println("Invalid Credentials!!");
        }
    }
}
