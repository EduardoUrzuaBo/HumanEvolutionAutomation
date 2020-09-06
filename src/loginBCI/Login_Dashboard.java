package loginBCI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import element.elementLogin;

public class Login_Dashboard {

	private WebDriver driver;
	private static String baseUrl;
	
	
	public static void main(String[] args) {
		elementLogin login  = new elementLogin();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		baseUrl = "https://www.google.com/";
		driver.get(baseUrl);
		driver.findElement(By.xpath(login.rut)).sendKeys("23661067-5");
		driver.findElement(By.xpath(login.contraseña)).sendKeys("alia2019");
		driver.findElement(By.xpath(login.ingresar)).click();
		
	}
	
}
