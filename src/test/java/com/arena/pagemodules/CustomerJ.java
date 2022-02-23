package com.arena.pagemodules;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.arena.main.Base;
import com.arena.main.confiReader;
public class CustomerJ extends Base {
	

		confiReader config = new confiReader();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Actions act = new Actions(driver);
		
		public CustomerJ(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}	
		
		@FindBy(xpath="//*[@id='myModalAutoOpen_booktestDrive']//h3[contains(text(),'Book A Test Drive')]")
		public WebElement btdText;
		
		@FindBy(xpath="//*[@class='modal bookTestformPopup show']//*[@class='close']")
		public WebElement btdpopupclose;
		
		@FindBy(xpath = "//*[@class='topheader2']//*[@class='rightmenubox']//ul//li/a")
		public List <WebElement> headMenu;
		
		@FindBy(xpath = "//*[@id='verifyPopup1']//*[@class='radiobtn']//label//span")
		public List <WebElement> custType;
		
		@FindBy(xpath = "//*[@class='leftRightMain cust_box']//*[@class='form-group']//*[@name='Mobile']")
		public WebElement mob;
		
		@FindBy(xpath = "//*[@class='leftRightMain cust_box']//*[@class='form-group']//span")
		public WebElement verify;
		
		@FindBy(xpath = "//*[contains(text(),'otp')]")
		public WebElement getOtp;
		
		@FindBy(xpath = "//*[@id='verifyPopup2']//*[@class='form-group']//*[@id='Otp']")
		public WebElement otp;
		
		@FindBy(xpath = "//*[@id='verifyPopup2']//*[@class='submitBtn']/a")
		public WebElement sbmt;
		
		@FindBy(xpath = "//*[@class='verifyWrap verifyWrapper']//*[@id='Name']")
		public WebElement uName;
		
		@FindBy(xpath = "//*[@class='verifyWrap verifyWrapper']//*[@id='Email']")
		public WebElement uEmail;
		
		@FindBy(xpath = "//*[@id='verifyPopup4']//*[@class='submitBtn']//*[contains (text(),'No')] ")
		public WebElement popUpSubmt;
		
		@FindBy(xpath = "//*[@class='verifyWrap verifyWrapper']//*[@id='dob_land']")
		public WebElement DOB;
		
		@FindBy(xpath = "//*[@class='datepicker-days']//*[@class='datepicker-switch']")
		public WebElement daySwitch;
		
		@FindBy(xpath = "//*[@class='datepicker-months']//*[@class='datepicker-switch']")
		public WebElement yearSwitch;
		
		@FindBy(xpath = " //*[@class='datepicker-years']//th[@class='prev']")
		public WebElement prev;
		
		@FindBy(xpath = "//*[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-top']//*[@class='datepicker-years']//tr[1]//td/span")
		public List<WebElement> dobYear;
		
		@FindBy(xpath = "//*[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-top']//*[@class='datepicker-months']//tr[1]//td/span")
		public List<WebElement> dobMonth;
		
		@FindBy(xpath = "//*[@class='datepicker-days']//*[@class='table-condensed']//tbody//tr//td")
		public List<WebElement> Date;
		
		@FindBy(xpath = "//*[@class='verifyWrap verifyWrapper']//*[@id='landing_city']")
		public WebElement uCity;
		
		@FindBy(xpath = "//*[@class='d_disclaimer']//*[@class='disclamer form-check-input']")
		public WebElement policy;
		
		@FindBy(xpath = "//*[@id='verifyPopup3']//*[@class='col-lg-3 submitBtn']/a")
		public WebElement submt;
		
		@FindBy(xpath = "//*[@class='chooseCarSection']//*[@class='container']//ul//li//*[@class='blackButton']/a")
		public List<WebElement> selectCar;
		
		@FindBy(xpath = "//*[@class='selectvariant']//ul//li//label/span")
		public List<WebElement> carVariant;
		
		@FindBy(xpath = "//*[@class='selectColor']//ul//li/label")
		public List<WebElement> carColour;
		
		@FindBy(xpath = "//*[@class='pageButton']//*[@class='submit_vaiant']")
		public WebElement proceed;
		
		@FindBy(xpath = "//*[@class='inrlocatormapbox']//*[@class='locationdetail scroll scroll1 ']//ul//li[2]//div/a")
		public List<WebElement> dealerList;
		
