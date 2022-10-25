package OPERADORES;

import java.util.Scanner;

public class DescontoFrete2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double produto = scanner.nextDouble();
        
        Boolean produtoComFrete = produto < 100;

        Double precoFinal = produto;

        if (produtoComFrete) {
            precoFinal += 15.00;
        }
        System.out.println("Valor final do produto: R$" + precoFinal);

        scanner.close();
    }
}
