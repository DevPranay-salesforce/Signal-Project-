package Defence.Base.Administrator.Applicationform;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CompleteApplication {
	public static WebDriver driver;
	
	public static WebDriver setChromeDriver() {
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	}

	public static void clickElementWithJS(WebElement element) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", element);
	}

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
		driver = CompleteApplication.setChromeDriver();
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
		
//		String url = "https://signalmutualindemnity--dev.sandbox.my.site.com/s/";
//		String userName = "saurav.vekariya@psadvisory.com.signal";
//		String password = "MissionSignal@1234567";
//		


	
		CompleteApplication.setBrowser(url);
        // waitForSeconds(2);

		             // Section:Insured Information //
		
		WebElement Organize = driver.findElement(By.xpath("//input[@name='primeOrganizeName']")); 
		Organize.sendKeys("Name of Organization");
		// waitForSeconds(2);

		WebElement primeYear = driver.findElement(By.xpath("//input[@name='primeYearInBusiness']")); 
		primeYear.sendKeys("1564");
		// waitForSeconds(2);

		WebElement primeAddress = driver.findElement(By.xpath("//input[@name='primeAddress']"));
		primeAddress.sendKeys("primeAddress");
		// waitForSeconds(2);

		WebElement primeAddressLine = driver.findElement(By.xpath("//input[@name='primeAddressLine']")); 
		primeAddressLine.sendKeys("primeAddressLine");
		// waitForSeconds(2);

		WebElement primeCity = driver.findElement(By.xpath("//input[@name='primeCity']")); 
		primeCity.sendKeys("primeCity");
		// waitForSeconds(2);

		WebElement primeState = driver.findElement(By.xpath("//button[@name='primeState']")); 
		primeState.click();
		// waitForSeconds(2);

		WebElement Alabama = driver.findElement(By.xpath("//span[@title='Alabama']")); // Replace with
		Alabama.click();
		// waitForSeconds(2);

//
//		WebElement nameField31 = driver.findElement(By.xpath("//button[@name='PrimeCountry']")); // Replace with
//		nameField31.click();
//		waitForSeconds(2);
//
//		WebElement nameField04 = driver.findElement(By.xpath("//span[@title='None']")); // Replace with
//		nameField04.click();
//		waitForSeconds(2);

		WebElement PrimeCount = driver.findElement(By.xpath("//button[@name='PrimeCountry']")); 
		PrimeCount.click();
		// waitForSeconds(2);

		WebElement unistates = driver.findElement(By.xpath("//span[@title='United States']")); 
		// unistates.click();
		clickElementWithJS(unistates);
		// unistates.click();
		//waitForSeconds(5);

		WebElement primeType = driver.findElement(By.xpath("//button[@name='primeTypeofOrganization']")); 
		primeType.click();
		// waitForSeconds(2);

		WebElement titleOther = driver.findElement(By.xpath("//span[@title='Other']")); 
		titleOther.click();
		// waitForSeconds(2);

		WebElement primeOthertype = driver.findElement(By.xpath("//input[@name='primeOthertypeofOrganization']"));
		primeOthertype.sendKeys("otherInfo");
		// waitForSeconds(2);

		WebElement primeFirst = driver.findElement(By.xpath("//input[@name='primeFirstName']")); 
		primeFirst.sendKeys("primeFirst");
		// waitForSeconds(2);

		WebElement primeLast = driver.findElement(By.xpath("//input[@name='primeLastName']")); 
		primeLast.sendKeys("primeLast");
		// waitForSeconds(2);

		WebElement primeContact = driver.findElement(By.xpath("//input[@name='primeContactTitle']"));
		primeContact.sendKeys("ContactTitle");
		// waitForSeconds(2);

		WebElement primeContactEmail = driver.findElement(By.xpath("//input[@name='primeContactEmail']")); 
		primeContactEmail.sendKeys("primeContactEmail@.com");
		// waitForSeconds(2);

		WebElement primeContactPhone = driver.findElement(By.xpath("//input[@name='primeContactPhone']")); 
		primeContactPhone.sendKeys("4848454387");

		                          // Section:Broker Information //
		
		WebElement InsuranceAgencyorBroker = driver.findElement(By.xpath("//input[@name='brokerIAB']")); 
		InsuranceAgencyorBroker.sendKeys("InsuranceAgencyorBroker");

		WebElement BrokerTitle = driver.findElement(By.xpath("//input[@name='brokerTitle']")); 
		BrokerTitle.sendKeys("Country");

		WebElement FirstName = driver.findElement(By.xpath("//input[@name='brokerFirstName']")); 
		FirstName.sendKeys("Country");

		WebElement LastName = driver.findElement(By.xpath("//input[@name='brokerLastName']")); 
		LastName.sendKeys("LastName");

		WebElement Brokeremail = driver.findElement(By.xpath("//input[@name='brokerEmail']")); 
		Brokeremail.sendKeys("BrokerPhone@test.com");

		WebElement BrokerPhone = driver.findElement(By.xpath("//input[@name='brokerPhone']")); 
		BrokerPhone.sendKeys("46498444");
		waitForSeconds(5);
		
