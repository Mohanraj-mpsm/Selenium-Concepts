package Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept extends KeyWords {
	
public static void main(String[] args) {
		
		try {
			
		
		String url = "https://demo.guru99.com/test/drag_drop.html";
		launch(url);
		maximize();
		
		WebElement drag = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		
		WebElement drop = driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).build().perform();
		
		WebElement drag1 = driver.findElement(By.xpath("(//a[contains(text(),'5000')])[2]"));
		WebElement drop1 = driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
		a.dragAndDrop(drag1, drop1).build().perform();
		
		WebElement drag2 = driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
		WebElement drop2 = driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
		a.dragAndDrop(drag2, drop2).build().perform();
		
		WebElement drag3 = driver.findElement(By.xpath("(//a[contains(text(),'5000')])[4]"));
		WebElement drop3 = driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
		a.dragAndDrop(drag3, drop3).build().perform();
		
		
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
	}


}
