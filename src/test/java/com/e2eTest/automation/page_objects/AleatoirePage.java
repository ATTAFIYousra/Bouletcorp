package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.Setup;

public class AleatoirePage {

	public ConfigFileReader configFileReader;

	/* Retrieve Element */

	@FindBy(how = How.XPATH, using = "//div[@id='tabvanilla']//a[contains(text(),'Aléatoire')]")
	public static WebElement btnAleatoire;

	@FindBy(how = How.XPATH, using = "//img[@title='Facebook']")
	public static WebElement iconFacebook;

	@FindBy(how = How.XPATH, using = "//img[@title='Twitter']")
	public static WebElement iconTwitter;

	@FindBy(how = How.XPATH, using = "//a[@title='Share on Tumblr']")
	public static WebElement iconTumblr;

	public AleatoirePage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

}
