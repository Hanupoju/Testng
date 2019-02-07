package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
	
  @Test
  public void test(){
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page"));
  }
}
