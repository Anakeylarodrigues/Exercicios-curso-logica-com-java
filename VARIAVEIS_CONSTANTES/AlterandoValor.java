package VARIAVEIS_CONSTANTES;

import java.util.Scanner;

public class AlterandoValor {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProd = scanner.nextDouble();

        System.out.print("Digite o tipo de pagamento sendo 1 - à vista e 2 - à prazo: ");
        Integer tipoPgto = scanner.nextInt();

        Boolean pgtoAVista = tipoPgto.equals(1);

        Double juros = 0.0;

        if (!pgtoAVista) {
            juros = 10.0;
        }

        Double acrescimo = valorProd * juros / 100;

        Double total = valorProd + acrescimo;

        System.out.println("Valor totoal: " + total);

        scanner.close();
    }
}
