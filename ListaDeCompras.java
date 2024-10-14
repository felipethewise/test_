package mercado;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCompras {

	public static void main(String[] args) {
		
			System.out.println("Criando uma lista de compras.");
		
		// Usuario adicionar itens
		System.out.println("Adicione um item à lista: ");
		Scanner scanner = new Scanner(System.in);
		String item01add = scanner.nextLine();
			//Mensagem para o usuario
		System.out.println("Item adicionado!");
		
		System.out.println("Adicione mais um item à lista: ");
		Scanner scanner2 = new Scanner(System.in);
		String item02add = scanner2.nextLine();
			//Mensagem para o usuario
		System.out.println("Item adicionado!");
		
		System.out.println("Adicione mais um item à lista: ");
		Scanner scanner3 = new Scanner(System.in);
		String item03add = scanner3.nextLine();
			//Mensagem para o usuario
		System.out.println("Item adicionado!");
		
		System.out.println("Adicione mais um item à lista: ");
		Scanner scanner4= new Scanner(System.in);
		String item04add = scanner4.nextLine();
			//Mensagem para o usuario
		System.out.println("Item adicionado!");
		// Lista com os novos itens adicionados
		ArrayList<String> Lista = new ArrayList<>();
			Lista.add(item01add);
			Lista.add(item02add);
			Lista.add(item03add);
			Lista.add(item04add);
			
		// Mostrando lista e quantidade de itens
		System.out.println("Lista de Compras: "+Lista);
		System.out.println("Número total de itens na lista: "+Lista.size());
		
		//Fechando o Scanner
		scanner.close();
		scanner2.close();
		scanner3.close();
		scanner4.close();
		
	}
}
