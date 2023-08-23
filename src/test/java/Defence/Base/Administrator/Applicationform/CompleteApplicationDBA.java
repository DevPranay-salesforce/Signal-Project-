package Defence.Base.Administrator.Applicationform;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CompleteApplicationDBA {
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
		driver = CompleteApplicationDBA.setChromeDriver();
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

		CompleteApplicationDBA.setBrowser(url);
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
		// waitForSeconds(5);

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
		waitForSeconds(10);

		                   // ************** Section:Add Additional Insured pop up******************* //

		WebElement AdditionalInsuredPopUp = driver.findElement(By.xpath("//button[text()='Add additional Insured']")); // Replace
		AdditionalInsuredPopUp.click();
		waitForSeconds(2);

		WebElement organizationName = driver.findElement(By.xpath("//input[@name='organizeName']")); // Replace
		organizationName.click();
		organizationName.sendKeys("organizeeName");
		// waitForSeconds(2);

		WebElement YearInBusiness = driver.findElement(By.xpath("//input[@name='yearInBusiness']")); // Replace
		YearInBusiness.click();
		YearInBusiness.sendKeys("87");
		// waitForSeconds(2);

		WebElement address = driver.findElement(By.xpath("//input[@name='address']")); // Replace
		address.click();
		address.sendKeys("Royal marg -87");
		// waitForSeconds(2);

		WebElement addressLine1 = driver.findElement(By.xpath("//input[@name='addressLine1']")); // Replace
		addressLine1.click();
		addressLine1.sendKeys("Royal marg -877");
		// waitForSeconds(2);

		WebElement city = driver.findElement(By.xpath("//input[@name='city']")); // Replace
		city.click();
		city.sendKeys("Raipur -877");
		// waitForSeconds(2);

		WebElement state = driver.findElement(By.xpath("//button[@name='state']"));
		state.click();
		waitForSeconds(2);
		// ("//span[text()='Security Contractor']//..//..//..//span[@title='Other']"));
		WebElement stateName = driver.findElement(
				By.xpath("//span[text()='Add Additional Insured']//..//..//..//..//span[@title='Alabama']"));
		stateName.click();
		// waitForSeconds(2);

		WebElement typeofOrganization = driver.findElement(By.xpath("//button[@name='typeofOrganization']"));
		typeofOrganization.click();
		waitForSeconds(2);

//		WebElement title = driver.findElement(By.xpath("//span[@title='LLC']"));  // Replace with
//		title.click();
//		waitForSeconds(1); 
//		
//		
//		typeofOrganization = driver.findElement(By.xpath("//button[@name='typeofOrganization']")); // Replace with
//		typeofOrganization.click();
//		waitForSeconds(2);

		WebElement typeofOrganizationOther = driver
				.findElement(By.xpath("//span[text()='Add Additional Insured']//..//..//..//..//span[@title='Other']"));
		typeofOrganizationOther.click();
		waitForSeconds(1);

		WebElement otherTypeofOrganization = driver.findElement(By.xpath("//input[@name='otherTypeofOrganization']"));
		otherTypeofOrganization.click();
		otherTypeofOrganization.sendKeys("otherTypeofOrganization");
		waitForSeconds(1);

		WebElement AddRecord = driver.findElement(By.xpath("//button[text()='Add Record']")); // Replace
		AddRecord.click();
		waitForSeconds(10);
		
		         // ************ Section:Broker Information***************** //

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
		waitForSeconds(10);

//		 WebElement toggleButton = driver.findElement(By.xpath("//span[(text()= 'Specific Contracts as Listeds?')]"));
//
//			// Click the toggle button
//			toggleButton.click();

		// ******************* Section: Contract Information *****************//

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

		// [ This syntax is used when showing error like: " Elements are not
		// intractable."]//

		WebElement primeContractCountry = driver.findElement(
				By.xpath("//span[text()='Contract Information']//..//..//..//button[@name=\"primeContractCountry\"]"));
		primeContractCountry.click();
		// waitForSeconds(2);

		WebElement States = driver.findElement(
				By.xpath("//span[text()='Contract Information']//..//..//..//span[@title='United Kingdom']"));
		clickElementWithJS(States);
		// States.click();
		waitForSeconds(10);

		             // ***************Contract Information::Add Contract pop// up*********************//

		
		WebElement buttonAddContract = driver.findElement(By.xpath("//button[text()='Add Contract']")); // Replace
		buttonAddContract.click();
		waitForSeconds(2);

		WebElement proposedEffectiveDateContract = driver.findElement(By.xpath("//input[@name='proposedEffectiveDate']")); // Replace
		proposedEffectiveDateContract.click();
		proposedEffectiveDateContract.sendKeys("1/13/2023");

		WebElement requestedQuoteDateContract = driver.findElement(By.xpath("//input[@name='requestedQuoteDate']")); // Replace
		requestedQuoteDateContract.click();
		requestedQuoteDateContract.sendKeys("1/14/2023");
		waitForSeconds(2);

		WebElement typeofContractplist = driver.findElement(By.xpath("//button[@name='typeofContract']")); // Replace
		typeofContractplist.click();
		waitForSeconds(2);

		WebElement AddContractInformationOther = driver.findElement(
				By.xpath("//span[text()='Add Contract Information']//..//..//..//..//span[@title='Other']"));
		AddContractInformationOther.click();
		waitForSeconds(1);

		WebElement otherTypeofContract = driver.findElement(By.xpath("//input[@name='otherTypeofContract']"));
		otherTypeofContract.click();
		otherTypeofContract.sendKeys("otherTypeofContract");
		waitForSeconds(1);

		WebElement contractValue = driver.findElement(By.xpath("//input[@name='contractValue']"));
		contractValue.sendKeys("89");
		waitForSeconds(1);

		WebElement contractNumber = driver.findElement(By.xpath("//input[@name='contractNumber']"));
		contractNumber.sendKeys("7867");
		waitForSeconds(1);

		WebElement contractLength = driver.findElement(By.xpath("//input[@name='contractLength']"));
		contractLength.sendKeys("77");
		waitForSeconds(1);

		WebElement contractCountryplist = driver.findElement(By.xpath("//button[@name='contractCountry']")); // Replace
		contractCountryplist.click();
		waitForSeconds(2);

		WebElement contractCountryUS = driver.findElement(
				By.xpath("//span[text()='Add Contract Information']//..//..//..//..//span[@title='Aland Islands']"));
		contractCountryUS.click();
		waitForSeconds(5);

		WebElement ContractAddRecord = driver.findElement(
				By.xpath("//span[text()='Add Contract Information']//..//..//..//..//button[text()='Add Record']"));
		ContractAddRecord.click();
		waitForSeconds(5);

		WebElement toggleButton = driver
				.findElement(By.xpath("//span[(text()='Are you the prime contractor on these contracts?')]"));
		toggleButton.click();
		// waitForSeconds(2);

		WebElement toggleButtonorganization = driver
				.findElement(By.xpath("//span[(text()='Has the organization previously carried DBA coverage?')]"));
		toggleButtonorganization.click();
		// waitForSeconds(2);

		WebElement toggleButton1 = driver
				.findElement(By.xpath("//span[text()='Any work performed underground, underwater, or above 15 Ft?']"));
		toggleButton1.click();
		// waitForSeconds(2);

		WebElement textareaname1 = driver.findElement(By.xpath("//textarea[@name='Work_environment_description__c']"));
		textareaname1.sendKeys("Workenvironmentdescriptionc");
		// waitForSeconds(2);

		WebElement PrimetoggleButtono = driver
				.findElement(By.xpath("//span[(text()= 'If Prime Contractor, are subcontractors used?')]"));
		PrimetoggleButtono.click();
		// waitForSeconds(2);

		WebElement Subcontractorsvettingprocessc = driver
				.findElement(By.xpath("//textarea[@name='Subcontractors_vetting_process__c']"));
		Subcontractorsvettingprocessc.sendKeys("Subcontractorsvettingprocessc");
		// waitForSeconds(2);

		WebElement textareaname = driver.findElement(By.xpath("//textarea[@name='Description_of_operations__c']"));
		textareaname.sendKeys("Workenvironmentdescriptionc");
		waitForSeconds(5);

		// ***************Contract Information::Add Contract pop
		// up*********************//
//		WebElement buttonAddContract =driver.findElement(By.xpath("//button[text()='Add Contract']")); // Replace
//		buttonAddContract.click();
//		waitForSeconds(2);

		
		// ********** Section: Remuneration / Employee Information******************* //

		WebElement Country_Of_Operation__c = driver.findElement(By.xpath("//button[@name='Country_Of_Operation__c']"));
		Country_Of_Operation__c.click();
		// waitForSeconds(2);

		WebElement remuneration = driver.findElement(By.xpath(
				"//span[text()='Remuneration / Employee Information']//..//..//..//span[@title='United States']"));
		// clickElementWithJS(remuneration);
		remuneration.click();
		// waitForSeconds(5);

		WebElement Job_Description__c = driver.findElement(By.xpath("//input[@name='Job_Description__c']"));
		Job_Description__c.sendKeys("JobDescriptionc");
		// waitForSeconds(2);

		WebElement toggleremuneration = driver
				.findElement(By.xpath("//span[(text()='Include United States national employees')]"));
		toggleremuneration.click();
		// waitForSeconds(2);

		WebElement Number_US_national__c = driver.findElement(By.xpath("//input[@name='Number_US_national__c']"));
		Number_US_national__c.sendKeys("NumberUSnationalc");
		// waitForSeconds(2);

		WebElement Total_Remuneration_USN__c = driver.findElement(By.xpath("//input[@name='Total_Remuneration_USN__c']"));
		Total_Remuneration_USN__c.sendKeys("TotalRemunerationUSNc");
		// waitForSeconds(2);

		WebElement toggleremThirdCountry = driver.findElement(By.xpath("//span[(text()='Include Third-Country national employees ')]"));
		toggleremThirdCountry.click();
		// waitForSeconds(2);

		WebElement ThirdCountry = driver.findElement(By.xpath("//input[@name='Number_ThirdCountry_National__c']"));
		ThirdCountry.sendKeys("8521");
		// waitForSeconds(2);

		WebElement TotalRemunerationTCNc = driver.findElement(By.xpath("//input[@name='Total_Remuneration_TCN__c']"));
		TotalRemunerationTCNc.sendKeys("1569");
		// waitForSeconds(2);

		WebElement togglLocalnational = driver.findElement(By.xpath("//span[(text()=' Include Local national employees')]"));
		togglLocalnational.click();
		// waitForSeconds(2);

		WebElement Number_Local_National__c = driver.findElement(By.xpath("//input[@name='Number_Local_National__c']"));
		Number_Local_National__c.sendKeys("5454");

		WebElement Total_Remuneration_LN__c = driver.findElement(By.xpath("//input[@name='Total_Remuneration_LN__c']"));
		Total_Remuneration_LN__c.sendKeys("98787");
		waitForSeconds(10);

		// ********** Section::Add Remuneration / Employee Information******************* //
		

		WebElement buttonAddCountries = driver.findElement(By.xpath("//button[text()='Add Countries']")); 
		buttonAddCountries.click();
		
		WebElement countryOfOperation = driver.findElement(By.xpath("//button[@name='countryOfOperation']"));
		countryOfOperation.click();
		
		WebElement countryOfOperationPlist = driver.findElement(By.xpath("//span[text()='Add Remuneration / Employee Information']//..//..//..//..//span[@title='Afghanistan']"));
		countryOfOperationPlist.click();
		

		WebElement countryjobDescription = driver.findElement(By.xpath("//input[@name='jobDescription']"));
		countryjobDescription.sendKeys("countryjobDescription");
		
		WebElement togglecountryNE = driver.findElement(By.xpath("//span[text()='Add Remuneration / Employee Information']//..//..//..//..//span[(text()='Include United States national employees')]"));
		togglecountryNE.click();

	    WebElement countryNumber_US_national__c = driver.findElement(By.xpath("//span[text()='Add Remuneration / Employee Information']//..//..//..//..//input[@name='Number_US_national__c']"));
		countryNumber_US_national__c.sendKeys("56");
		
		WebElement countryTotal_Remuneration_USN__c = driver.findElement(By.xpath("//span[text()='Add Remuneration / Employee Information']//..//..//..//..//input[@name='Total_Remuneration_USN__c']"));
		countryTotal_Remuneration_USN__c.sendKeys("5666");
		

		 
		 
			
		WebElement toggleAddThirdCountry = driver.findElement(By.xpath("//span[text()='Add Remuneration / Employee Information']//..//..//..//..//span[(text()=' Include Third-Country national employees ')]"));
		toggleAddThirdCountry.click();
		
				
		WebElement countryNumber_ThirdCountry_National__c = driver.findElement(By.xpath("//span[text()='Add Remuneration / Employee Information']//..//..//..//..//input[@name='Number_ThirdCountry_National__c']"));
		countryNumber_ThirdCountry_National__c.sendKeys("56");
			
		WebElement countryTotal_Remuneration_TCN__c = driver.findElement(By.xpath("//span[text()='Add Remuneration / Employee Information']//..//..//..//..//input[@name='Total_Remuneration_TCN__c']"));
		countryTotal_Remuneration_TCN__c.sendKeys("5666");
		
			
		WebElement toggleLocalnationalemployees= driver.findElement(By.xpath("//span[text()='Add Remuneration / Employee Information']//..//..//..//..//span[(text()=' Include Local national employees ')]"));
		toggleLocalnationalemployees.click();
		
	    WebElement countryNumber_Local_National__c = driver.findElement(By.xpath("//span[text()='Add Remuneration / Employee Information']//..//..//..//..//input[@name='Number_Local_National__c']"));
	    countryNumber_Local_National__c.sendKeys("56");
		
		WebElement countryTotal_Remuneration_LN__c = driver.findElement(By.xpath("//span[text()='Add Remuneration / Employee Information']//..//..//..//..//input[@name='Total_Remuneration_LN__c']"));
		countryTotal_Remuneration_LN__c.sendKeys("5666");

		WebElement AddRecordButton = driver.findElement(By.xpath("//span[text()='Add Remuneration / Employee Information']//..//..//..//..//button[text()='Add Record']")); // Replace
		AddRecordButton.click();
		waitForSeconds(10);
		
		
		                              //********** Section:Additional Contract Information***********//
		
		WebElement togglemployeesutilized = driver.findElement(By.xpath("//span[(text()='Are tenured employees utilized for contract?')]"));
		togglemployeesutilized.click();

		WebElement toggleemploymentwithcompany = driver.findElement(By
				.xpath("//span[(text()='Will employees retain employment with company after contract is complete?')]"));
		toggleemploymentwithcompany.click();

		WebElement toggleEEscarry = driver.findElement(By.xpath("//span[(text()='Do any EEs carry firearms? ')]"));
		toggleEEscarry.click();

		WebElement Firearms_details__c = driver.findElement(By.xpath("//textarea[@name='Firearms_details__c']"));
		Firearms_details__c.sendKeys("Firearmsdetailsc");

		WebElement toggleprovidedprior = driver
				.findElement(By.xpath("//span[(text()='Are physicals provided prior to deployment?')]"));
		toggleprovidedprior.click();

		WebElement textareaPhysicalsprovided = driver
				.findElement(By.xpath("//textarea[@name='Physicals_provided_description__c']"));
		textareaPhysicalsprovided.sendKeys("Physicalsprovideddescriptionc");

		WebElement togglepsychiatric = driver
				.findElement(By.xpath("//span[(text()='Is psychiatric pre-screening completed prior to departure?')]"));
		togglepsychiatric.click();

		WebElement textareaprescreening = driver
				.findElement(By.xpath("//textarea[@name='Psychiatric_prescreening_description__c']"));
		textareaprescreening.sendKeys("Psychiatricprescreeningdescriptionc");

		WebElement togglescreenings = driver
				.findElement(By.xpath("//span[(text()='Are post deployment screenings completed?')]"));
		togglescreenings.click();

		WebElement textareadeployment = driver
				.findElement(By.xpath("//textarea[@name='Post_deployment_screenings_description__c']"));
		textareadeployment.sendKeys("Postdeploymentscreeningsdescriptionc");

		WebElement togglemedicalinsurance = driver
				.findElement(By.xpath("//span[(text()='Are EEs provided with non-work-related medical insurance?')]"));
		togglemedicalinsurance.click();

		WebElement concentration = driver.findElement(By.xpath("//input[@name='Maximum_flight_concentration__c']"));
		concentration.sendKeys("5454");
		 waitForSeconds(10);

		                       //************* Section :::Employee Housing*******************//


		WebElement toggleemployeehoused= driver.findElement(By.xpath("//span[(text()='Are employees housed on base?')]"));
		toggleemployeehoused.click();
		

		WebElement textareaTypeofhousing = driver.findElement(By.xpath("//textarea[@name='Type_of_housing__c']"));
		textareaTypeofhousing.sendKeys("textareaTypeofhousing");

		WebElement textareaTransporttoworkc = driver.findElement(By.xpath("//textarea[@name='Transport_to_work__c']"));
		textareaTransporttoworkc.sendKeys("textareaTransporttoworkc");
		// waitForSeconds(5);

		WebElement textareaDistance_to_work__c = driver
				.findElement(By.xpath("//textarea[@name='Distance_to_work__c']"));
		textareaDistance_to_work__c.sendKeys("Distancetoworkc");
		// waitForSeconds(5);

		WebElement textareaTransportation_concentration__c = driver
				.findElement(By.xpath("//textarea[@name='Transportation_concentration__c']"));
		textareaTransportation_concentration__c.sendKeys("textareaTransportation_concentration__c");
		// waitForSeconds(5);

		WebElement textareaTransport_security__c = driver
				.findElement(By.xpath("//textarea[@name='Transport_security__c']"));
		textareaTransport_security__c.sendKeys("textareaTransportsecurityc");
		waitForSeconds(10);

		                      //******************* Section ::: Flight Contractor************** //

		WebElement toggleflightcontractor = driver
				.findElement(By.xpath("//span[(text()='Are you a flight contractor?')]"));
		toggleflightcontractor.click();
		waitForSeconds(1);

		WebElement toggleaircraftahelicopter = driver
				.findElement(By.xpath("//span[(text()='Is the aircraft a helicopter?')]"));
		toggleaircraftahelicopter.click();
		waitForSeconds(1);

		WebElement toggleservicetheaircraft = driver
				.findElement(By.xpath("//span[(text()='Do you also service the aircraft?')]"));
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

		WebElement Location_of_base_for_flights__c = driver
				.findElement(By.xpath("//input[@name='Location_of_base_for_flights__c']"));
		Location_of_base_for_flights__c.sendKeys("Location_of_base_for_flights__c");
		waitForSeconds(1);

		WebElement Flight_destination__c = driver.findElement(By.xpath("//input[@name='Flight_destination__c']"));
		Flight_destination__c.sendKeys("Flight_destination__c");
		waitForSeconds(10);
		
		                         //************* Section :::Security Contractor*************** //

		WebElement toggleecurityContract = driver
				.findElement(By.xpath("//span[(text()='Are you a Security Contractor?')]"));
		toggleecurityContract.click();
		waitForSeconds(1);

		WebElement toggleAreYourEEsarmed = driver.findElement(By.xpath("//span[(text()='Are your EEs armed?')]"));
		toggleAreYourEEsarmed.click();
		waitForSeconds(1);

		WebElement togglebodyarmour = driver
				.findElement(By.xpath("//span[(text()='Is body armour required to be worn?')]"));
		togglebodyarmour.click();
		waitForSeconds(1);

		WebElement Security_Body_armour_description__c = driver
				.findElement(By.xpath("//textarea[@name='Security_Body_armour_description__c']"));
		Security_Body_armour_description__c.sendKeys("textareaTransportsecurityc");

		WebElement Security_Mobile_work__c = driver.findElement(By.xpath("//input[@name='Security_Mobile_work__c']"));
		Security_Mobile_work__c.sendKeys("12");
		waitForSeconds(1);

		WebElement Security_location__c = driver.findElement(By.xpath("//button[@name='Security_location__c']"));
		Security_location__c.click();
		waitForSeconds(2);

		WebElement titleOtherSecurity = driver
				.findElement(By.xpath("//span[text()='Security Contractor']//..//..//..//span[@title='Other']"));
		titleOtherSecurity.click();

		WebElement Other_security_location__c = driver
				.findElement(By.xpath("//Input[@name='Other_security_location__c']"));
		Other_security_location__c.sendKeys("Other_security_location__c");
		waitForSeconds(10);

		                       //***************** Section :::Linguist Contractor*****************//
		

		WebElement togglelinguistictranslator = driver
				.findElement(By.xpath("//span[(text()='Are you a linguistic/translator contractor?')]"));
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
		// act.moveToElement(togglelinguistictranslatorOther).build().perform();
		togglelinguistictranslatorOther.click();
		waitForSeconds(1);

//		WebElement Translator_other_type__c = driver.findElement(By.xpath("//Input[@name='Translator_other_type__c']"));
//		Translator_other_type__c.sendKeys("Other_security_location__c");

		WebElement toggleembeddedwithforward = driver.findElement(By.xpath("//span[(text()='Is any work embedded with forward operating units?')]"));
		toggleembeddedwithforward.click();

		WebElement Translator_Mobile_work__c = driver.findElement(By.xpath("//Input[@name='Translator_Mobile_work__c']"));
		Translator_Mobile_work__c.sendKeys("Translator_Mobile_work__c");

		WebElement togglermourrequiredtobeworn = driver.findElement(By.xpath("//span[text()='Linguist Contractor']//..//..//..//span[(text()='Is body armour required to be worn?')]"));
		togglermourrequiredtobeworn.click();
		waitForSeconds(2);

		WebElement Translator_Body_armour_description__c = driver.findElement(By.xpath("//textarea[@name='Translator_Body_armour_description__c']"));
		Translator_Body_armour_description__c.sendKeys("Translator_Body_armour_description__c");
		

		                    //************** Section ::: Requested Documents********************* //

		WebElement requestedTypeofOrganization = driver.findElement(By.xpath("//button[@name='requestedTypeofOrganization']"));
		requestedTypeofOrganization.click();

		WebElement toggleContractListing = driver.findElement(By.xpath("//span[@title='Contract Listing']"));
		// act.moveToElement(togglelinguistictranslatorOther).build().perform();
		toggleContractListing.click();

		WebElement UploadFiles = driver.findElement(By.xpath("//input[@name='fileUploader']"));
		UploadFiles.clear();
		UploadFiles.sendKeys("C:\\Users\\PC2\\eclipse-workspace\\SignalProject\\UploadFiles\\N2G LOGO.png");
		waitForSeconds(8);

		WebElement ButtonDoneone = driver.findElement(By.xpath("//span[text()='Done']"));
		ButtonDoneone.click();
		waitForSeconds(1);

		WebElement UploadFilesclickpdf = driver.findElement(By.xpath("//input[@name='fileUploader']"));
		UploadFilesclickpdf.clear();
		UploadFilesclickpdf.sendKeys("C:\\Users\\PC2\\eclipse-workspace\\SignalProject\\UploadFiles\\com222.pdf");
		waitForSeconds(8);

		List<WebElement> ButtonDonesecond = driver.findElements(By.xpath("//span[text()='Done']"));
		ButtonDonesecond.get(0).click();
		waitForSeconds(1);

		WebElement UploadFilesclickdoc = driver.findElement(By.xpath("//input[@name='fileUploader']"));
		UploadFilesclickdoc.clear();
		UploadFilesclickdoc.sendKeys("C:\\Users\\PC2\\eclipse-workspace\\SignalProject\\UploadFiles\\DBAInvoiceDocument.docx");
		waitForSeconds(8);

		List<WebElement> ButtonDone = driver.findElements(By.xpath("//span[text()='Done']"));
		ButtonDone.get(0).click();
		waitForSeconds(1);

		
       //validate the fraud disclosure message //
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
				
		if (actualText.equals(expectedText)) {
			System.out.println("Validation passed: " + actualText);
		} else {
			System.out.println("Validation failed. Expected: " + expectedText + ", Actual: " + actualText);
		}
		
		WebElement buttonSubmitForm = driver.findElement(By.xpath("//button[text()='Submit Form']"));
		buttonSubmitForm.click();
		waitForSeconds(10);
		
		
		
		

//		WebElement submittedMessege = driver.findElement(By.xpath("//P[text()='The form is successfully submitted.']"));
//		submittedMessege.sendKeys("Other_security_location__c");
//		waitForSeconds(1);

		// Get the text of the element & Validate the text massage //

		WebElement ThankyouMessege = driver.findElement(By.xpath("//P[text()='Thank you']"));
		waitForSeconds(2);
		// Get the text of the element
		String actualTextt = ThankyouMessege.getText();
		// Validate the text
		String expectedTextt = "Thank you";
		if (actualText.equals(expectedTextt)) {
			System.out.println("Validation passed: " + actualTextt);
		} else {
			System.out.println("Validation failed. Expected: " + expectedTextt + ", Actual: " + actualTextt);
		}

		// Get the text of the element & Validate the text massage //

		WebElement successfullMessege = driver.findElement(By.xpath("//P[text()='The form is successfully submitted.']"));
		waitForSeconds(2);
		// Get the text of the element
		String actuallTextt = successfullMessege.getText();
		// Validate the text
		String expecteddTextt = "The form is successfully submitted.";
		if (actualText.equals(expecteddTextt)) {
			System.out.println("Validation passed: " + actuallTextt);
		} else {
			System.out.println("Validation failed. Expected: " + expecteddTextt + ", Actual: " + actuallTextt);
		}
		
		waitForSeconds(10);

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
