@Login
Feature: Login
	
	Scenario: Efetuar login com sucesso
    When o usuário realiza o login com o cpf '11346509735'e senha 'Cardif@2022'
    Then o usuário deve ser autenticado com sucesso

  Scenario: Efetuar login com CPF não cadastrado
    When o usuário realiza o login com o cpf '86608303505'e senha 'Cardif@2022'
    Then é apresentada uma mensagem de erro relacionada ao CPF
    
  Scenario: Efetuar login com senha inválida
    When o usuário realiza o login com o cpf '11346509735'e senha '123456'
    Then é apresentada uma mensagem de erro relacionada ao CPF