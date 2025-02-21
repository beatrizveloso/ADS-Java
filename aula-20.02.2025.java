
/*Exercício 1*/
package Aula2002;

public class exe {
    public static void main (String args[])/*public modificador, static interno*/{
          int n1=6, n2=6, soma=0, sub=0, mult=0, divi=0;
          soma = Somar(n1, n2);
          System.out.println("A soma foi " + soma);

          sub = Sub(n1, n2);
          System.out.println("A subtração foi " + sub);

          mult = Mult(n1, n2);
          System.out.println("A multiplicação foi " + mult);

          divi = Divi(n1, n2);
          System.out.println("A divisão foi " + divi);
}

    static int Somar(int n1, int n2) {
         return n1 + n2;
    }
    static int Sub(int n1, int n2) {
         return n1 - n2;
    }
     static int Mult(int n1, int n2) {
         return n1 * n2;
    }
    static int Divi(int n1, int n2) {
         return n1 / n2;
}
}

/*Exercício 2*/
package Aula2002;
public class ExercicioBlackBoard {
    public static void main (String args[]) {
        int a=2, b=4, d=6;
        int A1, A2;
        int Tot;
        A1 = A1(a,b);
        System.out.println("A1 " + A1);
        A2 = A2(b, d);
        System.out.println("A2 " + A2);
        Tot = Tot(A1, A2);
        System.out.println("Total "+ Tot);
    }

    static int A1(int a, int b) {
    return a * b;
}
   static int A2(int b, int d) {
    return b * d;
}
   static int Tot(int A1, int A2){
    return A1 + A2;
}
}
