package pages;

import elementos.Elementos;

public class BuscaResultado {
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	public void validarTextoBusca() {
		metodos.clicar(el.cookies);
		metodos.validarTexto( el.validarTelefone, "telefone sem fio intelbras ts 3110 preto");
		metodos.screenshot("Telefone");
		metodos.fechar();
	}
}