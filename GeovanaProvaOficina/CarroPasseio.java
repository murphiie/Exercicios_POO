public class CarroPasseio extends Carro{
	private boolean arCondicionado;
	
	public void setArCondicionado(boolean arCondicionado){
		this.arCondicionado = arCondicionado;
	}
	
	public boolean getArCondicionado(){
		return arCondicionado;
	}
	
	public CarroPasseio(String marca, int ano, double custoBase, String tipoCombustivel, int numeroPortas, boolean arCondicionado){
		super(marca, ano, custoBase, tipoCombustivel, numeroPortas);
		this.arCondicionado = arCondicionado;
	}
	
	@Override
	public double calculaCustoManutencao(){
		if (tipoCombustivel.equalsIgnoreCase("Diesel")){
			if(arCondicionado){
				return custoBase + ((custoBase * 10)/100) + 200;
			}else{
				return custoBase + ((custoBase * 10)/100);
			}
		}
		
		if(arCondicionado){
			return custoBase + 200;
		}
		
		return custoBase;
	}
}
