public class Moto extends VeiculoLeve{
	private int cilindradas;	
	
	public void setCilindradas(int cilindradas){
		this.cilindradas = cilindradas;
	}
	
	public int getCilindradas(){
		return cilindradas;
	}
	
	public Moto(String marca, int ano, double custoBase, String tipoCombustivel, int cilindradas){
		super(marca, ano, custoBase, tipoCombustivel);
		this.cilindradas = cilindradas;
	}
	
	@Override
	public double calculaCustoManutencao(){
		if (tipoCombustivel.equalsIgnoreCase("Diesel") && cilindradas > 300){
			return custoBase + ((custoBase * 10)/100) + 50;
		}
		 if(cilindradas > 300){
			return custoBase + 50;
		}
		return custoBase;
	}
}
