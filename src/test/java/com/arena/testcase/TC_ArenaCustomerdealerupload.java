package com.arena.testcase;

import org.testng.annotations.Test;

import com.arena.main.Base;
import com.arena.pagemodules.Customerdealerupload;

public class TC_ArenaCustomerdealerupload extends Base {

	Customerdealerupload CJ;

	@Test
	public void heade() throws Exception {
		
		CJ = new Customerdealerupload(driver);
		
		CJ.heade();
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
		//CJ.Addressdetail_P();
		//CJ.uploaddocument_P();
		
		
	}

	
	
}
