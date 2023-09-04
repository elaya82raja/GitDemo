import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String name = "Raja";
			    
		//Invoking browser
		System.setProperty("WebDriver.Chrome.Driver", "E:\\chromedriver_win32.exe");
		WebDriver Driver = new ChromeDriver();
		
		//Implicit wait for 2 seconds
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Call the method
		String password = getpassword(Driver);
				
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
		
		//System.out.println(Driver.findElement(By.cssSelector("p.error")).getText());
		
		//Click on forgot password link
		//Driver.findElement(By.linkText("Forgot your password?")).click();
		
		//Enter user name
		//Driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys(name);
		
		//Enter email
		//Driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("senthil@gmail.com");
		
		//Click on reset button
		//Driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		
		//Temporary password
		//System.out.println(Driver.findElement(By.cssSelector("p.infoMsg")).getText());
		
		
	    //Driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
				
       // Driver.findElement(By.id("inputUsername")).sendKeys(name);
		
		//Enter the Password
		//Driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("raja");
		

	}
	
	//Get the password - Please use temporary password 'rahulshettyacademy' to Login.
	public static String getpassword(WebDriver Driver) throws InterruptedException {
		//Navigate to URL
		Driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Click on forgot password link
		Driver.findElement(By.linkText("Forgot your password?")).click();
		
		//Wait for one second
		Thread.sleep(1000);
		
		//Click on reset button
		Driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		
		//Temporary password - Please use temporary password 'rahulshettyacademy' to Login.
		String passwordtext = (Driver.findElement(By.cssSelector("p.infoMsg")).getText());
		String[] passwordarray = passwordtext.split("'");
		String[] passwordarray2 = passwordarray[1].split("'");
		String password = passwordarray2[0];
		return password;
		// In String array 0th index - Please use temporary password (will be store)
		// In string array 1th index - rahulshettyacademy' to Login.(will be store)
		
		
		
		
		
		
}
	
}
