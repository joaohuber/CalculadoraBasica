import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Calculadora Básica!");
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultado = 0.0;

        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    System.exit(1); // Encerra o programa com código de erro 1
                }
                break;
            default:
                System.out.println("Operador inválido!");
                System.exit(1); // Encerra o programa com código de erro 1
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
