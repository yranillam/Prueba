package com.co.demo.stepdefinitions;

import com.co.demo.models.UserLoombokData;
import com.co.demo.steps.SerenityLoginSteps;
import com.co.demo.utils.GlobalData;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class SerenityLoginStepDefinitions {

    @Steps
    private SerenityLoginSteps loginSteps;

    @Given("the user is on the serenity demo page")
    public void theUserIsOnTheSerenityDemoPage() throws InterruptedException {
        loginSteps.OpenTheWebSite(GlobalData.baseUrl);
    }

    @When("attempts to log in")
    public void attemptsToLogIn(DataTable table) {
        loginSteps.login(UserLoombokData.setData(table).get(0));
    }

    @Then("^will validate the text on screen (.*)$")
    public void willValidateTheTextOnScreenMessage(String text) {
        loginSteps.validateTextOnScreen(text);
    }
}
