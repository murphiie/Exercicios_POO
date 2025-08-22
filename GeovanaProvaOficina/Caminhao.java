public class Caminhao extends VeiculoPesado{
	private int eixos;
	
	public void setEixos(int eixos){
		this.eixos = eixos;
	}
	
	public int getEixos(){
		return eixos;
	}
	
	public Caminhao(String marca, int ano, double custoBase, double cargaMaxima, int eixos){
		super( marca, ano, custoBase, cargaMaxima);
		this.eixos = eixos;
	}
	
	@Override
	public double calculaCustoManutencao(){
		return custoBase + (cargaMaxima * 100) + (eixos * 200);
	}
}
