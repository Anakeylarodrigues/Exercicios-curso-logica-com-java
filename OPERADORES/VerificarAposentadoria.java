package OPERADORES;

/*Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que essa 
pessoa contribuiu com a previdência, depois verifique se ela pode aposentar ou não */

import java.util.Scanner;

public class VerificarAposentadoria {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        Integer idade = scanner.nextInt();

        System.out.print("Digite seu tempo de contribuição em anos: ");
        Integer tempoContribuicao = scanner.nextInt();

        if (idade >= 55 && tempoContribuicao >= 25) {
            System.out.println("Você pode se aposentar!");
        } else {
            System.out.println("Você ainda não pode se aposentar!");
        }
        scanner.close();
    }
}