		@FindBy(xpath = "//*[@class='continueBtn']//*[@class='main_submit']")
		public WebElement cntinue;
		
		@FindBy(xpath = "//*[@class='prsButtMain']//*[@class='btnSave cls-loan-offer_new']")
		public WebElement showLoanOffers;
		
		@FindBy(xpath = "//*[@class='itrRadioBtnSec']//*[@class='customRadioBtn'][contains(text(),'No')]")
		public WebElement ITR;
		
		@FindBy(xpath = "//*[@class='personalDetails']//*[@id='SubEmployee_no']/option[5]")
		public WebElement subEmpl;
		
		@FindBy(xpath = "//*[@class='personalDetails']//*[@id='Name']")
		public WebElement uNamee;
		
		@FindBy(xpath = "//*[@class='personalDetails']//*[@id='MiddleName']")
		public WebElement midName;
		
		@FindBy(xpath = "//*[@class='personalDetails']//*[@id='LastName']")
		public WebElement lastName;
		
		@FindBy(xpath = "//*[@class='personalDetails']//*[@id='Email']")
		public WebElement Email;
		
		@FindBy(xpath = "//*[@class='personalDetails']//*[@id='Mobile']")
		public WebElement phn;
		
		@FindBy(xpath = "//*[@class='personalDetails']//*[@id='ResidenceType']")
		public WebElement resType;
		
		@FindBy(xpath = "//*[@class='personalDetails']//*[@id='ResidentSince']")
		public WebElement resSince;
		
		@FindBy(xpath = "//*[@class='personalDetails']//*[@id='Pan']")
		public WebElement pan;
		
		@FindBy(xpath = "//*[@class='personalDetails']//*[@id='CurrentEMI']")
		public WebElement currentEMI;
		
		@FindBy(xpath = "//*[@class='personalDetails']//*[@id='AvgMonthyIncome']")
		public WebElement avgIncome;
		
		@FindBy(xpath = "//*[@class='personalDetails']//*[@id='Gender']")
		public WebElement gender;
		
		@FindBy(xpath = "//*[contains (text(),'Professional Work Experience*')]")
		public WebElement expText;

		@FindBy(xpath = "//*[@class='wrkExpSelectMain']//*[@id='ProfessionalYear']/option[5]")
		public WebElement yearExp;
		
		@FindBy(xpath = "//*[@class='wrkExpSelectMain']//*[@id='ProfessionalMonth']/option[5]")
		public WebElement monthExp;
		
		@FindBy(xpath = "//*[@class='wrkExpSelectMain']//*[@id='TenureBussinessYear']/option[5]")
		public WebElement bussinessYear;
		
		@FindBy(xpath = "//*[@class='wrkExpSelectMain']//*[@id='TenureBussinessMonth']/option[5]")
		public WebElement bussinessMonth;
		
		@FindBy(xpath = "//*[@class='personalDetails']//*[@class='psDiscTxt']//ul//li/*[@id='disclaimer']")
		public List<WebElement> disclaimer;
		
		@FindBy(xpath = "//*[@class='formfieldRow wpexp ']//*[@class='pageButton']//a")
		public List<WebElement> continuee;
		
		@FindBy(xpath = "//*[@class='cibilButtMain']//*[contains (text(),'Skip to Offer')]")
		public List<WebElement> skipToOffers;
		
		@FindBy(xpath = "//*[@class='bankloadofferList tableListSec scroll scroll1']//li//div//p/a[@class='apply_loan']")
		public List<WebElement> bankList;
		
		@FindBy(xpath = "//*[@id='initial-pop']//img")
		public WebElement close;
		
		@FindBy(xpath = "//*[@class='left common1']//*[@class='form-group']//*[@id='EducationQualification']//option[4]")
		public WebElement eduQualif;
		
		@FindBy(xpath = "//*[@class='left common1']//*[@class='form-group']//*[@id='MaritalStatus']//option[4]")
		public WebElement maritalStatus;
		
		@FindBy(xpath = "//*[@class='left common1']//*[@class='form-group']//*[@id='Dependents']")
		public WebElement dependents;
		
		@FindBy(xpath = "//*[@class='left common1']//*[@class='form-group']//*[@id='previous_year_profit']")
		public WebElement prevProfit;
		
		@FindBy(xpath = "//*[@class='left common1']//*[@class='form-group latest_year_profit_after_tax']//*[@id='latest_year_profit_after_tax']")
		public WebElement latestProfit;
		