//		 WebElement toggleButton = driver.findElement(By.xpath("//span[(text()= 'Specific Contracts as Listeds?')]"));
//
//			// Click the toggle button
//			toggleButton.click();
		
                                 // Section: Contract Information //
		
		WebElement primeEffectiveDate = driver.findElement(By.xpath("//input[@ name='primeEffectiveDate']"));
		primeEffectiveDate.sendKeys("11/8/2023");

		WebElement RequestedQuoteDate = driver.findElement(By.xpath("//input[@ name='primeRequestedQuoteDate']")); 
		RequestedQuoteDate.sendKeys("12/8/2023");
		// waitForSeconds(5);

		WebElement primeTypeofContract = driver.findElement(By.xpath("//button[@ name='primeTypeofContract']")); 
		primeTypeofContract.click();

		WebElement FEMA = driver.findElement(By.xpath("//span[@title='FEMA']")); 
		FEMA.click();

		WebElement primeContractValue = driver.findElement(By.xpath("//input[@ name='primeContractValue']"));
		primeContractValue.sendKeys("987847");

		WebElement primeContractNumber = driver.findElement(By.xpath("//input[@ name='primeContractNumber']"));
		primeContractNumber.sendKeys("987");

		WebElement primeContractLength = driver.findElement(By.xpath("//input[@ name='primeContractLength']"));
		primeContractLength.sendKeys("97");

		// This syntax is used when showing error like: " Elements are not intractable." //
		WebElement primeContractCountry = driver.findElement(By.xpath("//span[text()='Contract Information']//..//..//..//button[@name=\"primeContractCountry\"]"));
		primeContractCountry.click();
		//waitForSeconds(2);

		WebElement States = driver.findElement(By.xpath("//span[text()='Contract Information']//..//..//..//span[@title='United Kingdom']")); 
		clickElementWithJS(States);
		// States.click();
		//waitForSeconds(5);

		WebElement toggleButton = driver.findElement(By.xpath("//span[(text()='Are you the prime contractor on these contracts?')]"));
		toggleButton.click();
		//waitForSeconds(2);

		WebElement toggleButtonorganization = driver.findElement(By.xpath("//span[(text()='Has the organization previously carried DBA coverage?')]"));
		toggleButtonorganization.click();
		//waitForSeconds(2);

		WebElement toggleButton1 = driver.findElement(By.xpath("//span[text()='Any work performed underground, underwater, or above 15 Ft?']"));
		toggleButton1.click();
		//waitForSeconds(2);

		WebElement textareaname1 = driver.findElement(By.xpath("//textarea[@name='Work_environment_description__c']"));
		textareaname1.sendKeys("Workenvironmentdescriptionc");
		//waitForSeconds(2);

		WebElement PrimetoggleButtono = driver.findElement(By.xpath("//span[(text()= 'If Prime Contractor, are subcontractors used?')]"));
		PrimetoggleButtono.click();
		//waitForSeconds(2);

		WebElement Subcontractorsvettingprocessc = driver.findElement(By.xpath("//textarea[@name='Subcontractors_vetting_process__c']"));
		Subcontractorsvettingprocessc.sendKeys("Subcontractorsvettingprocessc");
		//waitForSeconds(2);

		WebElement textareaname = driver.findElement(By.xpath("//textarea[@name='Description_of_operations__c']"));
		textareaname.sendKeys("Workenvironmentdescriptionc");
		//waitForSeconds(2);
		
	                         //Section:	Remuneration  / Employee Information //
		
		WebElement Country_Of_Operation__c = driver.findElement(By.xpath("//button[@name='Country_Of_Operation__c']"));
		Country_Of_Operation__c.click();
		//waitForSeconds(2);
		
		
		WebElement remuneration = driver.findElement(By.xpath("//span[text()='Remuneration / Employee Information']//..//..//..//span[@title='United States']")); 
		//clickElementWithJS(remuneration);
		remuneration.click();
		//waitForSeconds(5);

		WebElement Job_Description__c = driver.findElement(By.xpath("//input[@name='Job_Description__c']"));
		Job_Description__c.sendKeys("JobDescriptionc");
		//waitForSeconds(2);
		
		WebElement toggleremuneration = driver.findElement(By.xpath("//span[(text()='Include United States national employees')]"));
		toggleremuneration.click();
		//waitForSeconds(2);


		WebElement Number_US_national__c = driver.findElement(By.xpath("//input[@name='Number_US_national__c']"));
		Number_US_national__c.sendKeys("NumberUSnationalc");
		//waitForSeconds(2);
		

		WebElement Total_Remuneration_USN__c = driver.findElement(By.xpath("//input[@name='Total_Remuneration_USN__c']"));
		Total_Remuneration_USN__c.sendKeys("TotalRemunerationUSNc");
		//waitForSeconds(2);
		
		WebElement toggleremThirdCountry = driver.findElement(By.xpath("//span[(text()='Include Third-Country national employees ')]"));
		toggleremThirdCountry.click();
		//waitForSeconds(2);
		

		WebElement ThirdCountry = driver.findElement(By.xpath("//input[@name='Number_ThirdCountry_National__c']"));
		ThirdCountry.sendKeys("8521");
    	//waitForSeconds(2);
		
    	WebElement TotalRemunerationTCNc = driver.findElement(By.xpath("//input[@name='Total_Remuneration_TCN__c']"));
    	TotalRemunerationTCNc.sendKeys("1569");
		//waitForSeconds(2);
		
		WebElement togglLocalnational = driver.findElement(By.xpath("//span[(text()=' Include Local national employees')]"));
		togglLocalnational.click();
		//waitForSeconds(2);
		
		WebElement Number_Local_National__c = driver.findElement(By.xpath("//input[@name='Number_Local_National__c']"));
		Number_Local_National__c.sendKeys("5454");
		
		WebElement Total_Remuneration_LN__c = driver.findElement(By.xpath("//input[@name='Total_Remuneration_LN__c']"));
		Total_Remuneration_LN__c.sendKeys("98787");
		
		                   //Section:Additional Contract Information//
		WebElement togglemployeesutilized = driver.findElement(By.xpath("//span[(text()='Are tenured employees utilized for contract?')]"));
		togglemployeesutilized.click();
		
		WebElement toggleemploymentwithcompany = driver.findElement(By.xpath("//span[(text()='Will employees retain employment with company after contract is complete?')]"));
		toggleemploymentwithcompany.click();
		
		WebElement toggleEEscarry= driver.findElement(By.xpath("//span[(text()='Do any EEs carry firearms? ')]"));
		toggleEEscarry.click();
		
		WebElement Firearms_details__c= driver.findElement(By.xpath("//textarea[@name='Firearms_details__c']"));
		Firearms_details__c.sendKeys("Firearmsdetailsc");
		
		WebElement toggleprovidedprior= driver.findElement(By.xpath("//span[(text()='Are physicals provided prior to deployment?')]"));
		toggleprovidedprior.click();
		
		WebElement textareaPhysicalsprovided = driver.findElement(By.xpath("//textarea[@name='Physicals_provided_description__c']"));
		textareaPhysicalsprovided.sendKeys("Physicalsprovideddescriptionc");
		
		WebElement togglepsychiatric= driver.findElement(By.xpath("//span[(text()='Is psychiatric pre-screening completed prior to departure?')]"));
		togglepsychiatric.click();
		
		
		WebElement textareaprescreening = driver.findElement(By.xpath("//textarea[@name='Psychiatric_prescreening_description__c']"));
		textareaprescreening.sendKeys("Psychiatricprescreeningdescriptionc");
		
		WebElement togglescreenings = driver.findElement(By.xpath("//span[(text()='Are post deployment screenings completed?')]"));
		togglescreenings.click();
		
		
		WebElement textareadeployment = driver.findElement(By.xpath("//textarea[@name='Post_deployment_screenings_description__c']"));
		textareadeployment.sendKeys("Postdeploymentscreeningsdescriptionc");
		
		
		WebElement togglemedicalinsurance = driver.findElement(By.xpath("//span[(text()='Are EEs provided with non-work-related medical insurance?')]"));
		togglemedicalinsurance.click();

		WebElement concentration = driver.findElement(By.xpath("//input[@name='Maximum_flight_concentration__c']"));
		concentration.sendKeys("5454");
		//waitForSeconds(5);
		                                       // Section :::Employee Housing //
		 
