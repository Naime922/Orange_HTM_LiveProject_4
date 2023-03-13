package Orange_HRM_Add_User_Functionality;

import Utilities.UtilityClass;
import org.testng.Assert;
import org.testng.annotations.Parameters;
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

    }

    @Test
    void testCase07(){

    }

    @Test
    void testCase08(){

        Orange_App_Elements elements=new Orange_App_Elements(driver);

        clickElements(elements.getAdminButton());

        Assert.assertTrue(isDisplayedElements(elements.getAddButton()), "Failed to display Add Button");

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
    @Parameters(value = "msg")
        void testCase11(String str){
        Orange_App_Elements elements=new Orange_App_Elements(driver);
        clickElements(elements.getAdminButton());
        clickElements(elements.getAddButton());
        sendKeysElements(elements.getPasswordInputBox(),str);

        String actualPasswordErrorMessage = getTextFromElements(elements.getPasswordErrorMessage());
        String expectedPasswordErrorMessage = "Should have at least 8 characters";

        String actualPasswordMessageColor = elements.getPasswordErrorMessage().getCssValue("color");
        String expectedPasswordMessageColor ="rgba(235, 9, 16, 1)";

        Assert.assertEquals(actualPasswordErrorMessage, expectedPasswordErrorMessage, "The message is not same");
        Assert.assertTrue(isDisplayedElements(elements.getPasswordErrorMessage()), "Failed to display the password error message");
        Assert.assertEquals(actualPasswordMessageColor, expectedPasswordMessageColor, "The colors are not same");

    }

    @Test
    void testCase12(){

    }



}
