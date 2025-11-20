package website;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  WebDriver driver = new ChromeDriver();
	        driver.get("https://www.amazon.com/");

	        Actions a = new Actions(driver);

	        WebElement accountList = driver.findElement(By.cssSelector("#nav-link-accountList"));

	        a.moveToElement(accountList).build().perform();
		

	}

}
