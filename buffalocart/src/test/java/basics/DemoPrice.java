package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class DemoPrice {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://192.168.227.128:8080/");
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@alt='Sign In']")).click();
		WebElement priceBooks = driver.findElement(By.xpath("//div[@id='tabcontainer']/descendant::a[text()='Price Books']"));
		for(;;) {
			if(priceBooks.isDisplayed()) {
				priceBooks.click();
				break;
			}else {
				driver.findElement(By.id("scrollright")).click();		}	}
		driver.findElement(By.xpath("//input[@onclick='createAction()']")).click();
		driver.findElement(By.name("property(Price Book Name)")).sendKeys("viratbio");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		String bookname = driver.findElement(By.id("value_Price Book Name")).getText();
		Assert.assertEquals(bookname, "viratbio");
		driver.findElement(By.partialLinkText("Logout")).click();
	}

}
