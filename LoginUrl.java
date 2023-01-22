package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginUrl {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//firefoxDriver driver=new FirefoxDriver
		//EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Karthi");
		//driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Entered the Description field");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("saranv2912@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement el=driver.findElement(By.id("updateLeadForm_description"));
		el.clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Entered the imp notes");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println("The title is:"+ driver.getTitle());
		driver.findElement(By.className("subMenuButton")).click();
		WebElement el1 = driver.findElement(By.id("createLeadForm_companyName"));
		el1.clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("new company entered");
		WebElement el2 = driver.findElement(By.id("createLeadForm_firstName"));
		el2.clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("New Name entered");
		driver.findElement(By.className("smallSubmit")).click();
		String title1 = driver.getTitle();
		System.out.println("The title is:"+ driver.getTitle());
		
		
		
		
		
		
		

	}

}
