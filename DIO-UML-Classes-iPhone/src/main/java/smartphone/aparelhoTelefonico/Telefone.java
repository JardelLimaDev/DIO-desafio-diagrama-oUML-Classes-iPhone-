package smartphone.aparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		System.out.println("FAZENDO UMA LIGAÇÃO");
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("ATENDENDO UMA LIGAÇÃO");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("INICIANDO CORREIO DE VOZ");
	}
}
