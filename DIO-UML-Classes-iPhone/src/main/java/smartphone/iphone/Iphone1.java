package smartphone.iphone;

import smartphone.aparelhoTelefonico.AparelhoTelefonico;
import smartphone.navegadorInternet.NavegadorInternet;
import smartphone.reprodutorMusical.ReprodutorMusical;

public class Iphone1 implements  AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("PAUSANDO MUSICA NO IPHONE 1");
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("TOCANDO MUSICA NO IPHONE 1");
	}

	@Override
	public void selecionarMusica() {
		// TODO Auto-generated method stub
		System.out.println("SELECIONANDO MUSICA NO IPHONE 1");
	}

	@Override
	public void exibirPagina() {
		// TODO Auto-generated method stub
		System.out.println("EXIBINDO PAGINA INTERNET NO IPHONE 1");
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("ADICIOANDO NOVA ABA INTERNET NO IPHONE 1");
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("ATUALIZANDO PAGINA INTERNET NO IPHONE 1");
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		System.out.println("FAZENDO LIGAÇÃO NO IPHONE 1");
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("ATENDENDO LIGAÇÃO NO IPHONE 1");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("INICIANDO CORREIO DE VOZ NO IPHONE 1");
	}
	
	public static void main(String[] args) {
		Iphone1 iphone1 = new Iphone1();
		iphone1.atender();
		iphone1.tocar();
		iphone1.selecionarMusica();
		
	}
	
}
