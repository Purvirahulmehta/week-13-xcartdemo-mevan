package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class Shipping extends Utility {
    By shippingTab=By.xpath("//span[@xpath='1' and contains(text(),'Shipping')]");

    public String getShippingText(){

        return getTextFromElement(shippingTab);
    }

}
