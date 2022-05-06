package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutSuccessFul extends Utility {
    By thankYouMessage=By.xpath("//h1[text()='Thank you for your order']");

    public String getThankYouMessage(){

        return getTextFromElement(thankYouMessage);
    }

}

