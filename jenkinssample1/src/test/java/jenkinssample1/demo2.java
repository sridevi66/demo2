package jenkinssample1;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo2 {
    
	@Test
	
		public void demo2test() throws Throwable
		{

			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
		    FileInputStream fis=new FileInputStream("./data.properties");
			Properties p= new Properties();
			p.load(fis);
			System.out.println("login to application");
			String url1=p.getProperty("url");
			driver.get(url1);
		//	String URL=System.getProperty("url1");
			//System.out.println(URL);
			//driver.get(URL);
			System.out.print("welcome2");
		}
			
		
	}

