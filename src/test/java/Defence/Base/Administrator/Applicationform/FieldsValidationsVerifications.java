package Defence.Base.Administrator.Applicationform;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FieldsValidationsVerifications {
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
		driver = FieldsValidationsVerifications.setChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		waitForSeconds(5);}

	public static void main(String[] args) {
		String url = "https://signalmutualindemnity--dev.sandbox.my.site.com/s/";
		FieldsValidationsVerifications.setBrowser(url);
		waitForSeconds(5);
		
		                         //*******************Section::Insured Information*********************//
		
		WebElement nameField46 = driver.findElement(By.xpath("//button[text()='Submit Form']")); // Replace with
		nameField46.click();
		waitForSeconds(5);
		
		//1
		WebElement nameOfOrganizationBlankValidation = driver.findElement(By.xpath("//div[text()='Please enter Name of Organization']"));
		if(nameOfOrganizationBlankValidation.getText().equals("Please enter Name of Organization")) {
			System.out.println("Pass :Blank Field Validation Message is Displayed :"+nameOfOrganizationBlankValidation.getText());}
		else {
			System.out.println("Failed :Blank Field Validation Message is Displayed :"+nameOfOrganizationBlankValidation.getText());}
		
		//2
		WebElement addressBlankValidation = driver.findElement(By.xpath("//div[text()='Please enter Address']"));
		if(addressBlankValidation.getText().equals("Please enter Address")) {
			System.out.println("Pass :Blank Field Validation Message is Displayed :"+addressBlankValidation.getText());}
		else {
			System.out.println("Failed :Blank Field Validation Message is Displayed :"+addressBlankValidation.getText());}
		
		//3
		WebElement typeOfOrgBlankValidation = driver.findElement(By.xpath("//div[text()='Please enter type of Organization']"));
		if(typeOfOrgBlankValidation.getText().equals("Please enter type of Organization")) {
			System.out.println("Pass :Blank Field Validation Message is Displayed :"+typeOfOrgBlankValidation.getText());}
		else {
			System.out.println("Failed :Blank Field Validation Message is Displayed :"+typeOfOrgBlankValidation.getText());}
		
		//4
		WebElement FirstNameBlankValidation = driver.findElement(By.xpath("//div[text()='Please enter First Name']"));
		if(FirstNameBlankValidation.getText().equals("Please enter First Name")) {
			System.out.println("Pass :Blank Field Validation Message is Displayed :"+FirstNameBlankValidation.getText());}
		else {
			System.out.println("Failed :Blank Field Validation Message is Displayed :"+FirstNameBlankValidation.getText());}
		
		//5
		WebElement LastNameBlankValidation = driver.findElement(By.xpath("//div[text()='Please enter Last Name']"));
		if(LastNameBlankValidation.getText().equals("Please enter Last Name")) {
			System.out.println("Pass :Blank Field Validation Message is Displayed :"+LastNameBlankValidation.getText());}
		else {
			System.out.println("Failed :Blank Field Validation Message is Displayed :"+LastNameBlankValidation.getText());}
		 
		//6
		WebElement ContactEmailBlankValidation = driver.findElement(By.xpath("//div[text()='Please enter valid Contact Email']"));
		if(ContactEmailBlankValidation.getText().equals("Please enter valid Contact Email")) {
			System.out.println("Pass :Blank Field Validation Message is Displayed :"+ContactEmailBlankValidation.getText());}
		else {
			System.out.println("Failed :Blank Field Validation Message is Displayed :"+ContactEmailBlankValidation.getText());}
		//7
		WebElement ContactPhoneBlankValidation = driver.findElement(By.xpath("//div[text()='Please enter valid Contact Phone']"));
		if(ContactPhoneBlankValidation.getText().equals("Please enter valid Contact Phone")) {
			System.out.println("Pass :Blank Field Validation Message is Displayed :"+ContactPhoneBlankValidation.getText());}
		else {
			System.out.println("Failed :Blank Field Validation Message is Displayed :"+ContactPhoneBlankValidation.getText());}
		waitForSeconds(5);
		
		                      //***********************Section::Contract Information*********************//
		//8
		WebElement ContractvaliddateBlankValidation = driver.findElement(By.xpath("//div[text()='Please select vald date']"));
		if(ContractvaliddateBlankValidation.getText().equals("Please select vald date")) {
			System.out.println("Pass :Blank Field Validation Message is Displayed :"+ContractvaliddateBlankValidation.getText());}
		else {
			System.out.println("Failed :Blank Field Validation Message is Displayed :"+ContractvaliddateBlankValidation.getText());}
		
		//9
		WebElement typeofContrvaliddateBlankValidation = driver.findElement(By.xpath("//div[text()='Please select type of Contract']"));
		if(typeofContrvaliddateBlankValidation.getText().equals("Please select type of Contract")) {
			System.out.println("Pass :Blank Field Validation Message is Displayed :"+typeofContrvaliddateBlankValidation.getText());}
		else {
			System.out.println("Failed :Blank Field Validation Message is Displayed :"+typeofContrvaliddateBlankValidation.getText());}
		
		//10
		WebElement  ContractNumbervaliddateBlankValidation = driver.findElement(By.xpath("//div[text()='Please enter Contract Number']"));
		if(ContractNumbervaliddateBlankValidation.getText().equals("Please enter Contract Number")) {
			System.out.println("Pass :Blank Field Validation Message is Displayed :"+ContractNumbervaliddateBlankValidation.getText());}
		else {
			System.out.println("Failed :Blank Field Validation Message is Displayed :"+ContractNumbervaliddateBlankValidation.getText());}

		//11
		WebElement  CompletefieldvaliddateBlankValidation = driver.findElement(By.xpath("//div[text()='Complete this field.']"));
		if(CompletefieldvaliddateBlankValidation.getText().equals("Complete this field.")) {
			System.out.println("Pass :Blank Field Validation Message is Displayed :"+CompletefieldvaliddateBlankValidation.getText());}
		else {
			System.out.println("Failed :Blank Field Validation Message is Displayed :"+CompletefieldvaliddateBlankValidation.getText());}
		
		//12
		WebElement DescrOpervaliddateBlankValidation = driver.findElement(By.xpath("//div[text()='Please Enter Description of Operations']"));
		if(DescrOpervaliddateBlankValidation.getText().equals("Please Enter Description of Operations")) {
			System.out.println("Pass :Blank Field Validation Message is Displayed :"+DescrOpervaliddateBlankValidation.getText());}
		else {
			System.out.println("Failed :Blank Field Validation Message is Displayed :"+DescrOpervaliddateBlankValidation.getText());}
		
		                     
		
		
		
		
		waitForSeconds(5);
		driver.quit();
	}
}
