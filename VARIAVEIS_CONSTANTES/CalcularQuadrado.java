package VARIAVEIS_CONSTANTES;

/*Leia um número no console e depois faça o cálculo do quadrado desse número e exiba o resultado no console.*/

import java.util.Scanner;

public class CalcularQuadrado {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número que deseja saber o quadrado: ");
        int num = scanner.nextInt();

        int result = num * num;

        System.out.println("O quadrado de " + num + " é: " + result);

        scanner.close();
    }
}
