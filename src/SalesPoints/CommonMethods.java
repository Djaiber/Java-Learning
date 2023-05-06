package SalesPoints;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonMethods {

    public static int ExceptionGod(int menu) throws IOException {

        while (true) {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                menu = Integer.parseInt(in.readLine());
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
}
