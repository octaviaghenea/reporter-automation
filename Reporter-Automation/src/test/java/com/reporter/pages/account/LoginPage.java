package com.reporter.pages.account;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

	@FindBy(id = "userName")
	private WebElementFacade userNameInput;

	@FindBy(id = "password")
	private WebElementFacade passwordInput;

	@FindBy(css = "button[class]")
	private WebElementFacade sigInButton;

	public void enterUserName(String userName) {
		userNameInput.type(userName);
	}

	public void enterPassword(String password) {
		passwordInput.type(password);
	}

	public void clickSignInButton() {
		sigInButton.click();
	}
}
