package SalesPoints;

import java.io.*;
import java.util.Scanner;



public class Main {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);

        //Atributos objetos administrador
        Admin admin = new Admin("125467", "Martha", "martha54leo@gmail.com", "12345678");
        //Atributos ejemplo de objeto Cliente
        Cliente cliente1 = new Cliente("646416", "Jaiber",
                "djaiver9@gmailcom", "1234", "3173074159", "2023/05/04", 10);
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
        System.out.println("-------------------------------¡Donde tus compras cuentan!");
        System.out.println("Digite 1 para LOGIN or 2 para SIGN IN:");
        System.out.println("1. LOGIN");
        System.out.println("2. SIGN IN");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int menu =0;
        menu = CommonMethods.ExceptionMenuMain(menu);
        int goodOption = menu;

        do {
            int aux = 0;
            if (goodOption == 1) {
                System.out.println("----------------------------------------------------------");
                System.out.println("------------------------- LOGIN --------------------------");
                System.out.println("----------------------------------------------------------");
                System.out.println("\t Ingrese su nombre de usuario: ");
                String userNameAux = in.readLine();
                System.out.println("\t Ingrese su password:");
                String passwordAux = in.readLine();
                //------------------------------------------------------------------------------------------------------------------
                boolean loginAdmin = admin.login(userNameAux, passwordAux);
                if (loginAdmin) {
                    System.out.println("Ingresó como ADMINISTRADOR");
                    do {
                        System.out.println("------------------ MENÚ ADMINISTRADOR --------------------");
                        System.out.println("Digite 1 para CHECK SALES y 2 para  SALIR:");
                        System.out.println("1. CHECK SALES");
                        System.out.println("2. CHECK CONSUMERS");
                        System.out.println("3. SALIR");
                        menu = CommonMethods.ExceptionMenuAdmin(menu);
                        if (menu == 1) {
                            admin.checkSales(menu);
                            scanner.nextLine();
                        }
                        if (menu == 2) {
                            admin.checkConsumers(menu);
                            scanner.nextLine();
                        }
                    } while (menu != 3);
                    System.out.println("\t Ha salido del MENÚ ADMINISTRADOR");
                    aux = 1;
                }
                //-----------------------------------------------------------------------------------------------------------------
                boolean loginCliente;
                if (aux == 0) {
                    loginCliente = cliente1.login(userNameAux, passwordAux);

                    if (loginCliente) {
                        System.out.println("Ingresó como CLIENTE");
                        do {
                            System.out.println("------------------ MENÚ CLIENTE --------------------");
                            System.out.println("Digite 1 para REGISTER BUY; 2 para SHOW HISTORIAL; 3 para SHOW HISTORIAL; 4 para UPDATE PROFILE y 5 para SALIR:");
                            System.out.println("1. REGISTER BUY");
                            System.out.println("2. SHOW HISTORIAL");
                            System.out.println("3. PICKUP BONO");
                            System.out.println("4. UPDATE PROFILE");
                            System.out.println("5. LOG OUT");
                            menu = CommonMethods.ExceptionMenuCliente(menu);

                            if (menu == 1) {
                                System.out.println("---------------REGISTRAR COMPRA-------------------");
                                String clienteId = cliente1.getUserID();
                                String clienteName = cliente1.getNameUser();
                                Shopping registerBuy = Shopping.registerBuy(clienteId, clienteName);
                                System.out.println("DATOS COMPRA REGISTRADA:" + registerBuy);
                                float newPoints= registerBuy.getBonoPoints();
                                float oldPoints= cliente1.getBonoPoints();
                                cliente1.setBonoPoints(oldPoints+newPoints);
                                System.out.println("Puntos actualizados:"+cliente1.getBonoPoints());
                                scanner.nextLine();
                            }
                            if (menu == 2) {
                                System.out.println("---------------HISTORIAL DE COMPRAS-------------");
                                String clienteId = cliente1.getUserID();
                                Shopping.showHistorial(clienteId);
                                scanner.nextLine();
                                //Crear un query para que muestre todos los registros del cliente ingresado
                            }
                            if (menu == 3) {
                                //¿Implementarlo en el main o en una clase?
                                System.out.println("---------------RECLAMAR RECOMPENSAS-------------");
                                System.out.println("Escogiendo recompensa...");
                                System.out.println("TIPO DE RECOMPENSA");
                                System.out.println("1. Adiós Sueño (50 Puntos)");
                                System.out.println("2. Adiós Hambre (100 Puntos)");
                                System.out.println("3. No traigo Almuerzo (200 Puntos)");
                                int bonoOption = Integer.parseInt(in.readLine());
                                Bonification.pickUpBono(bonoOption);

                                scanner.nextLine();
                                //De acuerdo a los atributos elegir una de las tres recompensas
                            }
                            if (menu == 4) {
                                System.out.println("--------------ACTUALIZAR PERFIL-------------------");
                                //Retorna un nuevo objeto
                                Cliente UpdateProfile = Cliente.UpdateProfile(menu);
                                //GUARDAR TABLA CLIENTES
                                scanner.nextLine();
                            }
                        }
                        while (menu != 5);
                        System.out.println("Ha salido del MENÚ CLIENTE");
                    }
                }
            }
            if (goodOption == 2) {
                System.out.println("----------------------------------------------------------");
                System.out.println("------------------------ SIGN IN -------------------------");
                System.out.println("----------------------------------------------------------");
                //Método para registrar un nuevo cliente
                Cliente registered = Cliente.registerCliente(goodOption);
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