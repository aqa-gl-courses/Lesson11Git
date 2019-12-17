package com.aqacourses.project.pages;

import com.aqacourses.project.base.BaseTest;

public class HomePage extends AbstractPage {

    /**
     * Constructor
     *
     * @param testClass
     */
    public HomePage(BaseTest testClass) {
        super(testClass);
        System.out.println("Test");
        testClass.waitTillElementIsVisible(divPage);
    }
}
