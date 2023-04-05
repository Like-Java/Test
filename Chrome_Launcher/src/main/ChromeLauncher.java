package main;

// This is simple example code. Use selenium sources. If you use this framework please check in https://www.selenium.dev 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeLauncher {

	private WebDriver driver;
	private ChromeOptions options;
	
	public ChromeLauncher() {	
		
		options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); //Please be attention. If you forget this sentence it won't move current Chrome Launcher 
		driver = new ChromeDriver(options); //Launch GoogleChrome browser
		
		try {			
			driver.get("https://www.amazon.co.jp"); // this is example address. 
			WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")); //get path from inspector
			searchBar.sendKeys("pc parts"); //this is example content
			System.out.println(driver.getTitle()); //appeared title in terminal
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
