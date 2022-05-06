package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BestSellers extends Utility {
    By bestSellersTab=By.xpath("//h3[contains(text(),'Bestsellers')]");
    By sortByTab=By.xpath("//span[contains(text(),'Sort by:')]");
    By sortZToA = By.partialLinkText("Name Z -");//before sorting the order
    By sortAToZ = By.partialLinkText("Name A -");//before sorting the order
    By sortPriceHighToLow = By.partialLinkText("Price High - L");//before sorting the order

    By sortByRateTab = By.xpath("//a[@data-sort-by='r.rating']");//before sorting the order

    By zToASorted = By.xpath("//span[contains(text(),'Name Z - A')]");//After sorting the order
    By highToLowSorted = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]");//After sorting the order
    By nameOrderSorted = By.xpath("//a[@class='fn url next-previous-assigned']");//After sorting the order
    By priceOrderSorted = By.xpath("//span[@class='price product-price']");//After sorting the order

    By rateOrderSorted = By.xpath("//ul[@class='products-grid grid-list']/li/div/div[2]//div[@class='stars-row full']");//After sorting the order

    By mouseHooverOnAddToCart = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]/a[1]/img[1]");
    By addToCart = By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-42']");
    By productText = By.xpath("//li[text()='Product has been added to your cart']");
    By crossSign = By.xpath("//a[@class='close']");
    By yourCartSymbol = By.xpath("//div[@title='Your cart']");
    By viewCart = By.xpath("//a[@class='regular-button cart']");
    By addToCartVinlyProduct = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[8]/div[1]/div[2]/div[4]/div[1]/button[1]");

    public String getBestSellerText() {
        return getTextFromElement(bestSellersTab);
    }

    public void mouseHoverOnSortByTab() {
        mouseHoverToElementAndClick(sortByTab);
    }

    public void clickOnSortZToA() {
        clickOnElement(sortZToA);
    }

    public void clickOnSortAToZ() {
        clickOnElement(sortAToZ);
    }

    public void clickOnSortPriceHighLow() {
        clickOnElement(sortPriceHighToLow);
    }

    public void clickOnSortRateBestSeller() {

        clickOnElement(sortByRateTab);
    }

    public String getzToAText() {

        return getTextFromElement(zToASorted);
    }

    public String getHighToLowText() {

        return getTextFromElement(highToLowSorted);
    }

    public List<WebElement> fetchItemsListName() {

        return listOfWebElementsList(nameOrderSorted);
    }

    public List<WebElement> fetchItemsListPrice() {

        return listOfWebElementsList(priceOrderSorted);
    }

    public List<WebElement> fetchItemsListRate() {

        return listOfWebElementsList(rateOrderSorted);
    }

    public void mouseHoverOnAddToCart() {
        mouseHoverToElement(mouseHooverOnAddToCart);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String getProductText() {
        return getTextFromElement(productText);
    }

    public void clickOnCrossSign() {
        clickOnElement(crossSign);
    }

    public void clickOnYourCartSymbol() {
        clickOnElement(yourCartSymbol);
    }

    public void clickOnViewCart() {
        clickOnElement(viewCart);
    }

    public void mouseHoverAndClickOnAddToCartVinlyProduct() {
        mouseHoverToElementAndClick(addToCartVinlyProduct);
    }


}



