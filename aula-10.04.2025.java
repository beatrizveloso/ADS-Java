/*1) Na empresa onde trabalhamos, há tabelas com o valor gasto em cada mês. Para fechar o balanço do primeiro trimestre, precisamos somar o gato total. Em janeiro foram gastos 15000 reais; em fevereiro, 
23000 reais e, em março, 17000 reais.*/

package Aula1004;
import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        int gastoJaneiro = 15000;
        int gastoFevereiro = 23000;
        int gastoMarco = 17000;

        int gastoTotal = gastoJaneiro + gastoFevereiro + gastoMarco;

        System.out.println("O gasto total no primeiro trimestre foi: R$ " + gastoTotal);
    }
}

/*2) Faça um programa que imprima o gasto total no trimestre e, no final, avisa se o gasto total estourou o orçamento de 50000 para o trimestre*/

package Aula1004;
import java.util.Scanner;
public class exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double janeiro, fevereiro, março;

        System.out.print("Digite o gasto de janeiro: R$ ");
        janeiro = scanner.nextDouble();
        System.out.print("Digite o gasto de fevereiro: R$ ");
        fevereiro = scanner.nextDouble();
        System.out.print("Digite o gasto de março: R$ ");
        março = scanner.nextDouble();

        double total = janeiro + fevereiro + março;

        System.out.printf("\nGasto total no trimestre: R$ %.2f\n", total);
        if (total > 50000) {
            System.out.println("ALERTA: O gasto total ultrapassou o orçamento de R$ 50.000!");
        } else {
            System.out.println("O gasto total está dentro do orçamento.");
        }
        scanner.close();
    }
}
