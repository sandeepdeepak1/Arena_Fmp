package com.arena.testcase;

import org.testng.annotations.Test;

import com.arena.main.Base;
import com.arena.pagemodules.CustomerJ;

public class TC_CustomerJ extends Base {
	CustomerJ CJ;
	@Test
	 public void heade() throws Exception {
		
		CJ = new CustomerJ(driver);
		CJ.UserLogin();
		CJ.Name();
		CJ.Email();
		CJ.DateOfBirth();
		CJ.City();
		CJ.Policy();
		CJ.sbmt();
		CJ.SelectCar();
		CJ.SelectDealer();
		CJ.PriceSummary();
		CJ.PersonalDeatils1();
		CJ.BankLoanOffers();
		CJ.PersonalDetails();
		CJ.Customer_Main_Method();

}
}