public class PlanoFamiliar extends Plano{
	private int usuarios;
	
	public void setUsuarios(int usuarios){
		this.usuarios = usuarios;
	}
	
	public int getUsuarios(){
		return usuarios;
	}
	
	public PlanoFamiliar(Double precoBase, int usuarios){
		super(precoBase);
		this.usuarios = usuarios;
	}
	
	@Override
	public Double calculaPreco(){
		int acrescimo = usuarios * 5;
		return precoBase + acrescimo;
	}
}
