package basics;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoPotentials {

	public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://192.168.227.128:8080/");
	driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
	driver.findElement(By.id("passWord")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@alt='Sign In']")).click();
	driver.findElement(By.xpath("//a[text()='Potentials']")).click();
	driver.findElement(By.xpath("//input[@value='New Potential']")).click();
	driver.findElement(By.name("property(Potential Name)")).sendKeys("hari");
	driver.findElement(By.xpath("//input[@id='Account Name']")).sendKeys("sbi");
	WebElement calender = driver.findElement(By.xpath("//img[@title='Calendar']"));
	calender.click();
	driver.findElement(By.xpath("//a[text()='21']")).click();
	WebElement drop = driver.findElement(By.xpath("//select[@name='property(Stage)']"));
	drop.click();
	Select s=new Select(drop);
	s.selectByValue("20:Qualification");
	driver.findElement(By.xpath("//input[@value='Save']")).click();
	
	}

}



