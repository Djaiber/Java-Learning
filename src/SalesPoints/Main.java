package SalesPoints;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {


    public static void main(String[] args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));


        System.out.println("------DISTRIPIZZA POINTS------\n");
        System.out.println("1. Login\n");
        System.out.println("2. Sing in\n");
        int menu = Integer.parseInt(in.readLine());
        switch (menu) {
            case 1:
                System.out.println("\t Ingrese su nombre de usuario:\n ");
                String userNameAux = in.readLine();
                System.out.println("\t Ingrese su password:\n");
                String passwordAux = in.readLine();
                if (userNameAux == Admin.getAdminName()) {
                    System.out.println("Ingresó como Administrador\n");
                    break;
                }
            //---------------------------------------------//
            case 2:



                break;

            default:
                // code to execute if expression doesn't match any of the specified values
        }
        Admin admin = new Admin("Martha","martha54leo@gmail.com","de8todo23");
        Cliente cliente1 = new Cliente("Juanito", "jaunito33@gmail.com","317304511","sghd549");
    }
}