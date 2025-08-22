public class Funcionario{
	protected String nome;
	protected Double salario;
	protected int registro;
	
	public Funcionario(String nome, Double salario, int registro){
		this.nome = nome;
		this.salario = salario;
		this.registro = registro;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}

	public void setSalario(Double salario){
		this.salario = salario;
	}
	
	public Double getSalario(){
		return salario;
	}
	
	public void setRegistro(int registro){
		this.registro = registro;
	}
	
	public int getRegistro(){
		return registro;
	}
	
	public Double calculaSalario(){
		Double desconto = ((salario * 10)/100);
		return salario - desconto;
	}
	
}
