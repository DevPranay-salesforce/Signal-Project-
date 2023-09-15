package Defence.Base.Administrator.Applicationform;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllPopUpBlankFieldsValidationsCheck {
	public static WebDriver driver;

	public static WebDriver setChromeDriver() {
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();}

	public static void clickElementWithJS(WebElement element) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", element);}

	public static void waitForSeconds(int sec) {

		try {
			Thread.sleep(sec * 1000);} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}}

	public static void setBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = AllPopUpBlankFieldsValidationsCheck.setChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		waitForSeconds(2);}

	public static void main(String[] args) {
		String url = "https://signalmutualindemnity--dev.sandbox.my.site.com/s/";
		AllPopUpBlankFieldsValidationsCheck.setBrowser(url);
		waitForSeconds(2);
		
		                  //****************Section::Add Additional Insured*******************//
		
		WebElement InsuredSubForm = driver.findElement(By.xpath("//button[text()='Submit Form']")); // Replace with
		InsuredSubForm.click();
		waitForSeconds(2);
		
		WebElement AdditionalInsuredPopUp = driver.findElement(By.xpath("//button[text()='Add additional Insured']")); // Replace
		AdditionalInsuredPopUp.click();
		waitForSeconds(2);
		
		WebElement AddRecord = driver.findElement(By.xpath("//button[text()='Add Record']")); // Replace
		AddRecord.click();
		waitForSeconds(2);
		//1
		WebElement AddNameOfOrgBlankValidation = driver.findElement(By.xpath("//div[text()='Please enter Name of Organization']"));
		if(AddNameOfOrgBlankValidation.getText().equals("Please enter Name of Organization")) {
			System.out.println("Pass :Blank Field Validation Message is Displayed :"+AddNameOfOrgBlankValidation.getText());}
		else {
			System.out.println("Failed :Blank Field Validation Message is Displayed :"+AddNameOfOrgBlankValidation.getText());}
		//2 
		WebElement AddAddressBlankValidation = driver.findElement(By.xpath("//div[text()='Please enter Address']"));
		if(AddAddressBlankValidation.getText().equals("Please enter Address")) {
			System.out.println("Pass :Blank Field Validation Message is Displayed :"+AddAddressBlankValidation.getText());}
		else {
			System.out.println("Failed :Blank Field Validation Message is Displayed :"+AddAddressBlankValidation.getText());}
		
		WebElement typeofOrganization = driver.findElement(By.xpath("//button[@name='typeofOrganization']"));
		typeofOrganization.click();
		waitForSeconds(2);
        //3
		WebElement AddTypeOfOrgBlankValidation = driver.findElement(By.xpath("//div[text()='Please select type of Organization']"));
		if(AddTypeOfOrgBlankValidation.getText().equals("Please select type of Organization")) {
			System.out.println("Pass :Blank Field Validation Message is Displayed :"+AddTypeOfOrgBlankValidation.getText());}
		else {
			System.out.println("Failed :Blank Field Validation Message is Displayed :"+AddTypeOfOrgBlankValidation.getText());}
		
		WebElement typeofOrganizationOther = driver
				.findElement(By.xpath("//span[text()='Add Additional Insured']//..//..//..//..//span[@title='Other']"));
		typeofOrganizationOther.click();
		waitForSeconds(1);

		WebElement AddRecordd = driver.findElement(By.xpath("//button[text()='Add Record']")); // Replace
		AddRecordd.click();
		waitForSeconds(2);
		//4
		WebElement AddOtherTypeOfOrgBlankValidation = driver.findElement(By.xpath("//span[text()='Add Additional Insured']//..//..//..//..//div[text()='Please enter other type of Organization']"));
		if(AddOtherTypeOfOrgBlankValidation.getText().equals("Please enter other type of Organization")) {
			System.out.println("Pass :Blank Field Validation Message is Displayed :"+AddOtherTypeOfOrgBlankValidation.getText());}
		else {
			System.out.println("Failed :Blank Field Validation Message is Displayed :"+AddOtherTypeOfOrgBlankValidation.getText());}
		

		WebElement closebuttonAddContract = driver.findElement(By.xpath("//lightning-icon[@title='close']")); // Replace
		closebuttonAddContract.click();
		waitForSeconds(5);
				
		                           //*******************Section::Add Contract Information***********************//

		WebElement buttonAddContract = driver.findElement(By.xpath("//button[text()='Add Contract']")); // Replace
		buttonAddContract.click();
		waitForSeconds(2);
		
		WebElement AddRecordButton= driver.findElement(By.xpath("//button[text()='Add Record']")); // Replace
		AddRecordButton.click();
		waitForSeconds(2);
		
		WebElement AddContractEffeDateBlankValidation = driver.findElement(By.xpath("//div[text()='Please Select Effective Date']"));
		if(AddContractEffeDateBlankValidation.getText().equals("Please Select Effective Date")) {
			System.out.println("Pass :Blank Field Validation Message is Displayed :"+AddContractEffeDateBlankValidation.getText());}
		else {
			System.out.println("Failed :Blank Field Validation Message is Displayed :"+AddContractEffeDateBlankValidation.getText());}
		
		WebElement AddContractTypeBlankValidation = driver.findElement(By.xpath("//div[text()='Please Select type of Contract']"));
		if(AddContractTypeBlankValidation.getText().equals("Please Select type of Contract")) {
			System.out.println("Pass :Blank Field Validation Message is Displayed :"+AddContractTypeBlankValidation.getText());}
		else {
			System.out.println("Failed :Blank Field Validation Message is Displayed :"+AddContractTypeBlankValidation.getText());}
		
		WebElement AddContrNumBlankValidation = driver.findElement(By.xpath("//div[text()='Complete this field.']"));
		if(AddContrNumBlankValidation.getText().equals("Complete this field.")) {
			System.out.println("Pass :Blank Field Validation Message is Displayed :"+AddContrNumBlankValidation.getText());}
		else {
			System.out.println("Failed :Blank Field Validation Message is Displayed :"+AddContrNumBlankValidation.getText());}
		
		WebElement AddCountrySelectBlankValidation = driver.findElement(By.xpath("//div[text()='Please Select Country']"));
		if(AddCountrySelectBlankValidation.getText().equals("Please Select Country")) {
			System.out.println("Pass :Blank Field Validation Message is Displayed :"+AddCountrySelectBlankValidation.getText());}
		else {
			System.out.println("Failed :Blank Field Validation Message is Displayed :"+AddCountrySelectBlankValidation.getText());}
		
		WebElement closeAddContractbutton = driver.findElement(By.xpath("//lightning-icon[@title='close']")); // Replace
		closeAddContractbutton.click();
		waitForSeconds(2);

		WebElement buttonAddCountries = driver.findElement(By.xpath("//button[text()='Add Countries']")); 
		buttonAddCountries.click();
		
		WebElement AddRecordCountriesButton= driver.findElement(By.xpath("//button[text()='Add Record']")); // Replace
		AddRecordCountriesButton.click();
		waitForSeconds(2);
		
		WebElement AddContractCountryBlankValidation = driver.findElement(By.xpath("//span[text()='Add Remuneration / Employee Information']//..//..//..//..//div[text()='please select country']"));
		if(AddContractCountryBlankValidation.getText().equals("please select country")) {
			System.out.println("Pass :Blank Field Validation Message is Displayed for Add Remuneration / Employee Information:"+AddContractCountryBlankValidation.getText());}
		else {
			System.out.println("Failed :Blank Field Validation Message is Displayed for Add Remuneration / Employee Information :"+AddContractCountryBlankValidation.getText());}
		
		
		
		waitForSeconds(10);
		driver.quit();
	}
}
