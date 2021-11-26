package br.com.keeggo.pages;

import org.junit.Assert;
import org.openqa.selenium.By;


public class MenuPage extends WebBrowser {
		
	
	public void fechar() {
		Browser.quit();

		}
	
	public void verificaMenuInicio() {
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertTrue(Browser.getPageSource().contains("header_logo"));
		
		}
	
	
		public void clicaLogin() {
			Browser.findElement(By.xpath("//a[@class='login']")).click();
			
		}
		
		
		public void verificaMenuLogin() {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Assert.assertTrue(Browser.getPageSource().contains("Email address"));
			
		}
		
		public void preencheLogin() {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Browser.findElement(By.xpath("//input[@id='email']")).sendKeys("brutus123@gmail.com");
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Browser.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123456");

			
		}
		
}
