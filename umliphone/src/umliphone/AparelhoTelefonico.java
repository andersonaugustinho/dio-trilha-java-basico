package umliphone;

public class AparelhoTelefonico extends Iphone {

	public void ligar(String telefone) {
		System.out.println("Ligar para o telefone de número " + telefone);
	}
	
	public void atender() {
		System.out.println("Atendendo ligação.");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz.");
	}
	
}
