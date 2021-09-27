#language: pt
#econding: UTF-8

@CreateAccount
Funcionalidade: Cria uma nova conta

@CadastrarEmail
Cenario: Cadastrar email
Quando eu colocar o email "lucas3@hotmail.com"
E clicar no botao
Entao o sistema ir para a tela de cadastro

@CadastrarConta
Cenario: Criando conta
Quando eu colocar meu primeiro nome "lucas"
E colocar o meu sobrenome "andrade"
E colocar uma senha "123456"
E colocar meu endereco "las vegas"
E colocar minha cidade "Nevada"
E colocar o estado 
E colocar meu cep "00000"
E colocar meu continente
E colocar meu telefone "40028922"
E clicar no botao registrar
Entao o sistema exibe cadastro com sucesso
