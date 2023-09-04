import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Password {
	
	public String getpassword(WebDriver Driver) throws InterruptedException
	{
		//Invoking browser
		//System.setProperty("WebDriver.Chrome.Driver", "E:\\chromedriver_win32.exe");
		//WebDriver Driver = new ChromeDriver();
				
		//Implicit wait for 2 seconds
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Navigate to URL
		Driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		Driver.findElement(By.linkText("Forgot your password?")).click();
		//Wait for one second
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String passwordtext = Driver.findElement(By.cssSelector("p.infoMsg")).getText();
		String[] passwordarray = passwordtext.split("'");
		String[] passwordarray2 = passwordarray[1].split("'");
		String password = passwordarray2[0];
		return password;
	
		
		
		
	}

}
