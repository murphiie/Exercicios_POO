public class Plano4K extends PlanoPremium{
	private boolean hdr;
	
	public void setHdr(boolean hdr){
		this.hdr = hdr;
	}
	
	public boolean getHdr(){
		return hdr;
	}
	
	public Plano4K(Double precoBase, int dispositivos, boolean hdr){
		super(precoBase, dispositivos);
		this.hdr = hdr;
	}
	
	@Override
	public Double calculaPreco(){ //Erro na colocação das chaves.
		Double acrescimoPP = ((precoBase * 15)/100);
		Double acrescimoP = ((precoBase * 5)/100);
		Double acrescimoHdr = ((precoBase * 25)/100);
		if(dispositivos <= 3){
			if(hdr)
				return precoBase + acrescimoP + acrescimoHdr;
			}else{ 
				return precoBase + acrescimoP;
			}
		if(dispositivos> 3){
			if(hdr)
				return precoBase + acrescimoPP + acrescimoHdr;
			}else {
				return precoBase + acrescimoPP;
			}
	return 0.0;
	}
}
