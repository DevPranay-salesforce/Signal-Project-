package Defence.Base.Administrator.Applicationform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DbaApplicationForm {
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

		// method/function to launch the browser

		DbaApplicationForm.setBrowser(url);
//	    	waitForSeconds(10);
		// Fill in the username and password
		// driver.findElement(By.id("username")).sendKeys(userName);
		// driver.findElement(By.id("password")).sendKeys(password);
//	        waitForSeconds(1);
		// Click the login button
		// driver.findElement(By.id("Login")).click();

		// Wait for a few seconds after logging in (you can adjust the time as needed)
		waitForSeconds(2);

		WebElement nameField = driver.findElement(By.xpath("//input[@name='primeOrganizeName']")); // Replace with the
																									// actual element
																									// locator
		nameField.sendKeys("Name of Organization");
		waitForSeconds(2);

		WebElement nameField1 = driver.findElement(By.xpath("//input[@name='primeYearInBusiness']")); // Replace with
																										// the actual
																										// element
																										// locator
		nameField1.sendKeys("1");
		waitForSeconds(2);

		WebElement nameField2 = driver.findElement(By.xpath("//input[@name='primeAddress']")); // Replace with
		nameField2.sendKeys("Address");
		waitForSeconds(2);

		WebElement nameField11 = driver.findElement(By.xpath("//input[@name='primeAddressLine']")); // Replace with
		nameField11.sendKeys("Address Line 1");
		waitForSeconds(2);

		WebElement nameField33 = driver.findElement(By.xpath("//input[@name='primeCity']")); // Replace with
		nameField33.sendKeys("City");
		waitForSeconds(2);

		WebElement nameField3 = driver.findElement(By.xpath("//button[@name='primeState']")); // Replace with
		nameField3.click();
		waitForSeconds(2);

		WebElement nameField4 = driver.findElement(By.xpath("//span[@title='Alabama']")); // Replace with
		nameField4.click();
		waitForSeconds(2);

		nameField3 = driver.findElement(By.xpath("//button[@name='primeState']")); // Replace with
		nameField3.click();
		waitForSeconds(2);

		WebElement nameField5 = driver.findElement(By.xpath("//span[@title='Alaska']")); // Replace with
		nameField5.click();
		waitForSeconds(2);
		/*
		 * nameField3 = driver.findElement(By.xpath("//button[@name='primeState']")); //
		 * Replace with nameField3.click(); waitForSeconds(2);
		 * 
		 * WebElement nameField6 =
		 * driver.findElement(By.xpath("//span[@title='American Samoa']")); // Replace
		 * with nameField6.click(); waitForSeconds(2);
		 * 
		 * nameField3 = driver.findElement(By.xpath("//button[@name='primeState']")); //
		 * Replace with nameField3.click(); waitForSeconds(2);
		 * 
		 * WebElement nameField7 =
		 * driver.findElement(By.xpath("//span[@title='Arizona']")); // Replace with
		 * nameField7.click(); waitForSeconds(2);
		 * 
		 * nameField3 = driver.findElement(By.xpath("//button[@name='primeState']")); //
		 * Replace with nameField3.click(); waitForSeconds(2);
		 * 
		 * WebElement nameField8 =
		 * driver.findElement(By.xpath("//span[@title='Arkansas']")); // Replace with
		 * nameField8.click(); waitForSeconds(2);
		 * 
		 * nameField3 = driver.findElement(By.xpath("//button[@name='primeState']")); //
		 * Replace with nameField3.click(); waitForSeconds(2);
		 * 
		 * WebElement nameField9 =
		 * driver.findElement(By.xpath("//span[@title='Armed Forces Europe']")); //
		 * Replace with nameField9.click(); waitForSeconds(5);
		 * 
		 * nameField3 = driver.findElement(By.xpath("//button[@name='primeState']")); //
		 * Replace with nameField3.click(); waitForSeconds(2);
		 * 
		 * WebElement nameField99 =
		 * driver.findElement(By.xpath("//span[@title='Armed Forces Pacific']")); //
		 * Replace with nameField99.click(); waitForSeconds(2);
		 * 
		 * nameField3 = driver.findElement(By.xpath("//button[@name='primeState']")); //
		 * Replace with nameField3.click(); waitForSeconds(2);
		 * 
		 * WebElement nameField14 =
		 * driver.findElement(By.xpath("//span[@title='California']")); // Replace with
		 * nameField14.click(); waitForSeconds(2);
		 */

		WebElement nameField31 = driver.findElement(By.xpath("//button[@name='PrimeCountry']")); // Replace with
		nameField31.click();
		waitForSeconds(2);

		WebElement nameField04 = driver.findElement(By.xpath("//span[@title='None']")); // Replace with
		nameField04.click();
		waitForSeconds(2);

		nameField31 = driver.findElement(By.xpath("//button[@name='PrimeCountry']")); // Replace with
		nameField31.click();
		waitForSeconds(2);

		WebElement nameField41 = driver.findElement(By.xpath("//span[@title='United States']")); // Replace with
		nameField41.click();
		waitForSeconds(2);

		nameField31 = driver.findElement(By.xpath("//button[@name='PrimeCountry']")); // Replace with
		nameField31.click();
		waitForSeconds(2);

		WebElement nameField42 = driver.findElement(By.xpath("//span[@title='Afghanistan']")); // Replace with
		nameField42.click();
		waitForSeconds(2);

		WebElement nameField32 = driver.findElement(By.xpath("//button[@name='primeTypeofOrganization']")); // Replace
																											// with
		nameField32.click();
		waitForSeconds(2);

		WebElement nameField43 = driver.findElement(By.xpath("//span[@title='LLC']")); // Replace with
		nameField43.click();
		waitForSeconds(2);

		nameField32 = driver.findElement(By.xpath("//button[@name='primeTypeofOrganization']")); // Replace with
		nameField32.click();
		waitForSeconds(2);

		WebElement nameField44 = driver.findElement(By.xpath("//span[@title='Ind']")); // Replace with
		nameField44.click();
		waitForSeconds(2);

		nameField32 = driver.findElement(By.xpath("//button[@name='primeTypeofOrganization']")); // Replace with
		nameField32.click();
		waitForSeconds(2);

		WebElement nameField45 = driver.findElement(By.xpath("//span[@title='Corporate']")); // Replace with
		nameField45.click();
		waitForSeconds(2);

		nameField32 = driver.findElement(By.xpath("//button[@name='primeTypeofOrganization']")); // Replace with
		nameField32.click();
		waitForSeconds(2);

		WebElement nameField46 = driver.findElement(By.xpath("//span[@title='Other']")); // Replace with
		nameField46.click();
		waitForSeconds(2);
		
		WebElement nameField12 = driver.findElement(By.xpath("//input[@name='primeOthertypeofOrganization']")); // Replace with
		nameField12.sendKeys("otherInfo");
		waitForSeconds(2);
		
		
		WebElement nameField22 = driver.findElement(By.xpath("//input[@name='primeFirstName']")); // Replace with
		nameField22.sendKeys("FirstName");
		waitForSeconds(2);
		
		WebElement nameField23 = driver.findElement(By.xpath("//input[@name='primeLastName']")); // Replace with
		nameField23.sendKeys("LastName");
		waitForSeconds(2);
		

		WebElement nameField24 = driver.findElement(By.xpath("//input[@name='primeContactTitle']")); // Replace with
		nameField24.sendKeys("ContactTitle");
		waitForSeconds(2);
		

		WebElement nameField25 = driver.findElement(By.xpath("//input[@name='primeContactEmail']")); // Replace with
		nameField25.sendKeys("ContactEmail@.com");
		waitForSeconds(2);
		

		WebElement nameField26 = driver.findElement(By.xpath("//input[@name='primeContactPhone']")); // Replace with
		nameField26.sendKeys("4848454387");
		waitForSeconds(2);
		/*
		 * nameField3 = driver.findElement(By.xpath("//button[@name='primeState']")); //
		 * Replace with nameField3.click(); waitForSeconds(2);
		 * 
		 * WebElement nameField12 =
		 * driver.findElement(By.xpath("//span[@title='Colorado']")); // Replace with
		 * nameField12.click(); waitForSeconds(2);
		 * 
		 * nameField3 = driver.findElement(By.xpath("//button[@name='primeState']")); //
		 * Replace with nameField3.click(); waitForSeconds(2);
		 * 
		 * WebElement nameField13 =
		 * driver.findElement(By.xpath("//span[@title='Connecticut']")); // Replace with
		 * nameField13.click(); waitForSeconds(2);
		 * 
		 * nameField3 = driver.findElement(By.xpath("//button[@name='primeState']")); //
		 * Replace with nameField3.click(); waitForSeconds(2);
		 * 
		 * WebElement nameField44 =
		 * driver.findElement(By.xpath("//span[@title='Delaware']")); // Replace with
		 * nameField44.click(); waitForSeconds(2);
		 * 
		 * nameField3 = driver.findElement(By.xpath("//button[@name='primeState']")); //
		 * Replace with nameField3.click(); waitForSeconds(2);
		 * 
		 * WebElement nameField15 =
		 * driver.findElement(By.xpath("//span[@title='District of Columbia']")); //
		 * Replace with nameField15.click(); waitForSeconds(2);
		 * 
		 * nameField3 = driver.findElement(By.xpath("//button[@name='primeState']")); //
		 * Replace with nameField3.click(); waitForSeconds(2);
		 * 
		 * 
		 * WebElement nameField16 =
		 * driver.findElement(By.xpath("//span[@title='Federated Micronesia']")); //
		 * Replace with nameField16.click(); waitForSeconds(2);
		 * 
		 * nameField3 = driver.findElement(By.xpath("//button[@name='primeState']")); //
		 * Replace with nameField3.click(); waitForSeconds(2);
		 * 
		 * WebElement nameField17 =
		 * driver.findElement(By.xpath("//span[@title='Florida']")); // Replace with
		 * nameField17.click(); waitForSeconds(2);
		 * 
		 * nameField3 = driver.findElement(By.xpath("//button[@name='primeState']")); //
		 * Replace with nameField3.click(); waitForSeconds(2);
		 * 
		 * WebElement nameField18 =
		 * driver.findElement(By.xpath("//span[@title='Georgia']")); // Replace with
		 * nameField18.click(); waitForSeconds(2);
		 * 
		 * nameField3 = driver.findElement(By.xpath("//button[@name='primeState']")); //
		 * Replace with nameField3.click(); waitForSeconds(2);
		 * 
		 * 
		 * WebElement nameField19 =
		 * driver.findElement(By.xpath("//span[@title='Guam']")); // Replace with
		 * nameField19.click(); waitForSeconds(2);
		 * 
		 * nameField3 = driver.findElement(By.xpath("//button[@name='primeState']")); //
		 * Replace with nameField3.click(); waitForSeconds(2);
		 * 
		 * 
		 * WebElement nameField20 =
		 * driver.findElement(By.xpath("//span[@title='Hawaii']")); // Replace with
		 * nameField20.click(); waitForSeconds(2);
		 * 
		 * nameField3 = driver.findElement(By.xpath("//button[@name='primeState']")); //
		 * Replace with nameField3.click(); waitForSeconds(2);
		 * 
		 * WebElement nameField21 =
		 * driver.findElement(By.xpath("//span[@title='Idaho']")); // Replace with
		 * nameField21.click(); waitForSeconds(2);
		 * 
		 * nameField3 = driver.findElement(By.xpath("//button[@name='primeState']")); //
		 * Replace with nameField3.click(); waitForSeconds(2);
		 * 
		 * WebElement nameField22 =
		 * driver.findElement(By.xpath("//span[@title='Illinois']")); // Replace with
		 * nameField22.click(); waitForSeconds(2);
		 * 
		 * nameField3 = driver.findElement(By.xpath("//button[@name='primeState']")); //
		 * Replace with nameField3.click(); waitForSeconds(2);
		 * 
		 * WebElement nameField23 =
		 * driver.findElement(By.xpath("//span[@title='lowa']")); // Replace with
		 * nameField23.click(); waitForSeconds(2);
		 * 
		 * nameField3 = driver.findElement(By.xpath("//button[@name='primeState']")); //
		 * Replace with nameField3.click(); waitForSeconds(2);
		 * 
		 * WebElement nameField24 =
		 * driver.findElement(By.xpath("//span[@title='Kansas']")); // Replace with
		 * nameField24.click(); waitForSeconds(2);
		 * 
		 * nameField3 = driver.findElement(By.xpath("//button[@name='primeState']")); //
		 * Replace with nameField3.click(); waitForSeconds(2);
		 * 
		 * WebElement nameField25 =
		 * driver.findElement(By.xpath("//span[@title='Kentucky']")); // Replace with
		 * nameField25.click(); waitForSeconds(2);
		 * 
		 * nameField3 = driver.findElement(By.xpath("//button[@name='primeState']")); //
		 * Replace with nameField3.click(); waitForSeconds(2);
		 * 
		 * WebElement nameField26 =
		 * driver.findElement(By.xpath("//span[@title='Louisiana']")); // Replace with
		 * nameField26.click(); waitForSeconds(2);
		 */
		/*
		 * WebElement nameField5 =
		 * driver.findElement(By.xpath("//input[@name='primeAddress']")); // Replace
		 * with nameField5.sendKeys("Country");
		 * 
		 * WebElement nameField6 =
		 * driver.findElement(By.xpath("//input[@name='primeAddress']")); // Replace
		 * with nameField6.sendKeys("First Name");
		 * 
		 * WebElement nameField7 =
		 * driver.findElement(By.xpath("//input[@name='primeAddress']")); // Replace
		 * with nameField7.sendKeys("Last Name");
		 * 
		 * 
		 * WebElement nameField8 =
		 * driver.findElement(By.xpath("//input[@name='primeAddress']")); // Replace
		 * with nameField8.sendKeys("Contact Title");
		 * 
		 * 
		 * WebElement nameField9 =
		 * driver.findElement(By.xpath("//input[@name='primeAddress']")); // Replace
		 * with nameField9.sendKeys("Contact Title");
		 */

		// Perform further actions on the application form or navigate to other pages as
		// needed

		// Close the browser
		driver.quit();
	}
}
