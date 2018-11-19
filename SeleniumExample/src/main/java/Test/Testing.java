package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.Dress;
import Pages.LandingPage;
import Pages.SearchPage;


public class Testing {
	
	WebDriver driver;
	String url;
	
	@Before
	public void setUp() {
		url = "http://automationpractice.com/index.php";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	@Ignore
	public void landingPageTest() {
		LandingPage lp = PageFactory.initElements(driver, LandingPage.class);
		SearchPage sp = PageFactory.initElements(driver,  SearchPage.class);
		lp.searchFor("dress");
		assertEquals("\"DRESS\"", sp.correctSearch());
	}
	
	@Test
	public void searchDressTest() {
		LandingPage lp = PageFactory.initElements(driver, LandingPage.class);
		SearchPage sp = PageFactory.initElements(driver,  SearchPage.class);
		Dress dress = PageFactory.initElements(driver, Dress.class);
		lp.searchFor("dress");
		sp.getDress();
		assertEquals("Printed Summer Dress", dress.correctDress());
	}

}
