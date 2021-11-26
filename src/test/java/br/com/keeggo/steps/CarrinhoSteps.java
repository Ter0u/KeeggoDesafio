package br.com.keeggo.steps;

import io.cucumber.java.After;
import br.com.keeggo.logic.CarrinhoLogic;
import br.com.keeggo.logic.LoginLogic;
import br.com.keeggo.pages.MenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CarrinhoSteps {
	
	private MenuPage paginaInicio;
	private CarrinhoLogic paginaDeCarrinho;
	private LoginLogic paginaDeLogin;
	
	public CarrinhoSteps() {
		this.paginaDeCarrinho = new CarrinhoLogic();
		this.paginaInicio = new MenuPage();
		this.paginaDeLogin = new LoginLogic();
		
	}
	
	@After
	public void After() {
		this.paginaInicio.fechar();
	
	
	}
	
	@Given ("que entro no site")
	public void acessoSite() {
		this.paginaInicio.verificaMenuInicio();
	
	
	}
	
	@When ("que entro no usuario")
	public void acessoUsuario_Carrinho() {
		this.paginaInicio.clicaLogin();
	
	
	}
	
	@And ("realizo o login")
	public void realizoLogin_Carrinho() {
		this.paginaDeLogin.verificaMenuLogin();
		this.paginaDeLogin.preencheLogin();
		this.paginaDeLogin.clicaRealizarLogin();
		this.paginaDeLogin.verificoLoginRealizado();
	
	
	}
	
	@And ("procuro um item")
	public void procuroItem_Carrinho() {
		this.paginaDeCarrinho.procuraVestidos();
	
	
	}
	
	@And ("adiciono um item no carrinho")
	public void adicionoItemNoCarrinho_Carrinho() {
		this.paginaDeCarrinho.adicionaVestidoCarrinho();
	
	
	
	}
	
	@And ("acesso ao carrinho")
	public void terminoCadastro_Carrinho() {
		this.paginaDeCarrinho.verificaVestidoNoCarrinho();
		this.paginaDeCarrinho.entraNoCarrinho();;
		
	
	}
	
	@Then ("removo o item do carrinho")
	public void finalizoCadastro_Carrinho() {
		this.paginaDeCarrinho.removeProdutoDoCarrinho();
	
	
	}

}
