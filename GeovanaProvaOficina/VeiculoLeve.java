public class VeiculoLeve extends Veiculo{
	protected String tipoCombustivel;
	
	public void setTipoCombustivel(String tipoCombustivel){
		this.tipoCombustivel = tipoCombustivel;
	}
	
	public VeiculoLeve(String marca, int ano, double custoBase, String tipoCombustivel){
		super( marca, ano, custoBase);
		this.tipoCombustivel = tipoCombustivel;
	}
	
	@Override
	public double calculaCustoManutencao(){
		if (tipoCombustivel.equals("Diesel")){
			return custoBase + ((custoBase * 10)/100);
		}
		return custoBase;
	}
}
