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
        Orange_App_Elements elements=new Orange_App_Elements(driver);
        clickElements(elements.getAdminButton());
        clickElements(elements.getAddButton());
        sendKeysElements(elements.getPasswordInputBox(),"technoStudy123.");
        sendKeysElements(elements.getConfirmPasswordInputBox(),"1234");
        String Actual =getTextFromElements(elements.getPasswordErrorMessage());
        String ExpectedMessage = "Passwords do not match";
        Assert.assertTrue(isDisplayedElements(elements.getPasswordErrorMessage()));
        Assert.assertEquals(Actual,ExpectedMessage);
        String ActualColor = elements.getPasswordErrorMessage().getCssValue("color");
        String ExpectedColor ="rgba(235, 9, 16, 1)";
        Assert.assertEquals(ActualColor,ExpectedColor);





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
