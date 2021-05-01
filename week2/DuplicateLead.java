package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		
		//2. Enter UserName 
	
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//3.Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//4.Click on Login Button using Class Locator
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//5.Click on CRM/SFA Link
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//6.Click on Leads Link
		
		driver.findElement(By.linkText("Leads")).click();
		
		//7.Click Find Leads
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		//8. Click in Email
		
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();
		
		
		//9.Enter Email
		
		
		driver.findElement(By.name("emailAddress")).sendKeys("123@abc.com");
		
		//10. Find Leads Button
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//11.Capture name of First Resulting lead
		
		String name1 = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")).getText();
		
		
		
		//12. Click First Resulting lead
		
		driver.findElement(By.linkText("10039")).click();
		
		//13.Click Duplicate Lead
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		//14. Verify the title as 'Duplicate Lead'
		
		String duplicateLead = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(""+duplicateLead);
		
		//15. Click Create Lead
		
		driver.findElement(By.name("submitButton")).click();
		
		String companyName = driver.findElement(By.xpath("//span[@class='requiredField']")).getText();
		
		if(name1==companyName)
		{
			System.out.println("Duplicate name");
		}
		
		driver.close();
		

	}

}
