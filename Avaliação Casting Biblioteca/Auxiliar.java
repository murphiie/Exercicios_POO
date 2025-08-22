public class Auxiliar extends Funcionario{
	private String setor;
	
	public Auxiliar(int registro, String setor, String nome, Double salario){
		super(nome, salario, registro);
		this.setor = setor;
	}
	
	public void setSetor(String setor){
		this.setor = setor;
	}
	
	public String getSetor(){
		return setor;
	}
	
	@Override
	public Double calculaSalario(){
		
		Double desconto = ((salario * 10)/100);
		Double acrescimoAcervo = (salario * 15)/100;
		Double acrescimoLimpeza = (salario * 5)/100;
		
		if(getSetor().equalsIgnoreCase("ACERVO")){
			return salario - desconto+acrescimoAcervo;
		}else if(getSetor().equalsIgnoreCase("LIMPEZA"))
			return salario - desconto + acrescimoLimpeza;
		return 0.0;
	}
	
	public String organizarLivros(String genero){
		return "Livros de "+genero+" organizados no "+ getSetor()+".";
	}
	
}
