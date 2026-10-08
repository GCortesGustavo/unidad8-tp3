package unidad8.tp3;

import java.util.Arrays;
import java.util.List;

public class Main {

    // Método genérico
    public static <T> void imprimirLista(List<T> lista) {

        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {

        // Lista de enteros
        List<Integer> numeros = Arrays.asList(
                10, 20, 30, 40, 50
        );

        // Lista de cadenas
        List<String> nombres = Arrays.asList(
                "Juan",
                "María",
                "Pedro",
                "Lucía"
        );

        System.out.println("=== Lista de enteros ===");
        imprimirLista(numeros);

        System.out.println("\n=== Lista de cadenas ===");
        imprimirLista(nombres);
    }
}