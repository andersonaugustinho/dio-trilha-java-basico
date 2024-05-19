package umliphone;

public class ReprodutorMusical extends Iphone {

	public void tocar() {
		System.out.println("Tocar música.");
	}
	
	public void pausar() {
		System.out.println("Pausar música.");
	}
	
	public void selecionarMusica(String musica) {
		System.out.println("Música " + musica + " selecionada.");
	}
	
}
