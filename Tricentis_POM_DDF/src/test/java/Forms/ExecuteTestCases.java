package Forms;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BasePack.BaseClass;


public class ExecuteTestCases  extends BaseClass{
  @Test
  
  public void TestCases() throws InterruptedException, IOException {
	  ScriptCoding n = new ScriptCoding();
	  n.openurl();
	  ScriptCoding s =  PageFactory.initElements(driver, ScriptCoding.class);
	   
	  s.entervehicaldata();
	  s.enterinsurancedata();
	  s.enterproductdata();
	  s.selectpriceoption();
	  s.sendquote();
  }
}
