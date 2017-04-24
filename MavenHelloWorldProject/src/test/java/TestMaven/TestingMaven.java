package TestMaven;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.GetTitle;

public class TestingMaven {

	public WebDriver driver;
	
	@Before
	public void setup(){
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\punam\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();		
	}
	
	@After
	public void teardown(){
		driver.quit();
	}
	
	@Test
	public void loadyoutube(){
		driver.navigate().to("https://www.youtube.com");
		String title = driver.getTitle();
		System.out.println("Title of the page is :" +title);
		assertTrue(title.contains("YouTube"));
	}
		@Test
		public void searchgoogle(){
			driver.navigate().to("https://www.google.com");
			String title1 = driver.getTitle();
			System.out.println("Title of the page is :" +title1);
			assertTrue(title1.contains("Google"));
	}
}
