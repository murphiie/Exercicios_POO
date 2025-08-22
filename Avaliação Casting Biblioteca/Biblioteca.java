public class Biblioteca{
	private Funcionario[] funcionarios  = new Funcionario[10];
	
		public Funcionario[] getFuncionarios(){
		return funcionarios;
	}
	
	public void setFuncionarios(Funcionario[] funcionarios){
		this.funcionarios = funcionarios;
	}
	
		public boolean adicionaFuncionario(Funcionario funcionario){
		for (int i = 0; i < funcionarios.length; i++){
			if (funcionarios[i]==null){
				funcionarios[i]=funcionario; 
				return true; 
			}
		}
		return false; 
	}
	
	public boolean adicionaFuncionario(Bibliotecario bibliotecario){
		for(int i = 0; i < funcionarios.length; i++){
			if(funcionarios[i] == null){
				funcionarios[i] = bibliotecario;
				return true;
			}
		}
		return false;
	}
	
	public boolean adicionaFuncionario(Auxiliar auxiliar){
		for(int i = 0; i < funcionarios.length; i++){
			if(funcionarios[i] == null){
				funcionarios[i] = auxiliar;
				return true;
			}
		}
		return false;
	}
	
	public boolean adicionaFuncionario(Atendente atendente){
		for(int i = 0; i < funcionarios.length; i++){
			if(funcionarios[i] == null){
				funcionarios[i] = atendente;
				return true;
			}
		}
		return false;
	}
	
	public boolean excluirFuncionario(Funcionario funcionario){
		for(int i = 0; i < funcionarios.length; i++){
			if(funcionarios[i] != null){
				if(funcionarios[i].getNome().equalsIgnoreCase(funcionario.getNome())){
					funcionarios[i] = null;
					return true;
				}
			}
		}
		return false;
	}
	
	public Funcionario buscaFuncionario(String nome){
			for(int i=0;i<funcionarios.length;i++){
				if(funcionarios[i]!=null){
						if(funcionarios[i].getNome().equalsIgnoreCase(nome)){
							return funcionarios[i]; 
						}
				}
			}
		return null; 
	}
	
	public Double mostraSalario(String nome){
		for(int i=0;i<funcionarios.length;i++){
				if(funcionarios[i]!=null){
						if(funcionarios[i].getNome().equalsIgnoreCase(nome)){
							return funcionarios[i].calculaSalario(); 
						}
				}
			}
		return 0.0; 
	}
	
	public String executaTarefa(Funcionario funcionario, String p){
		
		if(funcionario instanceof Bibliotecario){
			return ((Bibliotecario) funcionario).processarEmprestimo(p);
			
		}else if(funcionario instanceof Atendente){
			return ((Atendente) funcionario).atenderUsuario(p);
		}
			
		else
			return ((Auxiliar) funcionario).organizarLivros(p);
		
		
	}
}
