public class Atendente extends Funcionario{
	private String turno;
	
	public Atendente(int registro, String turno, String nome, Double salario){
		super(nome, salario, registro);
		this.turno = turno;
	}
	public void setTurno(String turno){
		this.turno = turno;
	}
	
	public String getTurno(){
		return turno;
	}
	
	@Override
	public Double calculaSalario(){
		
		Double desconto = ((salario * 10)/100);
		Double acrescimoNoite = (salario * 20)/100;
		
		
		if(getTurno().equalsIgnoreCase("NOITE")){
			return salario - desconto+acrescimoNoite;
		}else if(getTurno().equalsIgnoreCase("MANHA"))
			return salario - desconto;
		return 0.0;
	}
	
	public String atenderUsuario(String nome){
		return "Usuário "+nome+" atendido no turno" + getTurno()+".";
	}
}
