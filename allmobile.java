package pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class allmobile {
	WebDriver dr1;
	public allmobile(WebDriver dr1)
	{
		this.dr1=dr1;
		PageFactory.initElements(dr1, this);
	}
	@FindBy(xpath="//a[normalize-space()='All Mobiles']")
	WebElement all;
	
	@FindBy(xpath="//input[@class='form-control mb-4']")
	WebElement srch;
	
	@FindBy(xpath="(//a[.='Order'])[5]")
	WebElement od;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement fn;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement ln;
	@FindBy(xpath="//input[@id='inputEmail']")
	WebElement em;
	@FindBy(xpath="//button[normalize-space()='Order Now']")
	WebElement at;
	@FindBy(xpath="//input[@id='inputPassword']")
	WebElement ps;
	@FindBy(xpath="//input[@id='flexRadioDefault1']")
	WebElement rd;
	@FindBy(xpath="(//input[@type='number'])[1]")
	WebElement nu;
	@FindBy(xpath="//input[@id=' address1']")
	WebElement ad;
	@FindBy(xpath="//input[@id='address2']")
	WebElement adr;
	@FindBy(xpath="//input[@id='inputCity']")
	WebElement ct;
	@FindBy(xpath="//select[@id='inputState']")
	WebElement dr;
	@FindBy(xpath="//input[@rel='apple']")
	WebElement ch;
	@FindBy(xpath="//input[@rel='apple']")
	WebElement cha;
	@FindBy(xpath="//input[@placeholder='no of mobiles']")
	WebElement cm;
	@FindBy(xpath="//button[normalize-space()='Order Now']")
	WebElement bt12;
	@FindBy(xpath="//a[@class='btn btn-secondary']")
	WebElement bt14;
	@FindBy(xpath="//option[.='Apple 12']")
	WebElement md;
	@FindBy(xpath="//select[@id='bought']")
	WebElement s;
	@FindBy(xpath="(//input[@id='gridCheck1'])[1]")
	WebElement chlast;
	@FindBy(xpath="(//input[@id='gridCheck1'])[2]")
	WebElement chlast2;
	public void cha1()
	{
		cha.click();
	}	
	
	
	public void ch2()
	{
		chlast2.click();
	}		
			
	public void chl()
	{
		chlast.click();
	}
	public void md1()
	{
		md.click();
	}
	public void al()
	{
		all.click();
	}
	public void sc(String sa)
	{
		srch.sendKeys(sa);
	}	
	public void btn()
	{
		od.click();
	}
	public void fn1(String n)
	{
		fn.sendKeys(n);
	}
	public void ln1(String n)
	{
		ln.sendKeys(n);
	}
	public void em1(String n)
	{
		em.sendKeys(n);
	}
	
	public void ps(String a)
	{
		ps.sendKeys(a);
	}
	
	public void rd1()
	{
		rd.click();
	}
	
	public void nu1(String a)
	{
     nu.sendKeys(a);
	}
	
	public void ad1(String a)
	{
     ad.sendKeys(a);
	}
	
	public void ad2(String a)
	{
     adr.sendKeys(a);
	}
	public void ct1(String a)
	{
     ct.sendKeys(a);
	}
	public void dr1()
	{
		
		Select sd=new Select(dr);	
		sd.selectByIndex(2);
    
	}
	
	public void ch1()
	{
     ch.click();
	}
	public void cnm(String a)
	{
     cm.sendKeys(a);
	}
	
	public void btn1()
	{
     bt12.click();
	}
	public void btn2()
	{
     bt14.click();
	}
	public void s1()
	{
		Select sd=new Select(s);	
		sd.selectByIndex(1);
	}
	
	public void wn()
	{
		WebDriver driver = dr1;
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentID=it.next();
		String childID=it.next();
		driver.switchTo().window(childID);
		
	}
	
}
