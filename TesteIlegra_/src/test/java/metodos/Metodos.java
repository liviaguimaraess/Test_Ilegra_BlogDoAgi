package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import driver.Drivers;

public class Metodos extends Drivers {
	/**
	 * Método para escrever passando o parametro By
	 * @param elemento
	 * @param texto
	 */
	public void escrever (By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
			
		}catch (Exception e) {
			System.err.println("Erro ao tentar clicar no elemento" + elemento);
		}
	}
/**
 * Método para clicar passando o parametro By
 * @param elemento
 */
	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
			
		}catch (Exception e) {
			System.err.println("Erro ao tentar clicar no elemento" + elemento);
		}
	}
	/**
	 * Método para validar url capturada
	 * @param urlDesejada
	 */
	public void CurrentUrl(String urlDesejada) {
		try {
		assertEquals(urlDesejada, driver.getCurrentUrl());
		}catch (Exception e) {
			System.err.println("Erro ao tentar validar a url desejada" + urlDesejada);
		}
	}
}
