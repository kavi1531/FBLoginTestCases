package PageObjectModel;
import org.testng.annotations.DataProvider;
public class logintestdata {



        @DataProvider(name = "loginData")
        public static Object[][] loginData() {
            return new Object[][]{
                    {"user1@example.com", "password1"},
                    {"user3@example.com", "password3"}
            };


        }
    }

