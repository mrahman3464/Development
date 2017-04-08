package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Pages.LogInPage;



public class PageClassImplementation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C://SeleniumWebdrivers//chromedriver.exe");
		 //System.setProperty("webdriver.ie.driver", "C://SeleniumWebdrivers//IEDriverServer.exe");
		//WebDriver driver = new FirefoxDriver();
		 //WebDriver driver = new InternetExplorerDriver();
		WebDriver driver = new ChromeDriver();

		
/*		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		LogInPage obj1= PageFactory.initElements(driver, LogInPage.class);	
		obj1.login("adam","admin");
		*/
		
	
		
		
		 
		 
		
		
		
	

/*
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://www.google.com/xhtml");
		  Thread.sleep(5000);  // Let the user actually see something!
		  WebElement searchBox = driver.findElement(By.name("q"));
		  searchBox.sendKeys("ChromeDriver");
		  searchBox.submit();
		  Thread.sleep(5000);  // Let the user actually see something!
		  driver.quit();
		*/
		
		
		
		/*
		 * 
		driver.findElement(By.id("abc")).sendKeys("Username");
		driver.findElement(By.name("abc")).sendKeys("Username");
		driver.findElement(By.xpath(".//*[@id='abc']")).click();
		driver.findElement(By.linkText("singin")).click();
		driver.findElement(By.partialLinkText("sign")).click();
		
		
		 * */
		
		/*
		
		//#################Handling Dynamic Dropdowns#############################################//
		driver.findElement(By.id("abc")).click();
		driver.findElement(By.xpath("//a[@value='US']")).click();
		
		//#################Handling Static Dropdowns#############################################//
		
		Select dropdown=new Select(driver.findElement(By.xpath("//*[id='abv']")));
		dropdown.selectByIndex(0);
		dropdown.selectByValue("8");
		dropdown.selectByVisibleText("Goa");
		
		//##################Checkbox###############################################################
		System.out.println(driver.findElement(By.xpath("//a[@value=GOI]")).isSelected());
		driver.findElement(By.xpath("//a[@value=GOI]")).click();
		
		
		*/
		
		
		
/*
		//Is displayed is used when particular object is in code base but it is in visible mode or not

		driver.get("http://www.makemytrip.com/");
		driver.manage().window().maximize();

		System.out.println(" Before clikcing on Multi city Radio button");

		System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());

		//driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).click();

		//driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).isEnabled();

		System.out.println(" After clikcing on Multi city Radio button");

		driver.findElement(By.xpath(".//*[@id='start_date_sec']/span[3]")).click();

		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[5]/td[3]/a")).click();

		int i=0;

		while(i<5)

		{

		driver.findElement(By.xpath(".//*[@id='adult_count']/a[2]")).click();

		i++;

		}

		//System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());

		//System.out.println(driver.findElement(By.xpath(".//*[@id='mui_city_button']/span")).isDisplayed());

		Thread.sleep(3000L);

		//System.out.println(driver.findElement(By.xpath(".//*[@id='responsive_bottom']/div[2]/div[1]/div/div/h3")).getText());

		//If you want to validate the object which is present in web page or code base

		int count=driver.findElements(By.xpath(".//*[@id='mui_city_button']/span")).size();

		if (count==0)

		{

		System.out.println("verified");

		}
		*/
		
		

		driver.get("http://spicejet.com/");
		driver.manage().window().maximize();
		/*

		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

		driver.findElement(By.xpath("//a[@value='GOI']")).click();

		*/

		// If you want to accees any methods in class ,create object for that class and access methods

		//using object.method

		/*Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));

		dropdown.selectByIndex(4);

		dropdown.selectByVisibleText("9 Adults");

		dropdown.selectByValue("8");*/

		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

		
		
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
