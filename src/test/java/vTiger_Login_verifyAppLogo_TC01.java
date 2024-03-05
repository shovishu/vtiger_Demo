import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vTiger_Login_verifyAppLogo_TC01 {

    public static void main(String args[]){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:100");
        driver.manage().window().maximize();
        if(driver.findElements(By.xpath("//img[@src='include/images/vtiger-crm.gif']")).size()==1)
        {
            System.out.println("Logo displayed successfully!!");
        }

        else
        {
            System.out.println("Title Logo didn't displayed");
        }

    }
}
