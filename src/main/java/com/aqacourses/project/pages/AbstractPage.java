package com.aqacourses.project.pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import com.aqacourses.project.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class AbstractPage {

    // Web Elements
    @FindBy(xpath = "//ul[@id='main-nav']//a/span[.='PYTHON']/..")
    private WebElement pythonLink;

    @FindBy(xpath = "//ul[@id='main-nav']//a/span[.='HOME']/..")
    private WebElement homeLink;

    @FindBy(xpath = "//div[@id='page']")
    protected WebElement divPage;

    // Instances of BaseTest
    protected BaseTest testClass;

    /**
     * Constructor
     *
     * @param testClass
     */
    public AbstractPage(BaseTest testClass) {
        this.testClass = testClass;
        page(this);
        testClass.waitTillElementIsVisible(divPage);
    }

    /**
     * Click on Python link
     *
     * @return new instance of PythonPage
     */
    public PythonPage clickPythonLink() {
        testClass.waitTillElementIsVisible(pythonLink);
        $(pythonLink).click();
        return new PythonPage(testClass);
    }

    /**
     * Click on Home link
     *
     * @return new instance of HomePage
     */
    public HomePage clickHomeLink() {
        testClass.waitTillElementIsVisible(homeLink);
        $(homeLink).click();
        return new HomePage(testClass);
    }
}