//
//		WebElement toggleemployeehoused= driver.findElement(By.xpath("//span[(text()='Are employees housed on base?')]"));
//		toggleemployeehoused.click();
//		

		WebElement textareaTypeofhousing = driver.findElement(By.xpath("//textarea[@name='Type_of_housing__c']"));
		textareaTypeofhousing.sendKeys("textareaTypeofhousing");
		

		WebElement textareaTransporttoworkc = driver.findElement(By.xpath("//textarea[@name='Transport_to_work__c']"));
		textareaTransporttoworkc.sendKeys("textareaTransporttoworkc");
		//waitForSeconds(5);

		WebElement textareaDistance_to_work__c = driver.findElement(By.xpath("//textarea[@name='Distance_to_work__c']"));
		textareaDistance_to_work__c.sendKeys("Distancetoworkc");
		//waitForSeconds(5);
		
		WebElement textareaTransportation_concentration__c = driver.findElement(By.xpath("//textarea[@name='Transportation_concentration__c']"));
		textareaTransportation_concentration__c.sendKeys("textareaTransportation_concentration__c");
		//waitForSeconds(5);

		WebElement textareaTransport_security__c= driver.findElement(By.xpath("//textarea[@name='Transport_security__c']"));
		textareaTransport_security__c.sendKeys("textareaTransportsecurityc");
		waitForSeconds(1);

		                                  // Section ::: Flight Contractor //
		
		WebElement toggleflightcontractor = driver.findElement(By.xpath("//span[(text()='Are you a flight contractor?')]"));
		toggleflightcontractor.click();
		waitForSeconds(1);
		
		WebElement toggleaircraftahelicopter = driver.findElement(By.xpath("//span[(text()='Is the aircraft a helicopter?')]"));
		toggleaircraftahelicopter.click();
		waitForSeconds(1);
		
		WebElement toggleservicetheaircraft = driver.findElement(By.xpath("//span[(text()='Do you also service the aircraft?')]"));
		toggleservicetheaircraft.click();
		waitForSeconds(1);
		

		WebElement Flight_aircraft_type__c = driver.findElement(By.xpath("//input[@name='Flight_aircraft_type__c']"));
		Flight_aircraft_type__c.sendKeys("Flight_aircraft_type__c");
		waitForSeconds(1);

		WebElement Flight_crew__c = driver.findElement(By.xpath("//input[@name='Flight_crew__c']"));
		Flight_crew__c.sendKeys("11254");
		waitForSeconds(1);

		WebElement Number_of_flights__c = driver.findElement(By.xpath("//input[@name='Number_of_flights__c']"));
		Number_of_flights__c.sendKeys("554Number_of_flights__c");
		waitForSeconds(1);

		WebElement Location_of_base_for_flights__c = driver.findElement(By.xpath("//input[@name='Location_of_base_for_flights__c']"));
		Location_of_base_for_flights__c.sendKeys("Location_of_base_for_flights__c");
		waitForSeconds(1);

		WebElement Flight_destination__c = driver.findElement(By.xpath("//input[@name='Flight_destination__c']"));
		Flight_destination__c.sendKeys("Flight_destination__c");
		
		                               // Section :::Security Contractor //
		
		WebElement toggleecurityContract = driver.findElement(By.xpath("//span[(text()='Are you a Security Contractor?')]"));
		toggleecurityContract.click();
		waitForSeconds(1);
		
		WebElement toggleAreYourEEsarmed = driver.findElement(By.xpath("//span[(text()='Are your EEs armed?')]"));
		toggleAreYourEEsarmed.click();
		waitForSeconds(1);
		
		WebElement togglebodyarmour  = driver.findElement(By.xpath("//span[(text()='Is body armour required to be worn?')]"));
		togglebodyarmour.click();
		waitForSeconds(1);
		

		WebElement Security_Body_armour_description__c= driver.findElement(By.xpath("//textarea[@name='Security_Body_armour_description__c']"));
		Security_Body_armour_description__c.sendKeys("textareaTransportsecurityc");
		

		WebElement Security_Mobile_work__c = driver.findElement(By.xpath("//input[@name='Security_Mobile_work__c']"));
		Security_Mobile_work__c.sendKeys("12");
		waitForSeconds(1);
		
		WebElement Security_location__c = driver.findElement(By.xpath("//button[@name='Security_location__c']"));
		Security_location__c.click();
		waitForSeconds(2);
		

		WebElement titleOtherSecurity = driver.findElement(By.xpath("//span[text()='Security Contractor']//..//..//..//span[@title='Other']"));  
		titleOtherSecurity.click();
		

		WebElement Other_security_location__c = driver.findElement(By.xpath("//Input[@name='Other_security_location__c']"));
		Other_security_location__c.sendKeys("Other_security_location__c");
		waitForSeconds(1);
		
		                                    // Section :::Linguist Contractor //
		
		WebElement togglelinguistictranslator  = driver.findElement(By.xpath("//span[(text()='Are you a linguistic/translator contractor?')]"));
		togglelinguistictranslator.click();
		waitForSeconds(1);
		
		
		WebElement Translator_type__c = driver.findElement(By.xpath("//button[@name='Translator_type__c']"));
		Translator_type__c.click();
		waitForSeconds(2);
		
