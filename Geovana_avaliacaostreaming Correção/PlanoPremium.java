public class PlanoPremium extends Plano{
	protected int dispositivos;
	
	public void setDispositivos(int dispositivos){
		this.dispositivos = dispositivos;
	}
	
	public int getDispositivos(){
		return dispositivos;
	}
	
	public PlanoPremium(Double precoBase, int dispositivos){
		super(precoBase);
		this.dispositivos = dispositivos;
	}
	
	@Override
	public Double calculaPreco(){
		Double acrescimoPP = ((precoBase * 15)/100);
		Double acrescimoP = ((precoBase * 5)/100);
		if(dispositivos <= 3)
			return precoBase + acrescimoP;
		else
			return precoBase + acrescimoPP;
		
	}
}
