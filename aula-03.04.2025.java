/*Aula Jefferson - Estrutura de repetição*/
package Aula0304;

public class exemplo {

    public static void main(String args[]) {
        int cont = 1;;
        int resto;

        while (cont <= 10) {
            System.out.println("Número " + cont);
            cont++;
        }
        do {
            System.out.println("Número " + cont);
            cont++;
        } while (cont <= 10);

        for (cont = 1; cont <= 10; cont++) {
            resto = cont % 2;
            if (resto == 1) {
                System.out.println("Número " + cont);
            }
        }

        for (cont = 1; cont <= 10; cont++) {
            resto = cont % 1;
            if (resto == 0) {
                System.out.println("Número " + cont);
            }
        }
    }
}

/*1) Faça um algoritmo que imprima os números pares entre 0 e 100*/
public class exer1 {
    public static void main(String args[]) {
        int cont = 1;;
        int resto;

        for (cont = 1; cont <= 100; cont++) {
            resto = cont % 2;
            if (resto == 0) {
                System.out.println("Número " + cont);
            }
        }
    }
}

/*2) Faça um algoritmo que imprima os números de 1 a 50 de 1 em 1 e de 52 a 100 de 2 em 2.*/
public class exer2 {
    public static void main(String args[]) {
        int cont = 1;;
        int resto;
   
     for (cont = 1; cont <= 50; cont++) {
            resto = cont % 1;
            if (resto == 0) {
                System.out.println("Número " + cont);
            }
        }
      for (cont = 52; cont <= 100; cont++) {
            resto = cont % 2;
            if (resto == 0) {
                System.out.println("Número " + cont);
            }
      }
    }   
}

/*3) Escreva um algoritmo que leia a quantidade de valores que serão processados, depois leia os valores e calcule a média dos mesmos. 
     Utilize a estrutura de repetição */
import java.util.Scanner;

public class exer3 {
    public static void main(String args[]) {
        int quantidade, cont;
        double soma = 0, media;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores a serem processados: ");
        quantidade = scanner.nextInt();

        for (cont = 1; cont <= quantidade; cont++) {
            System.out.print("Digite o valor " + cont + ": ");
            double valor = scanner.nextDouble();
            soma += valor;
        }

        media = soma / quantidade;
        System.out.println("A média dos valores é: " + media);

        scanner.close();
    }
}

/* 4) Cada espectador de um cinema respondeu a um questionário no qual constava sua idade e a sua opinião em relação ao filme: 
ótimo - 3, bom - 2, regular - 1.
Faça uma Programa que receba a idade e a opinião de N espectadores, calcule e imprima:
• a média das idades das pessoas que responderam ótimo;
• a quantidade de pessoas que responderam regular;*/

import java.util.Scanner;

public class exer4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        int n, opiniao, idade, contReg = 0, somaIddOtimo = 0, contOtimo = 0;
        
        System.out.print("Digite o número de espectadores: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a idade do espectador " + i + ": ");
            idade = scanner.nextInt();

            System.out.print("Digite a opinião do espectador " + i + " (ótimo - 3, bom - 2, regular - 1): ");
            opiniao = scanner.nextInt();

            if (opiniao == 3) {
                somaIddOtimo += idade;
                contOtimo++;
            } else if (opiniao == 1) {
                contReg++;
            }
        }

        if (contOtimo > 0) {
            double mediaIddOtimo = somaIddOtimo / (double) contOtimo;
            System.out.println("A média das idades das pessoas que responderam 'ótimo' é: " + mediaIddOtimo);
        } else {
            System.out.println("Nenhuma pessoa respondeu 'ótimo'.");
        }

        System.out.println("A quantidade de pessoas que responderam 'regular' é: " + contReg);
        
        scanner.close();
    }
}








