package OPERADORES;

import java.util.Scanner;

public class VerificarAposentadoria2 {

    static final Integer IDADE_MINIMA_APOSENTADORIA = 55;

    static final Integer TEMPO_MINIMO_CONTRIBUICAO = 25;
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        Integer idade = scanner.nextInt();

        System.out.print("Digite seu tempo de contribuição em anos: ");
        Integer tempoContribuicao = scanner.nextInt();

        Boolean idadeParaAposentar = idade >= IDADE_MINIMA_APOSENTADORIA;

        Boolean tempoContribuicaoSuficiente = tempoContribuicao >= TEMPO_MINIMO_CONTRIBUICAO;

        Boolean podeAposentar = idadeParaAposentar && tempoContribuicaoSuficiente;

        if(podeAposentar) {
            System.out.println("Você pode se aposentar!");
        } else {
            System.out.println("Você ainda não pode se aposentar!");
        }
        scanner.close();
    }
}
