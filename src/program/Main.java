package program;

/*
beecrowd | 1048 - Aumento de Salário

A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:

Salário				Percentual de Reajuste
0 - 400.00					15%
400.01 - 800.00				12%
800.01 - 1200.00			10%
1200.01 - 2000.00			7%
Acima de 2000.00			4%

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho
e o índice reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste ganho,
conforme exemplo abaixo.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double porcentagem = 0;

		if (salario <= 400.00) {
			porcentagem = 0.15;
		} else if (salario >= 400.01 & salario <= 800.00) {
			porcentagem = 0.12;
		} else if (salario >= 800.01 & salario <= 1200.00) {
			porcentagem = 0.10;
		} else if (salario >= 1200.01 & salario <= 2000.00) {
			porcentagem = 0.07;
		} else if (salario > 2000) {
			porcentagem = 0.04;
		}
		
		double reajuste = salario * porcentagem;
		salario += reajuste;
		System.out.printf("Novo salario: %.2f\n"
				+ "Reajuste ganho: %.2f\n"
				+ "Em percentual: %.0f %%\n", salario, reajuste, porcentagem * 100);
		sc.close();
	}
}
