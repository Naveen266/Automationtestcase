package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
	WebDriver drv;
	
	public Signup(WebDriver drv1) {
		
	drv=drv1;
	PageFactory.initElements(drv1, this);
		
	}

	By button=By.xpath("//button[@type='submit']");
	By sign=By.xpath("//a[.='Sign up']");
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement fn1;
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement ln;
	
	@FindBy(xpath="//input[@type='Email']")
	WebElement Em;
	@FindBy(xpath="//input[@type='Password']")
	WebElement ps;
	
	@FindBy(xpath="//input[@type='date']")
	WebElement dt;
	@FindBy(xpath="(//input[@type='radio'])[1]")
	WebElement rd;
	@FindBy(xpath="//input[@type='number']")
	WebElement nu;
	@FindBy(xpath="//textarea[@placeholder='Short Bio']")
	WebElement sh;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement rg;
	
	
	public WebElement but()
	{
		return drv.findElement(button);
	}
	
	public WebElement Sg()
	{
		return drv.findElement(sign);
	}
	public void first(String As) {
		fn1.sendKeys(As);
	}
	
	public void Last(String F)
	{
		ln.sendKeys(F);
	}
	public void Email(String E)
	{
		Em.sendKeys(E);
	}

	public void Pass(String p)
	{
		ps.sendKeys(p);
	}	

	public void Date()
	{
		dt.click();
	}	
	public void gender()
	{
		rd.click();
	}
	
	public void num(String n)
	{
		nu.sendKeys(n);
	}	
	
	public void bio(String b)
	{
		sh.sendKeys(b);
	}
	
	public void regbt()
	{
		rg.click();
	}	
	
	
}

