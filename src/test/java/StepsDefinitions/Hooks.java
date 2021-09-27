package StepsDefinitions;

import static utils.Utils.acessarSistema;
import static utils.Utils.capturarTela;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pageObject.TelaInicialPage;

import static utils.Utils.*;
public class Hooks {

	@Before()
	public void setUp() {
		acessarSistema();	
		//Na(TelaInicialPage.class).acionarAbaLogin();
	}
	
	@After()
	public void tearDown(Scenario scenario) {
		capturarTela(scenario);
		//driver.quit();
	}
}
