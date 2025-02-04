import java.util.*;
public class Loja {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Produto item1 = new Produto("Lapis", 2.5, 12, "Escolar");
		Produto item2 = new Produto("Borracha", 3.4, 10, "Escolar");
		Produto item3 = new Produto("Maça", 1.2, 50, "Alimenticio");
		
		int op = 0;
		int prod;
		int tipo = 0, quantidade;
		double preco, frete, desconto, imposto;
		boolean mostrarEstoque = true;
		
		do{
			do
			{
				System.out.println("------MENU------");
				System.out.println("Produto 1 -"+ item1.exibirDetalhes());
				System.out.println("Produto 2 -"+ item2.exibirDetalhes());
				System.out.println("Produto 3 -"+ item3.exibirDetalhes());
				System.out.println("Qual produto deseja?");
				prod = scan.nextInt();
			} while (prod<1 || prod>3);
			
			
			do
			{
				System.out.printf("1 - Vender Produto\n2 - Comprar produto\n3 - Calcular o valor total do estoque\4 - Exibir detalhes\n5 - Sair do programa\n");
				op = scan.nextInt();
			} while (op<1 || op >5);
			switch(op){
				case 1:
					System.out.printf("1 - Vender produto com desconto\n2 - Vender produto sem desconto\n");
					tipo = scan.nextInt();
					switch(tipo){
						case 1:
							System.out.println("Digite o valor do produto:");
							quantidade = scan.nextInt();
							System.out.println("Digite o desconto do produto:");
							desconto = scan.nextDouble();
							item1.vender(quantidade, desconto);
							break;
						case 2:
							System.out.println("Digite a quantidade para vender:");
							quantidade = scan.nextInt();
							item1.vender(quantidade);
							break;
					}
				default:
				break;
				case 2:
					System.out.printf("1 - Comprar com frete\n2 - Comprar sem frete\n");
					tipo = scan.nextInt();
					switch(tipo){
						case 1:
							System.out.println("Digite a quantidade do produto:");
							quantidade = scan.nextInt();
							System.out.println("Digite o frete:");
							frete = scan.nextDouble();
							item1.comprar(quantidade,frete);
							break;	
						case 2:
							System.out.println("Digite a quantidade do produto:");
							quantidade = scan.nextInt();
							item1.comprar(quantidade);
							break;
					}
				
				break;
				case 3:
					System.out.printf("1 - Calcular o valor total do estoque com imposto\n2 - Calcular sem imposto\n");
					tipo = scan.nextInt();
					switch(tipo){	
						case 1: 
							System.out.println("Digite o percentual do imposto");
							imposto = scan.nextDouble();
							item1.calcularValorTotalEstoque(imposto);
							break;
						case 2:
							System.out.println("Valor total do estoque R$ "+ item1.calcularValorTotalEstoque());
							break;
					}
				break;
				case 4:
					if(mostrarEstoque == true){
						item1.exibirDetalhes(true);
					}else
						item1.exibirDetalhes();
				break;
				case 5:
					System.out.println("Siando do programa...");
					break;
			}
		}while(op != 5);
		
	}
}

