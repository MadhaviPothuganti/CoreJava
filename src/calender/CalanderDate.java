package calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderDate {

	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\i839973\\\\Downloads\\\\ChromeDriver\\\\chromedriver.exe");		
	    WebDriver driver  = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.redbus.in/bus-tickets/");
	    driver.findElement(By.xpath("//input[@id = 'txtOnwardCalendar']")).click();
	   List<WebElement> ele = driver.findElements(By.xpath("//div[@id='onward']//div[@id='rb-calmiddle']//ul[@class='rb-calendar-days']//li "));
	   int count = ele.size();
	   System.out.println("Number of Date Elements  "+count);
	   
	   for(int i=0; i<count; i++) {
		   String date = ele.get(i).getText();
		   if(date.equalsIgnoreCase("28")) {
			   ele.get(i).click();
			   break;
		   }
	   }
	   
	}

}
