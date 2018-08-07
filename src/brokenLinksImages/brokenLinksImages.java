package brokenLinksImages;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinksImages {
	
	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\i839973\\\\Downloads\\\\ChromeDriver\\\\chromedriver.exe");		
    WebDriver driver  = new ChromeDriver();
    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://www.costco.com.tw/");
    
   List<WebElement> links =  driver.findElements(By.tagName("a"));
   links.addAll(driver.findElements(By.tagName("img")));
   int count = links.size();
   
   for(int i = 0;i<count;i++) {
	   
	 String url= links.get(i).getAttribute("href");
	 verifyActiveLinks(url);
  
   }
			
}

	public static void verifyActiveLinks(String linkurl) {
		
		try {
			URL url = new URL(linkurl);
		    HttpURLConnection httpurlconnect = (HttpURLConnection)url.openConnection();
		    httpurlconnect.setConnectTimeout(3000);
		    httpurlconnect.connect();
		    if(httpurlconnect.getResponseCode()==200) {
		    	System.out.println(linkurl+" - "+httpurlconnect.getResponseMessage());
		    }
		    if(httpurlconnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
		    	System.out.println(linkurl+" - "+httpurlconnect.getResponseMessage() + " - "+HttpURLConnection.HTTP_NOT_FOUND);
		    }
		
		
		
		
		} catch (Exception e) {
			
		}
		
		
	}
	
	
}