		@FindBy(xpath = "//*[@class='left common1']//*[@class='form-group latest_year_depreciation']//*[@id='latest_year_depreciation']")
		public WebElement yearDepreciation;
		
		@FindBy(xpath = "//*[@class='left common1']//*[@class='form-group']//*[@id='business_name']")
		public WebElement bussinessName;
		
		@FindBy(xpath = "//*[@class='left common1']//*[@class='form-group']//*[@id='ReferenceFirstName']")
		public WebElement refFirstName;
		
		@FindBy(xpath = "//*[@class='left common1']//*[@class='form-group']//*[@id='ReferenceLastName']")
		public WebElement refLastName;
		
		@FindBy(xpath = "//*[@class='left common1']//*[@class='form-group']//*[@id='ReferenceMobile']")
		public WebElement refPhn;
		
		@FindBy(xpath = "//*[@class='employerBtn']//div/button[contains (text(),'Continue to Address Details')]")
		public WebElement contnueToAddDetails;
		
		@FindBy(xpath = "//*[@class='formWrap']//*[@class='left']//span")
		public WebElement currentAddCheckBox;
		
		@FindBy(xpath = "//*[@class='formWrap']//*[@class='left']//*[@placeholder='Work Address*']")
		public WebElement workAdd;
		
		@FindBy(xpath = "//*[@class='formWrap']//*[@class='right']//*[@id='Address1']")
		public WebElement add1;
		
		@FindBy(xpath = "//*[@class='formWrap']//*[@class='right']//*[@id='Address2']")
		public WebElement add2;

		@FindBy(xpath = "//*[@class='formWrap']//*[@class='right']//*[@id='LandMark']")
		public WebElement landMark;
		
		@FindBy(xpath = "//*[@class='formWrap']//*[@class='right']//*[@id='PresentState']")
		public WebElement presentState;
		
		@FindBy(xpath = "//*[@class='formWrap']//*[@class='right']//*[@id='PresentCity']")
		public WebElement presentCity;
		
		@FindBy(xpath = "//*[@class='formWrap']//*[@class='right']//*[@id='Pincode']")
		public WebElement pincode;
		
		@FindBy(xpath = "//*[@class='formWrap']//*[@class='right']//*[@id='ResidentSince']")
		public WebElement residenceSince;
		
		@FindBy(xpath = "//*[@class='formWrap']//*[@class='right']//*[@id='OfficeAddress1']")
		public WebElement Officeadd1;
		
		@FindBy(xpath = "//*[@class='formWrap']//*[@class='right']//*[@id='OfficeAddress2']")
		public WebElement Officeadd2;

		@FindBy(xpath = "//*[@class='formWrap']//*[@class='right']//*[@id='OfficeLandMark']")
		public WebElement OfficelandMark;
		
		@FindBy(xpath = "//*[@class='formWrap']//*[@class='right']//*[@id='OfficeState']")
		public WebElement officeState;
		
		@FindBy(xpath = "//*[@class='formWrap']//*[@class='right']//*[@id='OfficeCity']")
		public WebElement officeCity;
		
		@FindBy(xpath = "//*[@class='formWrap']//*[@class='right']//*[@id='OfficePincode']")
		public WebElement officePincode;
		
		@FindBy(xpath = "//*[@class='employerBtn']//*[contains (text(),'Continue to Document Upload')]")
		public WebElement contnueToDocUpload;
		
		@FindBy(xpath = "//*[@class='employerBtn askdocUpload']//*[contains (text(),'Let Dealer Upload my Documents')]/span")
		public WebElement DocUploadByDealer;
		
		@FindBy(xpath = "//*[@class='employerBtn']//*[@class='btn1 SUBMIT']")
		public WebElement DealerSbmt;
		
		@FindBy(xpath = "//*[@class='popupContent green']//*[@class='submitcibil']")
		public WebElement cibilOK;
		
		
		public void btdPopupClose() throws Exception
		{   
			Thread.sleep(10000);
			if(btdText.isDisplayed()) {
				btdpopupclose.click();
			}
			
			else{
				System.out.println("BTD Popup not Displayed");
			}
		}
		
		public void popup() throws Exception {
			
				Thread.sleep(4000);
				if(popUpSubmt.isDisplayed()) {
					popUpSubmt.click();
					Thread.sleep(3000);
				}
				else{
					System.out.println("Popup not Displayed");
				}
			} 
		
