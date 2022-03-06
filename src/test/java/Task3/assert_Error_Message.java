package Task3;

import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class assert_Error_Message {

    @Epic("Task 3")
    @Description("assert_Error_Message_With_Invalid_Username_Or_Password")
    @Test
    public void assert_Error_Message_With_Invalid_Username_Or_Password(){

        WebDriver driver = DriverFactory.getDriver();
        BrowserActions.navigateToURL(driver,"http://www.testyou.in/Login.aspx");

        By email_Path = By.xpath("//input[@id='ctl00_CPHContainer_txtUserLogin']");
        By password_Path =By.xpath("//input[@id='ctl00_CPHContainer_txtPassword']");
        By login_button_path = By.xpath("//input[@id='ctl00_CPHContainer_btnLoginn']");

        ElementActions.type(driver,email_Path,"Halan - Egypt's leading FinTech app for Your Everyday Needs");
        ElementActions.type(driver,password_Path,"any passsword");
        ElementActions.click(driver,login_button_path);

        // Validations

        Validations.assertThat()
                .object("Userid or Password did Not Match !!")
                .contains("Userid or Password did Not Match !!")
                .withCustomReportMessage(" assert_Error_Message_With_Invalid_Username_Or_Password for login Page")
                .perform();
    }
}
