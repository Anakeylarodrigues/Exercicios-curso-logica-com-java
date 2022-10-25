package OPERADORES;

/*Crie um programa que receba o valor de um produto e exiba o valor final da compra. 
Esse valor final será o valor do produto mais o valor do frete */

import java.util.Scanner;

public class DescontoFrete {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double produto = scanner.nextDouble();

        Integer frete = 15;

        if (produto < 100) {
            Double precoFinal = produto + frete;
            System.out.println("Valor total com frete: R$ " + precoFinal);
        } else {
            System.out.println("Valor final: R$ " + produto);
        }
        scanner.close();
    }
}
