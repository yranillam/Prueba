package com.co.demo.steps;

import com.co.demo.models.UserLoombokData;
import com.co.demo.pageobjects.SerenityDashBoardPage;
import com.co.demo.pageobjects.SerenityLoginPage;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.core.Serenity.getDriver;

public class SerenityLoginSteps {
    SerenityLoginPage loginPage = new SerenityLoginPage();

    @Step
    public void OpenTheWebSite(String url) {
        getDriver().get(url);
    }

    @Step
    public void login(UserLoombokData userLoombokData) {

        loginPage.getDriver().findElement(SerenityLoginPage.getTxtUser()).clear();
        loginPage.getDriver().findElement(SerenityLoginPage.getTxtPass()).clear();

        loginPage.getDriver().findElement(SerenityLoginPage.getTxtUser()).sendKeys(userLoombokData.getUser());
        loginPage.getDriver().findElement(SerenityLoginPage.getTxtPass()).sendKeys(userLoombokData.getPass());

        loginPage.getDriver().findElement(SerenityLoginPage.getBtnSubmit()).click();


    }

    @Step
    public void validateTextOnScreen(String text) {
        assert loginPage.getDriver().findElement(SerenityDashBoardPage.getTxtValidation()).getText().contains(text);
    }


}

