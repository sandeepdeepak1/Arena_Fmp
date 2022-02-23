package com.arena.pagemodules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.arena.main.Base;
import com.arena.main.confiReader;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Customerdealerupload extends Base {
	Actions act = new Actions(driver);
	confiReader config = new confiReader();
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	WebDriverWait wait = new WebDriverWait(driver, 30);

	public Customerdealerupload(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	}

	@FindBy(xpath = "//*[@id='myModalAutoOpen_booktestDrive']//*[@class='close']")
	public WebElement BtdClose;

	@FindBy(xpath = "//*[@href='/more-from-us']")
	public WebElement header;
	
	@FindBy(xpath = "//*[@href='/more-from-us/finance']//*[@id='6-PrimaryNav-Finance']")
	public WebElement subheader;

	@FindBy(css = "input.form-control.Mobile")
	public WebElement entermobile;

	@FindBy(css = "span.verify.popupBtn1")
	public WebElement verify;

	@FindBy(xpath = "//div[@class='form-group']//input[@id='Otp']")
	public WebElement enterotp;

	@FindBy(css = "a.popupBtn2")
	public WebElement otpsubmit;

	@FindBy(xpath = "//div[@class='submitBtn']//a[@class='form-fnc-mdl-no-land']")
	public WebElement returnNo;

	@FindBy(xpath = "//div[@class='col-lg-3 form-group']//input[@id = 'Name']")
	public WebElement bfirstname;

	@FindBy(xpath = "//div[@class='col-lg-3 form-group email']//input[@id = 'Email']")
	public WebElement benteremail;

	@FindBy(xpath = "//div[@class='col-lg-3 form-group dob']//input[@id = 'dob_land']")
	public WebElement bdob;

	@FindBy(xpath = "//*[contains(text(), 'November') and @class='datepicker-switch']")
	public WebElement dateheader;

	@FindBy(xpath = "//*[(text() = '2003') and @class='datepicker-switch']")
	public WebElement datehea;

	@FindBy(xpath = "//*[(text() = '2000-2009') and @class='datepicker-switch']")
	public WebElement datehe;

	@FindBy(xpath = "//*[(text() = '1990') and @class='decade old']")
	public WebElement dateh;

	@FindBy(xpath = "//*[(text() = '1989') and @class='year old']")
	public WebElement da;

	@FindBy(xpath = "//*[(text() = 'Jan') and @class='month']")
	public WebElement date;

	@FindBy(xpath = "//*[(text() = '3') and @class='day']")
	public WebElement dat;

	@FindBy(id = "landing_city")
	public WebElement bcity;

	@FindBy(xpath = "//p[@class='d_disclaimer']//input[@name='IsDisclaimerAccepted_land' and @value='true']")
	public WebElement bdisclaimer;

	@FindBy(className = "popupBtn3")
	public WebElement bsubmit;

	@FindBy(css = "a[data-value='150007|AN|ALTO']")
	public WebElement selectcar;

	@FindBy(xpath = "//*[@class='colorSelect variantlist']//label[@class='customCheckBox' and text()='ALTO VXI']")
	public WebElement selectvarient;

	@FindBy(xpath = "//label[@class='customCheckBox']//div[@style='background: #c3c7ca']")
	public WebElement selectcolor;

	@FindBy(xpath = "//div[@class='pageButton']//*[@class='blackButton']//*[@class='submit_vaiant']")
	public WebElement proceeddealer;
	
	@FindBy(xpath = "//div[@class='morebutton']/a")
	public WebElement viewmore;
	
	@FindBy(xpath = "//h4[@onclick='openMarker(4)' and @data-value='CHOWGULE']")
	public WebElement dealerscroll;

	@FindBy(xpath = "//div[@class='proceed_loan']/a")
	public WebElement proceedloanoffer;

	@FindBy(xpath = "//a[text()='Government salaried']")
	public WebElement Ugovernmentsalaried;

	@FindBy(css = "a.main_submit")
	public WebElement Ucontinue;

	@FindBy(css = "a.btnSave.cls-loan-offer_new")
	public WebElement Pshowloan;

	@FindBy(id = "MiddleName")
	public WebElement Personalmiddle;

	@FindBy(id = "LastName")
	public WebElement Personallast;

	@FindBy(id = "ResidenceType")
	public WebElement Personalresidence;

	@FindBy(id = "ResidentSince")
	public WebElement Personalresident;

	@FindBy(id = "Pan")
	public WebElement Ppan;

	@FindBy(id = "CurrentEMI")
	public WebElement Pcurrentemi;

	@FindBy(name = "net_income")
	public WebElement Pnetincome;

	@FindBy(name = "Salary")
	public WebElement Pgross;

	@FindBy(id = "Years")
	public WebElement Pexpy;

	@FindBy(name = "Month")
	public WebElement Pexpm;

	@FindBy(id = "Gender")
	public WebElement Pgender;

	@FindBy(xpath = "//input[@class='disclamer form-check-input IsDisclaimerAccepted_fn']")
	public WebElement Pdis1;

	@FindBy(xpath = "//input[@class='disclamer form-check-input IsDisclaimerAccepted_fn_3']")
	public WebElement Pdis2;
	
	@FindBy(xpath = "//div[@class='dave-help-container']/img[1]")
	public WebElement chat;

	@FindBy(xpath  = "//*[@class='pageButton']//*[@class='blackButton']//*[@class='prsnl_dtls_sbmt_slry']")
	public WebElement Pcont;

	@FindBy(css = "a.skiptooffer")
	public WebElement cibil;

	@FindBy(xpath = "//*[(text()='5') and @class='tenure']")
	public WebElement loanperiod;

	@FindBy(xpath = "//div[@class='bnkLoanRowBx ']//*[@class='blackButton']//a[@data-value='0']")
	public WebElement applyloan;

	@FindBy(xpath = "//*[(text()='Apply For Loan') and @data-value='1']")
	public WebElement applyloansbi;

	@FindBy(xpath = "//div[@class='modal-content']//button[@class='close']//img[@src='/dist/assets/images/nexa-finance-new/cross.png']")
	public WebElement closepopup;

	@FindBy(xpath = "//input[@name='FatherName']")
	public WebElement Afather;

	@FindBy(id = "EducationQualification")
	public WebElement eq;

	@FindBy(name = "MaritalStatus")
	public WebElement marital;

	@FindBy(name = "Dependents")
	public WebElement noofdependent;

	@FindBy(xpath = "//*[(text()='Continue to Address Details') and @class='btn1 next_step']")
	public WebElement Acontinuetoaddress;

	@FindBy(xpath = "//input[@name='Address1']")
	public WebElement curr1;

	@FindBy(name = "Address2")
	public WebElement curr2;

	@FindBy(id = "PresentState")
	public WebElement stat;

	@FindBy(id = "PresentCity")
	public WebElement cit;

	@FindBy(xpath = "//input[@id='Pincode']")
	public WebElement pinc;

	@FindBy(xpath = "//select[@id='ResidentSince']")
	public WebElement Rsince;

	@FindBy(xpath = "//div[@class='form-group cAddress']//textarea[@id='per_Add']")
	public WebElement permaadd;
	
	@FindBy(xpath = "//span[@class='cusCheckMark']")
	public WebElement sameascurr;

	@FindBy(xpath = "//div[@class='form-group office']//textarea[@id='off_Add']")
	public WebElement workadd;

	@FindBy(name = "OfficeAddress1")
	public WebElement office1;

	@FindBy(name = "OfficeAddress2")
	public WebElement office2;

	@FindBy(name = "OfficeState")
	public WebElement officestat;

	@FindBy(id = "OfficeCity")
	public WebElement officecit;

	@FindBy(id = "OfficePincode")
	public WebElement officepinc;

	@FindBy(xpath = "//div[@class='blackButton']//button[@class='btn1 next_step doc_upload']")
	public WebElement documentupload;

	@FindBy(xpath = "//*[@id=\"step3\"]/div/div[1]/div/label[2]/span")
	public WebElement dealerwillupload;

	@FindBy(xpath = "//div[@class='linkBtn']/div[2]//a[@class='btn1 SUBMIT']")
	public WebElement Submittodealer;

	@FindBy(xpath = "//div[@class='popupContent green']/div/button")
	public WebElement okpopup;

	public void heade() throws InterruptedException {
		
		Thread.sleep(10000);
		//BtdClose.click();

		header.click();
		Thread.sleep(2000);
		subheader.click();
		Thread.sleep(8000);
		//jse.executeScript("scroll(0, 400)");
	}

	public void Userlogin() throws InterruptedException {

		entermobile.sendKeys(config.getUMobile());
		Thread.sleep(10000);
		verify.click();
		Thread.sleep(10000);
		RestAssured.baseURI = "http://65.0.0.75:8089/fmp/";
// Request Object
		RequestSpecification myrequest = RestAssured.given();
// Response Object
		Response myresponose = myrequest.request(io.restassured.http.Method.GET, "7788996655");
		String responsebody = myresponose.getBody().asString();
		System.out.println("Response body is " + responsebody);
		JsonPath jpath = myresponose.jsonPath();
		String otp = jpath.get("otp");
		System.out.println("OTP is " + " " + otp);
		enterotp.sendKeys(otp);
		Thread.sleep(4000);
		otpsubmit.click();
		Thread.sleep(2000);
		returnNo.click();

	}

	public void basicinfo() throws InterruptedException {

		bfirstname.sendKeys(config.getUname());
		benteremail.sendKeys(config.getUEmail());
		Thread.sleep(4000);
		bdob.click();
		bdob.sendKeys(config.getUDob());
		Thread.sleep(2000);
		// driver.switchTo().frame("GTM-KZ5HNDG");
/*		dateheader.click();
		Thread.sleep(1000);
		datehea.click();
		Thread.sleep(1000);
		datehe.click();
		Thread.sleep(1000);
		dateh.click();
		Thread.sleep(1000);
		da.click();
		Thread.sleep(1000);
		date.click();
		Thread.sleep(1000);
		dat.click();
		Thread.sleep(1000);
		// driver.switchTo().defaultContent();*/

		Select citylist = new Select(bcity);
		citylist.selectByValue("19");
		jse.executeScript("scroll(0,450)");
		Thread.sleep(4000);
		bdisclaimer.click();
		Thread.sleep(2000);
		bsubmit.click();
		Thread.sleep(10000);
	}

	public void selectcar() throws InterruptedException {
		jse.executeScript("scroll(0,450)");
		Thread.sleep(7000);
		selectcar.click();

	}

	public void selectvarient() throws InterruptedException {

		Thread.sleep(20000);
		// Actions ac = new Actions(driver);
		// ac.moveToElement(selectvarient).click().build().perform();
		selectvarient.click();
		Thread.sleep(10000);

		jse.executeScript("scroll(0,650)");
		Thread.sleep(2000);
		// ac.moveToElement(selectcolor).click().build().perform();
		// selectvarient.click();
		wait.until(ExpectedConditions.elementToBeClickable(selectcolor)).click();
		Thread.sleep(8000);
		// ac.moveToElement(proceeddealer).click().build().perform();
		// selectcolor.click();*/
		//jse.executeScript("scroll(0,950)");
		wait.until(ExpectedConditions.elementToBeClickable(proceeddealer)).click();
		// proceeddealer.click();

		Thread.sleep(20000);

	}

	public void proceedloanoffer() throws Exception {
		// driver.switchTo().alert().dismiss();
		//jse.executeScript("scroll(0,400)");
		Thread.sleep(5000);
		//viewmore.click();
		//Thread.sleep(8000);
		//jse.executeScript("arguments[0]. scrollIntoView(true);", dealerscroll);
		
		Thread.sleep(7000);
		proceedloanoffer.click();
		Thread.sleep(10000);
	}

	public void Ugovernmentsalaried() throws InterruptedException {
		Thread.sleep(10000);
		Ugovernmentsalaried.click();
		Thread.sleep(3000);
		jse.executeScript("scroll(0,250)");
		Thread.sleep(3000);
		Ucontinue.click();
		Thread.sleep(10000);

	}

	public void Pshowloan() throws InterruptedException {
		Thread.sleep(10000);
		jse.executeScript("scroll(0,550)");
		Thread.sleep(35000);
		Pshowloan.click();
		Thread.sleep(10000);

	}

	public void Personaldetails() throws InterruptedException {
		Thread.sleep(15000);
		Personalmiddle.sendKeys(config.getUmiddle());
		Personallast.sendKeys(config.getUlast());
		Select resi = new Select(Personalresidence);
		resi.selectByIndex(1);
		Select reside = new Select(Personalresident);
		reside.selectByIndex(3);
		Ppan.sendKeys(config.getpan());
		Pcurrentemi.sendKeys(config.getUcurrentemi());
		Pnetincome.sendKeys(config.getUnetincome());
		Pgross.sendKeys(config.getUgrossincome());
		Select exper_y = new Select(Pexpy);
		exper_y.selectByIndex(8);
		Select exper_m = new Select(Pexpm);
		exper_m.selectByIndex(9);
		Select gender = new Select(Pgender);
		gender.selectByIndex(1);
		jse.executeScript("scroll(0,550)");
		Thread.sleep(3000);
		Pdis1.click();
		Thread.sleep(2000);
		Pdis2.click();
		Thread.sleep(2000);
		//chat.click();
		//driver.navigate().refresh();
		//Thread.sleep(7000);
		jse.executeScript("scroll(0,800)");
		
		Thread.sleep(9000);
		jse.executeScript("arguments[0].click();", Pcont);
		//zjse.executeScript("arguments[1].click();",Pcont);
		
	     // Pcont.click();
		Thread.sleep(15000);
		cibil.click();
		Thread.sleep(10000);

	}

	public void Loanoffer_Pa() throws InterruptedException {
		Thread.sleep(40000);
		jse.executeScript("scroll(0,250)");
		Thread.sleep(25000);
		//loanperiod.click();
		Thread.sleep(35000);

		applyloan.click();

		//applyloan.click();
		Thread.sleep(10000);
		closepopup.click();
		Thread.sleep(10000);
	}

	public void Application_P() throws InterruptedException {
		Thread.sleep(10000);
		Afather.sendKeys(config.getUfather());
		Select educat = new Select(eq);
		educat.selectByIndex(3);
		jse.executeScript("scroll(0,250)");
		Select mat = new Select(marital);
		mat.selectByIndex(3);
		Thread.sleep(3000);
		jse.executeScript("scroll(0,250)");
		Thread.sleep(10000);
		noofdependent.sendKeys(config.getUNoofdependent());
		Thread.sleep(7000);
		jse.executeScript("scroll(0,400)");
		Thread.sleep(3000);
		//Acontinuetoaddress.click();
	//	Thread.sleep(10000);

	}

	public void Addressdetail_P() throws InterruptedException {
		// jse.executeScript("scroll(0,500)");
		curr1.sendKeys(config.getCurrentAddress());
		Thread.sleep(3000);
		curr2.sendKeys(config.getCurrentAddress1());
		Thread.sleep(3000);
		Select sta = new Select(stat);
		sta.selectByVisibleText("HARYANA");
		Thread.sleep(3000);
		Select ci = new Select(cit);
		ci.selectByVisibleText("GURUGRAM");
		Thread.sleep(3000);
		pinc.sendKeys(config.getPinCurrent());
		Thread.sleep(10000);
		Select currentresidencsin = new Select(Rsince);
		currentresidencsin.selectByIndex(3);
		jse.executeScript("scroll(0,350)");
		Thread.sleep(2000);
		permaadd.click();
		Thread.sleep(2000);
		sameascurr.click();
		Thread.sleep(5000);
		workadd.click();
		office1.sendKeys(config.getWorkAddress());
		office2.sendKeys(config.getWorkAddress1());
		Select wsta = new Select(officestat);
		wsta.selectByVisibleText("RAJASTHAN");
		Select wci = new Select(officecit);
		wci.selectByVisibleText("JAIPUR");
		pinc.sendKeys(config.getPinWork());
		documentupload.click();
		Thread.sleep(10000);

	}

	public void uploaddocument_P() throws InterruptedException {
		Thread.sleep(5000);
		dealerwillupload.click();
		Thread.sleep(10000);
		Submittodealer.click();
		Thread.sleep(10000);
		okpopup.click();

	}
}
