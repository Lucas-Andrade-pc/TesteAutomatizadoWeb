package StepsDefinitions;

import static utils.Utils.Na;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObject.TelaInicialPage;
public class ComprarSteps {
	
	@Dado("que eu esteja na pagina inicial do sistema")
	public void queEuEstejaNaPaginaInicialDoSistema() {
	    
	}
	@Dado("esteja logado")
	public void estejaLogado() {
	    
	}
	@Quando("clicar em women")
	public void clicarEmWomen() {
		 Na(TelaInicialPage.class).selecionarSexo();
	}
	@Quando("escolher um produto")
	public void escolherUmProduto() {
		 Na(TelaInicialPage.class).selecionarItemDaLoja();
	}
	@Quando("clicar em adicionar o produto ao carrinho")
	public void clicarEmAdicionarOProdutoAoCarrinho() throws Exception {
	    Na(TelaInicialPage.class).adicionarAoCarrinho();
	}
	@Quando("ir para o carrinho")
	public void irParaOCarrinho() {
		Na(TelaInicialPage.class).procederParaCarrinho();
	}
	@Entao("o sistema exibe o carrinho de compra")
	public void oSistemaExibeOCarrinhoDeCompra() {
		Na(TelaInicialPage.class).carrinho();
	}
//	@Dado("que eu esteja na pagina inicial do sistema")
//	public void queEuEstejaNaPaginaInicialDoSistema() {
//	    
//	}
//	@Dado("esteja logado")
//	public void estejaLogado() {
//	    
//	}
//
//	@Quando("clicar em women")
//	public void clicarEmWomen() {
//	    Na(TelaInicialPage.class).selecionarSexo();
//	}
//	@Quando("adicionar um produto ao carrinho")
//	public void adicionarUmProdutoAoCarrinho() {
//	    Na(TelaInicialPage.class).selecionarItemDaLoja();
//	}
//	@Quando("clicar para ir pro carrinho")
//	public void clicarParaIrProCarrinho() {
//		Na(TelaInicialPage.class).selecionarBotaoCarrinho();
//	}
//	@Entao("o sistema exibe o carrinho de compra")
//	public void oSistemaExibeOCarrinhoDeCompra() {
//	    Na(TelaInicialPage.class).carrinho();
//	}
}
