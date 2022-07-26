package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginup {
	
	WebDriver dt;
	public Loginup(WebDriver Dr)
	
	{
	dt=Dr;
	PageFactory.initElements(dt, this);
	}
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement sa;
	
	
@FindBy(xpath="//input[@type='text']")
WebElement un;

@FindBy(xpath="//input[@type='password']")
WebElement pw;
	
@FindBy(xpath="//a[@type='submit']")
WebElement sbt;

public void bts()
{
	sa.click();
	
	}

public void User(String S)
{
	un.sendKeys(S);
	
	}
public void passwd(String p)
{
	pw.sendKeys(p);
	
	}
public void btn()
{
	sbt.click();
	
	}


}
