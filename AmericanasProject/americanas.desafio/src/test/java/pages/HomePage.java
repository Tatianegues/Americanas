package pages;

import elementos.Elementos;

public class HomePage {
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	public void buscarProduto() throws InterruptedException {
		metodos.preencher("telefone sem fio intelbras", el.buscarProduto);
		metodos.submit(el.buscarProduto);
		metodos.pausar(3000);
		metodos.clicar(el.cookies);
	}
}