package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 WebElement eleUserName=driver.findElement(By.id("username"));
		 eleUserName.sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("nivedha");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("nivedha");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Adhikesavan");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("nive");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("TESTING");
		 driver.findElement(By.name("description")).sendKeys("MANUAL");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anivedha94@gmail.com");
		 driver.findElement(By.name("submitButton")).click();
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.name("description")).clear();
		 driver.findElement(By.name("importantNote")).sendKeys("manual");
		 driver.findElement(By.className("smallSubmit")).click();
		 System.out.println("The Title is :"+driver.getTitle());

	}
}
