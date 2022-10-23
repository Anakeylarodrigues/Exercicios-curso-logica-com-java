/*Crie um programa que lê, do console, o nome e o sobrenome de uma pessoa e depois 
imprime o nome completo.*/

package VARIAVEIS_CONSTANTES;

import java.util.Scanner;

public class ImprimirNome {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobreNome = scanner.nextLine();

        System.out.println("Olá " + nome + " " + sobreNome + "!");

        scanner.close();
    }
}
