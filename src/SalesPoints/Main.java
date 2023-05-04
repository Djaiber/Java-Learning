package SalesPoints;

import java.io.*;


public class Main {


    public static void main(String[] args)throws IOException {

        Admin admin = new Admin("125467","Martha","martha54leo@gmail.com","de8todo23");
        Cliente cliente1 = new Cliente("646416","Jaiber Diaz","djaiver9@gmailcom","jaibL123", "2023/05/04");


        FileOutputStream fileOutputStream = new FileOutputStream("ObjetoAdmin.txt");
        ObjectOutputStream objectOutStream = new ObjectOutputStream(fileOutputStream);
        objectOutStream.writeObject(admin);
        objectOutStream.close();





        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));



        System.out.println("------DISTRIPIZZA POINTS------");
        System.out.println("1. Login");
        System.out.println("2. Sing in");
        int menu = Integer.parseInt(in.readLine());
        switch (menu) {
            case 1:
                System.out.println("\t Ingrese su nombre de usuario: ");
                String userNameAux = in.readLine();
                if (userNameAux== "Martha"){
                    System.out.println("Ingresó como administrador");
                }
                System.out.println("\t Ingrese su password:");
                String passwordAux = in.readLine();

            //---------------------------------------------//
            case 2:



                break;

            default:
                // code to execute if expression doesn't match any of the specified values
        }

    }
}