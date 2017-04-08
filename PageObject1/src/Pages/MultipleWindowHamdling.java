package Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHamdling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C://SeleniumWebdrivers//chromedriver.exe");
		 //System.setProperty("webdriver.ie.driver", "C://SeleniumWebdrivers//IEDriverServer.exe");
		//WebDriver driver = new FirefoxDriver();
		 //WebDriver driver = new InternetExplorerDriver();
		WebDriver driver = new ChromeDriver();
		//#############Handling Multiple Windows##################################################################################
				driver.get("https://accounts.google.com/SignUp");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
				System.out.println(driver.getTitle());
				Set<String>ids=driver.getWindowHandles();
				Iterator<String>it=ids.iterator();
				String parentid=it.next();
				String childid=it.next();
				driver.switchTo().window(childid);
				System.out.println(driver.getTitle());
				driver.switchTo().window(parentid);
				System.out.println(driver.getTitle());
				System.out.println(driver.getPageSource());
				System.out.println(driver.getCurrentUrl());
	
	
		System.out.println("#####################################");
		System.out.println("#####################################");
		System.out.println("###########END OF TEST###############");
		System.out.println("#####################################");
		System.out.println("#####################################");
		Thread.sleep(5000); 
		driver.quit();
		//driver.close();
	
	}

}
