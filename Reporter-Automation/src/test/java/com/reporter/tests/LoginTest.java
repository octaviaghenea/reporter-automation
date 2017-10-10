package com.reporter.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.reporter.steps.account.LoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)

public class LoginTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	LoginSteps loginSteps;

	public String baseURL;
	public String userName;
	public String userPassword;

	@Before
	public void dataSetup() {
		baseURL = "https://reporter.urnbag.com";
		userName = "admin";
		userPassword = "dummy";

	}

	@Test
	public void enterCredentials() {
		loginSteps.openReporterPage(baseURL);
		loginSteps.enterUserName(userName);
		loginSteps.enterPassword(userPassword);
		loginSteps.clickSignInButton();
	}
}
