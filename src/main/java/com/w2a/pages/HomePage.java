package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	public void goToSupport(){
		
		driver.findElement(By.cssSelector(".signin>a:nth-child(2)")).click();
		
	}
	
	public void goToLogin(){
		
		driver.findElement(By.cssSelector(".signin")).click();
		
	}
	
	public void goToSignUp(){
		
		driver.findElement(By.cssSelector(".signup")).click();
		
	}
	
	public void goToZoho(){
		
	}
	
	public void goToLearnMore(){
		
	}
	
	public void validateFooterLinks(){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
