package com.humanevolution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Formularios extends Common {
	
	/******************************************INPUT******************************************/
	public By inputRut =By.xpath("//input[@placeholder='RUT']");
	public By BtnXdescuentos =By.xpath("(//button[@class='ub-emb-close'])[1]");
	
	/******************************************FORMULARIO CONTACTANOS******************************************/
	public By BtnContactanos =By.xpath("(//a[@href='contactanos'])[1]");
	public By FormContactanos =By.xpath("//form[@id='form-contact']");
	public By inputNombreContactanos =By.xpath("//input[@id='contact-name']");
	public By inputTelefono =By.xpath("//input[@id='phone-contact']");
	public By inputEmail =By.xpath("//input[@id='contact-email']");
	
	public By selectIdioma =By.xpath("//select[@id='language_preference']");
	public By idiomaIngles =By.xpath("//select[@id='language_preference']//option[@value='4']");
	
	public By selectHome =By.xpath("//select[@id='home-place-cl']");
	public By optionProvidencia =By.xpath("//select[@id='home-place-cl']//option[@value='5928']");

	public By inputLocation =By.xpath("//input[@id='place-autocomplete']");
	public By motivoEstudio =By.xpath("//input[@id='contact-estudio']");
	
	public By mjeContacto =By.xpath("//textarea[@id='contact-message']");
	
	public By BtnSubmitContactanos =By.xpath("//button[@id='submit-button-contacts']");
	
	/******************************************FORMULARIO Descuentos******************************************/
	
	public By inputNombreDescuentos =By.xpath("//input[@id='name']");
	public By inputEmailDescuentos =By.xpath("//input[@id='email']");
	public By inputFonolDescuentos =By.xpath("//input[@id='phone']");	
	public By selectLenguajeDescuentos =By.xpath("//select[@id='preferred_language']");
	public By selectPrimeraOption =By.xpath("//select[@id='preferred_language']//option[2]");
	public By BtnEnviarDescuentos =By.xpath("//div[@id='lp-pom-root']//button[@type='submit']");
	public By MsjGracias =By.xpath("//span[contains(text(),'Gracias')]");
	
	/******************************************FORMULARIO Coach******************************************/
	public By BtnPostulaCoach =By.xpath("//a[contains(text(),'Postula como Coach')]");
	public By FormProfesor =By.xpath("//h3[contains(text(),'Postula como profesor')]");
	public By inputNombreCoach =By.xpath("//input[@id='candidate_first_name']");
	public By inputApellidoCoach =By.xpath("//input[@id='candidate_last_name']");
	public By inputDireccion =By.xpath("//input[@id='candidate_location_name']");
	public By selectLenguaje =By.xpath("//select[@id='candidate_native_language']");
	public By optionAfar =By.xpath("//select[@id='candidate_native_language']//option[@value='Afar']");
	public By selectLenguajeEnseñar =By.xpath("//select[@id='candidate_language_to_teach']");
	public By selectLenguajeGerman =By.xpath("//select[@id='candidate_language_to_teach']//option[@value='German']");
	public By selectNivel =By.xpath("//select[@id='candidate_level']");
	public By optionBasico =By.xpath("//select[@id='candidate_level']//option[@value='basico']");
	public By inputComoAprendiste =By.xpath("//textarea[@id='candidate_how_did_you_learn']");
	public By inputVividoEnExtranjero =By.xpath("//textarea[@id='candidate_foreign_history']");
	public By inputEmailFormCoach =By.xpath("//input[@id='candidate_email']");
	public By inputFonoFormCoach =By.xpath("//input[@id='candidate_phone']");
	public By inputPorQueFormCoach =By.xpath("//textarea[@id='candidate_why_poliglota']");
	public By BtnEnviarCoach =By.xpath("//button[@type='submit']");
	public By MjeExitoCoach =By.xpath("//div[contains(text(),'Pronto nos contactaremos contigo')]");
	
	/******************************************FORMULARIO Cafeteria******************************************/
	public By BtnPostulaCafeteria =By.xpath("//a[contains(text(),' Postula tu cafeter')]");
	public By inputNombreEmpr =By.xpath("//input[@id='responsible_name']");
	public By inputFonoEmpr =By.xpath("//input[@id='responsible_phone']");
	public By inputEmailEmpr =By.xpath("//input[@id='responsible_mail']");
	public By inputNombreCafeEmpr =By.xpath("//input[@id='coffee_name']");
	public By inputDireccionEmpr =By.xpath("//input[@id='coffee_autocomplete']");
	public By inputWebEmpr =By.xpath("//input[@id='contact_place_site']");
	public By inputDescribeEmpr =By.xpath("//textarea[@id='contact_place_description']");
	public By inputHoraMayorEmpr =By.xpath("//input[@id='contact_place_schedule_description']");
	public By inputHoraAtencionEmpr =By.xpath("//input[@id='contact_place_schedule']");
	public By porQueQuieresSerParte =By.xpath("//textarea[@id='abour_us_coffee']");
	public By queOfreces =By.xpath("//textarea[@id='contact_place_to_offer']");
	public By BtnEnviar =By.xpath("//section[@id='contact-us-coffee']//input[contains(@value,'Enviar')]");
	
	
	
	public Formularios(WebDriver driver) {
		super(driver);
	
	}
	
	public void LoginPoliglota() {
		sendKeyElemento(inputRut, "10265168-5", "Input Buscar");
		
	}
	
	public void llenarFormularioContactanos() throws Exception {
		
		comprobarElemento(BtnXdescuentos, "Boton x", 5);
		//capturaPantalla();
		clicElemento(BtnXdescuentos, "Boton X descuentos");
		
		clicElemento(BtnContactanos, "Boton Contactanos");
		
		comprobarElemento(FormContactanos, "Formulario Contactanos", 5);
		//capturaPantalla();
		
		//Se ingresa Nombre Completo
		sendKeyElemento(inputNombreContactanos, "Test Automatizado", "Nombre Formualario Contactanos");
		//Se ingresa Numero Telefono
		sendKeyElemento(inputTelefono, "+56978234483", "Telefono");
		//Se ingresa Email
		sendKeyElemento(inputEmail, "abc@test.com", "Email");
		//Se selecciona Idioma
		clicElemento(selectIdioma,"SE Selecciona Idioma");
		clicElemento(idiomaIngles,"Seleccion Idioma Ingles");
		clicElemento(selectIdioma,"SE Selecciona Idioma");
		
		//De donde Eres
		clicElemento(selectHome,"SE Selecciona Donde Vives");
		clicElemento(optionProvidencia,"SE Selecciona Providencia");
		clicElemento(selectHome,"SE Selecciona Donde Vives");
		
		sendKeyElemento(inputLocation, "Aachen, Alemania", "Se ingresa Location");
		
		clicElemento(motivoEstudio, "Motivo Estudio");
		
		sendKeyElemento(mjeContacto, "Test Automatizado", "Se ingresa Mensaje opcional");
		
		//capturaPantalla();
		clicElemento(BtnSubmitContactanos, "Boton Empieza a Aprender");
		
	}
	
public void llenarFormularioDescuentos() throws Exception {
		
		// Falidar Formulario Descuentos
		comprobarElemento(BtnXdescuentos, "Boton x", 5);
		
		
		driver.switchTo().frame(2); 
		
		
		//Se ingresa Nombre 
		sendKeyElemento(inputNombreDescuentos, "Test Automatizado", "Nombre Formualario Descuentos");
		
		//Se ingresa Email
		sendKeyElemento(inputEmailDescuentos, "abc@test.com", "Email Formualario Descuentos");
		
		//Se ingresa Fono
		sendKeyElemento(inputFonolDescuentos, "+56978034483", "Fono Formualario Descuentos");
		
		// Selecciona
		clicElemento(selectLenguajeDescuentos, "Select Idioma");
		clicElemento(selectPrimeraOption, "Primera Opcion");
		clicElemento(selectLenguajeDescuentos, "Select Idioma");
		
		//Click Enviar
		clicElemento(BtnEnviarDescuentos, "Clic Enviar");
		
		comprobarElemento(MsjGracias, " Gracias Pronto nos pondremos en contacto contigo", 3);
		
		//capturaPantalla();
		
	}

public void llenarFormularioCoach() throws Exception {
	
	comprobarElemento(BtnXdescuentos, "Boton x", 5);
	//capturaPantalla();
	clicElemento(BtnXdescuentos, "Boton X descuentos");
	
	//Click Boton Postulacion Coach
	clicElemento(BtnPostulaCoach, "Boton Postulacion Coach");
	
	// Validar Formulario Descuentos
	comprobarElemento(FormProfesor, "Formulario Postulacion Profesor", 8);
	
	//Se ingresa Nombre
	sendKeyElemento(inputNombreCoach, "Test Automatizado", "Nombre formulario Coach");
	//Se ingresa apellido
	sendKeyElemento(inputApellidoCoach, "Automatizado", "Apellido formulario Coach");
	
	//Se ingresa Direccion
	sendKeyElemento(inputDireccion, "Atlanta, Georgia, EE. UU.", "Direccion formulario Coach");
	
	//Select Lenguaje origen
	clicElemento(selectLenguaje, "Seleccion Lenguaje Nativo");
	clicElemento(optionAfar, "Seleccion opcion Afar");
	clicElemento(selectLenguaje, "Seleccion Lenguaje Nativo");
	
	// Select Lenguaje enseñar
	clicElemento(selectLenguajeEnseñar, "Click Lenguaje a enseñar");
	clicElemento(selectLenguajeGerman, "Option German");
	clicElemento(selectLenguajeEnseñar, "Click Lenguaje a enseñar");
	
	//Seleccionar Nivel
	clicElemento(selectNivel, "Select Nivel");
	clicElemento(optionBasico, "Opcion Basico");
	clicElemento(selectNivel, "Select Nivel");
	
	// Como aprendiste el idioma
	sendKeyElemento(inputComoAprendiste, "Test Automatizado", "TextArea como aprendiste el idioma");
	//Haz vivido en el extranjero
	sendKeyElemento(inputVividoEnExtranjero, "Test Automatizado", "TextArea has vivido en el extranjero");
	// Email
	sendKeyElemento(inputEmailFormCoach, "abc@test.com", "Email Coach");
	// Fono
	sendKeyElemento(inputFonoFormCoach, "+56978234483", "Fono Coach");
	// Fono
	sendKeyElemento(inputPorQueFormCoach, "Test Automatizado", "Por que te gustaria ser Coach");
	// Enviar
	clicElemento(BtnEnviarCoach, "Enviar Solicitud Coach");
	
	comprobarElemento(MjeExitoCoach, "Pronto nos contactaremos contigo", 5);
	
	//capturaPantalla();
}

public void llenarFormularioCafeteria() throws Exception {
	
	comprobarElemento(BtnXdescuentos, "Boton x", 5);
	//capturaPantalla();
	clicElemento(BtnXdescuentos, "Boton X descuentos");
	
	//Click Boton Postulacion Cafeteria
	clicElemento(BtnPostulaCafeteria, "Boton Postulacion Cafeteria");
	
	//Nombre
	sendKeyElemento(inputNombreEmpr, "Test Automatizado", "Nombre Formulario Empresa");
	
	//Fono
	sendKeyElemento(inputFonoEmpr, "+56978234483", "Fono Formulario Empresa");
	
	//Email
	sendKeyElemento(inputEmailEmpr, "abc@test.com", "Email Formulario Empresa");
	
	//Nombre Cafeteria
	sendKeyElemento(inputNombreCafeEmpr, "Nombre Test", "Nombre Cafeteria Formulario Empresa");
	
	//Direccion Cafeteria
	sendKeyElemento(inputDireccionEmpr, "Atlanta, Georgia, EE. UU.", "Direccion Cafeteria Formulario Empresa");
	
	//Web
	sendKeyElemento(inputWebEmpr, "www.test.com", "Direccion WEB Cafeteria Formulario Empresa");
	
	//Descripcion empresa
	sendKeyElemento(inputDescribeEmpr, "Test Automatizado", "Descripcion Cafeteria Formulario Empresa");
	
	//Horas Mayor Concurrencia empresa
	sendKeyElemento(inputHoraMayorEmpr, "13", "Horas de mayor concurrencia Cafeteria Formulario Empresa");
	
	//Horas Atencion empresa
	sendKeyElemento(inputHoraAtencionEmpr, "13", "Horas Atencion Cafeteria Formulario Empresa");
	
	//Por que quieres ser parte empresa
	sendKeyElemento(porQueQuieresSerParte, "Test Automatizado", "Por que quieres ser parte Cafeteria Formulario Empresa");
	
	//Que Ofreces
	sendKeyElemento(queOfreces, "Test Automatizado", "Que ofreces");
	
	//Click Boton Enviar
	clicElemento(BtnEnviar, "Click Boton Enviar");
	
	
	//capturaPantalla();
}
}
