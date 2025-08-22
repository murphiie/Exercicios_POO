public class CarroEsportivo extends Carro{
	private boolean turbo;
	
	public void setTurbo(boolean turbo){
		this.turbo = turbo;
	}
	
	public boolean getTurbo(){
		return turbo;
	}
	
	public CarroEsportivo(String marca, int ano, double custoBase, String tipoCombustivel, int numeroPortas, boolean turbo){
		super( marca, ano, custoBase, tipoCombustivel, numeroPortas);
		this.turbo = turbo;
	}
	
	@Override
	public double calculaCustoManutencao(){
		if (tipoCombustivel.equalsIgnoreCase("Diesel")){
			if(turbo){
				return custoBase + ((custoBase * 10)/100) + 500;
			}else{
				return custoBase + ((custoBase * 10)/100);
			}
		}
		
		if(turbo){
			return custoBase + 500;
		}
		
		return custoBase;
	}
}
