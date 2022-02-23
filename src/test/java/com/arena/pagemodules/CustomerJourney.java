package com.arena.pagemodules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.arena.main.Base;
import com.arena.main.confiReader;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CustomerJourney extends Base {
	Actions act = new Actions(driver);
	confiReader config = new confiReader();
	JavascriptExecutor jse = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, 30);
    

	public CustomerJourney(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	}

	@FindBy(xpath = "//*[@id='myModalAutoOpen_booktestDrive']//*[@class='close']")
	public WebElement BtdClose;

	@FindBy(xpath = "//a[@href='/maruti-suzuki-car-finance']")
	public WebElement header;

	@FindBy(css = "input.form-control.Mobile")
	public WebElement entermobile;

	@FindBy(css = "span.verify.popupBtn1")
	public WebElement verify;

	@FindBy(id = "Otp")
	public WebElement enterotp;

	@FindBy(css = "a.popupBtn2")
	public WebElement otpsubmit;

	@FindBy(xpath = "//div[@class='submitBtn']//a[@class='form-fnc-mdl-no-land']")
	public WebElement returnNo;

	@FindBy(id = "Name")
	public WebElement bfirstname;

	@FindBy(id = "Email")
	public WebElement benteremail;

	@FindBy(id = "dob_land")
	public WebElement bdob;

	@FindBy(xpath = "//*[contains(text(), 'October') and @class='datepicker-switch']")
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

	@FindBy(name = "IsDisclaimerAccepted_land")
	public WebElement bdisclaimer;

	@FindBy(className = "popupBtn3")
	public WebElement bsubmit;

	@FindBy(css = "a[data-value='150001|BY|Baleno']")
	public WebElement selectcar;
	
	
	@FindBy(xpath = "//*[@class='colorSelect variantlist']//label[@class='customCheckBox' and (text()='ZETA AUTOMATIC PETROL')]/span")
	public WebElement selectvarient;

	@FindBy(xpath = "//label[@class='customCheckBox']//div[@style='background: #11376A']")
	public WebElement selectcolor;

	
	@FindBy(xpath =  "//div[@class='pageButton']//*[@class='blackButton']//a[@class='submit_vaiant']")
	public WebElement proceeddealer;

	@FindBy(xpath = "(//a[text()='Proceed to Loan Offer'])[1]")
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

	@FindBy(xpath =  "//*[@tabindex='50']")
	public WebElement Pdis1;

	@FindBy(xpath = "//*[@tabindex='52']")
	public WebElement Pdis2;

	@FindBy(css =  ".prsnl_dtls_sbmt_slry")
	public WebElement Pcont;

	@FindBy(css = "a.skiptooffer")
	public WebElement cibil;

	@FindBy(xpath = "//*[(text()='5') and @class='tenure']")
	public WebElement loanperiod;

	@FindBy(xpath = "//*[(text()='Apply For Loan') and @data-value='1']")
	public WebElement applyloan;

	@FindBy(xpath = "//img[@src='/dist/assets/images/nexa-finance-new/cross.png']")
	public WebElement closepopup;

	@FindBy(xpath = "//input[@name='FatherName']")
	public WebElement Afather;

	@FindBy(id = "EducationQualification")
	public WebElement eq;

	@FindBy(name = "MaritalStatus")
	public WebElement marital;

	@FindBy(name = "Dependents")
	public WebElement noofdependent;

	@FindBy(xpath = "//*[(text()='Continue to Address Details') and @data-id='step2']")
	public WebElement Acontinuetoaddress;

	@FindBy(xpath =  "//input[@name='Address1']")
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

	@FindBy(xpath = "//li[@class='id-pop']/a")
	public WebElement uploadid;

	@FindBy(xpath = "//label[@class='customRadioBtn']//input[@value='420005']")
	public WebElement iddriving;

	@FindBy(xpath = "//div[@class='dropImageBoxMain IDProof']//a[@class='ingredient_file']")
	public WebElement uploaddriving;

	@FindBy(xpath = "//div[@class='whiteButton']//input[@tabindex='87']")
	public WebElement selectfiledriving;
	
	@FindBy(xpath = "//div[@class='popupContainer_merge']//a[@class='merge_doc']")
	public WebElement s_c;
	
	@FindBy(xpath = "//div[@class='linkBtn']//*[(text()='Upload Document & Proceed')]")
	public WebElement UDP;
	
	@FindBy(xpath = "//div[@class='linkBtn']//*[(text()='Submit Loan Application')]")
	public WebElement SLA;
	
	@FindBy(xpath = "//button[@class='sub-btn']")
	public WebElement loanconfirmation;

	public void header() throws InterruptedException {
		Thread.sleep(10000);
		BtdClose.click();

		header.click();
		jse.executeScript("scroll(0, 400)");
	}

	public void Userlogin() throws InterruptedException {

		entermobile.sendKeys(config.getUMobile());
		verify.click();
		Thread.sleep(10000);
		RestAssured.baseURI = "https://api.uat.marutifinancemarketplace.com/maruti/user/v1/maruti/";
// Request Object
		RequestSpecification myrequest = RestAssured.given();
// Response Object
		Response myresponose = myrequest.request(io.restassured.http.Method.GET, "9000981235");
		String responsebody = myresponose.getBody().asString();
		System.out.println("Response body is " + responsebody);
		JsonPath jpath = myresponose.jsonPath();
		String otp = jpath.get("otp");
		System.out.println("OTP is " + " " + otp);
		enterotp.sendKeys(otp);
		Thread.sleep(3000);
		otpsubmit.click();
		Thread.sleep(2000);
		//returnNo.click();

	}

	public void basicinfo() throws InterruptedException {

		bfirstname.sendKeys(config.getUname());
		benteremail.sendKeys(config.getUEmail());

		bdob.click();
		
		// driver.switchTo().frame("GTM-KZ5HNDG");
		dateheader.click();
		datehea.click();
		datehe.click();
		dateh.click();
		da.click();
		date.click();
		dat.click();
		// driver.switchTo().defaultContent();

		Select citylist = new Select(bcity);
		citylist.selectByValue("19");
		bdisclaimer.click();
		bsubmit.click();
		Thread.sleep(10000);
	}

	public void selectcar() throws InterruptedException {
		selectcar.click();
		
		

	}

	public void selectvarient() throws InterruptedException {
       
		Thread.sleep(20000);
    // Actions ac = new Actions(driver);
     //  ac.moveToElement(selectvarient).click().build().perform();
     selectvarient.click();
       Thread.sleep(10000);
       
       jse.executeScript("scroll(0,450)");
      // ac.moveToElement(selectcolor).click().build().perform();
		//selectvarient.click();
		wait.until(ExpectedConditions.elementToBeClickable(selectcolor)).click();
		Thread.sleep(2000);
		//ac.moveToElement(proceeddealer).click().build().perform();
		//selectcolor.click();*/
		wait.until(ExpectedConditions.elementToBeClickable(proceeddealer)).click();
		//proceeddealer.click();
		
		Thread.sleep(20000);
		
	}

	public void proceedloanoffer() throws Exception {
	  //driver.switchTo().alert().dismiss();
		jse.executeScript("scroll(0,200)");
		proceedloanoffer.click();
		Thread.sleep(10000);
	}

	public void Ugovernmentsalaried() throws InterruptedException {
		Thread.sleep(1000);
		Ugovernmentsalaried.click();
		Ucontinue.click();
		Thread.sleep(10000);

	}

	public void Pshowloan() throws InterruptedException {
		Thread.sleep(10000);
		 jse.executeScript("scroll(0,350)");
		 Thread.sleep(10000);
		Pshowloan.click();
		Thread.sleep(10000);

	}

	public void Personaldetails() throws InterruptedException {
		Thread.sleep(10000);
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
        jse.executeScript("scroll(0,350)");
        Pdis1.click();
        Pdis2.click();
        jse.executeScript("scroll(0,250)");
        Thread.sleep(5000);
        Pcont.click();
        Thread.sleep(15000);
        cibil.click();
        Thread.sleep(10000);
         
	}
	public void Loanoffer_Pa() throws InterruptedException {
		Thread.sleep(20000);
		loanperiod.click();
		Thread.sleep(15000);
		applyloan.click();
		Thread.sleep(20000);
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
		
		Acontinuetoaddress.click();
		Thread.sleep(10000);
		
		
	}
	public void Addressdetail_P() throws InterruptedException {
		curr1.sendKeys(config.getCurrentAddress());
		curr2.sendKeys(config.getCurrentAddress1());
		Select sta = new Select(stat);
		sta.selectByValue("120015");
		Select ci = new Select(cit);
		ci.selectByValue("133396");
		pinc.sendKeys(config.getPinCurrent());
		Thread.sleep(10000);
		Select currentresidencsin = new Select(Rsince);
		currentresidencsin.selectByIndex(3);
		jse.executeScript("scroll(0,350)");
		sameascurr.click();
		workadd.click();
		office1.sendKeys(config.getWorkAddress());
		office2.sendKeys(config.getWorkAddress1());
		Select wsta = new Select(officestat);
		wsta.selectByValue("120009");
		Select wci = new Select(officecit);
		wci.selectByValue("130098");
		pinc.sendKeys(config.getPinWork());
		documentupload.click();
		Thread.sleep(10000);
		
		
	}
	public void uploaddocument_P() throws InterruptedException {
		Thread.sleep(5000);
		uploadid.click();
		Thread.sleep(10000);
		uploaddriving.click();
		Thread.sleep(10000);
		selectfiledriving.click();
		Thread.sleep(10000);
		selectfiledriving.sendKeys(config.getUploadid());
		s_c.click();
		Thread.sleep(10000);
		UDP.click();
		Thread.sleep(10000);
		SLA.click();
		Thread.sleep(10000);
		loanconfirmation.click();
		
		
		
	}
}
