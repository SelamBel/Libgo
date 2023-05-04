package com.mycompany.libreria;
import java.util.Scanner;

/**
 * Pequeña librería que me facilitará el castigo divino que es programar
 * @author SelamBel
 * @version 1.1.3
 */
public class Libreria {
    public static Scanner sc = new Scanner(System.in);
    
    /**
     * @param texto: texto que aparecerá cada vez que se pida el dato
     * @param start: el valor mínimo permitido
     * @param end: el valor máximo permitido
     * @return el valor que de el usuario
     */
    public static int getInt(String texto, int start, int end) {

        while (true) {
            int num;
            System.out.println(texto);

            if (!sc.hasNextInt()) {
                System.err.println("ERROR. Debes introducir solo números.\n");
                sc.next();
                continue;
            }
            
            num = sc.nextInt();

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
            int num;
            System.out.println(texto);
            if (!sc.hasNextInt()) {
                System.err.println("ERROR. Debes introducir solo números.\n");
                sc.next();
                continue;
            }
            
            num = sc.nextInt();

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
            System.out.println(texto);           

            if (!sc.hasNextInt()) {
                System.err.println("ERROR. Debes introducir solo números.\n");
                sc.next();
                continue;
            }
            
            return sc.nextInt();  
        }

    }
    
    /**
     * @param texto: texto que aparecerá cada vez que se pida el dato
     * @param start: el valor mínimo permitido
     * @param end: el valor máximo permitido
     * @return el valor que de el usuario
     */
    
    public static double getDouble(String texto, int start, int end) {

        while (true) {
            double num;
            System.out.println(texto);

            if (!sc.hasNextDouble()) {
                System.err.println("ERROR. Debes introducir solo números.\n");
                sc.next();
                continue;
            }
            
            num = sc.nextDouble();

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
            double num;
            System.out.println(texto);
            
            if (!sc.hasNextDouble()) {
                System.err.println("ERROR. Debes introducir solo números.\n");
                sc.next();
                continue;
            }
            
            num = sc.nextDouble();

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
            System.out.println(texto);
            String answer = sc.nextLine();

            if (!sc.hasNextDouble()) {
                System.err.println("ERROR. Debes introducir solo números.\n");
                sc.next();
                continue;
            }
            
            return sc.nextDouble();          
        }

    }

    /**
     * @param texto: texto que aparecerá cada vez que se pida el dato
     * @return el texto que de el usuario
     */
    
    public static String getLine(String texto) {
        while (true) {
            System.out.println(texto);
            String answer = sc.nextLine();

            if (!answer.isBlank() && !answer.isEmpty()) {
                return answer;
            }

            System.err.println("ERROR. Introduce valor");
            System.out.println("");
        }
    }
}
