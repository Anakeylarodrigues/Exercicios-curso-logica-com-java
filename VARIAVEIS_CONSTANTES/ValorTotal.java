/*Encontre o valor total baseado na quantidade e no desconto */

package VARIAVEIS_CONSTANTES;

import java.util.Scanner;

public class ValorTotal {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProd = scanner.nextDouble();

        System.out.print("Quantidade do produto: ");
        Integer qtdProd = scanner.nextInt();

        Double subTotal = valorProd * qtdProd;

        Boolean totalProd = qtdProd >= 10;

        Double desc = 0.0;

        if (totalProd) {
            desc = 10.0;
        } 

        Double desconto = subTotal * desc / 100;

        Double total = subTotal - desconto;

        System.out.println("O valor total é: " + total);

        scanner.close();
    }
}
