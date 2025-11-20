package dropdowns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UpdatedsDropDown {

	public static void main(String[] args)  throws InterruptedException {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

	        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	        driver.findElement(By.id("divpaxinfo")).click();
	        Thread.sleep(2000L);

	        //int i=1;
//	        while ((i<5)){
//	            driver.findElement(By.id("hrefDecAdt")).click();
//	            i++;
//	        }
	        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	        for (int i = 1; i < 5; i++) {

	                driver.findElement(By.id("hrefIncAdt")).click();
	            }
	            driver.findElement(By.id("btnclosepaxoption")).click();

	            System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	        }
	    

	}


