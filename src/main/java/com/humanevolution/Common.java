package com.humanevolution;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Common {
	WebDriver driver;
	public WebDriverWait wait;
	
	public Common(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void logger(String msj) {
		System.out.println(msj);
	}
	
	public void sendKeyElemento(By by ,String msj ,  String nombreElemento) {
		if(isElementPresent(by) == true) {
			driver.findElement(by).sendKeys(msj);
		}else {
			logger("No existe el elemento: "+nombreElemento);
			try {
				capturaPantalla();
			} catch (Exception e) {
				logger("Error al sacar evidencia ");
				
			}
		}
	}
	
	public void clicElemento(By by , String nombreElemento) {
		if(isElementPresent(by) == true) {
			driver.findElement(by).click();
		}else {
			logger("No existe el elemento: "+nombreElemento);
			try {
				capturaPantalla();
			} catch (Exception e) {
				logger("Error al sacar evidencia ");
			}	
		}
	}
	public void comprobarElemento(By by , String nombreElemento, Integer segundos) {
		esperaElemento(segundos);
		if(isElementPresent(by) == true) {
			logger("El elemento "+nombreElemento+" existe.");
		}else {
			logger("El elemento "+nombreElemento+" NO existe.");
			try {
				capturaPantalla();
			} catch (Exception e) {
				logger("Error al sacar evidencia ");
			}	
		}
	}
	
	public void capturaPantalla() throws Exception{
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		File screenshot = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("c:\\Evidencia\\evidencia.png"));
	}
	
	public static void esperaElemento(Integer time) {
		Integer operation = time * 1000;
		try {
			Thread.sleep(operation);
		} catch (InterruptedException e) {
			System.out.println("");
			Thread.currentThread().interrupt();
		}
	}
	
	public void comprobarElementoClickeable(By by) {
		esperaElemento(1);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	public void comprobarElementoVisible(By by) {
		esperaElemento(1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public boolean comprobarElementoDisplayed(By by) {
		esperaElemento(1);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by)).isDisplayed();
	}
	
	public boolean isElementPresent(By by){
        try{
            driver.findElement(by);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
	
}
