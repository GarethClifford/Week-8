import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testing {
	
	WebDriver driver;
	String url;
	
	@Before
	public void settingUp() {
		url ="http://thedemosite.co.uk/";
		System.setProperty("webdriver.chome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = (WebDriver) new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void methodTest() {
		driver.manage().window().maximize();
		driver.get(url);
	}

}
