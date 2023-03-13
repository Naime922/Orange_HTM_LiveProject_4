package Orange_HRM_Add_User_Functionality;

import Utilities.UtilityClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Add_User_Functionality_Test_Cases extends UtilityClass {

    @Test
    void testCase01(){

    }

    @Test
    void testCase02(){

    }
    @Test
    void testCase03(){

    }

    @Test
    void testCase04(){

    }

    @Test
    void testCase05(){

    }

    @Test
    void testCase06(){
        Orange_App_Elements elements=new Orange_App_Elements(driver);
        //Check if you are in Dashboard page
        Assert.assertEquals(getTextFromElements(elements.getDashboardHeader()), "Dashboard");

        //Navigate to Admin page
        clickElements(elements.getAdminButton());

        //Check if you landed on Admin page
        Assert.assertTrue(driver.getCurrentUrl().contains("SystemUsers"));

        //Click on add button
        clickElements(elements.getAddButton());

        //Enter a value in to the username field which is less than 5 characters
        sendKeysElements(elements.getUsernameInputBox(), "utku");

        //Verify that notification messages “Should be at least 5 characters” in red color displayed.
        String actual = elements.getPasswordErrorMessage().getText();

        System.out.println(actual);

        String expected = "Should be at least 5 characters";
        Assert.assertEquals(actual, expected);
    }

    @Test
    void testCase07(){

    }

    @Test
    void testCase08(){

    }

    @Test
    void testCase09(){
     Orange_App_Elements elements=new Orange_App_Elements(driver);
        //Check if you are in Dashboard page
        Assert.assertEquals(getTextFromElements(elements.getDashboardHeader()), "Dashboard");

        //Navigate to Admin page
        clickElements(elements.getAdminButton());

        //Check if you landed on Admin page
        Assert.assertTrue(driver.getCurrentUrl().contains("SystemUsers"));

        //Click on add button
        clickElements(elements.getAddButton());

        //Verify the elements are displayed;
        Assert.assertTrue(isDisplayedElements(elements.getUserRole()));
        Assert.assertTrue(isDisplayedElements(elements.getEmployeeName()));
        Assert.assertTrue(isDisplayedElements(elements.getStatus()));
        Assert.assertTrue(isDisplayedElements(elements.getUsernameAdminPage()));
        Assert.assertTrue(isDisplayedElements(elements.getPasswordAdminPage()));
        Assert.assertTrue(isDisplayedElements(elements.getConfirmPassword()));
        Assert.assertTrue(isDisplayedElements(elements.getCancelButton()));
        Assert.assertTrue(isDisplayedElements(elements.getSaveButton()));


    }

    @Test
    void testCase10(){
        Orange_App_Elements elements=new Orange_App_Elements(driver);
        //Navigate to Admin page
        clickElements(elements.getAdminButton());

        //Check if you landed on Admin page
        Assert.assertTrue(driver.getCurrentUrl().contains("SystemUsers"));

        //Click on add button
        clickElements(elements.getAddButton());

        //Verify "Add User" header is displayed
        Assert.assertTrue(isDisplayedElements(elements.getAddUserHeader()));
    }

    @Test
    void testCase11(){

    }

    @Test
    void testCase12(){

    }



}
