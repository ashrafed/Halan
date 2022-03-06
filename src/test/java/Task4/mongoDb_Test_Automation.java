package Task4;

import com.shaft.db.DatabaseActions;
import com.shaft.validation.Assertions;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.testng.annotations.Test;

import java.sql.ResultSet;

public class mongoDb_Test_Automation {

    @Epic("MongoDb")
    @Description("database test automation")
    @Test
    public void test_MongoDb_Connection() {
        DatabaseActions dbActions = new DatabaseActions(DatabaseActions.DatabaseType.SQL_SERVER, "", "", "", "", "");
        ResultSet queryResult = dbActions.executeSelectQuery("db.Halan.find();");
        Assertions.assertEquals("", DatabaseActions.getResult(queryResult), Assertions.AssertionComparisonType.CONTAINS,
                Assertions.AssertionType.POSITIVE);
    }
    /// can insert local db
    // Insert IP
    // Insert port
    // Insert DB name
    // Insert userName
    // Insert Password
}
