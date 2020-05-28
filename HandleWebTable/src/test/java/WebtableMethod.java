import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebtableMethod {

	public static WebDriver driver;
	
	@Test
	public void WebTableAdd(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\CCC\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		driver= new ChromeDriver();
				
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[2]/td[1]
		
		String Before_xpath= "//*[@id=\"customers\"]/tbody/tr[";
		String After_xpath= "]/td[1]";
		
		for(int i=2;i<7;i++) {
			String name = driver.findElement(By.xpath(Before_xpath+i+After_xpath)).getText();
			System.out.println(name);
			if(name.contains("shiv")) {
				
			}
		}
	}
}
