package com.arena.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;
import java.util.Properties;

  public class confiReader 
  {
	public Properties pr;
	
	final String prfilepath= "../ArenaFMP/src/test/java/com/arena/configs/config.properties";
	
	public confiReader() 
	{
		BufferedReader br;
		try 
		{
			br=new BufferedReader(new FileReader(prfilepath));
			pr=new Properties();
			try
			{
				pr.load(br);
				br.close();
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
			throw new RuntimeException("Properties file not found "+ prfilepath);
		}		
	}
	
	public String getBrowser()
	{
		String browser= pr.getProperty("Browser");
		if(browser!=null)
		return browser;
		else throw new RuntimeException("Firefox driver Path not found in the config file");		
	}
	
	public String getAppUrl()
	{
		String Appurl = pr.getProperty("Url");
		if(Appurl!=null)		
		return Appurl;
		else throw new RuntimeException("Url not found");
	}
	
	public String getUMobile()
	{
		String moblie= pr.getProperty("Mobile");
		if(moblie!=null)
		return moblie;
		else throw new RuntimeException("User Mobile is not in the config file");		
	}
	
	public String getUname()
	{
		String Name=pr.getProperty("FirstName");
		if(Name!=null)
		return Name;
		else throw new RuntimeException("User Name is not in the cofig file.");		
	}
	
	
	public String getUEmail()
	{
		String UEmail = pr.getProperty("Emailid");
		if(UEmail!=null)
		return UEmail;
		else throw new RuntimeException("Customer Email Id is not in the config file");		
	}
	
	public String getUDob()
	{
		String dob=pr.getProperty("Dob");
		if(dob!=null)
			return dob;
		else throw new RuntimeException("Dob is not present in the congig file.");
	}
	
	public String getUmiddle()
	{
		String middle = pr.getProperty("MiddleName");
		if(middle!=null)		
		return middle;
		else throw new RuntimeException("MiddleName is not found");
	}	
	
	
	public String getUlast()
	{
		String lastname =pr.getProperty("LastName");
		if(lastname!=null)
			return lastname;
		else throw new RuntimeException("LastName is not found in the config file.");
	}
	public String getpan()
	{
		String Getpan =pr.getProperty("Pancard");
		if(Getpan!=null)
			return Getpan;
		else throw new RuntimeException("Pancard is not found in the config file.");
	}
	
	public String getUcurrentemi()
	{
		String Getcurrentemi =pr.getProperty("CurrentEmi");
		if(Getcurrentemi!=null)
			return Getcurrentemi;
		else throw new RuntimeException("CurrentEmi is not found in the config file.");
	}
	public String getUnetincome()
	{
		String Getnetincome =pr.getProperty("NetIncome");
		if(Getnetincome!=null)
			return Getnetincome;
		else throw new RuntimeException("NetIncome is not found in the config file.");
	}
	
	public String getUgrossincome()
	{
		String Getgrossincome =pr.getProperty("GrossIncome");
		if(Getgrossincome!=null)
			return Getgrossincome;
		else throw new RuntimeException("GrossIncome is not found in the config file.");
	}
	
	public String getUfather()
	{
		String father =pr.getProperty("Father'sName");
		if(father!=null)
			return father;
		else throw new RuntimeException("Father'sName is not found in the config file.");
	}
	
	public String getUNoofdependent()
	{
		String NO_Depend=pr.getProperty("Noofdependent");
		if( NO_Depend!=null)
			return  NO_Depend;
		else throw new RuntimeException("Noofdependent is not found in the config file.");
	}
	
	
	public String getCurrentAddress()
	{
		String address1=pr.getProperty("CurrentAddressfield1");
		if(address1!=null)
			return address1;
		else throw new RuntimeException("CurrentAddressfield1 is not found in the config file.");
	}
	
	public String getCurrentAddress1()
	{
		String address2=pr.getProperty("CurrentAddressfield2");
		if(address2!=null)
			return address2;
		else throw new RuntimeException("CurrentAddressfield2 is not found in the config file.");
	}
	public String getPinCurrent()
	{
		String GetPinC =pr.getProperty("CurrentAddPin");
		if(GetPinC!=null)
			return GetPinC;
		else throw new RuntimeException("CurrentAddPin is not found in the config file.");
	}
	
	public String getWorkAddress()
	{
		String waddress1=pr.getProperty("WorkAddress1");
		if(waddress1!=null)
			return waddress1;
		else throw new RuntimeException("WorkAddress1 is not found in the config file.");
	}
	
	public String getWorkAddress1()
	{
		String waddress2=pr.getProperty("WorkAddress2");
		if(waddress2!=null)
			return waddress2;
		else throw new RuntimeException("WorkAddress2 is not found in the config file.");
	}
	public String getPinWork()
	{
		String GetPinW =pr.getProperty("WorkPin");
		if(GetPinW!=null)
			return GetPinW;
		else throw new RuntimeException("WorkPin is not found in the config file.");
	}
	
	public String getUploadid()
	{
		String GetId =pr.getProperty("uploadID");
		if(GetId!=null)
			return GetId;
		else throw new RuntimeException("uploadID is not found in the config file.");
	}
	
	public String getdealermspin()
	{
		String Getmspin =pr.getProperty("Mspin");
		if(Getmspin!=null)
			return Getmspin;
		else throw new RuntimeException("Mspin is not found in the config file.");
	}
	
	public String getdealerotp()
	{
		String Getotp =pr.getProperty("Dotp");
		if(Getotp!=null)
			return Getotp;
		else throw new RuntimeException("Dotp is not found in the config file.");
	}
	public String getnewfinancemobile()
	{
		String Getfinancemobile =pr.getProperty("Newfinancemobile");
		if(Getfinancemobile!=null)
			return Getfinancemobile;
		else throw new RuntimeException("Newfinancemobile is not found in the config file.");
	}
	public String getDate()
	{
		String Getdate =pr.getProperty("date");
		if(Getdate!=null)
			return Getdate;
		else throw new RuntimeException("date is not found in the config file.");
	}
	public String getMonth()
	{
		String Getmonth =pr.getProperty("month");
		if(Getmonth!=null)
			return Getmonth;
		else throw new RuntimeException("Month is not found in the config file.");
	}
	public String getYear()
	{
		String Getyear =pr.getProperty("year");
		if(Getyear!=null)
			return Getyear;
		else throw new RuntimeException("year is not found in the config file.");
	}

	public String getcity() {
		String Getcity =pr.getProperty("City");
		if(Getcity!=null)
			return Getcity;
		else throw new RuntimeException("City is not found in the config file.");
		
		
		
	}

	public String getUState() {
		String Getstate = pr.getProperty("State");
		if(Getstate!= null)
		return Getstate;
		else throw new RuntimeException("State is not found in the config file");
	}

	public String getUPincode() {
		String Getcurrentpin = pr.getProperty("CurrentAddPin");
		if(Getcurrentpin!=null)
		return Getcurrentpin;
		else throw new RuntimeException("CurrentAddPin is not found in the config file");
		
	}

	
	
	
/*	public String getSearchText()
	{
		String msg=pr.getProperty("SearchText");
		if(msg!=null)
			return msg;
		else throw new RuntimeException();
	}*/
}