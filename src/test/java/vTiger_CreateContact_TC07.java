import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vTiger_CreateContact_TC07 {
    public static void main(String args[]) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:100");
//        driver.manage().window().maximize();

        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        driver.findElement(By.name("Login")).click();
//
        driver.findElement(By.xpath("//*[@id=\"tabcontent\"]/table/tbody/tr/td[18]/a")).click();
        driver.findElement(By.className("moduleMenu")).click();
        driver.findElement(By.name("salutationtype")).sendKeys("Mr.");
        driver.findElement(By.name("firstname")).sendKeys("Vishwajeet");
        driver.findElement(By.name("lastname")).sendKeys("Singh");
        driver.findElement(By.name("leadsource")).sendKeys("Employee");
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/form/table[2]/tbody/tr/td[1]/div/input[1]")).click();
    }
}