package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateLoginPage {

	@FindBy(name = "email_create")
	public WebElement emailCreate;

	@FindBy(name = "SubmitCreate")
	public WebElement botaoCreateAccount;

	@FindBy(name = "customer_firstname")
	public WebElement primeiroNome;

	@FindBy(name = "customer_lastname")
	public WebElement segundoNome;

	@FindBy(name = "passwd")
	public WebElement senha;

	@FindBy(name = "address1")
	public WebElement endereco;

	@FindBy(name = "city")
	public WebElement cidade;
	
	@FindBy(xpath = "//select[@id='id_state']/option[@value='2']")
	public WebElement selecionarEstado;

	@FindBy(name = "postcode")
	public WebElement cep;
	
	@FindBy(name = "id_country")
	public WebElement selecionarContinent;
	
	@FindBy(xpath = "//select[@id='id_country']/option[@value='21']")
	public WebElement unitedStates;

	@FindBy(name = "phone_mobile")
	public WebElement telefone;

	@FindBy(name = "submitAccount")
	public WebElement botaoRegistrar;
	
	@FindBy(xpath = "//h1[@class='page-heading']")
	public WebElement sucesso;

	public void cadastrarEmail(String email) {
		emailCreate.sendKeys(email);
	}

	public void acionarBotaoCreate() {
		botaoCreateAccount.click();
	}

	public void primeiroNome(String firstName) {
		primeiroNome.sendKeys(firstName);
	}

	public void segundoNome(String lastName) {
		segundoNome.sendKeys(lastName);
	}

	public void senha(String password) {
		senha.sendKeys(password);
	}

	public void endereco(String addres) {
		endereco.sendKeys(addres);
	}

	public void cidade(String city) {
		cidade.sendKeys(city);
	}
	
	public void estado() {
		selecionarEstado.click();
	}
	public void cep(String codigPostal) {
		cep.sendKeys(codigPostal);
	}
	
	public void continente() {
		selecionarContinent.click();
//		Actions acao = new Actions(driver);
//		acao.moveToElement(unitedStates).build().perform();
//		acao.click();
	}

	public void telefone(String phone) {
		telefone.sendKeys(phone);
	}
	public void acionarBotaoRegisrar() {
		botaoRegistrar.click();
	}

}
