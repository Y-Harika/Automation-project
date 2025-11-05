package Forms;

import org.testng.annotations.Test;

import BasePack.BaseClass;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class ReusedMethods extends ExecuteTestCases{
	public void dropdown(String a,String visibleText)
	{
		
		 WebElement E = driver.findElement(By.xpath(obj.getProperty(a)));
		 Select D = new Select(E);
		 D.selectByVisibleText(visibleText);
	}

	void t(int k) throws InterruptedException
	{
		int a = k*1000;
		Thread.sleep(a);
	}


	void screenshot(String k) throws IOException
	{
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File T = new File("C:\\Users\\Harika Yarra\\OneDrive\\Desktop\\Tricentis_POM_DDF\\Testevidances\\"+k +".jpg");
		FileHandler.copy(s, T);
	}
}
