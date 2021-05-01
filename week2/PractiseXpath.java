package week2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PractiseXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// TODO Auto-generated method stub
			
				WebDriverManager.chromedriver().setup();
				
				//Step 1: Click the URL
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps");
				
				driver.manage().window().maximize();
				
				// Step 2:Enter user name
				
				driver.findElement(By.xpath("//label[@for='username']/following-sibling::input")).sendKeys("DemoSalesManager");
	
				// Step 3: Enter the Password
				
				driver.findElement(By.xpath("//label[@for='password']/following-sibling::input")).sendKeys("crmsfa");
				
				//Step 4 : Click on the Login button
				
				driver.findElement(By.xpath("//input[@value='Login']")).click();
				
				//Step 5: Click on the CRM/SFA link
				
				driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
				
				//Step 6: Click on Leads link
				
				driver.findElement(By.xpath("//a[text()='Leads']")).click();
				
				//Step 7. Click on Merge Leads link
				
				driver.findElement(By.xpath("//a[text()='Merge Leads']")).click();
				
			   // Step 8. Click the first img icon
				
				
				driver.findElement(By.xpath("//div[@wairole='presentation']/following::img")).click();
				
				// Step 9: Select the first resulting lead
				
				driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner')]/a[@class='linktext']")).click();
				
				
				
				//Step 10: Click the second img icon
				
				driver.findElement(By.xpath("//input[@id='partyIdTo']/following::img")).click();
				
				//Step 11: Select the second resulting lead
				
				driver.findElement(By.xpath("//a[text()='10005']")).click();
				
				//Step 12:  Click on Merge Lead (submit) button
				
				driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
				
				//Step 13: Get the company name text based on its label
				
			
				WebElement name = driver.findElement(By.xpath("//span[text()='Company Name']"));
				System.out.println("Name of the Company is:- " +name.getAttribute("link text"));
				
	}
	

	
		
	}


