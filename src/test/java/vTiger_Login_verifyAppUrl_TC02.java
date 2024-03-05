import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vTiger_Login_verifyAppUrl_TC02 {

    public static void main(String args[]){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:100");
        driver.manage().window().maximize();

        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        driver.findElement(By.name("Login")).click();

        String vTitle = driver.getTitle();
        if(vTitle.equals("vtiger CRM - Commercial Open Source CRM"))
        {
            System.out.println("Title displayed!!");
        }
        else{
            System.out.println("Title didn't displayed");
        }

    }
}
