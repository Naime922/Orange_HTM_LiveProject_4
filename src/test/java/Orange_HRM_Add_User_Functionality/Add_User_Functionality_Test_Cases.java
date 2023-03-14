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

        //I navigate to Admin / User Management page.
        clickElements(elements.getAdminButton());

        //I click on Add button
        clickElements(elements.getAddButton());

        //I verify that all the required elements are displayed (User Role, Employee Name, Status, Username, Password, Confirm Password, Cancel, Save)
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
        //I navigate to Admin / User Management page.
        clickElements(elements.getAdminButton());

        //I click on Add button
        clickElements(elements.getAddButton());

        //I verify that “Add User” heading is displayed
        Assert.assertTrue(isDisplayedElements(elements.getAddUserHeader()));
    }

    @Test
    void testCase11(){

    }

    @Test
    void testCase12(){

    }



}
