package org.automation.pages.opencart;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;

/**
 * Created by shantonu on 5/16/16.
 */
@DefaultUrl("https://demo.opencart.com")
public class HomePage extends PageObject {
    public SearchPanel search;
    public HomePage() {
        search = new SearchPanel();
    }
}
