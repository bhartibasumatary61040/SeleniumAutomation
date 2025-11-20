package fruitskart;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FruitsKart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		String [] itemsNeeded = {"Cucumber","Brocolli","Beetroot","Carrot"};
		
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
	}
	public static  void addItems(WebDriver driver , String [] itemsNeeded) {
		
		int j=0;
		
		 List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		 
		 for(int i =0; i<products.size(); i++) {
			 //Brocolli - 1 Kg
			 
			 
			String[] name =  products.get(i).getText().split("-");
			String formatedName = name[0].trim();
			
			
			List itemsNeededList  = Arrays.asList(itemsNeeded);
		
			if(itemsNeededList.contains(formatedName)) {
				j++;
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j== itemsNeeded.length) {
					break;
			

		 }
 
		 
		 }
		 }
	
	}
	}
	
	


