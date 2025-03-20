/*Exemplo A*/
package Aula2003;
import java.util.Scanner;
public class ExemploA {
    public static void main(String args[]){
        Scanner objScan = new Scanner(System.in);
        ExemploB objExecB = new ExemploB();
        int n1, n2, soma;
        System.out.println("INf. n1 ");
        n1 = objScan.nextInt();
        System.out.println("INf. n2 ");
        n2 = objScan.nextInt();
        objExecB.rec(n1, n2);
        soma = objExecB.Somar();
        System.out.println("A soma foi " + soma);
    }
}


/*Exemplo B*/
package Aula2003;
public class ExemploB {
    private int num1;
    private int num2;

    public void rec(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int Somar() {
        return this.num1 + this.num2;
}
}

