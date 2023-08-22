package Browseropenandout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserloginAndOut {
	public static WebDriver driver;
	String Browser;

	public static void main(String[] args) throws InterruptedException {
		String browserName ="Chrome";
		String url="https://www.youtube.com/playlist?list=PLhW3qG5bs-L_s9HdC5zNshE5Ti8jABwlU";
		setBrowser(browserName,url);
		Thread.sleep(5000);
		driver.quit();
	}

	public static void setBrowser(String browserName,String url) throws InterruptedException {

		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); 
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			Thread.sleep(5000);
			driver.manage().window().minimize();
			Thread.sleep(10000);
		} else {
			driver.manage().window().minimize();
			System.out.println("######@@@@@@#####");
			
			System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		}
	}

}

package Defence.Base.Administrator.Applicationform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
public class DbaApplicationForm {
    public static WebDriver driver;

    public static void waitForSeconds(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
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
        String url = "https://signalmutualindemnity--dev.sandbox.lightning.force.com/";
        String userName = "nisarg.shihora@psadvisory.com.dev";
        String password = "Nisu@1999";

        // Method to launch the browser
        DbaApplicationForm.setBrowser(url);

        // Fill in the username and password
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);

        // Click the login button
        driver.findElement(By.id("Login")).click();

        // Wait for a few seconds after logging in (you can adjust the time as needed)
        waitForSeconds(10);

        // Perform further actions on the application form or navigate to other pages as needed

        // Close the browser
        driver.quit();
    }
}
*/
