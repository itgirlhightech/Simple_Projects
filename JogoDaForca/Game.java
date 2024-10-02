import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra = "programador"; //palavra que deve ser adivinhada
        StringBuilder letrasAdivinhadas = new StringBuilder("_".repeat(palavra.length()));
        int tentativas = 7;

        while (tentativas > 0 && letrasAdivinhadas.toString().contains("_")) {
            System.out.println("Palavra:  " + letrasAdivinhadas);
            System.out.println("Adivinhe uma letra: ");
            char letra = scanner.next().charAt(0);

            if (palavra.indexOf(letra) >= 0) {
                for (int i = 0; i < palavra.length(); i++) {
                    if (palavra.charAt(i) == letra) {
                        letrasAdivinhadas.setCharAt(i, letra);
                    }
                }
            } else {
                tentativas--;
                System.out.println("Letra errada! Tentativas restantes: " + tentativas);
            }

        }

        if (letrasAdivinhadas.toString().equals(palavra)) {
            System.out.println("Parabéns! Você adivinhou a palavra: " + palavra);
        } else {
            System.out.println("Você perdeu! A palavra era: " + palavra);
        }
    }
}
