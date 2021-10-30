package com.w2a.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.w2a.pages.HomePage;

public class LoginTest {

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\com\\w2a\\executables\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\com\\w2a\\executables\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.zoho.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage home = new HomePage();
		home.goToLogin();
	}

}
