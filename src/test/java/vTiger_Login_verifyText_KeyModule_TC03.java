import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vTiger_Login_verifyText_KeyModule_TC03 {

    public static void main(String args[]){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:100");
//        driver.manage().window().maximize();
        WebElement text = driver.findElement(By.xpath("//*[text()='Key Modules']"));
        System.out.println(text.getText());
        if(text.isDisplayed())
        {
            System.out.println("Content Available on the Page!!");
        }
        else
        {
            System.out.println("Content not Available on the Page!!");
        }

    }
}
