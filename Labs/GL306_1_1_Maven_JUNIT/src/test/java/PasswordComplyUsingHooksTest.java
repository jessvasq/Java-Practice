import com.nvz.junitTest.PasswordComply;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Test;
import org.junit.jupiter.api.*;

public class PasswordComplyUsingHooksTest {
    PasswordComply password;
    static File myFileReader;
    static Scanner myScannerReader;
    static InputStream passwordFile;
    TestInfo testInfo;
    TestReporter testReporter;

    /**
     * runs before any test case
     * ensures applications have valid passwords before running a load test
     */
    @BeforeAll
    public static void prepareLoadTestData(){
        try {
            myFileReader = new File("C:\\Users\\jessn\\LearningJava\\Java-Practice\\Labs\\GL306_1_1_Maven_JUNIT\\src\\main\\java\\com\\nvz\\junitTest\\passwordFile.txt");
            myScannerReader = new Scanner(myFileReader);
        } catch (IllegalArgumentException e) {
            System.out.println("An error occurred while reading the passwords.txt");
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the passwords.txt");
            e.printStackTrace();
        }
    }

    /**
     * runs before any test case and initializes, and makes data preparation for running the test case
     * @param testInfo
     * @param testReporter
     */
    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {
        this.testInfo = testInfo;
        this.testReporter = testReporter;
        testReporter.publishEntry("Running " + testInfo.getDisplayName() + " under tags " + testInfo.getTags());
        password = new PasswordComply("");
    }

    /**
     * runs after every test case and is used for clean-ups like closing resources, files, connections, sessions, etc
     */
    @AfterEach
    void cleanUpAfterTest() {
        myScannerReader.close();
        System.out.println("Clean up complete.");
    }

    /**
     * runs after all test cases are completed and the last method has been run. It is called for gc (garbage collector)
     */
    @AfterAll
    static void cleanAll(){
        Runtime.getRuntime().gc();
        System.out.println("Clean up of Application level DB data, logs...");
    }


    /**
     * runs a test case to check if config files of application components are available. It calls “@Nested” annotation to indicate its call within a test
     */
    @Nested
    @Tag("Configuration-File-Check")
    @DisplayName("Check ALL Config Files")
    class ConfigFilesAvailable {

        /**
         *  runs a test case based on a tag. It calls the “@Tag” annotation to run the specific “tagged” method @Tag("Configuration-File-Check"), and not all.
         */
        @Test
        @DisplayName("Config")
        public void checkALLConfigFiles() {
            System.out.println("All Config files created...");
        }

        /**
         *  runs a test repeatedly based on the number of times passed (Dependency Injection Pattern). It calls “@RepeatedTest(2)” annotation to run specific times
         */
        @Test
        @DisplayName("Config Entries Created...")
        @RepeatedTest(2)
        public void checkALLConfigEntries() {
            System.out.println("All Config entries valid...");
        }
    }


    /**
     * reads the file for a password and checks if they comply. It uses the “@DisplayName” annotation to name and identify a specific test run
     */
    @Test
    @Tag("DB-Password-Checks")
    @DisplayName("Check ALL DB Password are Valid...")
    public void testDoesPasswordComply() {
        assumeTrue((myFileReader != null));
        boolean expectedResult = true;
        while (myScannerReader.hasNextLine()) {
            String passwordRead = myScannerReader.nextLine();
            System.out.println("Password Read from File : " + passwordRead);
            password.setPassword(passwordRead);
            boolean actualResult = password.doesPasswordComply();
            assertAll(
                    () -> assertEquals(expectedResult,actualResult, "Password conditions failed!")
            );
        }
    }

    /**
     * method never called.It uses the “@Disabled” annotation to not run a test case.
     */
    @Disabled
    @Test
    public void cleanUpFiles() {
        myFileReader.delete();
        System.out.println("Deleting all config, password file created.");
    }
}

