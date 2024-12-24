package TestDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class SelDemo {

	public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.edge.driver","C:\\Users\\charu.yadav01\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
     EdgeDriver driver=new EdgeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     driver.get("http://isvifastappt01/iFast/");
    
     System.out.println(driver.getTitle());
     System.out.println(driver.getCurrentUrl());
     
     driver.manage().window().maximize();
     driver.findElement(By.name("userName")).sendKeys("Nanmathy");
     
   driver.findElement(By.name("password")).sendKeys("ISTestng");
   
   driver.findElement(By.className("btn")).click(); 
   Thread.sleep(2000);
  //  System.out.println(driver.findElement(By.cssSelector("label.ng-binding")).getText());
   //label[text()='Invalid Password']
 String err= driver.findElement(By.xpath("//label[text()='Invalid Password']")).getText();
 System.out.println(err);
 Thread.sleep(2000);
 driver.quit();  


 
  
     
    		 //driver.close();
//it will show you the current url of the page//
	}

}
