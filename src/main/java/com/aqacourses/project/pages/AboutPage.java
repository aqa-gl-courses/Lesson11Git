package com.aqacourses.project.pages;

import com.aqacourses.project.base.BaseTest;

public class AboutPage extends AbstractPage {

    /**
     * Constructor
     *
     * @param testClass
     */
    public AboutPage(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(divPage);
    }
}
