package com.aqacourses.project.tests;

import com.aqacourses.project.base.BaseTest;
import com.aqacourses.project.pages.HomePage;
import com.aqacourses.project.pages.PythonPage;
import org.junit.Test;

public class OpenSiteAndClickTheLinkTest extends BaseTest {

    /** Open site and click the link */
    @Test
    public void testOpenSiteAndClickTheLinkTest() {

        // Open site
        HomePage homePage = openSite();
        log("Opened site");

        // Click on Python link
        PythonPage pythonPage = homePage.clickPythonLink();
        log("Clicked on Python link");

        // Verify title
        pythonPage.verifyTitle();
        log("Verified title");

        // Close site
        closeSite();
        log("Closed site");
    }
}
