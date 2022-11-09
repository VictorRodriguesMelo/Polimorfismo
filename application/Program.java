package application;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		List <Pessoa> lista = new ArrayList<>();
		
		System.out.print("Quantidade de pessoas: ");
		int quantidadePessoas = sc.nextInt();
		
		for (int i = 1; i<=quantidadePessoas; i++) {
			System.out.print("Fisica (f) e Jurídica (j):");
			char car = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			String nome = sc.next();
			
			System.out.print("Renda anual: ");
			double rendaMensal = sc.nextDouble();
			
			if (car == 'f') {
				System.out.print("Gastos com saúde: ");
				double gastosSaude = sc.nextDouble();
				
				lista.add(new PessoaFisica(nome, rendaMensal, gastosSaude));				
			}
			if(car == 'j') {
				System.out.print("Número de funcionário: ");
				int numeroFuncionario = sc.nextInt();				
				lista.add(new PessoaJuridica(nome, rendaMensal, numeroFuncionario));
				
			}			
		}
		double soma = 0;
		System.out.println();
		System.out.println("Impostos pagos:");
		for (Pessoa etique : lista) {
			double taxa = etique.impostos();
		System.out.println(etique.getNome() + "   $   " + String.format("%.2f",etique.impostos()));		
		
		  soma =+taxa;		
		}		
		System.out.println("Total de imposto: " + String.format("%.2f", soma));
		sc.close();
	}

}
