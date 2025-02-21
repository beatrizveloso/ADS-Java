package Aula1302;
public class Exer1 {

    public static void main (String args[])/*public modificador, static interno*/{
          int n1=6, n2=6;
          int soma=0;
          soma = somar(n1, n2);
          System.out.println("A soma foi " + soma);
          int sub=0;
          sub = subtrair(n1, n2);
          System.out.println("A subtração foi " + sub);
          int mult=0;
          mult = multiplicacao(n1, n2);
          System.out.println("A multiplicação foi " + mult);
          int divi=0;
          divi = divisao(n1, n2);
          System.out.println("A divisão foi " + divi);
}

    static int somar(int n1, int n2) {
         return n1 + n2;
    }
    static int subtrair(int n1, int n2) {
         return n1 - n2;
    }
     static int multiplicacao(int n1, int n2) {
         return n1 * n2;
    }
    static int divisao(int n1, int n2) {
         return n1 / n2;
}
}


