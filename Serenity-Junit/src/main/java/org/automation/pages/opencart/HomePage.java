package org.automation.pages.opencart;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;

/**
 * Created by shantonu on 5/16/16.
 */
@DefaultUrl("https://demo.opencart.com")
public class HomePage extends PageObject {

    @FindBy(xpath = "//div[@id='search']/input")
    public WebElementFacade textBox ;

    @FindBy(xpath = "//div[@id='search']/span/button")//property loading or after parsing or static
    public WebElementFacade button;

    public void search(String keyWord){
        $()
    }
}
