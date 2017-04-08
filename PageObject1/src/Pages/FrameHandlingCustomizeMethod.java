package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameHandlingCustomizeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();

		WebDriverWait wd=new WebDriverWait(driver,7); //Eplicit Wait: Wait maximum 7 sec.Whenever element is present then it continue to next steps

		driver.get("https://fantasycricket.dream11.com/IN/");

		driver.manage().window().maximize();

		int m=gotoframe(driver,By.xpath(".//*[@id='recaptcha-anchor']"));

		driver.switchTo().frame(m);

		driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();

		driver.switchTo().defaultContent();

		wd.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("I1_1441700500937")));

		int j=gotoframe(driver,By.xpath(".//*[@id='recaptcha-verify-button']"));

		if(j!=-1)

		{

		driver.switchTo().frame(j);

		//WebDriverWait wd=new WebDriverWait(driver,5);

		//wd.until(ExpectedConditions.(By.xpath(".//*[@id='recaptcha-verify-button']")));

		driver.findElement(By.xpath(".//*[@id='recaptcha-verify-button']")).click();

		}

		else{

		System.out.println("ops");

		}
		
		
		
		
		
		
}
	
	
//#######################Custom FrameHandling Function#################################################
	
	public static int gotoframe(WebDriver driver1,By by)

	{

	driver1.switchTo().defaultContent();

	int i;

	int num = -1;

	int a=driver1.findElements(By.tagName("iframe")).size();

	for(i=0;i<a;i++)

	{

	driver1.switchTo().defaultContent();

	driver1.switchTo().frame(i);

	int b=driver1.findElements(by).size();

	if(b>0)

	{

	num=i;

	break;

	}

	}

	driver1.switchTo().defaultContent();

	return num;

	}
	
	
	

}
