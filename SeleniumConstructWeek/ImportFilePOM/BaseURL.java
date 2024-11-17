package ImportFilePOM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseURL {
	protected WebDriver driver;
	String real1;
	String real2;
	String real4;
	String real5;
	String real6;
	String real7;
	String real8;
	String firstname;
	String phoneNumber;
	String pin; 
	String city;
	String state;
	String flat;
	String area;
	String marks;
	String Manurl;
	@BeforeClass
	public void step1() throws IOException {
		driver = new ChromeDriver(); 
		//driver.get("");
		//Create property object for attracting date from config .properties
		Properties propertiessProperties = new Properties();
		
		// Passing config properties path.
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\khush\\Documents\\workspace-spring-tool-suite-4-4.24.0.RELEASE\\MasaiProject\\src\\test\\resources\\config.properties");
		// Load file in it
		propertiessProperties.load(fileInputStream);
		
		// Use .getproperty and store it in a string(url)
		Manurl = propertiessProperties.getProperty("url");
//		
		 real1 = propertiessProperties.getProperty("signName");
		 real2 = propertiessProperties.getProperty("username");
		 //real3 = propertiessProperties.getProperty("username");
		 real4 = propertiessProperties.getProperty("password");
		 real5 = propertiessProperties.getProperty("email");
		 real6 = propertiessProperties.getProperty("number");
		 real7 = propertiessProperties.getProperty("usernamelogin");
		 
		 real8 = propertiessProperties.getProperty("password");
		 firstname = propertiessProperties.getProperty("Firstname");
		 phoneNumber = propertiessProperties.getProperty("Number");
		 pin = propertiessProperties.getProperty("pin");
		 city = propertiessProperties.getProperty("city");
		 state = propertiessProperties.getProperty("state");
		 flat = propertiessProperties.getProperty("flat");
		 area = propertiessProperties.getProperty("area");
		 marks = propertiessProperties.getProperty("marks");
//		//call it using driver.get
		driver.get(Manurl);
		
		// now we can some extra features for our convenlence
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}

}
