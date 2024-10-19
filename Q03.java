/*
NOME: Esther Araujo Carreiro
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

public class Q03 {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Digite o valor cheio da compra: ");
        double valorCheio = scanner.nextDouble();
      
        System.out.print("Digite o valor do desconto: ");
        double desconto = scanner.nextDouble();

        double valorNovo = valorCheio - desconto;
        
        System.out.println("O valor cheio é: " + valorCheio);
        System.out.println("O valor do desconto é: " + desconto);
        System.out.println("O valor novo é: " + valorNovo);
        
        scanner.close();
  }
}
