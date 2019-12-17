package com.aqacourses.project.tests;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

import com.aqacourses.project.utils.YamlParser;
import com.codeborne.selenide.Configuration;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenSiteAndClickTheLinkSelenideTest {

    // Title of Python page
    private final String TITLE = "Selenium Framework | Python Course";

    // Web Elements
    @FindBy(xpath = "//ul[@id='main-nav']//a/span[.='PYTHON']/..")
    private WebElement pythonLink;

    @FindBy(xpath = "//ul[@id='main-nav']//a/span[.='HOME']/..")
    private WebElement homeLink;

    @Test
    public void testOpenSiteAndClickTheLinkSelenideTest() {

        // Maximize browser window
        Configuration.startMaximized = true;

        // Open URL
        open(YamlParser.getYamlData().getUrl());

        // Initialize WebElements
        page(this);

        // Verify that Python link is opened
        $(pythonLink).is(visible);

        // Click Python link
        $(pythonLink).click();

        // Verify that title as is expected
        Assert.assertEquals("Titles are not the same", TITLE, title());

        // Verify that Home link is visible using byXpath method
        $(byXpath("//ul[@id='main-nav']//a/span[.='HOME']/..")).is(visible);

        // Click Home link
        $(homeLink).click();
    }
}