		public void Finance() throws Exception {
		
			try
			{
				btdPopupClose();
				for(int i=0;i<=8;) {
					headMenu.get(7).click();
					break;
				}
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}	
		
		public void UserLogin() throws Exception {
			
			jse.executeScript("scroll(0, 400)");
			Thread.sleep(2000);
			for(int i=0;i<1;) {
				custType.get(0).click();
				break;
			}
			Thread.sleep(2000);
			act.moveToElement(mob).click().sendKeys(config.getUMobile()).build().perform();
			Thread.sleep(2000);
			act.moveToElement(verify).click().build().perform();
		    String api=	"window.open('https://api.uat.marutifinancemarketplace.com/maruti/user/v1/maruti/7788992200','');";
		    Thread.sleep(4000);
			jse.executeScript(api);
			Thread.sleep(3000);
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			Thread.sleep(3000);
		    driver.switchTo().window(newTb.get(1));
		    String otpString=getOtp.getText();
			System.out.println(otpString);
			String OTP=otpString.replaceAll("[^0-9]", "");
			System.out.println(OTP);
			Thread.sleep(7000);
			driver.switchTo().window(newTb.get(0));
			Thread.sleep(2000);
			act.moveToElement(otp).click().sendKeys(OTP).build().perform();
			Thread.sleep(2000);
			act.moveToElement(sbmt).click().build().perform();
			Thread.sleep(5000);
			popup();
			Thread.sleep(5000);
		}
		
		public void Name() throws Exception	{
			act.moveToElement(uName).click().sendKeys(config.getUname()).build().perform();
			Thread.sleep(4000);
		}
		
		public void Email() throws Exception	{
			Thread.sleep(3000);
			act.moveToElement(uEmail).click().sendKeys(config.getUEmail()).build().perform();
		}

		public void DateOfBirth() throws InterruptedException	{

			try {
				act.moveToElement(DOB).click().build().perform();
				Thread.sleep(2000);
				act.moveToElement(daySwitch).click().build().perform();
				Thread.sleep(2000);
				act.moveToElement(yearSwitch).click().build().perform();
				Thread.sleep(2000);
				act.moveToElement(prev).click().build().perform();
				Thread.sleep(2000);
				for(WebElement we:dobYear)
				{	
					if(we.getText().equals(config.getYear()))
					{		
						we.click();
						break;
					}
					
				}
				for(WebElement we:dobMonth)
				{	
					if(we.getText().equals(config.getMonth()))
					{					
						we.click();
						break;
					}
				}
				
				for(WebElement we:Date)
					{	
					if(we.getText().equals(config.getDate()))
					{					
						we.click();
						break;
						}
					}	
							
			} catch (Exception e) {
				e.printStackTrace();
			}
	    }
		
		public void City() throws Exception	{
			uCity.click();
			Thread.sleep(2000);
			act.moveToElement(uCity).click().sendKeys(config.getcity()).sendKeys(Keys.ENTER).build().perform();
		}
		
		public void Policy() throws Exception{
			Thread.sleep(2000);
			act.moveToElement(policy).click().build().perform();
		}
		
		public void sbmt() throws Exception{
			Thread.sleep(2000);
			act.moveToElement(submt).click().build().perform();
		}
		
		public void SelectCar() throws Exception {
			for(int i=0;i<=4;) {
				Thread.sleep(4000);
				act.moveToElement(selectCar.get(0)).click().build().perform();	
				Thread.sleep(10000);
				break;
			}
			    Thread.sleep(5000);
			for(int j=0;j<=7;) {
				Thread.sleep(6000);
			    act.moveToElement(carVariant.get(1)).click().build().perform();	
				Thread.sleep(4000);
				break;
			}
			    Thread.sleep(3000);
			    jse.executeScript("scroll(0, 400)");
			for(int k=0;k<=4;) {
				Thread.sleep(6000);
				act.moveToElement(carColour.get(1)).click().build().perform();	
				break;
			}
			    Thread.sleep(5000);
			    act.moveToElement(proceed).click().build().perform();	
		}
		
		public void SelectDealer() throws Exception{
			for(int i=0;i<=dealerList.size();) {
				Thread.sleep(7000);
				act.moveToElement(dealerList.get(0)).click().build().perform();
				Thread.sleep(10000);
				break;
			}
			    jse.executeScript("scroll(0, 200)");
			    Thread.sleep(6000);
			    act.moveToElement(cntinue).click().build().perform();
			    Thread.sleep(3000);
		}
		
		public void PriceSummary() throws Exception{
			    Thread.sleep(20000);
			    jse.executeScript("scroll(0, 400)");
			    Thread.sleep(3000);
			    act.moveToElement(showLoanOffers).click().build().perform();
			    Thread.sleep(25000);
		}
		
		public void PersonalDeatils1() throws Exception{
			    Thread.sleep(3000);
			    jse.executeScript("scroll(0, 300)");
			    Thread.sleep(6000);
			    ITR.click();
				Thread.sleep(4000);
			    subEmpl.click();
			    Thread.sleep(4000);
			    act.moveToElement(uNamee).click().keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).build().perform();
			    Thread.sleep(4000);
				act.moveToElement(uNamee).click().sendKeys(config.getUname()).build().perform();
				Thread.sleep(4000);
				act.moveToElement(midName).click().sendKeys(config.getUname()).build().perform();
				Thread.sleep(4000);
				act.moveToElement(lastName).click().sendKeys(config.getUname()).build().perform();
				Thread.sleep(4000);
				act.moveToElement(Email).click().keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).build().perform();
			    Thread.sleep(4000);
				act.moveToElement(Email).click().sendKeys(config.getUEmail()).build().perform();
				Thread.sleep(4000);
				resType.click();
				Thread.sleep(3000);
			    act.moveToElement(resType).sendKeys(Keys.ARROW_DOWN).click().build().perform();
			    Thread.sleep(4000);
				resSince.click();
				Thread.sleep(3000);
			    act.moveToElement(resSince).sendKeys(Keys.ARROW_DOWN).click().build().perform();
			    Thread.sleep(4000);
				act.moveToElement(pan).click().sendKeys(config.getpan()).build().perform();
				Thread.sleep(4000);
				act.moveToElement(currentEMI).click().sendKeys("10000").build().perform();
				Thread.sleep(4000);
				act.moveToElement(avgIncome).click().sendKeys("50000").build().perform();
				Thread.sleep(4000);
				gender.click();
				Thread.sleep(3000);
			    act.moveToElement(gender).sendKeys(Keys.ARROW_DOWN).click().build().perform();
	        if(expText.isDisplayed()) {
	        	Thread.sleep(3000);
				yearExp.click();
				Thread.sleep(3000);
				monthExp.click();
				}		 
	        else {
	        	Thread.sleep(2000);
	        	bussinessYear.click();
	        	Thread.sleep(3000);
	        	bussinessMonth.click();
	        }
			for(int i=0;i<=1;) {
				Thread.sleep(3000);
				act.moveToElement(disclaimer.get(0)).click().build().perform();
				Thread.sleep(3000);
				act.moveToElement(disclaimer.get(1)).click().build().perform();
				Thread.sleep(3000);
				break;
				}		    
			for(int i=0;i<=4;) {
				act.moveToElement(continuee.get(4)).click().build().perform();
				Thread.sleep(2000);
				break;
				}	    
			for(int j=0;j<=2;) {
				Thread.sleep(20000);
				act.moveToElement(skipToOffers.get(2)).click().build().perform();
				Thread.sleep(20000);
				break;
				}	
			
	   }
	   
		public void BankLoanOffers() throws Exception {
			jse.executeScript("scroll(0, 350)");
			Thread.sleep(6000);
			for(int j=0;j<=bankList.size();) {
				Thread.sleep(5000);
				act.moveToElement(bankList.get(0)).click().build().perform();
				break;
				}	
			    Thread.sleep(10000);
			    act.moveToElement(close).click().build().perform();
			    Thread.sleep(3000);
			    eduQualif.click();
			    Thread.sleep(3000);
			    maritalStatus.click();
			    Thread.sleep(5000);
			    act.moveToElement(dependents).click().sendKeys("3").build().perform();
			    Thread.sleep(5000);
			    act.moveToElement(prevProfit).click().sendKeys("10000000").build().perform();
			    Thread.sleep(3000);
			    act.moveToElement(latestProfit).click().sendKeys("10000000").build().perform();
			    Thread.sleep(3000);
			    act.moveToElement(yearDepreciation).click().sendKeys("50000").build().perform();
			    Thread.sleep(3000);
			    act.moveToElement(bussinessName).click().sendKeys(config.getUname()).build().perform();
			    Thread.sleep(3000);
			    act.moveToElement(refFirstName).click().sendKeys(config.getUname()).build().perform();
			    Thread.sleep(3000);
			    act.moveToElement(refLastName).click().sendKeys(config.getUname()).build().perform();
			    Thread.sleep(3000);
			    act.moveToElement(refPhn).click().sendKeys(config.getUMobile()).build().perform();
			    Thread.sleep(3000);
			    act.moveToElement(contnueToAddDetails).click().build().perform();
			    Thread.sleep(3000);
			    act.moveToElement(currentAddCheckBox).click().build().perform();
			    Thread.sleep(5000);
			    act.moveToElement(add1).click().sendKeys(config.getCurrentAddress()).build().perform();
			    Thread.sleep(3000);
			    act.moveToElement(add2).click().sendKeys(config.getCurrentAddress()).build().perform();
			    Thread.sleep(3000);
			    act.moveToElement(landMark).click().sendKeys(config.getCurrentAddress()).build().perform();
			    Thread.sleep(3000);
			    presentState.click();
				Thread.sleep(3000);
				act.moveToElement(presentState).sendKeys(config.getUState()).sendKeys(Keys.ENTER).build().perform();	
			    Thread.sleep(3000);
			    presentCity.click();
				Thread.sleep(3000);
				act.moveToElement(presentCity).sendKeys(config.getcity()).sendKeys(Keys.ENTER).build().perform();
				Thread.sleep(3000);
			    act.moveToElement(pincode).click().sendKeys(config.getUPincode()).build().perform();
			    Thread.sleep(3000);
			    act.moveToElement(residenceSince).sendKeys(Keys.ARROW_DOWN).click().build().perform();
			    Thread.sleep(3000);
			    act.moveToElement(workAdd).click().build().perform();
			    Thread.sleep(3000);
			    act.moveToElement(Officeadd1).click().sendKeys(config.getCurrentAddress()).build().perform();
			    Thread.sleep(3000);
			    act.moveToElement(Officeadd2).click().sendKeys(config.getCurrentAddress()).build().perform();
			    Thread.sleep(3000);
			    act.moveToElement(OfficelandMark).click().sendKeys(config.getCurrentAddress()).build().perform();
			    Thread.sleep(3000);
			    officeState.click();
				Thread.sleep(3000);
				act.moveToElement(officeState).sendKeys(config.getUState()).sendKeys(Keys.ENTER).build().perform();	
			    Thread.sleep(3000);
			    officeCity.click();
				Thread.sleep(3000);
				act.moveToElement(officeCity).sendKeys(config.getcity()).sendKeys(Keys.ENTER).build().perform();
				Thread.sleep(3000);
			    act.moveToElement(officePincode).click().sendKeys(config.getUPincode()).build().perform();
			    Thread.sleep(3000);
			    act.moveToElement(contnueToDocUpload).click().build().perform();
			    Thread.sleep(3000);
			    act.moveToElement(contnueToDocUpload).click().build().perform();
			    Thread.sleep(3000);
			    DocUploadByDealer.click();
			    Thread.sleep(3000);
			    jse.executeScript("scroll(0, 300)");
			    Thread.sleep(3000);
			    act.moveToElement(DealerSbmt).click().build().perform();
			    Thread.sleep(7000);
			    act.moveToElement(cibilOK).click().build().perform();
		}
		
	    public void PersonalDetails() throws Exception {
	    	Thread.sleep(2000);
	    	Name();
	    	Thread.sleep(2000);
	    	Email();
	    	Thread.sleep(2000);
	    	DateOfBirth();
	    	Thread.sleep(2000);
	    	City();
	    	Thread.sleep(2000);
	    	Policy();
	    	Thread.sleep(2000);
	    	sbmt();
	    	Thread.sleep(2000);
	    	SelectCar();
	    	Thread.sleep(2000);
	    	SelectDealer();
	    	Thread.sleep(2000);
	    	PriceSummary();
	    	Thread.sleep(3000);
	    	PersonalDeatils1();
	    	Thread.sleep(2000);
	    }
		
	    public void Customer_Main_Method() throws Exception {
	    	
	    	Finance();
			Thread.sleep(5000);
	    	UserLogin();
	    	Thread.sleep(5000);
	    	PersonalDetails();
	    	Thread.sleep(5000);
	    	BankLoanOffers();
	    }
		
	}


