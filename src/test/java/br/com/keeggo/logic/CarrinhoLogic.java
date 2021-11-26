package br.com.keeggo.logic;

import org.junit.Assert;
import org.openqa.selenium.By;
import br.com.keeggo.pages.CarrinhoPage;

public class CarrinhoLogic extends CarrinhoPage {
	
	public void procuraVestidos() {
		Browser.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("dresses");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Browser.findElement(By.xpath("//button[@name='submit_search']")).click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertTrue(Browser.getPageSource().contains("Top sellers"));

	}

	public void adicionaVestidoCarrinho() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Browser.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[1]/div")).click(); 
		// encurtar xpath
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Browser.findElement(By.xpath("//button[@name='Submit']")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertTrue(Browser.getPageSource().contains("Product successfully added to your shopping cart"));
		Browser.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertTrue(Browser.getPageSource().contains("Shopping-cart summary"));
		Browser.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertTrue(Browser.getPageSource().contains("Addresses"));
		Browser.findElement(By.xpath("//p[@class='cart_navigation clearfix']//button[@type='submit']")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertTrue(Browser.getPageSource().contains("Shipping"));
		Browser.findElement(By.xpath("//input[@type='checkbox']")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Browser.findElement(By.xpath("//p[@class='cart_navigation clearfix']//button[@type='submit']")).click();

	}

	public void verificaVestidoNoCarrinho() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertTrue(Browser.getPageSource().contains("In stock"));

	}

	public void entraNoCarrinho() {
		Browser.findElement(By.xpath("//a[@title='View my shopping cart']")).click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertTrue(Browser.getPageSource().contains("Shopping-cart summary"));

	}

	public void removeProdutoDoCarrinho() {
		Browser.findElement(By.xpath("//a[@title='Delete']")).click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertTrue(Browser.getPageSource().contains("Your shopping cart is empty."));

	}

}
