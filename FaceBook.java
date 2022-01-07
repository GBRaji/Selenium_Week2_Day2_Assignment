package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		// driver.switchTo().alert().accept()
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Venba");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("GR");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Success123");
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='birthday_day']")));
		WebElement wb = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select drop1 = new Select(wb);
		drop1.selectByValue("10");
		WebElement wb1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select drop2 = new Select(wb1);
		drop2.selectByValue("7");
		WebElement w2 = driver.findElement(By.xpath("//select[@id='year']"));
		Select drop3 = new Select(w2);
		drop3.selectByValue("1989");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		System.out.println("Account Created Successfully");
		driver.close();

	}

}
