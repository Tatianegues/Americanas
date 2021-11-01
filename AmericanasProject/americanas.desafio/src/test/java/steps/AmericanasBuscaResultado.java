package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Browser;
import pages.BuscaResultado;
import pages.HomePage;

public class AmericanasBuscaResultado {
	Browser browser = new Browser();
	HomePage page = new HomePage();
	BuscaResultado busResultado = new BuscaResultado();

	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String site) {
		browser.abrirNavegador(site);
	}

	@When("realizar pesquisa por produto")
	public void realizar_pesquisa_por_produto() throws InterruptedException {
		page.buscarProduto();

	}

	@Then("verifico produto retornado")
	public void verifico_produto_retornado() {
		busResultado.validarTextoBusca();

	}

}
