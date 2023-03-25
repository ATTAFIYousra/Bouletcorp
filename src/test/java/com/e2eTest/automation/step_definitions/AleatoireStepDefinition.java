package com.e2eTest.automation.step_definitions;

import org.junit.Assert;

import com.e2eTest.automation.page_objects.AleatoirePage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AleatoireStepDefinition {

	public AleatoirePage aleatoirePage;
	public SeleniumUtils seleniumUtils;
	public Validations validations;
	public ConfigFileReader configFileReader;

	public AleatoireStepDefinition() {

		aleatoirePage = new AleatoirePage();
		seleniumUtils = new SeleniumUtils();
		validations = new Validations();
		this.configFileReader = new ConfigFileReader();
	}

	@Given("J accede à l application bouletcorp")
	public void jAccedeÀLApplicationBouletcorp() {
		seleniumUtils.navigate(configFileReader.getProperties("home.url"));
	}

	@When("Je clique sur le bouton Aleatoire")
	public void jeCliqueSurLeBoutonAleatoire() {
		seleniumUtils.click(AleatoirePage.btnAleatoire);
	}

	@Then("La page change {string}")
	public void laPageChange(String url){
		validations.checkUrlChange(url);			
	}	

	@Then("Je trouve le widget twitter")
	public void jeTrouveLeWidgetTwitter() {
		Boolean res = validations.isElementDisplayed(AleatoirePage.iconTwitter);
		Assert.assertTrue(res);
	}

	@Then("Je trouve le widget facebook")
	public void jeTrouveLeWidgetFacebook() {
		Boolean res = validations.isElementDisplayed(AleatoirePage.iconFacebook);
		Assert.assertTrue(res);
	}

	@Then("Je trouve le widget tumblr")
	public void jeTrouveLeWidget_tumblr() {
		Boolean res = validations.isElementDisplayed(AleatoirePage.iconTumblr);
		Assert.assertTrue(res);
	}

}
