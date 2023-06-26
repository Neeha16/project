package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPage {

	public static void main(String[] args) {
		
		//step 1 lunch the browser
		
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(opt);
		
		//step 2 maximize the window
		driver.manage().window().maximize();
		
		//step 3 navigate to url
		driver.get("http://jitco-api.potents.in/20062023/home");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//step 4  click on launch the app
		driver.findElement(By.xpath("//a[@tabindex='0']")).click();
		
		//step 5 enter valid username
		driver.findElement(By.id("username"));
		
		//step 6 enter valid password
		driver.findElement(By.id("password"));
		
		//step 7 click on login
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
		
		//step 8 close app
		driver.close();

			
	}

}
