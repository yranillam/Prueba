package com.co.demo.pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SerenityDashBoardPage extends PageObject {

    private static By TXT_VALIDATION = By.xpath("//h1");

    public static By getTxtValidation() {
        return TXT_VALIDATION;
    }
}
