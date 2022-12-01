package test_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import generic.Base_Test;
import pom_scripts.Olx_01;

public class OlxProject extends Base_Test {
	@Test()
	public void test() throws InterruptedException {
		 Olx_01 Motorc = new Olx_01(driver);
		 Motorc.waitStmnt();
		 Motorc.Click_Motorcycle();
		
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		 
		
//----------------------------------CATEGORIES---------------------------------------------------------
		Motorc.Click_Scooters();
		Motorc.waitStmnt();
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//span[text()='Spare Parts'])[3]")))).click();
		Motorc.Click_SpareParts();
		

		Motorc.Click_BiCycles();
		
		
		Motorc.Click_MotorCycles();
		
		
//------------------------------------LOCATIONS----------------------------------------------------------
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@data-aut-id='location_Uttar Pradesh']"))));
		Motorc.Click_UttarPradesh();
		
		
		Motorc.Click_Lucknow();
		
		
		Motorc.Click_GomtiNagar();
		
		
//-------------------------------------BUDGET------------------------------------------------------------------
		//Motorc.Click_DropDown();

		
		
//------------------------------------ALL BRANDS---------------------------------------------------------------------		
		
		
		Motorc.Click_RoyalEnfield();
		
		
		Motorc.Click_Yamaha(); 
		
		
//------------------------------------ALL MODELS---------------------------------------------------------------------		
		Motorc.Click_RoyalEnfieldClassic();
		
		
		Motorc.Click_YamahaFZ();
		

//------------------------------------KM DRIVEN ---------------------------------------------------------------------
		Motorc.Click_KmDriven();
		
		
//------------------------------------YEAR -------------------------------------------------------------------------		
		Motorc.Click_Year();
		
		
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='Sort By']"))));

		
//------------------------------------SORT BY-----------------------------------------------------------------------		
		Motorc.Click_Sort1();
		
		
		Motorc.Click_Filter1();


		Motorc.Click_Sort2();
		
		
		Motorc.Click_Filter2();


		Motorc.Click_Sort3();
		
		
		Motorc.Click_Filter3();


		Motorc.Click_Sort4();
		
		
		Motorc.Click_Filter4();

		
		
//------------------------------------CLEAR ALL---------------------------------------------------------------------
		Motorc.Click_ClearAll();
		

		
		}
	

}
