package Orange_HRM_Add_User_Functionality;

import Utilities.UtilityClass;



import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
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
    void testCase02() throws InterruptedException {
        String username="username2525";

       Orange_App_Elements elements = new Orange_App_Elements(driver);
       clickElements(elements.getAdminButton());
       clickElements(elements.getAddButton());
        clickElements(elements.getUserRoleDropdownArrow());
        clickElements(elements.getESSFromUserRole());
        clickElements(elements.getStatusDropdownMenuArrow());
        clickElements(elements.getEnabledFromStatus());
        sendKeysElements(elements.getEmployeeNameInputBox(), "L");
        clickElements(elements.getEmployeeNameFromDropdownMenu());
        sendKeysElements(elements.getUsernameInputBox(),username);
        sendKeysElements(elements.getPasswordInputBox(), "Naime123.");
        sendKeysElements(elements.getConfirmPasswordInputBox(), "Naime123.");
        clickElements(elements.getSaveButton());
        Thread.sleep(3000);
        clickElements(elements.getAdminButton());
        sendKeysElements(elements.getUsernameInputBox(), username);
        clickElements(elements.getSubmitButtonForSearch());
        Assert.assertTrue(getTextFromElements(elements.getFindRecord()).contains(username));


    }



    @Test
    void testCase03() {
        Orange_App_Elements elements = new Orange_App_Elements(driver);
        clickElements(elements.getAdminButton());
        clickElements(elements.getAddButton());
        clickElements(elements.getSaveButton());
        Assert.assertTrue(isDisplayedElements(elements.getErrorForEmptyFields()));

        String expectedColor = "rgba(235, 9, 16, 1)";
        String actualColor = elements.getErrorForEmptyFields().getCssValue("color");
        Assert.assertEquals(actualColor, expectedColor);

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
    void testCase05() {

        // String EmployeeName = "Taeyang";
        Orange_App_Elements elements = new Orange_App_Elements(driver);
        clickElements(elements.getAdminButton());
        clickElements(elements.getAddButton());
        //  clickElements(elements.getEmployeeNameInputBox());

        sendKeysElements(elements.getEmployeeNameInputBox(), "Taeyang");

        String actualNoRecordFoundErrorMessageForEmployeeName = getTextFromElements(elements.getNoRecordFoundErrorMessageForEmployeeName());
        String expectedNoRecordFoundErrorMessageForEmployeeName = "No Records Found";

        Assert.assertEquals(actualNoRecordFoundErrorMessageForEmployeeName, expectedNoRecordFoundErrorMessageForEmployeeName);
        Assert.assertTrue(isDisplayedElements(elements.getNoRecordFoundErrorMessageForEmployeeName()));

        Actions actions = new Actions(driver);
        Action action = actions.sendKeys(Keys.TAB).build();
        action.perform();

        String actualInvalidMessageForEmployeeName = getTextFromElements(elements.getInvalidMessageForEmployeeName());
        String expectedInvalidMessageForEmployeeName = "Invalid";

        Assert.assertEquals(actualInvalidMessageForEmployeeName, expectedInvalidMessageForEmployeeName);
        Assert.assertTrue(isDisplayedElements(elements.getInvalidMessageForEmployeeName()));
    }

        @Test
        void testCase06 () throws InterruptedException {
            Orange_App_Elements elements = new Orange_App_Elements(driver);
            //Check if you are in Dashboard page


            //Navigate to Admin page
            clickElements(elements.getAdminButton());

            //Check if you landed on Admin page


            //Click on add button
            clickElements(elements.getAddButton());

            //Enter a value in to the username field which is less than 5 characters
            sendKeysElements(elements.getUsernameInputBox(), "utku");

            //Verify that notification messages “Should be at least 5 characters” in red color displayed.
            String actual = elements.getUsernameErrorMessage().getText();


            String expected = "Should be at least 5 characters";
            Assert.assertEquals(actual, expected);
        }

    @Test
    void testCase07(){
        Orange_App_Elements elements = new Orange_App_Elements(driver);

        clickElements(elements.getAdminButton());
        clickElements(elements.getAddButton());

        sendKeysElements(elements.getUsernameSearchButton(), "Jadine.Jackie");
        Assert.assertTrue(isDisplayedElements(elements.getAlreadyExistsMessage()));

        Assert.assertEquals(elements.getAlreadyExistsMessage().getCssValue("color"), "rgba(235, 9, 16, 1)");


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

//
//    @Override
//    public void sendKeysElements(WebElement element, String msg) {
//        super.sendKeysElements(element, msg);
//    }
}
