import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota da primeira avaliação:");
        double nota1 =
                scanner.nextDouble();
        System.out.println("Digite a nota da segunda avaliação:");
        double nota2 =
                scanner.nextDouble();
        System.out.println("Digite a nota da terceira avaliação:");
        double nota3 =
                scanner.nextDouble();

        double media = (nota1 + nota2 +  nota3) / 3;

        System.out.println("A média da aluna é: " + media);
    }
}
