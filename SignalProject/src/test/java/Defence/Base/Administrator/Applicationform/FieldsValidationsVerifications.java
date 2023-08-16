package Defence.Base.Administrator.Applicationform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FieldsValidationsVerifications {
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

		FieldsValidationsVerifications.setBrowser(url);
		waitForSeconds(10);

		WebElement nameField46 = driver.findElement(By.xpath("//button[text()='Submit Form']")); // Replace with
		nameField46.click();
		waitForSeconds(2);

		WebElement nameField26 = driver.findElement(By.xpath("//div[text()='Please enter Name of Organization']")); // Replace
																													// with
		waitForSeconds(2);
		// Get the text of the element
		String actualText = nameField26.getText();
		// Validate the text
		String expectedText = "Please enter Name of Organization";

		if (actualText.equals(expectedText)) {
			System.out.println("Validation passed: " + actualText);
		} else {
			System.out.println("Validation failed. Expected: " + expectedText + ", Actual: " + actualText);
		}

		WebElement nameField27 = driver.findElement(By.xpath("//div[text()='Please enter Address']")); // Replace with
		waitForSeconds(2);
		// Get the text of the element
		String actualText1 = nameField27.getText();
		// Validate the text
		String expectedText1 = "Please enter Address";

		if (actualText1.equals(expectedText1)) {
			System.out.println("Validation passed: " + actualText1);
		} else {
			System.out.println("Validation failed.Expected: " + expectedText1 + ", Actual: " + actualText1);
		}
		WebElement toggleButton = driver
				.findElement(By.xpath("//span[(text()= 'Are you the prime contractor on these contracts?')]"));

		// Click the toggle button
		toggleButton.click();

		// Check the state of the toggle button
		boolean isToggledOn = toggleButton.isSelected();

		if (isToggledOn) {
			System.out.println("Toggle button is ON");
		} else {
			System.out.println("Toggle button is OFF");
		}

		driver.quit();
	}
}
