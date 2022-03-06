package Task2;

import com.shaft.api.RestActions;
import com.shaft.driver.DriverFactory;
import com.shaft.validation.Validations;
import io.qameta.allure.Epic;
import jdk.jfr.Description;
import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;

public class asserts_The_Value_Of_The_Price_Is_Equal {
    //private RestActions apiObject;

    @Epic("Tesk 2")
    @Description("asserts the value of the price is 34.5")
    @Test
    public void asserts_The_Value_Of_The_Price_Is_Equal_35(){
        //apiObject = DriverFactory.getAPIDriver("");
        //double Price = 34.5 ;
        Validations.assertThat()
                .file("src/test/java/Task2/" ,"xmlRespons.xml")
                .exists()
                .withCustomReportMessage("asserts the value of the price is 34.5")
                .toString().getBytes(StandardCharsets.UTF_8)
                .equals("<soap:Envelope\n" +
                        "xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope/\"\n" +
                        "soap:encodingStyle=\"http://www.w3.org/2003/05/soap-encoding\">\n" +
                        "<soap:Body xmlns:m=\"http://www.example.org/stock\">\n" +
                        "<m:GetStockPriceResponse>\n" +
                        "<m:Price>34.5</m:Price>\n" +
                        "</m:GetStockPriceResponse>\n" +
                        "</soap:Body>\n" +
                        "</soap:Envelope>");
    }
}
