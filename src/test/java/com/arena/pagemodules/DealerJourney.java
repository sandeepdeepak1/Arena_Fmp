package com.arena.pagemodules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.arena.main.Base;
import com.arena.main.confiReader;

public class DealerJourney extends Base {
	Actions ac = new Actions(driver);
	confiReader config = new confiReader();
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	WebDriverWait wait = new WebDriverWait(driver, 10);

	public DealerJourney(WebDriver driver) {

		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@FindBy(xpath = "//*[@id='myModalAutoOpen_booktestDrive']//*[@class='close']")
	public WebElement BtdClose;

	@FindBy(xpath = "//*[@href='/more-from-us']")
	public WebElement header;
	
	@FindBy(xpath = "//*[@href='/more-from-us/finance']//*[@id='6-PrimaryNav-Finance']")
	public WebElement subheader;

	@FindBy(xpath = "//div[@class='radiobtn']//label[@class='customRadioBtn'][2]")
	public WebElement dealerJ;

	@FindBy(name = "mspin")
	public WebElement Mspin;

	@FindBy(xpath = "//div[@class='form-group']//span[@id='verify_mspin1']")
	public WebElement veri;

	@FindBy(xpath = "//input[@id='dealer_otp']")
	public WebElement dealerotp;

	@FindBy(xpath = "//a[@class='popupBtnMSPIN2']")
	public WebElement otpsubmit;

	@FindBy(xpath = "//img[@src='/dist/assets/images/dealer/new-journey-icon.png']")
	public WebElement newfinance;

	@FindBy(xpath = "//div[@class='col-sm-6 col-md-3 form-group']//input[@id='mobileNumber']")
	public WebElement newfinanmobile;

	@FindBy(xpath = "//div[4][@class='col-sm-6 col-md-3 form-group']//button[@id='dealer_filter_search']")
	public WebElement newsea;

	@FindBy(xpath = "//div[@class='popupContent blue']//div[@class='blackButton']//button[@class='submitcibil']")
	public WebElement newfpop;

	@FindBy(xpath = "//ul[@class='cd_breadcrumb']/li[2]/a")
	public WebElement newback;

	@FindBy(xpath = "//img[@src='/dist/assets/images/dealer/ongoing-finance-journey.png']")
	public WebElement ongoingfinance;

	@FindBy(xpath = "//input[@id='mobileNumber']")
	public WebElement ongmobile;

	@FindBy(xpath = "//button[@id='ongoing_filter_search']")
	public WebElement ongsearch;
	
	@FindBy(xpath = "//div[@class='popupContent blue']//div[@class='blackButton']//button[@class='submitcibil']")
	public WebElement ongpop;

	@FindBy(xpath = "//button[@id='launch_deal_ongoing']")
	public WebElement onglaunch;

	@FindBy(xpath = "//input[@tabindex='33']")
	public WebElement ongname;

	@FindBy(xpath = "//input[@tabindex='34']")
	public WebElement ongemail;

	@FindBy(xpath = "//input[@tabindex='35']")
	public WebElement ongdob;

	@FindBy(xpath = "//*[(text() = '3') and @class='day']")
	public WebElement ongdat;

	@FindBy(xpath = "//div[@class='col-sm-12']//button[@class='sub-btn mdl_dealer_submit']")
	public WebElement ongsub;

	@FindBy(xpath = "//div[@class='whiteButton BackPage']/a")
	public WebElement carb;
	
	@FindBy(xpath = "//ul[@class='cd_breadcrumb']/li[2]/a")
	public WebElement ongback;
	
	@FindBy(xpath = "//img[@src='/dist/assets/images/dealer/customer-request-icon.png']")
	public WebElement cusreq;

	@FindBy(xpath="//div[@class='popupContent blue']//div[@class='blackButton']//button[@class='submitcibil']")
	public WebElement Cusrpop;
	
	@FindBy(xpath = "//input[@id='mobileNumber']")
	public WebElement mob;

	@FindBy(xpath = "//button[@id='customer_request_search']")
	public WebElement crsearch;

	@FindBy(xpath = "//button[@class='btn btn-dealer btn-dealer-white view_form_req']")
	public WebElement crview;

	@FindBy(xpath = "//div[@class='popupContent blue']//div[@class='blackButton']//button[@class='submitcibil info_no']")
	public WebElement crpop;
	
	@FindBy(xpath = "//ul[@class='cd_breadcrumb']/li[2]/a")
	public WebElement crback;

	@FindBy(xpath = "//img[@src='/dist/assets/images/dealer/clarification-icon.png']")
	public WebElement clari;

	@FindBy(xpath = "//div[@class='popupContent blue']//div[@class='blackButton']//button[@class='submitcibil']")
	public WebElement clario;

	@FindBy(xpath = "//div[@class='container mobile-white-bg']/ul/li[2]/a")
	public WebElement clrback;

	@FindBy(xpath = "//img[@src='/dist/assets/images/dealer/track-finance-icon.png']")
	public WebElement trackfstatus;

	@FindBy(xpath = "//ul[@class='cd_breadcrumb']/li[2]/a")
	public WebElement tfsback;

	@FindBy(xpath = "//img[@title='Co-Applicant']")
	public WebElement coappli;

	@FindBy(xpath = "//div[@class='popupContent blue']//div//button[@class='submitcibil']")
	public WebElement coapplipop;

	@FindBy(xpath = "//ul[@class='cd_breadcrumb']//a[@class='back-icon']")
	public WebElement coappliback;

	@FindBy(xpath = "//div[@class='user_logout']/a")
	public WebElement Logout;
	
	@FindBy(xpath = "//button[@class='logout_yes']")
	public WebElement Confirlog;

	public void header() throws InterruptedException {
		Thread.sleep(10000);
		BtdClose.click();

		header.click();
		Thread.sleep(2000);
		subheader.click();
		Thread.sleep(5000);

	}

	public void dealerlogin() throws InterruptedException {
		jse.executeScript("scroll(0, 400)");
		Thread.sleep(3000);
		dealerJ.click();
		Thread.sleep(5000);
		Mspin.sendKeys(config.getdealermspin());
		veri.click();
		Thread.sleep(10000);
		dealerotp.sendKeys(config.getdealerotp());
		otpsubmit.click();
		Thread.sleep(8000);
		newfinance.click();
		newfinanmobile.sendKeys(config.getnewfinancemobile());
		newsea.click();
		Thread.sleep(7000);
		newfpop.click();
		Thread.sleep(15000);
		newback.click();
		Thread.sleep(8000);
		ongoingfinance.click();
		Thread.sleep(5000);
		ongmobile.sendKeys("8805737198");
		ongsearch.click();
		Thread.sleep(8000);
		ongpop.click();
		//onglaunch.click();
		Thread.sleep(9000);
		//ongname.clear();
		//ongname.sendKeys("test");
		//ongemail.sendKeys("test@yopmail.com");
		//ongdob.click();
		//Thread.sleep(5000);
	//	ongdat.click();
		//Thread.sleep(5000);
		//ongsub.click();
		//Thread.sleep(5000);
		//carb.click();
		ongback.click();
		Thread.sleep(5000);
		cusreq.click();
		Thread.sleep(5000);
		
		//mob.sendKeys("9746420370");
		//crsearch.click();
		//Thread.sleep(5000);
		Cusrpop.click();
		Thread.sleep(5000);
		//crview.click();
		//Thread.sleep(5000);
		//crpop.click();
		//Thread.sleep(5000);
		crback.click();
		Thread.sleep(5000);
		jse.executeScript("scroll(0,500)");
		//jse.executeScript("arguments[0].scrollIntoView()", clari);
		Thread.sleep(5000);
		clari.click();
		//Thread.sleep(5000);
		//clario.click();
		Thread.sleep(5000);
		clrback.click();
		Thread.sleep(5000);
		jse.executeScript("scroll(0,500)");
		Thread.sleep(5000);
		trackfstatus.click();
		Thread.sleep(5000);
		tfsback.click();
		Thread.sleep(5000);
		jse.executeScript("scroll(0,500)");
		Thread.sleep(5000);
		coappli.click();
		Thread.sleep(5000);
		//coapplipop.click();
		Thread.sleep(5000);
		coappliback.click();
		Thread.sleep(5000);
		Logout.click();
		Confirlog.click();
		
		
		

	}

}
