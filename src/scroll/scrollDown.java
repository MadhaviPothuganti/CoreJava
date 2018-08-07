package scroll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollDown {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\i839973\\\\Downloads\\\\ChromeDriver\\\\chromedriver.exe");		
		    WebDriver driver  = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.get("https://www.costco.com.tw/");
		    WebElement ele = driver.findElement(By.xpath("//a[@id='termuse']"));
		   
		    //1.Solution
		    Actions actions = new Actions(driver);
		    actions.moveToElement(ele).click().build().perform();
		    
		   
		    //2.Solution 
		   // ele.sendKeys(Keys.PAGE_DOWN);
		   // ele.click();
		   

	}

}
