package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LoginPage {
	
	@FindBy(name = "email")
	public WebElement username;
	
	@FindBy(name = "passwd")
	public WebElement password;
	
	@FindBy(name ="SubmitLogin")
	public WebElement botaoSign;
	
	
	
	public void inserirEmail(String email) {
		username.sendKeys(email);
	}
	
	public void inserirSenha(String senha) {
		password.sendKeys(senha);
	}
	
	public void acionarBotaoSign() {
		botaoSign.click();
	}
	
}
