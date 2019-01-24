package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Monks {

	@FindBy(xpath = "//*[@id=\"body-section\"]/div[4]/div[2]/div/div[2]/form/div[1]/div/input")
	private WebElement checkIn;
	
	@FindBy(xpath = "/html/body/div[10]/div[1]/table/tbody/tr[4]/td[4]")
	private WebElement today;
	
	@FindBy(xpath = "//*[@id=\"body-section\"]/div[4]/div[2]/div/div[2]/form/div[2]/div/input")
	private WebElement checkout;
	
	@FindBy(xpath = "/html/body/div[12]/div[1]/table/tbody/tr[4]/td[6]")
	private WebElement tomorrow;
	
//	@FindBy(xpath = "")
//	private WebElement 
	
	public void monksStuff(WebDriver driver){

		checkIn.click();
		WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(today));
		today.click();
		checkout.click();
		WebElement myDynamicElement1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(tomorrow));
		tomorrow.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	
}
	

