/*Exemplo A*/

package Aula2003;
import java.util.Scanner;
public class ExemploA {
    public static void main(String args[]){
        Scanner objScan = new Scanner(System.in);
        int n1, n2, soma;
        System.out.println("INf. n1 ");
        n1 = objScan.nextInt();
        System.out.println("INf. n2 ");
        n2 = objScan.nextInt();
        soma = Somar(n1, n2);
        System.out.println("A soma foi " + soma);
    }
    static int Somar(int n1, int n2) {
        return n1 + n2;
    }
}

/*Exemplo B*/
package Aula2003;
public class ExemploB {
    int num1;
    int num2;

    void rec(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    int Somar() {
        return this.num1 + num2;
}
}
