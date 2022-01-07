package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement((By.linkText("Create Contact"))).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Ganapathy B");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys(" B");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Ganesh");
		driver.findElement(By.xpath("//input[@name='lastNameLocal']")).sendKeys("GB");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("CBA");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Senior Service Manager");
		WebElement state = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select sss = new Select(state);
		sss.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		driver.findElement((By.xpath("//textarea[@name='importantNote']"))).sendKeys("Cleared Role details");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		System.out.println("Contacts Added and Updated Successfully");
		System.out.println("Page Title is" +" "+driver.getTitle());
		
	}

}
