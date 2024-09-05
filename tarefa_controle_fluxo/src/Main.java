import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, bem vindo ao calculador de médias!");
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4)/4;

        if (media >= 7){
            System.out.printf("Parabéns, sua média é %.2f, está APROVADO!", media);
        } else if (media >= 5) {
            System.out.printf("Sua média é %.2f, você está em RECUPERAÇÃO!", media);
        } else {
            System.out.printf("Sua média é %.2f, você está REPROVADO!", media);
        }
    }
}