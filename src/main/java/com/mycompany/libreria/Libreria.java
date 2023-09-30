package com.mycompany.libreria;

import java.util.Scanner;

/**
 * Pequeña librería que me facilitará el castigo divino que es programar
 *
 * @author SelamBel
 * @version 1.1.6
 */
public class Libreria {

    public static Scanner sc = new Scanner(System.in);

    /**
     * @param texto: texto que aparecerá cada vez que se pida el dato
     * @param start: el valor mínimo permitido
     * @param end:   el valor máximo permitido
     * @return el valor que de el usuario
     */
    public static int getInt(String texto, int start, int end) {

        while (true) {
            int num = start - 1;
            System.out.print(texto);
            String answer = sc.nextLine();

            try {
                num = Integer.parseInt(answer);

            } catch (Exception e) {
                System.err.println("ERROR. Debes introducir solo números.");
                System.out.println("");
            }

            if (num >= start && num <= end) {
                return num;
            } else {
                System.err.println("ERROR. Valor fuera de rango");
                System.out.println("");
            }
        }

    }

    /**
     * @param texto: texto que aparecerá cada vez que se pida el dato
     * @param start: el valor mínimo permitido
     * @return el valor que de el usuario
     */
    public static int getInt(String texto, int start) {

        while (true) {
            int num = start - 1;
            System.out.print(texto);
            String answer = sc.nextLine();

            try {
                num = Integer.parseInt(answer);

            } catch (Exception e) {
                System.err.println("ERROR. Debes introducir solo números.");
                System.out.println("");
            }

            if (num >= start) {
                return num;
            } else {
                System.err.println("ERROR. Valor fuera de rango");
                System.out.println("");
            }
        }

    }

    /**
     * @param texto: texto que aparecerá cada vez que se pida el dato
     * @return el valor que de el usuario
     */
    public static int getInt(String texto) {

        while (true) {
            System.out.print(texto);
            String answer = sc.nextLine();

            try {
                return Integer.parseInt(answer);

            } catch (Exception e) {
                System.err.println("ERROR. Debes introducir solo números.");
                System.out.println("");
            }
        }

    }

    /**
     * @param texto: texto que aparecerá cada vez que se pida el dato
     * @param start: el valor mínimo permitido
     * @param end:   el valor máximo permitido
     * @return el valor que de el usuario
     */
    public static double getDouble(String texto, int start, int end) {

        while (true) {
            double num = start - 1;
            System.out.print(texto);
            String answer = sc.nextLine();

            try {
                num = Double.parseDouble(answer);

            } catch (Exception e) {
                System.err.println("ERROR. Debes introducir solo números (Seperados por un punto si es decimal)");
                System.out.println("");
            }

            if (num >= start && num <= end) {
                return num;
            } else {
                System.err.println("ERROR. Valor fuera de rango");
                System.out.println("");
            }
        }

    }

    /**
     * @param texto: texto que aparecerá cada vez que se pida el dato
     * @param start: el valor mínimo permitido
     * @return el valor que de el usuario
     */
    public static double getDouble(String texto, int start) {

        while (true) {
            double num = start - 1;
            System.out.print(texto);
            String answer = sc.nextLine();

            try {
                num = Double.parseDouble(answer);

            } catch (Exception e) {
                System.err.println("ERROR. Debes introducir solo números (Seperados por un punto si es decimal)");
                System.out.println("");
            }

            if (num >= start) {
                return num;
            } else {
                System.err.println("ERROR. Valor fuera de rango");
                System.out.println("");
            }
        }

    }

    /**
     * @param texto: texto que aparecerá cada vez que se pida el dato
     * @return el valor que de el usuario
     */
    public static double getDouble(String texto) {

        while (true) {
            System.out.print(texto);
            String answer = sc.nextLine();

            try {
                return Double.parseDouble(answer);

            } catch (Exception e) {
                System.err.println("ERROR. Debes introducir solo números.");
                System.out.println("");
            }
        }

    }

    /**
     * @param texto: texto que aparecerá cada vez que se pida el dato
     * @return el texto que de el usuario
     */
    public static String getLine(String texto) {
        while (true) {
            System.out.print(texto);
            String answer = sc.nextLine();

            if (!answer.isBlank() && !answer.isEmpty()) {
                return answer;
            }

            System.err.println("ERROR. Introduce valor");
            System.out.println("");
        }
    }

    /**
     * @param opciones: Las opciones que tendrá el menú
     * @return La opción que elija el usuario del menú
     */
    public static int createMenu(String... opciones) {
        int numOpciones = opciones.length;
        for (int i = 0; i < numOpciones; i++) {
            System.out.println(opciones[i]);
        }
        return getInt("Eleccion: ", 1, numOpciones);
    }
}
