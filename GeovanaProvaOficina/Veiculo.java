public class Veiculo{
	protected String marca;
	protected int ano;
	protected double custoBase;
	
	public void setMarca(String marca){
		this.marca = marca;
	}
	
	public String getMarca(){
		return marca;
	}
	
	public void setAno(int ano){
		this.ano = ano;
	}
	
	public int getAno(){
		return ano;
	}
	
	public void setCustoBase(double custoBase){
		this.custoBase = custoBase;
	}
	
	public double getCustoBase(){
		return custoBase;
	}
	
	public Veiculo(String marca, int ano, double custoBase){
		this.marca = marca;
		this.ano = ano;
		this.custoBase = custoBase;
	}
	
	public double calculaCustoManutencao(){
		return custoBase;
	}
}
