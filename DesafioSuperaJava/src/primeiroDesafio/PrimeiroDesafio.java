package primeiroDesafio;

import java.util.*;

/**
 * Dev: @john
 */
public class PrimeiroDesafio {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de número: ");
        int numero = scanner.nextInt();

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for(int i = 0; i < numero; i++){
            System.out.print(  + i + 1 + ":" + " Número = ");
            int valor = scanner.nextInt();
            if(valor % 2 == 0){
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }

        Collections.sort(pares);

        Collections.sort(impares, Comparator.reverseOrder());

        for(int valor : pares ){
            System.out.println("Números pares em ordem crecente " + valor);
        }

        System.out.println("====================================================");

        for(int valor : impares){
            System.out.println("Números impares em ordem decrescente " + valor);
        }
        scanner.close();
    }
}
