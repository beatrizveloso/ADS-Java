/*Prof Jeffersson- Exercícios do Blackboard*/


/*Exercício 1 - Elaborar um algoritmo que solicite os dados de 2 retângulos para calcular e visualizar três áreas: AT (área total das duas figuras), A1 e A2 (áreas dos retângulos superior e inferior). Os únicos dados 
conhecidos são os valores a, b, d.*/

package Aula2702;
import java.util.Scanner;
public class Exer1 {
    public static void main(String args[]) {
        Scanner objScan = new Scanner(System.in);
        int a, b ,d;
        int A1, A2;
        System.out.println("Informe a: ");
        a = objScan.nextInt();
        System.out.println("Informe b: ");
        b = objScan.nextInt();
        System.out.println("Informe d: ");
        d = objScan.nextInt();
        A1 = A1(a,b);
        System.out.println("A1 " + A1);
        A2 = A2(b,d);
        System.out.println("A2 " + A2);
    }
    static int A1(int a, int b) {
        return a * b;
    }
    static int A2(int b, int d) {
        return b * d;
    }
}

/*Exercício 2 - Elabore um algoritmo que leia dois números inteiros e imprima o resto da divisão inteira de um pelo outro*/

package Aula2702;
import java.util.Scanner;
public class Exer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        int resto = num1 % num2;
        System.out.println("O resto da divisão inteira de " + num1 + " por " + num2 + " é: " + resto);
    }
}


/*Exercício 3 - Faça um algoritmo que leia um valor representando o gasto realizado por um cliente do restaurante ComaBem e visualize o valor total a ser pago, 
considerando os 10% do garçom.*/

package Aula2702;
import java.util.Scanner;
public class Exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor gasto no restaurante: R$ ");
        double valorGasto = scanner.nextDouble();
        double gorjeta = valorGasto * 0.10;
        double valorTotal = valorGasto + gorjeta;
        System.out.println("Valor total a ser pago (com 10% de gorjeta): R$ " + valorTotal);
    }
}

/*Exercício 4 - Faça um programa em que:
a) Obtenha o valor para a variável HT (horas
trabalhadas no mês);
b) Obtenha o valor para a variável VH (valor hora
trabalhada):
c) Obtenha o valor para a variável PA (percentual
de aumento);
d) Calcule o salário bruto => SB = HT * VH;
e) Calcule novo valor do salário => NS = SB +
((SB * PA)/100);
f) Apresente os valores do Salário Bruto
 */
package Aula2702;
import java.util.Scanner;
public class Exer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de horas trabalhadas no mês (HT): ");
        double HT = scanner.nextDouble();
        System.out.print("Digite o valor da hora trabalhada (VH): R$ ");
        double VH = scanner.nextDouble();
        System.out.print("Digite o percentual de aumento (PA): ");
        double PA = scanner.nextDouble();
        double SB = HT * VH;
        double NS = SB + ((SB * PA) / 100);
        System.out.println("Salário Bruto (SB): R$ " + SB);
        System.out.println("Novo Salário (NS) após o aumento: R$ " + NS);
    }
}


/*Exercício 5 - Uma granja possui um controle automatizado de
cada frango da sua produção. No pé direito do
frango há um anel com chip de identificação, no
pé esquerdo são dois anéis para indicar o tipo de
alimentação que deve consumir. Sabendo que o
anel com chip custa 4,00 reais e o de alimentação
custa 3,50 faça um programa para calcular o
gasto da granja para marcar seus frangos. */
package Aula2702;
import java.util.Scanner;
public class Exer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de frangos: ");
        int numFrangos = scanner.nextInt();

        double custoChip = 4.00;
        double custoAlimentacao = 3.50;

        double gastoTotal = numFrangos * (custoChip + 2 * custoAlimentacao);

        System.out.println("O gasto total para marcar os frangos é: R$ " + gastoTotal);
    }
}


/*Exercício 6 - Faça um programa que receba a quantidade e o valor de três produtos no seguinte formato:
quantidade1 valor1 quantidade2 valor2 quantidade3 valor3. 
O programa deve calcular esses valores no seguinte formato TOTAL = Quantidade1* Valor1 + Quantidade2 * valor2 + Quantidade3 * Valor3.
Mostrar sub-total e o total geral
 */
package Aula2702;
import java.util.Scanner;
public class Exer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade e o valor do primeiro produto (quantidade1 valor1): ");
        int quantidade1 = scanner.nextInt();
        double valor1 = scanner.nextDouble();

        System.out.print("Digite a quantidade e o valor do segundo produto (quantidade2 valor2): ");
        int quantidade2 = scanner.nextInt();
        double valor2 = scanner.nextDouble();

        System.out.print("Digite a quantidade e o valor do terceiro produto (quantidade3 valor3): ");
        int quantidade3 = scanner.nextInt();
        double valor3 = scanner.nextDouble();

        double subtotal1 = quantidade1 * valor1;
        double subtotal2 = quantidade2 * valor2;
        double subtotal3 = quantidade3 * valor3;

        double totalGeral = subtotal1 + subtotal2 + subtotal3;

        System.out.println("Sub-total do primeiro produto: R$ " + subtotal1);
        System.out.println("Sub-total do segundo produto: R$ " + subtotal2);
        System.out.println("Sub-total do terceiro produto: R$ " + subtotal3);
        System.out.println("Total geral: R$ " + totalGeral);
    }
}
