public class War extends JogoDeTabuleiro{
	//atributos
	private String cenario;

	//construtor
	public War(){
		this.nome = "War";
	}

	//getter
	public String getCenario(){
		return this.cenario;
	}
	//setter
	public void setCenario(String cenario){
		this.cenario = cenario;
	}

	//métodos
	public void jogar(){
		System.out.println("Cada jogador recebe um objetivo, um certo número de territórios e algumas tropas.");
		System.out.println("O jogador distribui suas tropas entre seus territórios da forma que achar melhor.");
		System.out.println("No seu turno, o jogador pode atacar territórios vizinhos aos seus para conquistá-los.");
		System.out.println("O jogador que completar seu objetivo primeiro ganha.");
	}
}