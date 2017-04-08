package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogInPage {
	
	@FindBy(xpath ="//*[@id='email']")
	public WebElement username;
	
	@FindBy(how=How.XPATH,using ="//*[@id='passwd']")
	public WebElement password;
	
	@FindBy(how=How.XPATH,using ="//*[@id='SubmitLogin']/span")
	public WebElement signin_button;
	
	//Business Logic 
	public void login(String myusername,String mypassword){
		
		username.sendKeys(myusername);
		password.sendKeys(mypassword);
		signin_button.click();
		
	}
	
	
	
	
	

}
