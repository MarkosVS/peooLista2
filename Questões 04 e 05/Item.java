public abstract class Item{
	//atributos
	protected String nome;
	protected String material;
	protected double valor;

	//getters
	public String getNome(){
		return this.nome;
	}

	public String getMaterial(){
		return this.material;
	}

	public double getValor(){
		return this.valor;
	}

	//setters
	public void setNome(String nome){
		this.nome = nome;
	}

	public void setMaterial(String material){
		this.material = material;
	}

	public void setValor(double valor){
		this.valor = valor;
	}

	//override metodos
	@Override
	public String toString(){
		return this.nome;
	}
}