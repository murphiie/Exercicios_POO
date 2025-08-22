public class PlanoExclusivo extends PlanoPremium{
	private boolean conteudoExtra;
	
	public void setConteudoExtra(boolean conteudoExtra){
		this.conteudoExtra = conteudoExtra;
	}
	
	public boolean getConteudoExtra(){
		return conteudoExtra;
	}
	
	public PlanoExclusivo(Double precoBase, int dispositivos, boolean conteudoExtra){
		super(precoBase, dispositivos);
		this.conteudoExtra = conteudoExtra;
	}
	
	@Override
	public Double calculaPreco(){ //Erro na colocação das chaves.
		Double acrescimoPP = ((precoBase * 15)/100);
		Double acrescimoP = ((precoBase * 5)/100);
		if(dispositivos <= 3){
			if(conteudoExtra)
				return precoBase + acrescimoP + 20;
			}else 
				return precoBase + acrescimoP;
		if(dispositivos> 3){
			if(conteudoExtra)
				return precoBase + acrescimoPP + 20;
			}else 
				return precoBase + acrescimoPP;
	return 0.0;
	}
}
