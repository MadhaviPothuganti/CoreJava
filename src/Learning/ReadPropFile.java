package Learning;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ReadPropFile {


	static WebDriver driver ;
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream  fip = new FileInputStream("C:\\2018\\WorkSpace\\JavaBasics\\src\\"
				+ "com\\qa\\config\\config.properties");
	    prop.load(fip);
		
		String browsername = prop.getProperty("browser");
		System.out.println("browser name:" + browsername);
		
		if(browsername.equals("chrome")) {
			 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\i839973\\Downloads\\ChromeDriver\\chromedriver.exe");
			
		driver = new ChromeDriver();
		
		}
		
		
		else if(browsername.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\i839973\\Downloads\\FFDriver\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("url"));
		}
	}

}
