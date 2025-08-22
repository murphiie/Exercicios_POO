public class Bibliotecario extends Funcionario{
	private String cargo;
	
	public Bibliotecario(int registro, String cargo, String nome, Double salario){
		super(nome, salario, registro);
		this.cargo = cargo;
	}
	
	public void setCargo(String cargo){
		this.cargo = cargo;
	}
	
	public String getCargo(){
		return cargo;
	}
	
	@Override
	public Double calculaSalario(){
		Double desconto = ((salario * 10)/100);
		Double acrescimoSenior = (salario * 30)/100;
		Double acrescimoJunior = (salario * 10)/100;
		if(getCargo().equalsIgnoreCase("Senior")){
			return salario - desconto+acrescimoSenior;
		}else if(getCargo().equalsIgnoreCase("JUNIOR"))
			return salario - desconto + acrescimoJunior;
		return 0.0;
	}
	
	public String processarEmprestimo(String livro){
		return "Empréstimo de "+livro+" processado por "+ getCargo()+".";
	}
}
