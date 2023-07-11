package quartoDesafio;

import java.util.Scanner;

public class QuartoDesafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de linha: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("forma incorreta: "  );
            String line = scanner.nextLine();
            String decrypLinha = descriptLinha(line);
            System.out.println("Correto: " + decrypLinha);
        }
    }

    private static String descriptLinha(String linha) {
        int length = linha.length();
        StringBuilder decrypLinha = new StringBuilder(length);

        for (int i = length / 2 - 1; i >= 0; i--) {
            decrypLinha.append(linha.charAt(i));
        }

        for (int i = length - 1; i >= length / 2; i--) {
            decrypLinha.append(linha.charAt(i));
        }

        return decrypLinha.toString();
    }
}
}