//		
//		WebElement ele = driver.findElement(By.xpath("//button[text()='Submit Form']")); //To move an element write such program when dropdown override to other page//
//		Actions act =new  Actions(driver);
//		act.moveToElement(ele).build().perform();
//		
		
		WebElement togglelinguistictranslatorOther = driver.findElement(By.xpath("//span[text()='Linguist Contractor']//..//..//..//..//..//..//..//span[@title='Transcription']"));  
		//act.moveToElement(togglelinguistictranslatorOther).build().perform();
		togglelinguistictranslatorOther.click();
		waitForSeconds(1);
		
//		WebElement Translator_other_type__c = driver.findElement(By.xpath("//Input[@name='Translator_other_type__c']"));
//		Translator_other_type__c.sendKeys("Other_security_location__c");

		WebElement toggleembeddedwithforward  = driver.findElement(By.xpath("//span[(text()='Is any work embedded with forward operating units?')]"));
		toggleembeddedwithforward.click();
		
		
		WebElement Translator_Mobile_work__c = driver.findElement(By.xpath("//Input[@name='Translator_Mobile_work__c']"));
		Translator_Mobile_work__c.sendKeys("Translator_Mobile_work__c");
	
	
		
		WebElement togglermourrequiredtobeworn = driver.findElement(By.xpath("//span[text()='Linguist Contractor']//..//..//..//span[(text()='Is body armour required to be worn?')]"));
		togglermourrequiredtobeworn.click();
		waitForSeconds(2);
		
		WebElement Translator_Body_armour_description__c = driver.findElement(By.xpath("//textarea[@name='Translator_Body_armour_description__c']"));
		Translator_Body_armour_description__c.sendKeys("Translator_Body_armour_description__c");
	
		                               // Section ::: Requested Documents // 
		
		WebElement requestedTypeofOrganization = driver.findElement(By.xpath("//button[@name='requestedTypeofOrganization']"));
		requestedTypeofOrganization.click();
		
		WebElement toggleContractListing = driver.findElement(By.xpath("//span[@title='Contract Listing']"));  
		//act.moveToElement(togglelinguistictranslatorOther).build().perform();
		toggleContractListing.click();
		
		//Input[@name='Translator_Mobile_work__c']
		WebElement UploadFiles  = driver.findElement(By.xpath("//input[@name='fileUploader']"));
		UploadFiles.sendKeys("C:\\Users\\PC2\\eclipse-workspace\\SignalProject\\UploadFiles\\N2G LOGO.png");
		waitForSeconds(2);
		
		WebElement UploadFilesclickpdf  = driver.findElement(By.xpath("//input[@name='fileUploader']"));
		//UploadFilesclickpdf.click();
		UploadFiles.sendKeys("C:\\Users\\PC2\\eclipse-workspace\\SignalProject\\UploadFiles\\com222.pdf");
		waitForSeconds(2);
		
		WebElement UploadFilesclickdoc  = driver.findElement(By.xpath("//input[@name='fileUploader']"));
		//UploadFilesclickdoc.click();
		UploadFilesclickdoc.sendKeys("C:\\Users\\PC2\\eclipse-workspace\\SignalProject\\UploadFiles\\saurabh Venkaria -08-16-2023 12-14-06.docx");
		
		waitForSeconds(5);
		driver.quit();

//		Insurance Agency or Broker
//		Broker Title
//		First Name
//		Last Name
//		Broker Email
//		Broker Phone
//

	}
}
