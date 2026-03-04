package com.ui.tests;

import static com.constants.Browser.*;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.pages.HomePage;

public class LoginTestOld {
	HomePage homePage;

	@BeforeMethod(description = "Load the homepage of the website")
	public void setUp() {
		homePage = new HomePage(EDGE);
	}

	@Test(description = "verifies with the valid user is able to login into the application", groups = { "e2e",
			"sanity" })
	public void loginTest() {

		assertEquals(homePage.goToLoginPage().doLoginWith("nidijiv259@pazuric.com", "password").getUserName(),
				"Hanamant Channal");
	}

}
