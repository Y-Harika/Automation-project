package BasePack;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import javax.xml.datatype.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	public static WebDriver driver;
	public static Properties obj;
	public static WebDriverWait wait;
	
 
  @BeforeClass
  public void openbrowser() throws IOException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harika Yarra\\OneDrive\\Desktop\\Batch_10AMOrange_HRM\\Mybro\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  FileInputStream fis = new FileInputStream("C:\\Users\\Harika Yarra\\OneDrive\\Desktop\\Tricentis_POM_DDF\\src\\data\\java\\Datapack\\Mydata");
	  obj = new Properties();
	  obj.load(fis);
	  
		 
  }

  @AfterClass
  public void closingbrowser() {
	 // driver.quit();
  }

}
