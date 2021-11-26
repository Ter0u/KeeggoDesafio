package br.com.keeggo.steps;

import io.cucumber.java.After;
import br.com.keeggo.logic.LoginLogic;
import br.com.keeggo.pages.MenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	private MenuPage paginaInicio;
	private LoginLogic paginaDeLogin;
	
	public LoginSteps() {
		this.paginaDeLogin = new LoginLogic();
		this.paginaInicio = new MenuPage();
		
		
	}
	
	@After
	public void After() {
		this.paginaInicio.fechar();
	
	
	}
	
	@Given ("que estou no site")
	public void acessoSite() {
		this.paginaInicio.verificaMenuInicio();
	
	
	}
	
	@When ("clico no usuario")
	public void acessoUsuario_Login() {
		this.paginaInicio.clicaLogin();
	
	
	}
	
	@And ("preencho o formulario de login")
	public void preenchoFormularioLogin_Login() {
		this.paginaInicio.verificaMenuLogin();
		this.paginaDeLogin.preencheLogin();
	
	
	}

	@And ("clico em login")
	public void clicoLogin_Login() {
		this.paginaDeLogin.clicaRealizarLogin();;
		this.paginaInicio = new MenuPage();
		
	
	}
	
	@Then ("realizo login com sucesso")
	public void realizoLoginComSucesso_Login() {
		this.paginaDeLogin.verificoLoginRealizado();
	
	
	}

}
