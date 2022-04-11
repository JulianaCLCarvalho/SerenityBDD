@MinhaConta
Feature: Minha Conta
  	  	
  	Background: 
    Given o usuário acessa a tela Minha Conta logado com o cpf '11346509735'e senha 'Cardif@2022'
  	
  	Scenario: Acessar Minha Conta
  	When o usuário aciona o botão Minha Conta
    Then deve ser apresentado o modal com as informações do usuário logado
