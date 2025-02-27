/*Prof Chen- Tarefa 1– copie e execute no programiz ou vscode o programa.*/

import java.util.Random;
public class RandomNumbers {
public static void main(String[] args) {
Random rand = new Random();
int[] numbers = new int[5];
int countNegative = 0;
System.out.println("Numeros gerado:");
for (int i = 0; i < numbers.length; i++) {
numbers[i] = rand.nextInt(199) - 99; 
System.out.print(numbers[i] + " ");
if (numbers[i] < 0) {
countNegative++;
}
}
System.out.println("\nQtde de nros negativos: " + countNegative);
}
}

/* Tarefa 2 – altere o programa da tarefa 1 e  imprima a quantidade de números 
positivos (maior ou igual a zero).*/
import java.util.Random;
public class RandomNumbers {
public static void main(String[] args) {
Random rand new Random();
int[] numbers = new int[5];
int countPositive = 0:

System.out.println("Numeros gerado:");

for (int i=0; i < numbers.length; i++) {
numbers[i] = rand.nextInt(199) 99; 
System.out.print(numbers[i] + " "):
if (numbers[i] >= 0) {
countPositive++:
}
}
System.out.println("\nQtde de nros positivos: "+ countPositive);
}
}

/*Tarefa 3 – altere a tarefa 1 para 50 numeros em vez de 5 nros. Mostre somente a quantidade 
de números negativos (tire do programa a parte de impressão dos números). */
import java.util.Random;

public class RandomNumbers {
public static void main(String[] args) {
Random rand new Random();
int[] numbers new int[50]:
int countNegative = 0:

for (int i=0; i < numbers.length; i++) {
numbers[i] = rand.nextInt(199) - 99;
if (numbers[i] < 0) {
countNegative++;
}
}
System.out.println("\nQtde de nros negativos: "+ countNegative);
}
}

/* Tarefa 4 – altere a tarefa 2 para 50 numeros em vez de 5 nros. Mostre somente a quantidade 
de números positivos (tire do programa a parte de impressão dos números). */
import java.util.Random;

public class RandomNumbers {
public static void main(String[] args) {
Random rand new Random();
int[] numbers new int[50]:
int countPositive = 0:

for (int i=0; i < numbers.length; i++) {
numbers[i] = rand.nextInt(199) - 99; 
if (numbers[i] >= 0) {
countPositive++;
}
}
System.out.println("\nQtde de nros positivos: "+ countPositive);
}
}

/*Tarefa 5 – altere a tarefa 3 e mostre a quantidade de números menor que zero, quantidades de zeros
e quantidades maior que zero.*/
import java.util.Random;

public class RandomNumbers {
public static void main(String[] args) {
Random rand new Random();
int[] numbers new int[50];
int count Negative = 0;
int countZero = 0;
int countPositive = 0;

for (int i=0; i numbers.length; i++) {
numbers [1] rand.nextInt(199) 99; 
if (numbers[i] < 0) {
countNegative++;
} else if (numbers [i] == 0) {
countZero++;
} else {
countPositive++;
}
}
System.out.println("\nQtde de nros negativos:" + countNegative);
System.out.println("\nQtde de zeros: "+ countZero);
System.out.println("\nQtde de nros positivos:" + countPositive);
}
}


