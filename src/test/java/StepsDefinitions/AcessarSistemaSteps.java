package StepsDefinitions;

import io.cucumber.java.pt.Dado;
import static utils.Utils.*;

public class AcessarSistemaSteps {

	@Dado("que eu estou acessando o sistema")
	public void queEuEstouAcessandoOSistema() {
	    acessarSistema();
	}
}
