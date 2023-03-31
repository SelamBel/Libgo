

package com.mycompany.libreria;

import java.util.Scanner;


public class Libreria {
    public static Scanner sc = new Scanner(System.in);
    
    public static int getInt(String s, int start, int end) {

        while (true) {
            int num = start - 1;
            System.out.println(s);
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
    
    public static int getInt(String s) {

        while (true) {
            System.out.println(s);
            String answer = sc.nextLine();

            try {
                return Integer.parseInt(answer);
            } catch (Exception e) {
                System.err.println("ERROR. Debes introducir solo números.");
                System.out.println("");
            }           
        }

    }

    public static String getLine(String s) {
        while (true) {
            System.out.println(s);
            String answer = sc.nextLine();

            if (!answer.isBlank() && !answer.isEmpty()) {
                return answer;
            }

            System.err.println("ERROR. Introduce valor");
            System.out.println("");
        }
    }
}
