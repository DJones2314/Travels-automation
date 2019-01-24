package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {

	@FindBy(xpath = "//*[@id=\"s2id_autogen8\"]/a")
	private WebElement searchCity;
	
	@FindBy(xpath = "//*[@id=\"dpd1\"]/div/input")
	private WebElement checkIn;
	
	@FindBy(xpath = "/html/body/div[9]/div[1]/table/tbody/tr[4]/td[4]")
	private WebElement today;
	
	@FindBy(xpath = "/html/body/div[10]/div[1]/table/tbody/tr[4]/td[5]")
	private WebElement endDay;
	
	
	
	public void searchCity(String destination, WebDriver driver){
		
			
		checkIn.click();

		WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(today));

		today.click();
		
		WebElement newDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(endDay));

		endDay.click();
		
		searchCity.click();
		searchCity.sendKeys(destination);
		searchCity.sendKeys(Keys.ENTER); 
		searchCity.submit();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
