package com.arena.testcase;

import org.testng.annotations.Test;

import com.arena.main.Base;
import com.arena.pagemodules.CustomerJourney;

public class TC_ArenafmpUser extends Base {

	CustomerJourney CJ;

	@Test
	
	public void header() throws Exception {
		CJ = new CustomerJourney(driver);
		CJ.header();
		CJ.Userlogin();
		CJ.basicinfo();
		CJ.selectcar();
		CJ.selectvarient();
		CJ.proceedloanoffer();
		CJ.Ugovernmentsalaried();
		CJ.Pshowloan();
		CJ.Personaldetails();
		CJ.Loanoffer_Pa();
		CJ.Application_P();
		CJ.Addressdetail_P();
		CJ.uploaddocument_P();
		
		
	}

	
	
}
