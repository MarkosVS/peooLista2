import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		ArrayList<JogoDeTabuleiro> jogos = new ArrayList<>();
		JogoDeTabuleiro bi = new BancoImobiliario();
		JogoDeTabuleiro war = new War();
		jogos.add(bi);
		jogos.add(war);
		for(JogoDeTabuleiro jdt : jogos){
			System.out.println("Como jogar " + jdt.getNome() + ':');
			jdt.jogar();
			System.out.println("");
		}
	}
}