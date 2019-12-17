package com.aqacourses.project.pages;

import static com.codeborne.selenide.Selenide.title;

import com.aqacourses.project.base.BaseTest;
import org.junit.Assert;

public class PythonPage extends AbstractPage {

    // Title of Python page
    private final String TITLE = "Selenium Framework | Python Course";

    /**
     * Constructor
     *
     * @param testClass
     */
    public PythonPage(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(divPage);
    }

    /** Verify that title is correct */
    public void verifyTitle() {
        Assert.assertEquals("Title is not as expected", TITLE, title());
    }
}
