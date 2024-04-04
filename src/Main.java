import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número natural: ");
        int numeroIngresado = scanner.nextInt();

        System.out.println("Utilizando el ciclo while:");
        int numeroNatural1 = 1;
        while (numeroNatural1 <= numeroIngresado) {
            int cuadrado = numeroNatural1 * numeroNatural1;
            System.out.println(numeroNatural1 + " * " + numeroNatural1 + " = " + cuadrado);
            numeroNatural1++;
        }

        System.out.println("\n Utilizando el ciclo for:");
        for (int numeroNatural2 = 1; numeroNatural2 <= numeroIngresado; numeroNatural2++) {
            int cuadrado = numeroNatural2 * numeroNatural2;
            System.out.println(numeroNatural2 + " * " + numeroNatural2 + " = " + cuadrado);
        }

        System.out.println("\n Utilizando el ciclo do-while:");
        int numeroNatural3 = 1;
        do {
            int cuadrado = numeroNatural3 * numeroNatural3;
            System.out.println(numeroNatural3 + " * " + numeroNatural3 + " = " + cuadrado);
            numeroNatural3++;
        } while (numeroNatural3 <= numeroIngresado);

        scanner.close();
    }
}
