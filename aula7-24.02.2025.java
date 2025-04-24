/*Aula Jefferson - 24.04*/

/*1) Foi feita uma pesquisa entre 5 habitantes de uma região. Foram coletados os dados de idade,
sexo (M/F) e salário. Faça um algoritmo que informe:
a) a média de idade do grupo;
b) a média de salários dos homens;
c) quantidade de mulheres com salário abaixo de R$600,00.*/

package Aula2404;
import java.util.Scanner;
public class exer1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalIdade = 0;
        double somaSalarioHomens = 0;
        int quantidadeHomens = 0;
        int mulheresSalarioBaixo = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Pessoa " + i + ":");
            
            System.out.print("Idade: ");
            int idade = input.nextInt();
            totalIdade += idade;

            System.out.print("Sexo (M/F): ");
            char sexo = input.next().toUpperCase().charAt(0);

            System.out.print("Salário: R$");
            double salario = input.nextDouble();

            if (sexo == 'M') {
                somaSalarioHomens += salario;
                quantidadeHomens++;
            } else if (sexo == 'F' && salario < 600) {
                mulheresSalarioBaixo++;
            }
        }

        double mediaIdade = totalIdade / 20.0;
        double mediaSalarioHomens = (quantidadeHomens > 0) ? somaSalarioHomens / quantidadeHomens : 0;

        System.out.printf("a) Média de idade do grupo: %.2f anos\n", mediaIdade);
        System.out.printf("b) Média dos salários dos homens: R$%.2f\n", mediaSalarioHomens);
        System.out.println("c) Quantidade de mulheres com salário abaixo de R$600,00: " + mulheresSalarioBaixo);
        
        input.close();
    }
}

/*2) Elaborar um algoritmo que leia um conjunto de valores reais, correspondentes a 10 notas dos
alunos de três turmas(1,2,3) , notas estas que variam de 0 a 10. Calcule e mostre:
a) A quantidade de alunos aprovados (nota >= 6.0)
b) a média das notas da turma*/

package Aula2404;
import java.util.Scanner;
public class exer2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int aprovados = 0;
        double somaNotas = 0;
        int totalNotas = 0;

        for (int turma = 1; turma <= 3; turma++) {
            System.out.println("Turma " + turma + ":");

            for (int i = 1; i <= 10; i++) {
                double nota;
                do {
                    System.out.print("Digite a nota do aluno " + i + " (0 a 10): ");
                    nota = input.nextDouble();
                } while (nota < 0 || nota > 10);

                if (nota >= 6.0) {
                    aprovados++;
                }

                somaNotas += nota;
                totalNotas++;
            }
        }

        double mediaGeral = somaNotas / totalNotas;

        System.out.println("\na) Quantidade de alunos aprovados: " + aprovados);
        System.out.printf("b) Média geral das notas: %.2f\n", mediaGeral);

        input.close();
    }
}

/*3) Faça um algoritmo que leia um valor n, inteiro e positivo, calcule e mostre a seguinte soma: S =
1+1/2 + 1/3 + 1/4 +...+ 1/n*/
package Aula2404;
import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double soma = 0.0;

        System.out.print("Digite um valor inteiro e positivo: ");
        n = sc.nextInt();

        if (n <= 0) {
            System.out.println("O valor precisa ser um número inteiro positivo.");
        } else {
            for (int i = 1; i <= n; i++) {
                soma += 1.0 / i;
            }
            System.out.printf("A soma S é: %.4f\n", soma);
        }

        sc.close();
    }
}
