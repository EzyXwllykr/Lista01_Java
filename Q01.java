/*
NOME: Esther Araujo Carreiro
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

import java.util.Scanner;

public class Q01 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite uma palavra: ");
    String UserWord = sc.nextLine();
    System.out.println(UserWord);
    String s = UserWord;
    int tamanho = s.lenght();
    int meio = tamanho / 2;
    System.out.println("A quantidade de dígitos da palavra é: " + s.lenght());
    System.out.println("A primeira letra é: " + s.charAt(0));
    //letra central de uma palavra de número par
    if (tamanho % 2 == 0) {
      char letra1 = s.charAt(meio - 1);
      char letra2 = s.charAt(meio);
      System.out.println("As letras centrais são: " + letra1 + " e " + letra2);
    } //letra central de uma palavra de número ímpar
    else {
      char letra = s.charAt(meio);
      System.out.println("A letra central é: " + letra);
    }
    System.out.println("A última letra da palavra é: " + s.charAt(s.length() - 1));
    
    System.out.println(s.toUpperCase());
    System.out.println(s.toLowerCase());
  }
}
