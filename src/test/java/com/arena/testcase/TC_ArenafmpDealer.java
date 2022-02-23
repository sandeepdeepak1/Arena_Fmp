package com.arena.testcase;

import org.testng.annotations.Test;
import com.arena.main.Base;
import com.arena.pagemodules.DealerJourney;

public class TC_ArenafmpDealer extends Base {
	DealerJourney DJ;

	@Test

	public void header() throws Exception {
		DJ = new DealerJourney(driver);
		DJ.header();
		DJ.dealerlogin();
			
		

	}

}