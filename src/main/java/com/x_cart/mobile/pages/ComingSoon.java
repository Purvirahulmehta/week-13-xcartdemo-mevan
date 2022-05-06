package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ComingSoon extends Utility {
    By comingSoonTab=By.xpath("//span[@xpath='1'and contains(text(),'Coming soon')]");
    public String clickOnComingSoonTab(){
        return getTextFromElement(comingSoonTab);
    }
}
