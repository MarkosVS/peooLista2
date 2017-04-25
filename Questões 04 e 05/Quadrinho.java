public class Quadrinho extends Item{
	//atributos
	private String autor;
	private int numPaginas;
	private String dataPublicacao;
	private String genero;

	//construtores
	public Quadrinho(String nome, String autor){
		this.nome = nome;
		this.autor = autor;
	}

	public Quadrinho(String nome, String autor, String genero){
		this.nome = nome;
		this.autor = autor;
		this.genero = genero;
	}

	//getters
	public String getAutor(){
		return this.autor;
	}

	public int getNumPaginas(){
		return this.numPaginas;
	}
	
	public String getDataPublicacao(){
		return this.dataPublicacao;
	}
	
	public String getGenero(){
		return this.genero;
	}
	//setters
	public void setAutor(String autor){
		this.autor = autor;
	}

	public void setAutor(int paginas){
		this.numPaginas = paginas;
	}
	
	public void setData(String data){
		this.dataPublicacao = data;
	}

	public void setGenero(String genero){
		this.genero = genero;
	}

	//metodos
	public boolean compararAutor(Quadrinho other){
		return this.autor.equals(other.autor);
	}

	public boolean compararGenero(Quadrinho other){
		return this.genero.equals(other.genero);
	}
}