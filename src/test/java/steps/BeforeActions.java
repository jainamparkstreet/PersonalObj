package steps;





import io.cucumber.java.Before;
import utils.SeleniumDriver;

public class BeforeActions {
	
	@Before
    public static void setUp() {
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
    	System.out.println("Before");
       SeleniumDriver.setUpDriver();
    }

}
