/*Cálculo de gastos familiar*/

package OPERADORES;

import java.util.Scanner;

public class CalcularGastos {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor das contas... ");

        Double totalContas = 0.0;

        System.out.print("Luz: ");
        totalContas += scanner.nextDouble();

        System.out.print("Água: ");
        totalContas += scanner.nextDouble();

        System.out.print("Telefone: ");
        totalContas += scanner.nextDouble();

        System.out.print("Escola filho: ");
        totalContas += scanner.nextDouble();

        System.out.print("Fatura cartão: ");
        totalContas += scanner.nextDouble();

        System.out.print("Supermercado: ");
        totalContas += scanner.nextDouble();

        System.out.print("Total de gastos: " + totalContas);

        scanner.close();
    }
}
