/*
NOME: Esther Araujo Carreiro
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Scanner;

public class Q02 {
    public static boolean isPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
        
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("O número digitado é par.");
        } else {
            System.out.println("O número digitado é ímpar.");
        }
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        if (isPrimo(numero)) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }
        System.out.println("A raiz quadrada do número é: " + Math.sqrt(numero));
        System.out.println("O número elevado a 3 é igual a: " + Math.pow(numero, 3));

        scanner.close();
    }
}
