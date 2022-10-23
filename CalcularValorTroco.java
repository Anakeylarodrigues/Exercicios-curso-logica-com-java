import java.util.Scanner;

public class CalcularValorTroco {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Valor pago pelo cliente: ");
        double valorPago = scanner.nextDouble();

        double troco = valorPago - valorProduto;
        System.out.println("Troco: " + troco);

        scanner.close();
    }
}
