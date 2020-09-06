package com.humanevolition.poliglota;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import com.humanevolution.Common;
import com.humanevolution.Formularios;

public class FormularioPostularCafeteria {

	WebDriver driver;
	private static String baseUrl;
	
	@Test
	public void test() throws Exception {
		driver = new ChromeDriver();
		Formularios test  = new Formularios(driver);
		Common common  = new Common(driver);
		driver.manage().window().maximize();
		
		try {
			baseUrl = "https://www.poliglota.org/cl/";
			driver.get(baseUrl);
			
			
			// Formulario Postular Cafeteria
			test.llenarFormularioCafeteria();
			
			
		} catch (Exception e) {
			common.capturaPantalla();
			common.logger("Ha fallado el test");
		}finally {
			driver.close();
			driver.quit();
		}
		
	 }
    }


