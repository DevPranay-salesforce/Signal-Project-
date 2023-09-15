package Defence.Base.Administrator.Applicationform;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DevSignalOppCreation {
	public static WebDriver driver;

	public static WebDriver setChromeDriver() {
		ChromeOptions options = new ChromeOptions(); //To stop notification when browser is open.
        options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver(options);
	}
 
	public static void clickElementWithJS(WebElement element) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", element);
	}

	
	 private static final String filePath = "C:\\Users\\PC2\\eclipse-workspace\\SignalProject\\UploadFiles\\SubmissionDataRandWte.properties";
  
	 // Function to read data from the properties file
	    public static String readProperty(String key) {
	        try (FileInputStream fileInput = new FileInputStream(filePath)) {
	            
	        	Properties properties = new Properties();
	            properties.load(fileInput);

	            return properties.getProperty(key);
	        } catch (IOException e) {
	            e.printStackTrace();
	            return null;
	        }
	    }

	    // Function to write data to the properties file
	    public static void writeProperty(String key, String value) {
	        try (FileOutputStream fileOutput = new FileOutputStream(filePath)) {
	            Properties properties = new Properties();

	            // Load existing properties
	            try (FileInputStream fileInput = new FileInputStream(filePath)) {
	                properties.load(fileInput);
	            } catch (IOException e) {
	                // File may not exist yet, ignore
	            }

	            // Set the new key-value pair
	            properties.setProperty(key, value);

	            // Save the properties to the file
	            properties.store(fileOutput, "Updated properties");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
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
		//System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = DevSignalOppCreation.setChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		waitForSeconds(5);
	}

	public static void toVerifyCreateAnApplicationData() {

		// https://signalmutualindemnity--dev.sandbox.my.site.com/s/
		// https://signalmutualindemnity--dev.sandbox.lightning.force.com/
		String url = "https://test.salesforce.com/";
	    String userName = "saurav.vekariya@psadvisory.com.signal";
		String password = "MissionSignal@1234567";
		
//		String url = "https://signalmutualindemnity--dev.sandbox.my.site.com/s/";
//		String userName = "saurav.vekariya@psadvisory.com.signal";
//		String password = "MissionSignal@1234567";
//		 

		DevSignalOppCreation.setBrowser(url);
		// waitForSeconds(2);

		WebElement loginusername = driver.findElement(By.xpath("//Input[@id='username']"));
		loginusername.click();
		loginusername.sendKeys(userName);
		waitForSeconds(2);

		WebElement loginPwd= driver.findElement(By.xpath("//Input[@id='password']"));
		loginPwd.click();
		loginPwd.sendKeys(password);
		waitForSeconds(2);

		WebElement LoginButton= driver.findElement(By.xpath("//input[@id='Login']"));
		LoginButton.click();
		waitForSeconds(10);
		
		List<WebElement> AllTabCls = driver.findElements(By.xpath("//button[contains(@class,'slds-button slds-button_icon slds-button_icon-x-small slds-button_icon-container')]"));
		waitForSeconds(2);
		
		int totalTabs = AllTabCls.size();
		
       for (int i=1; i<=totalTabs; i++) {
    	   List<WebElement> AllTabCls1 = driver.findElements(By.xpath("//button[contains(@class,'slds-button slds-button_icon slds-button_icon-x-small slds-button_icon-container')]"));
    	   if(AllTabCls1.size()>0) {
    	   AllTabCls1.get(0).click();}
    	   waitForSeconds(5);
    	   }
        
		
	    
	

		WebElement setupClick= driver.findElement(By.xpath("//lightning-icon[@icon-name='utility:setup']"));
		setupClick.click();
		waitForSeconds(5);
		
		WebElement ClickSetupClick= driver.findElement(By.xpath("//a[@data-id='related_setup_app_home']//span[text()='Setup']"));
		ClickSetupClick.click();
		waitForSeconds(10);
		
		
		ArrayList<String> handles = new ArrayList<>(driver.getWindowHandles()); ///***use for switch to new window, and avoid scroll x- path***///
		driver.switchTo().window(handles.get(1));
		waitForSeconds(2);
		
		
		WebElement QuickFindClick= driver.findElement(By.xpath("//input[@placeholder='Quick Find']"));
		QuickFindClick.sendKeys("Users");
		waitForSeconds(5);
		
		WebElement UsersQuickFindClick= driver.findElement(By.xpath("//li[@data-node-id='ManageUsers']//mark[text()='Users']"));
		UsersQuickFindClick.click();
		waitForSeconds(15);
		 
		driver.switchTo().frame(0); // Syntax used for i-frame.(To enter in i- frame.)
		waitForSeconds(10);
		WebElement elem = driver.findElement(By.xpath("//span[text()='I']")); 
		elem.click();
		waitForSeconds(15);
		
		driver.switchTo().defaultContent(); //Syntax used for out from i-frame.In same frame, script not run that time first out from i-frame then taking entry in this i frame
		waitForSeconds(2);
		
		driver.switchTo().frame(0);
		WebElement UWClick= driver.findElement(By.xpath("//a[contains(@title,'Iams, Bert') and text()='Login']"));
		UWClick.click();
		waitForSeconds(10);
		
		ArrayList<String> move = new ArrayList<>(driver.getWindowHandles()); ///***use for switch to new window, and avoid scroll x- path***///
		driver.switchTo().window(move.get(2));
		waitForSeconds(2);
		
		WebElement AppLauncher= driver.findElement(By.xpath("//div[@class='appLauncher slds-context-bar__icon-action']//button"));
		clickElementWithJS(AppLauncher);
		waitForSeconds(2);
		
		
		WebElement searchAppItem= driver.findElement(By.xpath("//Input[@placeholder='Search apps and items...']"));
		searchAppItem.sendKeys("Underwriter Console");
		waitForSeconds(10);
		
		WebElement UnderwrSelct= driver.findElement(By.xpath("//b[text()='Underwriter Console']"));
		UnderwrSelct.click();
		waitForSeconds(10);
		
		WebElement AppLauncherOne= driver.findElement(By.xpath("//div[@class='appLauncher slds-context-bar__icon-action']//button"));// x-path for icon
		clickElementWithJS(AppLauncherOne);
		waitForSeconds(2);
		
		WebElement searchAppItemFirst= driver.findElement(By.xpath("//Input[@placeholder='Search apps and items...']"));
		searchAppItemFirst.sendKeys("Submissions");
		waitForSeconds(10);
		
		WebElement Submissionclick= driver.findElement(By.xpath("//b[text()='Submissions']")); 
		Submissionclick.click();
		waitForSeconds(10);
		
		WebElement SubmissionViewclick= driver.findElement(By.xpath("//button[@title='Select a List View: Submissions']"));
		SubmissionViewclick.click();
		waitForSeconds(5);//////////
		
		WebElement ListViewAllclick= driver.findElement(By.xpath(" //span[text()='All']"));
		ListViewAllclick.click();
		waitForSeconds(5);
		

		WebElement InSubSearch= driver.findElement(By.xpath("//Input[@name='vlocity_ins__Application__c-search-input']"));
		InSubSearch.click();
		waitForSeconds(5);
		InSubSearch.sendKeys(readProperty("Member Account key"),Keys.ENTER); 
		
		waitForSeconds(15);
       
        
        WebElement SubmitAppClick= driver.findElement(By.xpath("//a[@title='"+readProperty("Member Account key")+"']"));
		SubmitAppClick.click();
		waitForSeconds(5);
		

        String str = DevSignalOppCreation.readProperty("Member Account key");
        System.out.println("Read The data sucessfully:"+str);
        WebElement Organize = driver.findElement(By.xpath("//lightning-formatted-text[@data-output-element-id='output-field']"));
	    String text = Organize.getText();
	    System.out.println("Text from the WebElement: " + text);
	    if (str.equals(text)) {
	        System.out.println("The name of organisation is equal.");
	    } else {
	        System.out.println("The name of organisation is not equal.");
	    }
		
		
		
		

		WebElement SubmitforApprovalButton= driver.findElement(By.xpath("//button[text()='Submit for Approval']"));
		clickElementWithJS(SubmitforApprovalButton);
		waitForSeconds(5);
		
		WebElement  SubmitforApprCommentButton= driver.findElement(By.xpath("//textarea[@role='textbox']"));
		SubmitforApprCommentButton.sendKeys("!!!!!!!!!!!!!!!!!!!!!!..Updated..!!!!!!!!!!!!!!!!!!!!!");
		waitForSeconds(10);
		
		WebElement  SubmitforApprSubButton= driver.findElement(By.xpath("//h2[text()='Submit for Approval']//..//..//..//span[text()='Submit']"));
		SubmitforApprSubButton.click();
		waitForSeconds(10);
		


		
		WebElement AppLauncherTwo= driver.findElement(By.xpath("//div[@class='appLauncher slds-context-bar__icon-action']//button"));//****New****//
		clickElementWithJS(AppLauncherTwo);
		waitForSeconds(10);
		
		WebElement SearchAppItemSecond= driver.findElement(By.xpath("//Input[@placeholder='Search apps and items...']"));
		SearchAppItemSecond.sendKeys("Approval Requests");
		waitForSeconds(10);
		
		WebElement ApprovalRequestClick= driver.findElement(By.xpath("//p[b='Approval Requests']"));
		ApprovalRequestClick.click();
		waitForSeconds(10);
		
		ArrayList<String> moveon = new ArrayList<>(driver.getWindowHandles()); ///***use for switch to new window, and avoid scroll x- path***///
		driver.switchTo().window(moveon.get(2));
		waitForSeconds(2);
		
		WebElement ClickToApprovalRequest= driver.findElement(By.xpath("//a[@title='PranaySignal11']"));
		ClickToApprovalRequest.click();
		waitForSeconds(10);

        driver.quit();

 
	}
}
