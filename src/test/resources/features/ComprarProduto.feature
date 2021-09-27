#language: pt
#econding: UTF-8



@Comprar
Funcionalidade: Comprar
Contexto: 
Dado que eu esteja na pagina inicial do sistema
E esteja logado

@Add
Cenario: Adicionar ao carrinho
Quando clicar em women
E escolher um produto
E clicar em adicionar o produto ao carrinho
E ir para o carrinho
Entao o sistema exibe o carrinho de compra