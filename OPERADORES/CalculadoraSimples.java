/*Para criar uma calculadora simples você vai precisar receber três informações pelo console. 
São os dois números que participarão da operação e também a operação que será realizada.*/

package OPERADORES;

import java.util.Scanner;

public class CalculadoraSimples {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        Double num1 = scanner.nextDouble();

        System.out.print("Digite o número da operação que deseja [1 - Adição, 2 - Subtração, 3 - Multiplicação e 4 - Divisão] : ");
        Integer tipoOperacao = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        Double num2 = scanner.nextDouble();

        Double result;

        if (tipoOperacao.equals(1)) {
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        } else if (tipoOperacao.equals(2)) {
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
        } else if (tipoOperacao.equals(3)) {
            result = num1 * num2;
            System.out.println(num1 + " x " + num2 + " = " + result);
        } else if (tipoOperacao.equals(4)) {
            result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
        } else {
            System.out.println("Opção inválida!");
        }
        scanner.close();
    }
}