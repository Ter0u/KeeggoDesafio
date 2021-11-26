package br.com.keeggo.logic;

import org.openqa.selenium.By;
import br.com.keeggo.pages.LoginPage;

import org.junit.Assert;

public class LoginLogic extends LoginPage {
	
	public void preencheLogin() {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Browser.findElement(By.xpath("//input[@id='email']")).sendKeys("brutus123@gmail.com");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Browser.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123456");

		
	}

	public void clicaRealizarLogin() {
		Browser.findElement(By.xpath("//p[@class='submit']//button[@id='SubmitLogin']")).click();

		
	}

	public void verificoLoginRealizado() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertTrue(Browser.getPageSource().contains("My account"));

		
	}
	
}
