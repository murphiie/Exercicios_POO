public class Produto{
	private String nome;
	private double preco;
	private int estoque;
	private String categoria;
	
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public double getPreco(){
		return preco;
	}
	
	public void setPreco(double preco){
		this.preco = preco;
	}
	
	public int getEstoque(){
		return estoque;
	}
	
	public void setEstoque(int estoque){
		this.estoque = estoque;
	}
	
	public String getCategoria(){
		return categoria;
	}
	
	public void setCategoria(String categoria){
		this.categoria = categoria;
	}
	
	public Produto(String nome, double preco, int estoque, String categoria){
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
		this.categoria = categoria;
	}
	
	public double vender(int quantidade){
		double valorTotal = 0;
		if(estoque - quantidade < 0){
			System.out.println("Erro. Não é possivel realizar a venda.");
		}
		valorTotal = (quantidade * preco);
		estoque = estoque - quantidade;
		return valorTotal;
	}
	
	public double vender(int quantidade, double desconto){
		double valorTotal = 0.0;
		if(estoque - quantidade < 0){
			System.out.println("Erro. Não é possivel realizar a venda.");
		}
		valorTotal = (quantidade * preco - desconto);
		estoque = estoque - quantidade;
		return  valorTotal;
	}
	
	public double comprar(int quantidade){
		double valorTotal = 0.0;
		valorTotal = quantidade * preco;
		estoque = estoque + quantidade;
		return valorTotal;
	}
	
	public double comprar(int quantidade, double frete){
		double valorTotal = 0.0;
		valorTotal = (quantidade * preco) + frete;
		estoque = estoque + quantidade;
		return valorTotal;
	}
	
	public double calcularValorTotalEstoque(){
		double valorTotal;
		valorTotal = estoque * preco;
		return valorTotal;
	}
	
	public double calcularValorTotalEstoque(double imposto){
		double valorTotal;
		valorTotal = (estoque * preco) - (imposto / 100);
		return  valorTotal;
	}
	
	public String exibirDetalhes(){
		return "Nome: " + nome + " Preco: R$ "+preco+ " Categoria: "+categoria;
	}
	public String exibirDetalhes(boolean mostrarEstoque){
		if(estoque > 0){
			mostrarEstoque = true;
			return "Nome: " + nome + " Preco: R$ "+preco+ " Categoria: "+categoria + "Estoque: "+estoque;
		}else 
			mostrarEstoque = false;
		return "Nome: " + nome + " Preco: R$ "+preco+ " Categoria: "+categoria;
	}
}

