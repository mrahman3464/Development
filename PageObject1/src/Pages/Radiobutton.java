package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://SeleniumWebdrivers//chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		//WebDriver driver=new FirefoxDriver();

		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();

		//driver.findElement(By.xpath("//input[@value='Milk']")).click();

		int count =driver.findElements(By.xpath("//input[@name='group1']")).size();

		for(int i=0;i<count;i++)

		{

		//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

		String text=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");

		if(text.equals("Cheese"))

		{

		driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

		}

		}
		
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
