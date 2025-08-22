public class PlanoBasico extends Plano{
	private String qualidadeMaxima;
	
	
	public void setQualidadeMaxima(String qualidadeMaxima){
		this.qualidadeMaxima = qualidadeMaxima;
	}
	
	public String getQualidadeMaxima(){
		return qualidadeMaxima;
	}
	
	public PlanoBasico(Double precoBase, String qualidadeMaxima){
		super(precoBase);
		this.qualidadeMaxima = qualidadeMaxima;
	}
	
	@Override
	public Double calculaPreco(){
		Double acrescimo = ((precoBase * 10)/100);
		if(qualidadeMaxima == "FULL HD") //if (qualidadeMaxima.equals("FULL HD"))
			return precoBase + acrescimo;
		else
			return precoBase;
	} 
}
