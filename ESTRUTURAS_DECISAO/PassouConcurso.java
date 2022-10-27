/*Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova. */

package ESTRUTURAS_DECISAO;

import java.util.Scanner;

public class PassouConcurso {

    static final Integer NOTA_GERAL = 150;

    static final Integer NOTA_MINIMA = 60;

     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota de português: ");
        Integer notaP = scanner.nextInt();

        System.out.print("Digite a nota de matemática: ");
        Integer notaM = scanner.nextInt();

        boolean notaMinimaAprovacaoPort = notaP >= NOTA_MINIMA;

        Boolean notaMinimaAprovacaoMat = notaM >= NOTA_MINIMA;

        Integer totalNota = notaP + notaM;

        Boolean notaNecessaria = totalNota >= NOTA_GERAL;

        Boolean aprovacao = notaMinimaAprovacaoPort && notaMinimaAprovacaoMat && notaNecessaria;

        if (aprovacao) {
            System.out.println("Você foi aprovado!");
        } else {
            System.out.println("Infelizmente você não passou!");
        }
        scanner.close();
     }
}
