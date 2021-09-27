package StepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObject.CreateLoginPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class CreateSteps {

	
	@Quando("eu colocar o email {string}")
	public void euColocarOEmail(String email) {
	    Na(CreateLoginPage.class).cadastrarEmail(email);
	
	}
	@Entao("o sistema ir para a tela de cadastro")
	public void oSistemaIrParaATelaDeCadastro() {
	    Na(CreateLoginPage.class).acionarBotaoCreate();
	}
	//#########################################################################
	
	@Quando("eu colocar meu primeiro nome {string}")
	public void euColocarMeuPrimeiroNome(String firstName) {
	    Na(CreateLoginPage.class).primeiroNome(firstName);
	}
	@Quando("colocar o meu sobrenome {string}")
	public void colocarOMeuSobrenome(String lastName) {
	    Na(CreateLoginPage.class).segundoNome(lastName);
	}
	@Quando("colocar uma senha {string}")
	public void colocarUmaSenha(String password) {
		Na(CreateLoginPage.class).senha(password);
	}
	@Quando("colocar meu endereco {string}")
	public void colocarMeuEndereco(String addres) {
		Na(CreateLoginPage.class).endereco(addres);
	}
	@Quando("colocar minha cidade {string}")
	public void colocarMinhaCidade(String city) {
		Na(CreateLoginPage.class).cidade(city);
	}
	@Quando("colocar o estado")
	public void colocarOEstado() {
	    Na(CreateLoginPage.class).estado();
	}
	@Quando("colocar meu cep {string}")
	public void colocarMeuCep(String codigPostal) {
		Na(CreateLoginPage.class).cep(codigPostal);
	}
	@Quando("colocar meu continente")
	public void colocarMeuContinente() {
	    Na(CreateLoginPage.class).continente();
	}
	@Quando("colocar meu telefone {string}")
	public void colocarMeuTelefone(String phone) {
		Na(CreateLoginPage.class).telefone(phone);
	}
	@Quando("clicar no botao registrar")
	public void clicarNoBotaoRegistrar() {
		Na(CreateLoginPage.class).acionarBotaoRegisrar();
	}
	@Entao("o sistema exibe cadastro com sucesso")
	public void oSistemaExibeCadastroComSucesso() {
		assertTrue(driver.findElement(By.xpath("//h1[@class='page-heading']")).isDisplayed());
	}
	
	
}
