package testcases;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

	
	
	public class Agrichain { 
		

		@Test
		
		public static void  main(String[] args) {
		
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Eclipse_workspace\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		//url
		driver.get("https://agrichain.com ");
		
		//string input 
		driver.findElement(By.id("Enter_string_input")).sendKeys("12312112233");
	   //submit
		driver.findElement(By.name("Submit")).click();
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		
		  //Take the screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        //Copy the file to some location 
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Java\\SS\\output.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
       

		String actualOutput= driver.findElement(By.linkText("Output is:")).getText();
		String expectedOutput= ("Output is : 123");
		
		Assert.assertEquals(actualOutput,expectedOutput);
		
		
		
		//BackToHome
		driver.findElement(By.name("BackToHome")).click();
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		
        driver.close();
		
		}
		
	}
	
	
