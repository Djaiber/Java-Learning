package SalesPoints;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonMethods {



    public static int ExceptionMenuMain(int menu) throws IOException {

        while (true) {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                menu = Integer.parseInt(in.readLine());
                //Opción (25) para apagar el programa
                if (menu == 1 || menu == 2 || menu == 25) {
                    if (menu == 25) {
                        System.exit(0);
                    }
                    break;
                }
                System.out.println("Digite un número válido");
            } catch (Exception e) {
                System.out.println("Digite una opción valida");
            }
        }
        return menu;
    }

    public static int ExceptionMenuAdmin(int menu) throws IOException {

        while (true) {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                menu = Integer.parseInt(in.readLine());
                //Opción (25) para apagar el programa
                if (menu == 2) {
                    break;
                }
                System.out.println("Digite un número válido");
            } catch (Exception e) {
                System.out.println("Digite una opción valida");
            }
        }
        return menu;
    }
    public static int ExceptionMenuCliente(int menu) throws IOException {

        while (true) {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                menu = Integer.parseInt(in.readLine());
                //Opción (25) para apagar el programa
                if (menu== 1 || menu == 2 || menu == 3 || menu == 4) {
                    break;
                }
                System.out.println("Digite un número válido");
            } catch (Exception e) {
                System.out.println("Digite una opción valida");
            }
        }
        return menu;
    }
}
