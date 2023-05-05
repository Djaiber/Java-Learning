package SalesPoints;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;


public class Main {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Atributos objetos administrador
        Admin admin = new Admin("125467", "Martha", "martha54leo@gmail.com", "12345678");
        //Atributos ejemplo de objeto Cliente
        Cliente cliente1 = new Cliente("646416", "Jaiber Diaz",
                "djaiver9@gmailcom", "jaibL123", "3173074159", "2023/05/04", 0);
        //Escribe los atributos de administrador en el fichero
        FileOutputStream fileOutputStreamAdmin = new FileOutputStream("ObjetoAdmin.txt");
        ObjectOutputStream objectOutStreamAdmin= new ObjectOutputStream(fileOutputStreamAdmin);
        objectOutStreamAdmin.writeObject(admin);
        objectOutStreamAdmin.close();
        //Lee e imprime los atributos del administrador (admin)
        FileInputStream fileInputStream = new FileInputStream("ObjetoAdmin.txt");//Método para leer los atributos del admin
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Admin savedAdmin = (Admin) objectInputStream.readObject();
        System.out.println("------ADMINISTRADOR------");
        System.out.println(savedAdmin);
        objectInputStream.close();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("----------------------------------------------------------");
        System.out.println("-------------------DISTRIPIZZA POINTS---------------------");
        System.out.println("------------------------------¡Donde tus compras cuenta!--");
        System.out.println("Digite 1 para LOGIN or 2 para SIGN IN:");
        System.out.println("1. LOGIN");
        System.out.println("2. SIGN IN");

        int menu = Integer.parseInt(in.readLine());
        do {
            //Opción para salir del programa
            if (menu == 25) {
                break;
            }
            //Validación de opción
            while (menu != 1 && menu != 2) {
                System.out.println("!Opción no válida");
                System.out.println("Ingrese una nueva opción:");
                menu = Integer.parseInt(in.readLine());
            }
            if (menu == 1) {
                System.out.println("----------------------------------------------------------");
                System.out.println("--------------------------LOGIN---------------------------");
                System.out.println("----------------------------------------------------------");
                System.out.println("\t Ingrese su nombre de usuario: ");
                String userNameAux = in.readLine();
                System.out.println("\t Ingrese su password:");
                String passwordAux = in.readLine();
                if (userNameAux.equals(admin.getNameUser()) && passwordAux.equals(admin.getPasswordUser())) {
                    System.out.println("Ingresó como ADMINISTRADOR");
                }
            }
            if (menu == 2) {
                System.out.println("----------------------------------------------------------");
                System.out.println("-------------------------SIGN IN--------------------------");
                System.out.println("----------------------------------------------------------");

                int randomUserID = (int) (Math.random() * 999999);
                String ClienteIDAux = Integer.toString(randomUserID);
                System.out.println("Ingrese su nombre:");
                String ClienteUserNameAux = in.readLine();
                System.out.println("Ingrese su correo:");
                String ClienteEmailUserAux = in.readLine();
                System.out.println("Ingrese su teléfono:");
                String ClientePhoneNumberAux = in.readLine();
                System.out.println("Ingrese su Contraseña:");
                String ClientePasswordUserAux = in.readLine();

                //Método para crear el atributo de registerDate del Cliente
                LocalDate actualDate = LocalDate.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                String ClienteRegisterDateAux = actualDate.format(formatter);

                //Asigna los datos ingresados por teclado como atributos del objeto clienteNew
                Cliente clienteNew = new Cliente(ClienteIDAux, ClienteUserNameAux,
                        ClienteEmailUserAux, ClientePhoneNumberAux,
                        ClientePasswordUserAux, ClienteRegisterDateAux, 0);

                //Escribe los atributos de Cliente registrado en el fichero
                FileOutputStream fileOutputStreamCliente = new FileOutputStream("ObjetoCliente.txt");
                ObjectOutputStream objectOutStreamCliente = new ObjectOutputStream(fileOutputStreamCliente);
                objectOutStreamCliente.writeObject(clienteNew);
                objectOutStreamCliente.close();

                //Lee e imprime los atributos del cliente registrado (clienteNew)
                FileInputStream fileInputStreamCliente = new FileInputStream("ObjetoCliente.txt");//Método para leer los atributos del admin
                ObjectInputStream objectInputStreamCliente = new ObjectInputStream(fileInputStreamCliente);
                Cliente savedcliente = (Cliente) objectInputStreamCliente.readObject();
                System.out.println("------CLIENTE------");
                System.out.println(savedcliente);
                objectInputStreamCliente.close();

                //Limpia los atributos del objeto clienteNew
                clienteNew.setUserID(null);
                clienteNew.setNameUser(null);
                clienteNew.setEmailUser(null);
                clienteNew.setPhoneNumber(null);
                clienteNew.setResgisterDate(null);
                clienteNew.setPasswordUser(null);
                System.out.println("Nuevos datos = " + clienteNew);
            }
            System.out.println("----------------------------------------------------------");
            System.out.println("-------------------DISTRIPIZZA POINTS---------------------");
            System.out.println("------------------------------¡Donde tus compras cuenta!--");
            System.out.println("Digite 1 para LOGIN o 2 para SIGN IN:");
            System.out.println("1.LOGIN");
            System.out.println("2.SIGN IN");
            menu = Integer.parseInt(in.readLine());
            //Opción para apagar el programa
            if (menu == 25) {
                break;
            }
            //Validación de opción
            while (menu != 1 && menu != 2) {
                System.out.println("!Opción no válida");
                System.out.println("Ingrese una nueva opción:");
                menu = Integer.parseInt(in.readLine());
            }
        }while (menu != 25) ;
    }
}