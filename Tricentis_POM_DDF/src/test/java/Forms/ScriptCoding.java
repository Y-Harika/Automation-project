package Forms;

import org.testng.annotations.BeforeClass;



import BasePack.BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class ScriptCoding extends ReusedMethods  {
	
	@FindBy(xpath = "//select[@id ='make']")WebElement d;
	
	 @FindBy(xpath = "//input[@id = 'engineperformance']")WebElement E;
	 @FindBy(xpath = "//input[@id = 'dateofmanufacture']")WebElement D;
	 @FindBy(xpath = "//input[@id = 'listprice']")WebElement P;
	 @FindBy(xpath = "//input[@id = 'licenseplatenumber']")WebElement L;
	 @FindBy(xpath = "//input[@id = 'annualmileage']")WebElement M;
	 @FindBy(xpath = "//button[@id ='nextenterinsurantdata']")WebElement N;
	 @FindBy(xpath = " //input[@id = 'firstname']")WebElement F;
	 @FindBy(xpath = " //input[@id = 'lastname']")WebElement S;
	 @FindBy(xpath = " //input[@id = 'birthdate']")WebElement B;
	 @FindBy(xpath = " //input[@id = 'streetaddress']")WebElement A;
	 @FindBy(xpath = " //input[@id = 'zipcode']")WebElement Z;
	 @FindBy(xpath = " //input[@id = 'city']")WebElement C;
	 @FindBy(xpath = "//button[@id = 'nextenterproductdata']")WebElement p;
	 @FindBy(xpath = "//input[@id = 'startdate']")WebElement startdate;
	 @FindBy(xpath = "//button[@id = 'nextselectpriceoption']")WebElement W;
	 @FindBy(xpath = "//button[@id = 'nextsendquote']")WebElement q;
	 @FindBy(xpath = "//input[@id = 'email']")WebElement Eg;
	 @FindBy(xpath = "//input[@id = 'username']")WebElement U;
	 @FindBy(xpath = "//input[@id = 'password']")WebElement y;                             
	 @FindBy(xpath = "//input[@id = 'confirmpassword']")WebElement o;
	 @FindBy(xpath = "//button[@id = 'sendemail']")WebElement e;
	 
	 public void openurl()
	 {
	 driver.get(obj.getProperty("URL"));
	 }

  public void entervehicaldata() throws InterruptedException, IOException
  {
	  PageFactory.initElements(driver,this);
	  screenshot("After wedsiteopen");
	 
	  driver.findElement(By.id("nav_automobile")).click();
	  
	  
		//dropdown("MAKE","Audi");
	  WebElement DD = e;
	 Select s = new Select(DD);
	 s.selectByVisibleText("Audi");
		E.sendKeys(obj.getProperty("performance"));
		D.sendKeys(obj.getProperty("Manufacture"));
		dropdown("seats","4");
		dropdown("fueltype","Petrol");
		P.sendKeys(obj.getProperty("Listprice"));
		L.sendKeys(obj.getProperty("PlateNo"));
		M.sendKeys(obj.getProperty("Mileage"));
		screenshot("After entervehicaldata");
		//wait.until(ExpectedConditions.elementToBeClickable
        N.click();
		  //screenshot("After entervehicaldata");

  }
 
  

  public void enterinsurancedata() throws IOException
  {
	  PageFactory.initElements(driver,this);
	  F.sendKeys(obj.getProperty("FirtName"));
	  S.sendKeys(obj.getProperty("LastName"));
	  B.sendKeys(obj.getProperty("DOB"));
	  
	  driver.findElement(By.xpath("//span[@class='ideal-radio' and preceding-sibling::input[@id='gendermale']]")).click();
	  dropdown("Country","India");
      A.sendKeys(obj.getProperty("Address"));
	  Z.sendKeys(obj.getProperty("Zipcode"));
	  C.sendKeys(obj.getProperty("City"));
	  dropdown("Occupation","Employee");
	  driver.findElement(By.xpath("//span[@class='ideal-check' and preceding-sibling::input[@id='speeding']]")).click();
	
			  p.click();
	  screenshot("After enterinsurancedata");
	  


 }
  public void enterproductdata() throws IOException
  {
	  PageFactory.initElements(driver,this);
	  startdate.sendKeys(obj.getProperty("Stsrtdate"));
	  dropdown("sum","3.000.000,00");
	  dropdown("Rating","Bonus 8");
	  dropdown("damageinsurance","Full Coverage");
	  
      
	  driver.findElement(By.xpath("//span[@class='ideal-check' and preceding-sibling::input[@id='EuroProtection']]")).click();
	  dropdown("Car","Yes");
	  screenshot("After enterproductdata");
	
			  W.click();

	  
}
  public void selectpriceoption() throws IOException
  {
	  PageFactory.initElements(driver,this);
	  driver.findElement(By.xpath("//span[@class='ideal-radio' and preceding-sibling::input[@id='selectgold']]")).click();
	  screenshot("After nextsendquote");
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("nextsendquote")));
	  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nextButton);
	  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextButton);


			  //q.click();
  }
  public void sendquote() throws IOException
  {
	  PageFactory.initElements(driver,this);
	  Eg.sendKeys(obj.getProperty("gmail"));
		U.sendKeys(obj.getProperty("uaername"));
		y.sendKeys(obj.getProperty("password"));
		o.sendKeys(obj.getProperty("confirmpassword"));
		 screenshot("After sendemail");
		 
		 //wait.until(ExpectedConditions.elementToBeClickable(
				 e.click();
  }


	    
	


}



    

 
