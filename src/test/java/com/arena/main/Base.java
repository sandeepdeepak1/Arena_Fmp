package com.arena.main;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	confiReader config;

	@BeforeMethod
	public void setup() {
		try {
			config = new confiReader();
			String browserName = config.getBrowser();

			if (browserName.equals("chrome")) {
				HashMap<String, Integer> contentsetting = new HashMap<String, Integer>();
				HashMap<String, Object> profile = new HashMap<String, Object>();
				HashMap<String, Object> prefs = new HashMap<String, Object>();
				// For geolocation:: Zero = asking, one= allow, two= block
				contentsetting.put("geolocation", 2);
				profile.put("managed_default_content_settings", contentsetting);
				prefs.put("profile", profile);
				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("prefs", prefs);
				options.addArguments("incognito");
				options.addArguments("start-maximized");
				options.addArguments("disable-location");
				options.addArguments("--disable-gpu");
				WebDriverManager.chromedriver().setup();

				//WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(options);
			} else if (browserName.equals("ff")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (browserName.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}

			driver.manage().window().maximize();
			driver.get(config.getAppUrl());
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		if (driver != null) {
			Thread.sleep(7000);
			driver.quit();
			System.out.println(this.getClass());
		}
	}
}