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
public class RestoDivisao {
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

