#language: pt
#encoding: UTF-8



@Login 
Funcionalidade: Realizar Login
Eu como usuario, desejo realizar o login
Para que eu possa ter acesso as principais funcionalidade da aplicacao

Contexto:

@LoginSucesso 
Cenario: Login com sucesso
Quando eu informar o usuario "lucas@hotmail.com"
E informar a senha "123456"
E clicar no botao
Entao o sistema exibe usuario logado

@LoginInvalido
Cenario: Login invalido 
Quando eu informar o usuario "lucas@hotmail.com"
E informar a senha "1234"
E clicar no botao 
Entao o sistema exibe uma mensagem de usuario invalido