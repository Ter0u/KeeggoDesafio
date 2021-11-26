package br.com.keeggo.steps;

import io.cucumber.java.After;
import br.com.keeggo.logic.CadastroLogic;
import br.com.keeggo.pages.MenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroSteps {
	
	private MenuPage paginaInicio;
	private CadastroLogic paginaDeCadastro;
	
	public CadastroSteps() {
		this.paginaInicio = new MenuPage();
		this.paginaDeCadastro = new CadastroLogic();
		
		
	}
	
	@After
	public void After() {
		this.paginaInicio.fechar();
	
	
	}
	
	@Given ("que acesso o site")
	public void acessoSite_Cadastro() {
		this.paginaInicio.verificaMenuInicio();
	
		
	}
	
	@When ("acesso o usuario")
	public void acessoUsuario_Cadastro() {
		this.paginaInicio.clicaLogin();
	
		
	}
	
	@And ("inicio criacao de cadastro")
	public void inicioCriacaoCadastro_Cadastro() {
		this.paginaInicio.verificaMenuLogin();
		this.paginaDeCadastro.preencheEmail();
		this.paginaDeCadastro.clicaCadastro();
	

	}
	
	@And ("preencho o formulario de cadastro")
	public void preenchoCadastro_Cadastro() {
		paginaDeCadastro.verificaMenuCadastro();
		paginaDeCadastro.preencheFormularioDeCadastro();
	
		
	}
	
	@And ("clico em cadastro")
	public void terminoCadastro_Cadastro() {
		this.paginaDeCadastro.clickRealizarCadastro();
	
	
	}
	
	@Then ("realizo cadastro com sucesso")
	public void finalizoCadastro_Cadastro() {
		this.paginaDeCadastro.verificaCadastroConcluido();
	
		
	}

	
}
