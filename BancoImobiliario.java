public class BancoImobiliario extends JogoDeTabuleiro{
	//atributos
	private String cenario;
	private double saldoBanco;

	//construtor
	public BancoImobiliario(){
		this.nome = "Banco Imobiliário";
	}

	//getters
	public String getCenario(){
		return this.cenario;
	}

	public double getSaldoBanco(){
		return this.saldoBanco;
	}

	//setters
	public void setCenario(String cenario){
		this.cenario = cenario;
	}

	public void setSaldoBanco(double saldo){
		this.saldoBanco = saldo;
	}

	//métodos
	public void emprestar(double emprestimo){
		if(this.saldoBanco >= emprestimo && emprestimo > 0 && this.saldoBanco > 0)
			this.saldoBanco -= emprestimo;
	}

	public void cobrar(double valor){
		this.saldoBanco += valor;
	}

	@Override
	public void jogar(){
		System.out.println("O jogador da vez joga o dado e anda o número de posições indicado.");
		System.out.println("Caso pare em uma propriedade sem dono, poderá comprá-la.");
		System.out.println("Mas, se houver dono, deverá pagar um aluguel ao dono. (O aluguel pode variar pra cada propriedade)");
		System.out.println("Caso o jogador seja o dono da propriedade (e também possua todas as propriedades da mesma cor) poderá pagar para construir casas e aumentar o valor do aluguel.");
		System.out.println("O último jogador a falir ganha.");
	}
}