package Task1;

import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Epic;
import io.restassured.response.Response;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class asserts_On_The_Returning_Values {

    @Epic("Tesk 1")
    @Description("asserts on the returning values")
    @Test
    public void Verify_Data_Equals_Same_Return_Value(){

        RestActions apiobject = DriverFactory.getAPIDriver("https://api.agify.io/?");
        Response getBookingRes =  apiobject
                .buildNewRequest("name=meelad",RestActions.RequestType.GET)
                .setTargetStatusCode(200)
                .performRequest();

        //Validations

        Validations.verifyThat()
                .response(getBookingRes)
                .isEqualToFileContent("src/test/java/Task1/userData.json")
                .withCustomReportMessage("asserts on the returning values");
    }
}
