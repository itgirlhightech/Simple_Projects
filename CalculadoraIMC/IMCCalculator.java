import java.util.Scanner;

public class IMCCalculator {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);
        System.out.printf("Seu IMC é: %.2f\n", imc);
        System.out.println(classificarIMC(imc));
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificarIMC(double imc) {
        if (imc < 18.5) return "Abaixo do peso";
        else if (imc < 24.9) return "Peso normal";
        else if (imc < 29.9) return "Sobrepeso";
        else return "Obesidade";
    }

}
