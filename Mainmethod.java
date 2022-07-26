package pom;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Mainmethod {

	private static final WebElement WebElement = null;
	@Test(dataProvider="signup")
	public void home(String a1,String a2,String a3,String a4,String a5,String a6)
	{
		
		System.setProperty("webdriver.chrome.driver","./soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		driver.get("https://mobileworld.azurewebsites.net/index.html");
		
		Signup lg=new Signup(driver);
	
		lg.but().click(); 
		lg.Sg().click();
		lg.first(a1);
		lg.Last(a2);
		lg.Email(a3);
		lg.Pass(a4);
		lg.Date();
		lg.gender();
		lg.num(a5);
		lg.bio(a6);
		lg.regbt();
		driver.switchTo().alert().accept();
		
		driver.close();
	}
	@DataProvider
	public Object signup()
	{
		return new Object [][] {{"Naveen","kumar","naveencmy25@gmail.com","Machhi@1234","6363389356","hi how are u dude"},{"prashant","kumari","balunavi25@gmail.com","vibgayar$09876","9108649969","hi guys how are you"}};
	}
	
	
	
	@Test(enabled=false,dataProvider="login")
	public void Log(String a,String b)
	{
		
		System.setProperty("webdriver.chrome.driver","./soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(3));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		driver.get("https://mobileworld.azurewebsites.net/index.html");
		Loginup sg=new Loginup(driver);
		sg.bts();
		sg.User(a);
		sg.passwd(b);
		sg.btn();
		driver.close();
	}
	@DataProvider
	public Object login()
	{
		return new Object [][] {{"naveencmy25@gmail.com","Vibgayar@123"},{"pashu@gmail.com","balki@123"},{"manoj654@gmail.com","puttagundla@99"}};
	}
	
	
	@Test(enabled=false,dataProvider="allmobiles")
	public void allm(String a1,String a2,String a3,String a4,String a5,String a6,String a7,String a8,String a9)
	{
		System.setProperty("webdriver.chrome.driver","./soft/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(3));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		driver.get("https://mobileworld.azurewebsites.net/index.html");
		allmobile at=new allmobile(driver);
		at.al();
		at.sc(a1);
		at.btn();
		at.wn();
		at.fn1(a2);
		at.ln1(a3);
		at.em1(a4);
	at.ps(a5);
	at.rd1();
	  at.nu1(a6);
	  at.ad1(a7);
	   at.ad2(a8);
	  at.dr1();
	  at.md1();
	 
	  at.cha1();
	  at.ch1();
	  at.cnm(a9);
	  at.s1();
	  at.ch1();
	  at.ch2();
	  at.btn1();
	 at.btn2();
	}
	@DataProvider
	public Object allmobiles()
	{
		return new Object [][] {{"apple","naveen","kumar","naveencmy25@gmail.com","milkyway@66","99020203612","chintamani","nagadenahalli","2"}};
			//{"apple","prash","manoj","dinggi@123.com","ponkyat","8892543659","kaiwar","chikkaballapura","3"};
	
}
}