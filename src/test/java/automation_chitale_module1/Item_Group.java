package automation_chitale_module1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Item_Group {
WebDriver driver;
@BeforeMethod
public void beforeMethod() 
	{
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://erpuat.chitalegroup.co.in");	
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div/div/div/div/div[2]/div/form/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"j_username\"]")).sendKeys("Supervisor");
		driver.findElement(By.xpath("//*[@id=\"j_password\"]")).sendKeys("Sangli1"); 
		driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();
	  //  WebElement element = driver.findElement(By.xpath("//*[@id=\"basic-nav-dropdown\"]"));
	  //  String name = element.getText();
	   // System.out.println(name);
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/ul/li[4]/a/p")).click();
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/ul/li[2]/a/p")).click();
	}
@ Test()
public void T()	
{
	
	}
@AfterMethod
public void afterMethod()
{
   driver.quit();	
}






































































































 

}
