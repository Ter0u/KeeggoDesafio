package br.com.keeggo.logic;

import org.openqa.selenium.By;
import br.com.keeggo.pages.CadastroPage;
import org.junit.Assert;

public class CadastroLogic extends CadastroPage{
	
	public void preencheEmail() {
		Browser.findElement(By.id("//input[@id='email_create']")).sendKeys("babaluu@gmail.com");
	}
	
	
	public void clicaCadastro() {
		Browser.findElement(By.xpath("//div[@class='submit']//button[@class='btn btn-default button button-medium exclusive']")).click();
		
	}
	
	
	public void verificaMenuCadastro() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertTrue(Browser.getPageSource().contains("Your personal information"));
		
	}
	
	
	public void preencheFormularioDeCadastro() {
		Browser.findElement(By.xpath("//input[@id='id_gender1']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Browser.findElement(By.id("customer_firstname")).sendKeys("Eris");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Browser.findElement(By.id("customer_lastname")).sendKeys("Greyrat");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Browser.findElement(By.id("passwd")).sendKeys("batata123");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Browser.findElement(By.xpath("//select[@id='days']//option[@value='25']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Browser.findElement(By.xpath("//select[@id='months']//option[@value='5']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Browser.findElement(By.xpath("//select[@id='years']//option[@value='2000']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Browser.findElement(By.id("address1")).sendKeys("Lisboa avenue 128");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Browser.findElement(By.id("city")).sendKeys("São Paulo");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Browser.findElement(By.xpath("//select[@id='id_state']//option[@value='11']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Browser.findElement(By.id("postcode")).sendKeys("12345");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Browser.findElement(By.id("phone_mobile")).sendKeys("11 98328 3708");
		
	}
	
	
	public void clickRealizarCadastro() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Browser.findElement(By.xpath("//button[@id='submitAccount']")).click();

	}
	
	
	public void verificaCadastroConcluido() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertTrue(Browser.getPageSource().contains("My account"));
		
	}
	
	
}
