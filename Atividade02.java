import java.util.Scanner;

public class Atividade02 {

    public static void main(String[] args) {

        int primeiroValor = 0;
        int segundoValor = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro valor");
        primeiroValor = sc.nextInt();

        System.out.println("Informe o segundo valor");
        segundoValor = sc.nextInt();

        int soma = primeiroValor + segundoValor;
        double divisao = primeiroValor / segundoValor;
        int multiplicao = primeiroValor * segundoValor;
        int subtracao = primeiroValor - segundoValor;

        System.out.println("Soma : " + soma);
        System.out.println("Divisão : " + divisao);
        System.out.println("Multiplicacao :" + multiplicao);
        System.out.println("Subtracao " + subtracao);


    }

}
