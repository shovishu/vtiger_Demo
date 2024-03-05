import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class vTiger_Login_withValid_Credentials_TC05 {
    public static void main(String args[]){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:100");
//        driver.manage().window().maximize();

        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        driver.findElement(By.name("Login")).click();

        WebElement e = driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/div/font[1]/strong"));
        System.out.println(e.getText() );

        if(e.isDisplayed())
        {
            System.out.println("Login successful");
        }
        else
        {
            System.out.println("Invalid Credentials!!");
        }
    }
}
