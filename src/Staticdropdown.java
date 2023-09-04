import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Staticdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoking browser
				System.setProperty("WebDriver.Chrome.Driver", "E:\\chromedriver_win32.exe");
				WebDriver Driver = new ChromeDriver();
				
				//Implicit wait for 2 seconds
				Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
									
				//Navigate to URL
				Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				//select USD in the the static dropdown
				WebElement staticdropdown = Driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
				Select dropdown = new Select(staticdropdown);
				dropdown.selectByIndex(3);
				System.out.println(dropdown.getFirstSelectedOption().getText());

	}

}
