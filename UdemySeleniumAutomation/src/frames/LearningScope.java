package frames;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LearningScope {

	public static void main(String[] args) throws InterruptedException {
		//1) Give me the count of links on the page 
		//2) Count of footer section-
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//3
		WebElement coloumDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumDriver.findElements(By.tagName("a")).size());

		
		//4) Click on each link in the coloumn and check if the page are opening 
		
		for( int i=1; i< coloumDriver.findElements(By.tagName("a")).size();i++) {
			
			
			 String clickonLinkTab  = Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
			
			Thread.sleep(5000L);
		}
			Set<String> abc = driver.getWindowHandles();
			Iterator<String> it = abc.iterator();
			
			while(it.hasNext())
			{
				
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
			
		}
		
	}


