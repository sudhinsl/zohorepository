package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Theme {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://192.168.227.128:8080/");
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@alt='Sign In']")).click();
		driver.findElement(By.xpath("//a[text()='Skins']")).click();
		//Thread.sleep(3000);
		WebElement color = driver.findElement(By.xpath("//form[@name='selectskin']//following::img[@alt='Balmy']"));
		//JavascriptExecutor j=(JavascriptExecutor) driver;
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(color));
		color.click();
		//j.executeScript("arguments[0].click();", "color");
		//color.click();
		//Actions a=new Actions(driver);
		//a.click(color).perform();
		driver.findElement(By.xpath("//input[@onclick='setAction(this);']")).click();
		driver.findElement(By.xpath("//input[@onclick='window.self.close()']")).click();
}
}