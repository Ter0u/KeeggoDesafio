@KeeggoDesafio @Carrinho

Feature: Carrinho

@03
Scenario: Adicionar e remover item do carrinho
	Given que entro no site
	When acesso o usuario
	And que entro no usuario
	And realizo o login
	And procuro um item
	And adiciono um item no carrinho 
	And acesso ao carrinho
	Then removo o item do carrinho

