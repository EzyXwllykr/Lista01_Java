/*
NOME: Esther Araujo Carreiro
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota (0 a 100): ");
        int nota = scanner.nextInt();
        String conceito;

        if (nota > 90) {
            conceito = "A";
        } else if (nota > 80) {
            conceito = "B";
        } else if (nota > 70) {
            conceito = "C";
        } else if (nota > 60) {
            conceito = "D";
        } else {
            conceito = "E";
        }
        
        System.out.println("O conceito da nota é: " + conceito);
        
        scanner.close();
    }
}
