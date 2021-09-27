package pageObject;

import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TelaInicialPage extends BasePage {
	
	
	
	@FindBy(xpath = "//a[@title='Women']")
	public WebElement selecionarBotaoDosProdutos;
	
	@FindBy(xpath = "//div[@class='right-block']/h5/a[@title='Faded Short Sleeve T-shirts']")
	public WebElement selecionarItem;
	
	////li[1]/div/div[2]/div[2]/a[1]/span
	@FindBy(xpath = "//button[@name='Submit']")
	public WebElement addToCart;
	
	@FindBy(xpath = "//div[@class='button-container']/a[@title='Proceed to checkout']")
	public WebElement selecionarBotaoIrParaCarrinho;
	
	@FindBy(xpath = "//div/a[@title='Delete']")
	public WebElement deletarItem;

	
	public void acionarAbaLogin() {
		abaLogin.click();
	}
	
	public void selecionarSexo() {
		selecionarBotaoDosProdutos.click();
	}
	
	public void selecionarItemDaLoja() {
		selecionarItem.click();
	}
	
	public void adicionarAoCarrinho() throws Exception {
		Actions acao = new Actions(driver);
		acao.moveToElement(addToCart).click().build().perform();
		Thread.sleep(4000);
	}
	
	public void procederParaCarrinho() {
		Actions acao = new Actions(driver);
		acao.moveToElement(selecionarBotaoIrParaCarrinho).click().build().perform();
	}
	
	public void carrinho() {
		assertTrue(driver.findElement(By.xpath("//h1[@id='cart_title']")).isDisplayed());
	}
	
	public void deletarProdutor(){
		Actions acao = new Actions(driver);
		acao.moveToElement(deletarItem).click().build().perform();
	}
}
