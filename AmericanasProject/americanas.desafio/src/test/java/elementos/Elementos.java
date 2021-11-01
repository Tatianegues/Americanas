package elementos;

import org.openqa.selenium.By;

public class Elementos {

	public By buscarProduto = By.name("conteudo");
	public By cookies = By.id("lgpd-accept");
	public By validarTelefone = By.xpath("//h3[text()='Telefone Sem Fio Intelbras TS 3110 Preto']");

	public By getBuscarProduto() {
		return buscarProduto;
	}

	public By getCookies() {
		return cookies;
	}

	public By getValidarTelefone() {
		return validarTelefone;
	}
}
