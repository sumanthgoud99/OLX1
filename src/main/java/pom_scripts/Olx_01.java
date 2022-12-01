package pom_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Olx_01 extends BasePage {

	public Olx_01(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//span[text()='Motorcycles']")
	WebElement Motorcycle;
	public void Click_Motorcycle() {
		clickAction(Motorcycle);
	}
	
	@FindBy(xpath="//a[@data-aut-id='subcategory_1413']")
	WebElement Scooters;
	public void Click_Scooters() {
		clickAction(Scooters);
	}
	
	
	@FindBy(xpath="(//span[text()='Spare Parts'])[3]")
	WebElement SpareParts;
	public void Click_SpareParts() {
		clickAction(SpareParts);
	}
	@FindBy(xpath="(//span[text()='Bicycles'])[2]")
	WebElement BiCycles;
	public void Click_BiCycles() {
		clickAction(BiCycles);
	}
	@FindBy(xpath="//a[@data-aut-id='subcategory_81']")
	WebElement MotorCycles;
	public void Click_MotorCycles() {
		clickAction(MotorCycles);
	}
	@FindBy(xpath=("//a[@data-aut-id='location_Uttar Pradesh']"))
	WebElement UttarPradesh;
	public void Click_UttarPradesh() {
		clickAction(UttarPradesh);
	}
	@FindBy(xpath="//a[@data-aut-id='location_Lucknow']")
	WebElement Lucknow;
	public void Click_Lucknow() {
		clickAction(Lucknow);
	}
	@FindBy(xpath="//a[@data-aut-id='location_Gomti Nagar']")
	WebElement GomtiNagar;
	public void Click_GomtiNagar() {
		clickAction(GomtiNagar);
	}
	
//	@FindBy(xpath="//div[@class='rc-slider-rail']")
//	WebElement DropDown;
//	public void Click_DropDown() {
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,600);");
//		
//		//WebElement slider1=driver.findElement(By.xpath("//div[@class='rc-slider-rail']"));
//		Actions act=new Actions(driver);
//		act.dragAndDropBy(DropDown, 60, 0).perform();
//		
//	}
	
	public void waitStmnt() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	

	
	@FindBy(xpath="//label[@title='Royal Enfield']")
	WebElement RoyalEnfield;
	public void Click_RoyalEnfield() {
		clickAction(RoyalEnfield);
	}
	@FindBy(xpath="//label[@title='Yamaha']")
	WebElement Yamaha;
	public void Click_Yamaha() {
		clickAction(Yamaha);
	}
	@FindBy(xpath="//label[@title='Royal Enfield Classic']")
	WebElement RoyalEnfieldClassic;
	public void Click_RoyalEnfieldClassic() {
		clickAction(RoyalEnfieldClassic);
	}
	@FindBy(xpath="//label[@title='Yamaha FZ']")
	WebElement YamahaFZ;
	public void Click_YamahaFZ() {
		clickAction(YamahaFZ);
	}
	@FindBy(xpath="(//div[@class='V15Xo'])[3]")
	WebElement KmDriven;
	public void Click_KmDriven() {
		clickAction(KmDriven);
	}
	@FindBy(xpath="(//div[@class='V15Xo'])[7]")
	WebElement Year;
	public void Click_Year() {
		clickAction(Year);
	}
	@FindBy(xpath="//span[text()='Sort By']")
	WebElement Sort1;
	public void Click_Sort1() {
		clickAction(Sort1);
	}
	@FindBy(xpath="//span[text()='Date Published']")
	WebElement Filter1;
	public void Click_Filter1() {
		clickAction(Filter1);
	}
	@FindBy(xpath="//span[text()='Sort By']")
	WebElement Sort2;
	public void Click_Sort2() {
		clickAction(Sort2);
	}
	@FindBy(xpath="(//div[@class='_2-IT4'])[3]")
	WebElement Filter2;
	public void Click_Filter2() {
		clickAction(Filter2);
	}
	@FindBy(xpath="//span[text()='Sort By']")
	WebElement Sort3;
	public void Click_Sort3() {
		clickAction(Sort3);
	}
	@FindBy(xpath="(//div[@class='_2-IT4'])[4]")
	WebElement Filter3;
	public void Click_Filter3() {
		clickAction(Filter3);
	}
	@FindBy(xpath="//span[text()='Sort By']")
	WebElement Sort4;
	public void Click_Sort4() {
		clickAction(Sort4);
	}
	@FindBy(xpath="//span[text()='Distance']")
	WebElement Filter4;
	public void Click_Filter4() {
		clickAction(Filter4);
	}
	@FindBy(xpath="(//span[text()='Clear All'])[2]")
	WebElement ClearAll;
	public void Click_ClearAll() {
		clickAction(ClearAll);
	}
	
	
	
	
	
	
	
	
	 
	

}
