package Orange_HRM_Add_User_Functionality;

import Utilities.UtilityClass;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Add_User_Functionality_Test_Cases extends UtilityClass {

    @Test
    void testCase01() throws InterruptedException {

     String name="Admin255";

     Orange_App_Elements elements=new Orange_App_Elements(driver);
     wait.until(ExpectedConditions.visibilityOf(elements.getAdminButton()));
     elements.getAdminButton().click();
     wait.until(ExpectedConditions.visibilityOf(elements.getUsernameInputBox()));
     elements.getAddButton().click();
     clickElements(elements.getUserRoleDropdownArrow());
     clickElements(elements.getESSFromUserRole());
     clickElements(elements.getStatusDropdownMenuArrow());
     clickElements(elements.getEnabledFromStatus());
     sendKeysElements(elements.getEmployeeNameInputBox(),"p");
     clickElements(elements.getEmployeeNameFromDropdownMenu());
     sendKeysElements(elements.getUsernameInputBox(),name);
     sendKeysElements(elements.getPasswordInputBox(),"Addmin.123");
     sendKeysElements(elements.getConfirmPasswordInputBox(),"Addmin.123");
     clickElements(elements.getSaveButton());

     Thread.sleep(3000);

     clickElements(elements.getAdminButton());
     sendKeysElements(elements.getUserNameSearch(),name);
     clickElements(elements.getSubmitButtonForSearch());
     Assert.assertTrue(getTextFromElements(elements.getRecordSearch()).contains(name));





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
    void testCase12() throws InterruptedException {
        String name="Admin256";

        Orange_App_Elements elements=new Orange_App_Elements(driver);
        wait.until(ExpectedConditions.visibilityOf(elements.getAdminButton()));
        elements.getAdminButton().click();
        wait.until(ExpectedConditions.visibilityOf(elements.getUsernameInputBox()));
        elements.getAddButton().click();
        clickElements(elements.getUserRoleDropdownArrow());
        clickElements(elements.getESSFromUserRole());
        clickElements(elements.getStatusDropdownMenuArrow());
        clickElements(elements.getEnabledFromStatus());
        sendKeysElements(elements.getEmployeeNameInputBox(),"b");
        clickElements(elements.getEmployeeNameFromDropdownMenu());
        sendKeysElements(elements.getUsernameInputBox(),name);
        sendKeysElements(elements.getPasswordInputBox(),"ADDMIN.123");

        Assert.assertTrue(isDisplayedElements(elements.getErrorTextMessage()));
        Assert.assertEquals(elements.getErrorTextMessage().getCssValue("color"),"rgba(235, 9, 16, 1)");
        System.out.println(elements.getErrorTextMessage().getText());
        System.out.println(elements.getErrorTextMessage().getCssValue("color"));





    }



}
