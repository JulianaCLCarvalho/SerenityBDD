@AlterarSenha
Feature: Alterar Senha
  	  	
  	Background: 
    Given o usuário acessa a tela Minha Conta logado com o cpf '11346509735'e senha 'Cardif@2022'
      	
  	Scenario: Acessar tela Alterar Senha
  	When o usuário aciona o botão Alterar senha
    Then deve ser apresentada a tela com as informações para alteração de senha
    
    Scenario: Alterar Senha com Sucesso
  	When o usuário aciona o botão Alterar senha
  	And informa a senha atual 'Cardif@2022'
  	And informa a nova senha 'Cardif@2022'
  	And confirma a nova senha 'Cardif@2022'
  	And aciona o botão Salvar
    Then será apresentada uma mensagem de sucesso na alteração de senha
