package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FeedBack {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://192.168.227.128:8080/");
	driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
	driver.findElement(By.id("passWord")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@alt='Sign In']")).click();
	WebElement solution=driver.findElement(By.xpath("//a[text()='Solutions']"));
	for(;;) {
	if(solution.isDisplayed()) {
		solution.click();
	}
	else {
		driver.findElement(By.id("scrollright")).click();}}
	
}
}
