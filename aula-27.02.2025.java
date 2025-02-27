/*Prof Jeffersson- Exercícios do Blackboard*/
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

