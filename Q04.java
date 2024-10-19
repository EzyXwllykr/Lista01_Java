/*
NOME: Esther Araujo Carreiro
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

public class Q04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        
        double maiorNota = notas[0];
        double menorNota = notas[0];
        
        for (double nota : notas) {
            if (nota > maiorNota) maiorNota = nota;
            if (nota < menorNota) menorNota = nota;
        }
        
        double media = soma / notas.length;
        
        System.out.println("A maior nota é: " + maiorNota);
        System.out.println("A menor nota é: " + menorNota);
        System.out.println("A média da turma é: " + media);

        scanner.close();
    }
}
