public class Carro extends VeiculoLeve{
	protected int numeroPortas;
	
	public void setNumeroPortas(int numeroPortas){
		this.numeroPortas = numeroPortas;
	}
	
	public int getNumeroPortas(){
		return numeroPortas;
	}
	
	public Carro(String marca, int ano, double custoBase, String tipoCombustivel, int numeroPortas){
	super(marca, ano, custoBase, tipoCombustivel);
	this.numeroPortas = numeroPortas;
	}
	
	@Override
	public double calculaCustoManutencao(){
		
		Double acrescimo = ((custoBase * 25)/100);
		
		if (tipoCombustivel.equalsIgnoreCase("Diesel") && numeroPortas == 4){
			return custoBase + ((custoBase * 10)/100) + acrescimo;
		}
		
		if(tipoCombustivel.equalsIgnoreCase("Diesel")){
			return custoBase + ((custoBase * 10)/100);
		}
		
		if(numeroPortas == 4){
			return custoBase + acrescimo;	
		} 
		
		return custoBase;
	}
}
