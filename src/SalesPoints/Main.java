package SalesPoints;

import java.io.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        //Atributos objetos administrador
        Admin admin = new Admin("125467", "Martha", "martha54leo@gmail.com", "12345678");
        //Atributos ejemplo de objeto Cliente
        Cliente cliente1 = new Cliente("646416", "Jaiber Diaz",
                "djaiver9@gmailcom", "jaibL123", "3173074159", "2023/05/04", 0);
        CommonMethods numberRegistered = new CommonMethods(2);
        //Escribe los atributos de administrador en el fichero
        FileOutputStream fileOutputStreamAdmin = new FileOutputStream("C:\\Users\\JAIBER DÌAZ\\IdeaProjects\\Java-Learning\\Ficheros\\ObjetoAdmin.txt");
        ObjectOutputStream objectOutStreamAdmin= new ObjectOutputStream(fileOutputStreamAdmin);
        objectOutStreamAdmin.writeObject(admin);
        objectOutStreamAdmin.close();
        //Lee e imprime los atributos del administrador (admin)
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\JAIBER DÌAZ\\IdeaProjects\\Java-Learning\\Ficheros\\ObjetoAdmin.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Admin savedAdmin = (Admin) objectInputStream.readObject();
        System.out.println(savedAdmin);
        objectInputStream.close();



        System.out.println("----------------------------------------------------------");
        System.out.println("------------------ DISTRIPIZZA POINTS --------------------");
        System.out.println("------------------------------¡Donde tus compras cuenta!--");
        System.out.println("Digite 1 para LOGIN or 2 para SIGN IN:");
        System.out.println("1. LOGIN");
        System.out.println("2. SIGN IN");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int menu =0;
        menu = CommonMethods.ExceptionMenuMain(menu);
        int goodOption = menu;
        do {

            if (goodOption == 1) {
                System.out.println("----------------------------------------------------------");
                System.out.println("------------------------- LOGIN --------------------------");
                System.out.println("----------------------------------------------------------");
                System.out.println("\t Ingrese su nombre de usuario: ");
                String userNameAux = in.readLine();
                System.out.println("\t Ingrese su password:");
                String passwordAux = in.readLine();
                if (userNameAux.equals(admin.getNameUser()) && passwordAux.equals(admin.getPasswordUser())) {
                    int login = admin.login(userNameAux,passwordAux);
                    int checkSales = 0;
                    if (login==1){
                        checkSales = admin.checkSales(login);
                    }
                    if (login==2|| checkSales==2){
                        System.out.println("\t Ha salido del MENÚ ADMINISTRADOR");
                    }
                }
                int login = 0;
                do {
                    if (!userNameAux.equals(admin.getNameUser()) && !passwordAux.equals(admin.getPasswordUser())) {
                        login = cliente1.login(userNameAux, passwordAux);
                    }

                    if (login == 1) {
                        System.out.println("---------------REGISTRAR COMPRA-------------------");
                        Shopping.registerBuy();
                        scanner.nextLine();
                    }
                    if (login == 2) {
                        System.out.println("---------------HISTORIAL DE COMPRAS-------------");
                        Shopping.showHistorial();
                        scanner.nextLine();
                    }
                    if (login == 3) {
                        System.out.println("---------------RECLAMAR RECOMPENSAS-------------");
                        Bonification.pickUpBono();
                        scanner.nextLine();
                    }
                    if (login == 4) {
                        System.out.println("--------------ACTUALIZAR PERFIL-------------------");
                        Cliente UpdateProfile = Cliente.UpdateProfile(login);
                        scanner.nextLine();

                    }
                }while(login!=5);
                    System.out.println("SALIÓ DEL MENU CLIENTE");


            }
            if (goodOption == 2) {
                System.out.println("----------------------------------------------------------");
                System.out.println("------------------------ SIGN IN -------------------------");
                System.out.println("----------------------------------------------------------");
                //Método para registrar un nuevo cliente
                Cliente registered = Cliente.registerCliente(goodOption);
                numberRegistered.ContadorClientes = numberRegistered.ContadorClientes + 1;
                System.out.println("Número de Clientes Registrados: " + numberRegistered.ContadorClientes);
                //Limpia los atributos del objeto registered
                registered.setUserID(null);
                registered.setNameUser(null);
                registered.setEmailUser(null);
                registered.setPhoneNumber(null);
                registered.setResgisterDate(null);
                registered.setPasswordUser(null);
                System.out.println("Cliente Borrado:"+ registered);
            }
            System.out.println("----------------------------------------------------------");
            System.out.println("------------------ DISTRIPIZZA POINTS --------------------");
            System.out.println("------------------------------¡Donde tus compras cuenta!--");
            System.out.println("Digite 1 para LOGIN o 2 para SIGN IN:");
            System.out.println("1.LOGIN");
            System.out.println("2.SIGN IN");
            menu = CommonMethods.ExceptionMenuMain(menu);
            goodOption = menu;
        }while (goodOption != 25) ;
    }
}