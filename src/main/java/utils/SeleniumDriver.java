package utils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class SeleniumDriver {

	private static SeleniumDriver seleniumdriver;
	
	 //initialize webdriver
    private static WebDriver driver;
    
    //initialize timeouts
    private static WebDriverWait wait;
    public final static int TIMEOUT = 30;
    public final static int PAGE_LOAD_TIMEOUT = 50;
    
    SeleniumDriver() {
    	//System.setProperty("webdriver.chrome.driver","C:\\Users\\growlt155\\OneDrive - Growexx\\Desktop\\Sumit - Automation\\NavigatorAutomation\\chromedriver.exe"); 
    	
    	WebDriverManager.chromedriver().setup();
    	
    	ChromeOptions options = new ChromeOptions(); 
    	//DesiredCapabilities cp = new DesiredCapabilities();
		//cp.setCapability(ChromeOptions.CAPABILITY, options);
		//options.merge(cp);
		
    	
    	driver = new ChromeDriver();
    	//ChromeOptions options = new ChromeOptions(); 
    	options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
    	options.addArguments("--no-sandbox");
    	options.addArguments("--headless");
		options.addArguments("--disable-gpu");// Bypass OS security model
		//options.addArguments("--remote-allow-origins=*");
		
		
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver(options);
		
    	driver.manage().window().maximize();
    	wait = new WebDriverWait(driver, Duration.ofSeconds(120, 1));
    	 driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
	     driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	     String window=driver.getWindowHandle();
	     System.out.println("Window ->"+window);
	      
    	
    	
    	 //driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
	       // driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	        //String window=driver.getWindowHandle();
	        //System.out.println("Window ->"+window);
    }
    

    public static void openPage(String url) {
    	System.out.println(url);
    	System.out.println(driver);
        driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }
    
    public static WebDriverWait Wait() {
        return wait;
    }

    public static void setUpDriver() {
       if (seleniumdriver == null)
    	   seleniumdriver = new SeleniumDriver();
      
    }

//    @AfterSuite
    public static void tearDown() {
        if (driver != null) {
        	
            driver.quit();
        }
        seleniumdriver = null;
    }
    public static void waitForPageToLoad()
    {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	
	
}
