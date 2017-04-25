public class Main{
	public static void main(String[] args){
		Quadrinho gc = new Quadrinho("Guerra Civil", "Mark Millar", "Ação");
		Quadrinho nv = new Quadrinho("Os Novos Vingadores", "Brian Michael Bendis", "Ação");
		Bluray hp = new Bluray("Harry Potter e a Pedra Filosofal", "Chris Columbus", "Fantasia");
		Bluray af = new Bluray("Animais Fantásticos e Onde Habitam", "David Yates", "Fantasia");
		Bluray tarzan = new Bluray("A Lenda de Tarzan", "David Yates", "Fantasia");
		System.out.println(tarzan.getGenero() + '\n');

		if(tarzan.compararDiretor(af))
			System.out.println("São do mesmo diretor");
		else
			System.out.println("Não são do mesmo diretor");

		if(gc.compararAutor(nv))
			System.out.println("São do mesmo autor");
		else
			System.out.println("Não são do mesmo autor");

		System.out.println("");
		Colecao col = new Colecao();
		col.inserir(gc);
		col.inserirQuadrinho(nv);
		col.inserir(hp);
		col.inserir(af);
		col.inserirBluray(tarzan);
		System.out.println("A coleção tem " + col.tamanho() + " itens.");
		System.out.println("Sendo " + col.numQuadrinhos() + " quadrinho(s) e " + col.numBlurays() + " Blu-ray(s)");
		System.out.println("");
		col.listarQuadrinhosAutor("Mark Millar");
		System.out.println("");
		col.listarQuadrinhosGenero("Ação");
		System.out.println("");
		col.listarBluraysDiretor("David Yates");
		System.out.println("");
		col.listarBluraysGenero("Comédia");
		System.out.println("");
		col.listarBluraysGenero(af);
		System.out.println("");
		col.listarBluraysDiretor(hp);
		System.out.println("");
		col.listarQuadrinhosGenero(gc);
		System.out.println("");
		col.listarQuadrinhosAutor(nv);
	}
}
