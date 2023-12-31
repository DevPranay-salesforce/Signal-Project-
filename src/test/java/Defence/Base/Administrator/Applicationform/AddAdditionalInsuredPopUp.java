package Defence.Base.Administrator.Applicationform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddAdditionalInsuredPopUp {
	public static WebDriver driver;

	public static void waitForSeconds(int sec) {

		try {
			Thread.sleep(sec * 1000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void setBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		waitForSeconds(5);
	}

	public static void main(String[] args) {

		// https://signalmutualindemnity--dev.sandbox.my.site.com/s/
		// https://signalmutualindemnity--dev.sandbox.lightning.force.com/
		String url = "https://signalmutualindemnity--dev.sandbox.my.site.com/s/";
		String userName = "nisarg.shihora@psadvisory.com.dev";
		String password = "Nisu@1999";

		AddAdditionalInsuredPopUp.setBrowser(url);
		//waitForSeconds(10);
		//p[@class='my-class']
		WebElement FraudDisclosure = driver.findElement(By.xpath("//p[contains(text(),'Any person who knowingly and with intent to defraud any insurance company or othe')]"));
        
		String actualText = FraudDisclosure.getText();
		// Validate the text
		String expectedText = "Notice to applicants: Any person who knowingly and with intent to defraud any insurance company "
				+ "or other person files an application for insurance or statement of claim containing any materially false information or, conceals, "
				+ "for the purpose of misleading, information concerning any fact material thereto, commits a fraudulent act, "
				+ "which is a crime and may subject such person to criminal and civil penalties. NOTICE: This application is for "
				+ "the purpose of obtaining a quotation and does not bind the applicant or the Company to complete the insurance. "
				+ "However, if a policy is later issued, this form shall be the basis of and become part of the contract. "
				+ "The undersigned applicant warrants that to the best of his or her knowledge the statements set forth herein are true. "
				+ "The applicant further warrants that if the information supplied on the application changes between the date of this application and "
				+ "the time when the policy is issued, the applicant will immediately notify the Company in writing of any change, "
				+ "and the insurer may withdraw or modify any outstanding quotations and/or authorization or agreements to bind the insurance.";
				
		
		/*
		 * System.out.println("Validation passed"+ actualText);
		 * System.out.println("Validation passed"+ expectedText);
		 */

		if (actualText.equals(expectedText)) {
			System.out.println("Validation passed: " + actualText);
		} else {
			System.out.println("Validation failed. Expected: " + expectedText + ", Actual: " + actualText);
		}
		WebElement AdditionalInsuredPopUp =driver.findElement(By.xpath("//button[text()='Add additional Insured']")); // Replace
		AdditionalInsuredPopUp.click();
		waitForSeconds(2);
				  
		WebElement AddRecord =driver.findElement(By.xpath("//button[text()='Add Record']")); // Replace
		AddRecord.click();
		waitForSeconds(2);
		
		WebElement organizationName =driver.findElement(By.xpath("//input[@name='organizeName']")); // Replace
		organizationName.click();
		organizationName.sendKeys("organizeeName");
		//waitForSeconds(2);
		
		WebElement YearInBusiness =driver.findElement(By.xpath("//input[@name='yearInBusiness']")); // Replace
		YearInBusiness.click();
		YearInBusiness.sendKeys("87");
		//waitForSeconds(2);
		
		WebElement address =driver.findElement(By.xpath("//input[@name='address']")); // Replace
		address.click();
		address.sendKeys("Royal marg -87");
		//waitForSeconds(2);
		
		WebElement addressLine1 =driver.findElement(By.xpath("//input[@name='addressLine1']")); // Replace
		addressLine1.click();
		addressLine1.sendKeys("Royal marg -877");
		//waitForSeconds(2);
		

		WebElement city =driver.findElement(By.xpath("//input[@name='city']")); // Replace
		city.click();
		city.sendKeys("Raipur -877");
		//waitForSeconds(2);
		
		WebElement state =driver.findElement(By.xpath("//button[@name='state']")); // Replace
		state.click();
		waitForSeconds(2);
		
		WebElement stateName = driver.findElement(By.xpath("//span[@title='Alabama']")); // Replace with
		stateName.click();
		//waitForSeconds(2);
		
//		state =driver.findElement(By.xpath("//button[@name='state']")); // Replace
//		state.click();
//		waitForSeconds(2);
//
//		WebElement stateName1 = driver.findElement(By.xpath("//span[@title='Arizona']")); // Replace with
//		stateName1.click();
//		waitForSeconds(2);
		
//		WebElement country = driver.findElement(By.xpath("//button[@name='country']")); // Replace with
//		country.click();
//		waitForSeconds(2);
//		
//		country = driver.findElement(By.xpath("//button[@name='country']")); // Replace with
//		country.click();
//		waitForSeconds(2);
		
		/*
		 * WebElement country1 =
		 * driver.findElement(By.xpath("//span[@title='Afghanistan']")); // Replace with
		 * country1.click(); waitForSeconds(2);
		 */
		
		WebElement typeofOrganization = driver.findElement(By.xpath("//button[@name='typeofOrganization']")); // Replace with
		typeofOrganization.click();
		waitForSeconds(2);
		
		WebElement title = driver.findElement(By.xpath("//span[@title='LLC']"));  // Replace with
		title.click();
		waitForSeconds(1); 
		
		
		typeofOrganization = driver.findElement(By.xpath("//button[@name='typeofOrganization']")); // Replace with
		typeofOrganization.click();
		waitForSeconds(2);
		
		WebElement Other = driver.findElement(By.xpath("//span[@title='Other']"));  // Replace with
		Other.click();
		waitForSeconds(1); 
		
		WebElement otherTypeofOrganization = driver.findElement(By.xpath("//input[@name='otherTypeofOrganization']"));  // Replace with
		otherTypeofOrganization.click();
		otherTypeofOrganization.sendKeys("otherTypeofOrganization");
		waitForSeconds(1); 
		
	    AddRecord =driver.findElement(By.xpath("//button[text()='Add Record']")); // Replace
		AddRecord.click();
		waitForSeconds(5);
		
		/*
		 * WebElement nameField46 =
		 * driver.findElement(By.xpath("//button[text()='Submit Form']")); // Replace
		 * with nameField46.click(); waitForSeconds(2);
		 * 
		 * WebElement nameField26 = driver.findElement(By.
		 * xpath("//div[text()='Please enter Name of Organization']")); // Replace //
		 * with waitForSeconds(2); // Get the text of the element String actualText =
		 * nameField26.getText(); // Validate the text String expectedText =
		 * "Please enter Name of Organization";
		 * 
		 * if (actualText.equals(expectedText)) {
		 * System.out.println("Validation passed: " + actualText); } else {
		 * System.out.println("Validation failed. Expected: " + expectedText +
		 * ", Actual: " + actualText); }
		 * 
		 * WebElement nameField27 =
		 * driver.findElement(By.xpath("//div[text()='Please enter Address']")); //
		 * Replace with waitForSeconds(2); // Get the text of the element String
		 * actualText1 = nameField27.getText(); // Validate the text String
		 * expectedText1 = "Please enter Address";
		 * 
		 * if (actualText1.equals(expectedText1)) {
		 * System.out.println("Validation passed: " + actualText1); } else {
		 * System.out.println("Validation failed.Expected: " + expectedText1 +
		 * ", Actual: " + actualText1); } WebElement toggleButton = driver
		 * .findElement(By.
		 * xpath("//span[(text()= 'Are you the prime contractor on these contracts?')]")
		 * );
		 * 
		 * // Click the toggle button toggleButton.click();
		 * 
		 * // Check the state of the toggle button boolean isToggledOn =
		 * toggleButton.isSelected();
		 * 
		 * if (isToggledOn) { System.out.println("Toggle button is ON"); } else {
		 * System.out.println("Toggle button is OFF"); }
		 */
		driver.quit();
	}
}
