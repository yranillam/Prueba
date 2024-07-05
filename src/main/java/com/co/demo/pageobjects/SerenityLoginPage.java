package com.co.demo.pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SerenityLoginPage extends PageObject {

    private static By TXT_USER = By.xpath("//input[@id='LoginPanel0_Username']");
    private static By TXT_PASS = By.xpath("//input[@id='LoginPanel0_Password']");
    private static By BTN_SUBMIT = By.xpath("//button[@id='LoginPanel0_LoginButton']");


    public static By getTxtUser() {
        return TXT_USER;
    }

    public static By getTxtPass() {
        return TXT_PASS;
    }

    public static By getBtnSubmit() {
        return BTN_SUBMIT;
    }
}

