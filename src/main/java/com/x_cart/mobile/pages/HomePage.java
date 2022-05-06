package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By shippingTab=By.xpath("//span[@xpath='1'and contains(text(),'Shipping')]");
    By newTab=By.xpath("//span[@xpath='1']");
    By comingSoonTab=By.xpath("//span[@xpath='1'and contains(text(),'Coming soon')]");
    By contactUsTab=By.xpath("//span[@xpath='1'and contains(text(),'Contact us')]");
    By hotDealsTab=By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title']");
    By saleTab=By.xpath("//h3[contains(text(),'Sale')]");
    By bestSallerTab=By.xpath("//h3[contains(text(),'Bestsellers')]");

    public void clickOnShippingTab(){
        clickOnElement(shippingTab);
    }
    public void clickOnNewTab(){
        clickOnElement(newTab);
    }
    public void clickOnComingSoonTab() {
        clickOnElement(comingSoonTab);
    }
    public void clickOnContactUsTab(){
        clickOnElement(contactUsTab);
    }
    public void mouseHooverOnHotDeals(){
        mouseHoverToElement(hotDealsTab);
    }
    public void mouseHooverOnSaleTab(){
        mouseHoverToElement(saleTab);
    }
    public void mouseHooverOnBestSallersTab(){
        mouseHoverToElement(bestSallerTab);
    }
}
