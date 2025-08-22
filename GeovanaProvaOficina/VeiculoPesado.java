public class VeiculoPesado extends Veiculo{
	protected double cargaMaxima;
	
	public void setCargaMaxima(double cargaMaxima){
		this.cargaMaxima = cargaMaxima;
	}
	
	public double getCargaMaxima(){
		return cargaMaxima;
	}
	
	public VeiculoPesado(String marca, int ano, double custoBase, double cargaMaxima){
		super(marca, ano, custoBase);
		this.cargaMaxima = cargaMaxima;
	}
	
	@Override
	public double calculaCustoManutencao(){
		return custoBase + (cargaMaxima * 100);
	}
}
