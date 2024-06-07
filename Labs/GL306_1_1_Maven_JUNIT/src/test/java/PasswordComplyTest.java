import com.nvz.junitTest.PasswordComply;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordComplyTest {

    /**
     * Calls the doesPasswordComply() method of the PasswordComply class and asserts actual versus expected results.
     */
    @Test
    public void testDoesPasswordComply() {
        boolean expectedResult = true;
        PasswordComply pw = new PasswordComply("abcd1234");
        boolean actualResult = pw.doesPasswordComply();
        assertEquals(expectedResult, actualResult, "Password Conditions Failed!");
        System.out.println("Password Conditions Passed!");
    }


    /**
     * Calls the doesNotAlreadyExist() method of the PasswordComply class and throws a SQL exception for Database errors or invalid data
     */
    @Test
    public void testDoesPasswordExist(){
        PasswordComply pw = new PasswordComply("Abcd!");
        assertThrows(java.sql.SQLException.class, () -> pw.doesNotAlreadyExist(), "SQL Exception Throw");
    }

    /**
     * Calls the doesNotAlreadyExist() method of the PasswordComply class and throws a Null exception for Database errors or invalid data.
     */
    @Test
    public void testEmptyPassword(){
        PasswordComply pw = new PasswordComply("abcd1234");
        assertThrows(NullPointerException.class, () -> pw.doesNotAlreadyExist(),  "Null Exception was thrown but received SQL Exception.");
    }
}
