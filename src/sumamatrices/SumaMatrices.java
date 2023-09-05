package sumamatrices;

import java.util.Scanner;

public class SumaMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------Escuela Tecnológica Instituto Técnico Central-----------");
        System.out.println("------------Bienvenidos al programa de la Suma de Matrices 1----------");
        System.out.println("----------------Realizado por: Nicolas Moreno Jiménez----------------------");
        System.out.println("\nA continuación encontrarán un menú por favor, elegir bien la opción correcta.");

        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] matrizResultado = new int[3][3];

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Llenar Matriz 1");
            System.out.println("2. Llenar Matriz 2");
            System.out.println("3. Sumar Matrices");
            System.out.println("4. Mostrar Matrices");
            System.out.println("0. Salir");
            System.out.print("\nSeleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nLlenar Matriz 1:");
                    llenarMatriz(matriz1, scanner);
                    break;
                case 2:
                    System.out.println("\nLlenar Matriz 2:");
                    llenarMatriz(matriz2, scanner);
                    break;
                case 3:
                    sumarMatrices(matriz1, matriz2, matrizResultado);
                    System.out.println("\nMatrices sumadas correctamente.");
                    break;
                case 4:
                    System.out.println("\nMatriz 1:");
                    mostrarMatriz(matriz1);
                    System.out.println("\nMatriz 2:");
                    mostrarMatriz(matriz2);
                    System.out.println("\nMatriz Resultado:");
                    mostrarMatriz(matrizResultado);
                    break;
                case 0:
                    System.out.println("\nPrograma Terminado con éxito :).");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }

    public static void llenarMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("\nPor favor ingrese el elemento en la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void sumarMatrices(int[][] matriz1, int[][] matriz2, int[][] matrizResultado) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
