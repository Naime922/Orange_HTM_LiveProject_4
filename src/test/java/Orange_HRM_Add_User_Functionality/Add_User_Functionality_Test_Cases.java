package Orange_HRM_Add_User_Functionality;

import Utilities.UtilityClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Add_User_Functionality_Test_Cases extends UtilityClass {

    @Test
    void testCase01() {

    }

    @Test
    void testCase02() {

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
        String actual = elements.getUsernameErrorMessage().getText();

        System.out.println(actual);

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
    void testCase12(){

    }


    @Override
    public void sendKeysElements(WebElement element, String msg) {
        super.sendKeysElements(element, msg);
    }
}
