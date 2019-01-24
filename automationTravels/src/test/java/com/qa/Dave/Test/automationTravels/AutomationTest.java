package com.qa.Dave.Test.automationTravels;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pages.Home;
import pages.Hotels;
import pages.Monks;

public class AutomationTest {

WebDriver driver;
	
static ExtentReports report;
static ExtentTest test;
static ExtentTest test1;

	@BeforeClass
	public static void preReport() {
	report = new ExtentReports("C:\\Users\\Admin\\Documents\\extentReports\\extent.html", true);
	}
	@Before
	public void setup() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver.exe");
	driver = new ChromeDriver();
	test = report.startTest("londonSearch");
	//test1 = report.startTest("newLondon");
	driver.manage().window().maximize();
	} 
	
	@Test
	public void testLondonSearch() {
		driver.get("https://www.phptravels.net/");
		Home page = PageFactory.initElements(driver, Home.class);
		page.searchCity("london", driver);
		test.log(LogStatus.INFO, "searching for london");
		Hotels page1 = PageFactory.initElements(driver, Hotels.class);
		page1.chooseHotel(driver);
		Monks page2 = PageFactory.initElements(driver, Monks.class);
		page2.monksStuff(driver);
		report.endTest(test);
		
	}
	
//	@Test
//	public void testLondonSearch2() {
//		driver.get("https://www.phptravels.net/");
//		Home page = PageFactory.initElements(driver, Home.class);
//		page.searchCity("london", driver);
//		test1.log(LogStatus.INFO, "searching for new london");
////		Hotels page1 = PageFactory.initElements(driver, Hotels.class);
////		page1.chooseHotel(driver);
////		Monks page2 = PageFactory.initElements(driver, Monks.class);
////		page2.monksStuff(driver);
//		
//	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	@AfterClass
	public static void tearReport() {
		report.endTest(test);
		report.endTest(test1);
		report.flush();
	}
}
