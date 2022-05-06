package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class NewArrivals extends Utility {
    By newTab=By.xpath("//span[@xpath='1']");

    public String clickOnNewTab(){
        return getTextFromElement(newTab);

    }
}
