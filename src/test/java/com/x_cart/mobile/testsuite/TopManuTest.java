package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.*;
import com.x_cart.mobile.testbase.TestBase;
import org.junit.Test;
import org.testng.Assert;

public class TopManuTest extends TestBase {
    HomePage homePage=new HomePage();
    Shipping shipping=new Shipping();
    NewArrivals newArrivals=new NewArrivals();
    ComingSoon comingSoon=new ComingSoon();
    ContactUs contactUs=new ContactUs();
    @Test
    public void  verifyUserShouldNavigateToShippingPageSuccessfully(){
        homePage.clickOnShippingTab();
        String expectedMessage="Shipping";
        String actualMessage=shipping.getShippingText();
        Assert.assertEquals(actualMessage,expectedMessage,"Shipping page is not in displayed");
    }
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully(){
        homePage.clickOnNewTab();
        String expectedMessage="New arrivals";
        String actualMessage=newArrivals.clickOnNewTab();
            Assert.assertEquals(actualMessage,expectedMessage,"New arrivals page is not in displatd");
    }
    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully() {
        homePage.clickOnComingSoonTab();
        String expectedMessage = "Coming soon";
        String actualMessage = comingSoon.clickOnComingSoonTab();
        Assert.assertEquals(actualMessage, expectedMessage, "Coming soon page is not in displayed");
   }
        @Test
        public void verifyUserShouldNavigateToContactUsPageSuccessfully () {
            homePage.clickOnContactUsTab();
            String expectedMessage = "Contact us";
            String actualMessage = contactUs.getContactTextTab();
            Assert.assertEquals(actualMessage, expectedMessage, "Contact us page is not in displayed");
        }

    }
