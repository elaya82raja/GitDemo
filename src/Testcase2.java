import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Testcase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String name = "Raja";
		Password call = new Password();
	
			    
		//Invoking browser
		System.setProperty("WebDriver.Chrome.Driver", "E:\\chromedriver_win32.exe");
		WebDriver Driver = new ChromeDriver();
		
		//Implicit wait for 2 seconds
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Call the method
		String password = call.getpassword(Driver);
				
		//Navigate to URL
		Driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Maximize the window
		Driver.manage().window().maximize();
		
		//Get the Title
		System.out.println("Website Title:" +" " + Driver.getTitle());
		
		//Get the URL
		System.out.println("Website URL:"+" "+ Driver.getCurrentUrl());
		
		// Enter the User Name
		Driver.findElement(By.id("inputUsername")).sendKeys(name);
		
		//Enter the Password
		Driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(password);
		
		//Click on sign in button
		Driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(2000);
		System.out.println(Driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(Driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	   

	}

}
