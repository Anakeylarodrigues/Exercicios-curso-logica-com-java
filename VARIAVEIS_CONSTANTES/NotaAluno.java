/*Crie um programa que informa se o aluno passou de ano de acordo com o que foi passado na aula*/

package VARIAVEIS_CONSTANTES;

import java.util.Scanner;

public class NotaAluno {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        int nota = scanner.nextInt();

        boolean result = nota >= 70;

        if (result) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
        scanner.close();
    }
}
