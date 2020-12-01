package com.academy.project.page;

import com.academy.core.page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubscriberPage extends BasePage {

    @FindBy(xpath = "//table//tr/td/input[@id='1']/../../td[3]")
    private WebElement name;

    public SubscriberPage(WebDriver driver) {
        super(driver);
    }

    public SubscriberPage goTo(String baseUrl) {
        driver.get(baseUrl + "/subscribers");
        return this;
    }

    public String getName() {
        return name.getText();
    }
}
