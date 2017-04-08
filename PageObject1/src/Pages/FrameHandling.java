package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C://SeleniumWebdrivers//chromedriver.exe");
		 //System.setProperty("webdriver.ie.driver", "C://SeleniumWebdrivers//IEDriverServer.exe");
		//WebDriver driver = new FirefoxDriver();
		 //WebDriver driver = new InternetExplorerDriver();
		WebDriver driver = new ChromeDriver();
		
		
			
		driver.get("http://jqueryui.com/droppable");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		driver.findElement(By.id("draggable")).click();
		
		
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
