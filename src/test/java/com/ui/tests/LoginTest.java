package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		WebDriver wd = new ChromeDriver(); // launch and create browser session
		wd.get("https://automationpractice.techwithjatin.com/"); // go to the website
		wd.manage().window().maximize(); // maximize the window
		By signInLinkLocator = By.xpath("//a[contains(text(),'Sign in')]");
		WebElement signInLinkWebElement = wd.findElement(signInLinkLocator);
		signInLinkWebElement.click();
	}

}
