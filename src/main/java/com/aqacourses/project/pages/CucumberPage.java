package com.aqacourses.project.pages;

import com.aqacourses.project.base.BaseTest;

public class CucumberPage extends AbstractPage {

    /**
     * Constructor
     *
     * @param testClass
     */
    public CucumberPage(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(divPage);
    }
}
