package steps;

import elementos.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;
import utils.MassaDeDados;

public class BuscarTest {
	
	Metodos metodos = new Metodos();
	Elementos el = new Elementos ();
	MassaDeDados massa = new MassaDeDados();
	

	@Given("que esteja na pagina inicial")
	public void queEstejaNaPaginaInicial() {
	   Executa.abrirNavegador();
	}
	@After
	public void finalizarTeste() {
		Executa.fecharNavegador();
	}
	@Given("click na lupa de pesquisa")
	public void clickNaLupaDePesquisa() {
		metodos.clicar(el.lupa);
	 
	}
	@Given("informe palavra aleatória no campo solicitado")
	public void informePalavraAleatóriaNoCampoSolicitado() {
	metodos.clicar(el.caixaPesquisa);
		metodos.escrever(el.caixaPesquisa, massa.nomeAleatorio);
	}
	@When("clicar no botao de pesquisa")
	public void clicarNoBotaoDePesquisa() {
		metodos.clicar(el.pesquisar);
		
	
	}
	@Then("sistema informa todos os artigos relacionados a palavra informada")
	public void sistemaInformaTodosOsArtigosRelacionadosAPalavraInformada() {
	   metodos.CurrentUrl("https://blogdoagi.com.br/?s=Finan%C3%A7as");
	}

	

	@Given("que esteja na home")
	public void queEstejaNaHome() {
	    Executa.abrirNavegador();
	}
	@Given("clicar na lupa de pesquisa")
	public void clicarNaLupaDePesquisa() {
	   metodos.clicar(el.lupa);
	}
	@Given("informe caracteres aleatorios no campo pesquisar")
	public void informeCaracteresAleatoriosNoCampoPesquisar() {
	    metodos.clicar(el.caixaPesquisa);
	    metodos.escrever(el.caixaPesquisa, massa.caracteresAleatorios);
	}
	@When("clicar no botao {string}")
	public void clicarNoBotao(String string) {
	    metodos.clicar(el.pesquisar);
	}
	@Then("sistema informa mensagem {string} {string}")
	public void sistemaInformaMensagem(String string, String string2) {
	   metodos.CurrentUrl("https://blogdoagi.com.br/?s=%2F%2F%2F%3B%3B%3B%2F%2F%2F");
	}





}
