package StepsDefinitions;

import io.cucumber.java.pt.Quando;
import pageObject.TelaInicialPage;
import static utils.Utils.*;

public class ActionSteps {

	@Quando("mover o mouse para a aba Sign in")
	public void moverOMouseParaAAbaSignIn() {
	    Na(TelaInicialPage.class).acionarAbaLogin();
	}
}
