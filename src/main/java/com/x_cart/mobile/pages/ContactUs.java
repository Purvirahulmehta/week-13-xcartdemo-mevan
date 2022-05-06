package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ContactUs extends Utility {
    By contactTab = By.xpath("//h1[text()='Contact us']");

    public String getContactTextTab(){
        return getTextFromElement(contactTab);
    }
}
