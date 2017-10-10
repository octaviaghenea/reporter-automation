package com.reporter.steps.account;

import com.reporter.pages.account.LoginPage;

import net.thucydides.core.annotations.Step;

public class LoginSteps {

	LoginPage loginpage;

	@Step
	public void openReporterPage(String url) {
		loginpage.getDriver().get(url);
	}

	@Step
	public void enterUserName(String username) {
		loginpage.enterUserName(username);
	}

	@Step
	public void enterPassword(String password) {
		loginpage.enterPassword(password);
	}

	@Step
	public void clickSignInButton() {
		loginpage.clickSignInButton();
	}
}
