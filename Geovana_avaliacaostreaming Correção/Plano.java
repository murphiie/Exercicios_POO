public class Plano{
	protected Double precoBase;
	
	public void setPrecoBase(Double precoBase){
		this.precoBase = precoBase;
	}
	
	public Double getPrecoBase(){
		return precoBase;
	}
	
	public Plano(Double precoBase){
		this.precoBase = precoBase;
	}
	
	public Double calculaPreco(){
		return precoBase;
	}
}
