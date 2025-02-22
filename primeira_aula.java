import java.util.Scanner;
public class primeira_aula{

public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int var1 = 0;
    int var2 = 1;
    int var3 = 3;

    int soma = var1 + var2 + var3;

    double media = (soma / 3);

    System.out.println("A soma dos numeros é: " + soma);
    System.out.println("A média dos numeros é: " + media);

    double area = (var1 * var2);
    System.out.println("A area do triangulo é: " + area);

    System.out.printf("Digite o comprimento: ");
    double comprimento = scanner.nextDouble();
    System.out.printf("Digite o largura: ");
    double largura = scanner.nextDouble();
    System.out.printf("Digite o profundidade: ");
    double profundide = scanner.nextDouble();

    double volume = (comprimento * largura * profundidade);

    double valor = (volume * 100);

    System.out.format("O valor da obra vai ser de R$%.2f%n", valor);

    scanner.close();
    }
}