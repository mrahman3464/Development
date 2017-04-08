package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameHandlingAdvance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();

		WebDriverWait wd=new WebDriverWait(driver,7);

		driver.get("https://fantasycricket.dream11.com/IN/");

		driver.manage().window().maximize();
		
		int number=findFramenunber(driver,By.xpath(".//*[@id='recaptcha-anchor']/div[5]"));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
		
		driver.switchTo().defaultContent();
		
		int number1=findFramenunber(driver,By.xpath("//*[@id='recaptcha-verify-button']"));
		driver.switchTo().frame(number1);
		driver.findElement(By.xpath("//*[@id='recaptcha-verify-button']")).click();
		
		
		
			
	}

	public static int findFramenunber(WebDriver driver, By by){
		
		int i;
		int framecount=driver.findElements(By.tagName("iframe")).size();
		
		for(i=0;i<framecount;i++){
			driver.switchTo().frame(i);
			int count=driver.findElements(by).size();
			if(count>0){
				break;
			}
			else
			{
				System.out.println("Continue looping");
			}
			
		}
		
	  driver.switchTo().defaultContent();	
		
	return i;
	}
	
	
	
	
	
	
	
}
