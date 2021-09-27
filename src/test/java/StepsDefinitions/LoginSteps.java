package StepsDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObject.LoginPage;
import pageObject.TelaInicialPage;

import static utils.Utils.*;
public class LoginSteps {

	public void acessarPainelDeLogin() {
		Na(TelaInicialPage.class).acionarAbaLogin();
	}
	
	@Quando("eu informar o usuario {string}")
	public void euInformarOUsuario(String email) {
		Na(LoginPage.class).inserirEmail(email);   
	}
	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
	    Na(LoginPage.class).inserirSenha(senha);
	}
	@Quando("clicar no botao")
	public void clicarNoBotao() {
	    Na(LoginPage.class).acionarBotaoSign();
	}
	@Entao("o sistema exibe usuario logado")
	public void oSistemaExibeUsuarioLogado() {
		assertTrue(driver.findElement(By.xpath("//h1[@class='page-heading']")).isDisplayed());
	}
	@Entao("o sistema exibe uma mensagem de usuario invalido")
	public void oSistemaExibeUmaMensagemDeUsuarioInvalido() {
		assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger']/p['There is 1 error']")).isDisplayed());
	}

}
