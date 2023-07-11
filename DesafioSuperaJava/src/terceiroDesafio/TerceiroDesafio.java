package terceiroDesafio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    dev @john
 */

public class TerceiroDesafio {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = scanner.nextInt();

        System.out.print(" Digite um valor do alvo: ");
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print( + i + 1 + " Número Array: ");
            arr[i] = scanner.nextInt();
        }

        int count = contPares(arr, k);

        System.out.println("O número de pares que satisfazem o critério é:  "+ count);
    }

    private static int contPares(int[] arr, int k) {
        int count = 0;

        // Cria um mapa para armazenar a frequência dos elementos do array
        Map<Integer, Integer> frequanciaMap = new HashMap<>();
        for (int num : arr) {
            frequanciaMap.put(num, frequanciaMap.getOrDefault(num, 0) + 1);
        }

        // Itera sobre os elementos do array
        for (int num : arr) {
            // Verifica se existe um par com a diferença igual a k
            if (frequanciaMap.containsKey(num - k)) {
                count += frequanciaMap.get(num - k);
            }
        }

        return count;
    }
}