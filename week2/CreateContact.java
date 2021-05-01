package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		
		//2. Enter UserName and Password Using Id Locator
	
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//3.Click on Login Button using Class Locator
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//4.Click on CRM/SFA Link
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//5.Click on contacts Button
		
		driver.findElement(By.linkText("Contacts")).click();
		
		//6.Click on Create contact
		
		driver.findElement(By.linkText("Create Contact")).click();
		
		//7.Enter FirstName Field Using id Locator
		
		driver.findElement(By.id("firstNameField")).sendKeys("Timon");
		
		
		
		//8.Enter LastName Field Using id Locator
		
		driver.findElement(By.id("firstNameField")).sendKeys("Bumba");
		
		//9.  Enter FirstName(Local) Field Using id Locator
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Tim");
		
		//10. Enter LastName(Local) Field Using id Locator
		
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Bum");
		
		//11.Enter Department Field Using any Locator of Your Choice
		
		driver.findElement(By.name("departmentName")).sendKeys("ComputerScience");
		
		//12. Enter Description Field Using any Locator of your choice 
		
		driver.findElement(By.id("createContactForm_description")).sendKeys("rtrtrtrt");
		
		//13.  Enter your email in the E-mail address Field using the locator of your choice
		
		
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("xyz@gmail.com");
		
		//14.  Select State/Province as NewYork Using Visible Text
		
		
		WebElement generalSta = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")); 
		new Select(generalSta).selectByVisibleText("New York"); 
		
		
		//15. Click on Create Contact
		
		driver.findElement(By.name("submitButton")).click();
		
		//16.  Click on edit button 
		
		driver.findElement(By.linkText("Edit")).click();
		
		//17. Clear the Description Field using .clear
		
		driver.findElement(By.xpath("//span[text()='Description']")).clear();
		
		//18. Fill ImportantNote Field with Any text
		
		driver.findElement(By.xpath("//span[text()='Important Note']")).sendKeys("Hi");
		
		//19. Click on update button using Xpath locator
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		//20. Get the Title of Resulting Page.
		
		String leadList = driver.findElement(By.xpath("//div[@id='ext-gen389']")).getText();
		if(leadList=="")
		{
			System.out.println("No records to display in Lead List");
		}
	
	driver.close();
	
	}
		
	}


