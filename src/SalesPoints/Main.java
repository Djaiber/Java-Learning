package SalesPoints;

import java.io.*;
import java.util.Random;


public class Main {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Admin admin = new Admin("125467", "Martha", "martha54leo@gmail.com", "12345678");
        Cliente cliente1 = new Cliente("646416", "Jaiber Diaz",
                "djaiver9@gmailcom", "jaibL123","3173074159", "2023/05/04", 0);

        FileOutputStream fileOutputStream = new FileOutputStream("ObjetoAdmin.txt");
        ObjectOutputStream objectOutStream = new ObjectOutputStream(fileOutputStream);
        objectOutStream.writeObject(admin);
        objectOutStream.close();

        FileInputStream fileInputStream = new FileInputStream("ObjetoAdmin.txt");//Método para leer los atributos del admin
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Admin martha = (Admin) objectInputStream.readObject();
        System.out.println("------ADMINISTRADOR------");
        System.out.println(martha);
        objectInputStream.close();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("----------------------------------------------------------");
        System.out.println("-------------------DISTRIPIZZA POINTS---------------------");
        System.out.println("------------------------------¡Donde tus compras cuenta!--");
        System.out.println("Digite 1 para LOGIN, 2 para SIGN IN y 3 para SALIR:");
        System.out.println("1. LOGIN");
        System.out.println("2. SIGN IN");
        System.out.println("3. SALIR");

        int menu = Integer.parseInt(in.readLine());

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

            int randomUserID = (int) ( Math.random() * 999999);
            String ClienteIDAux = Integer.toString(randomUserID);
            System.out.println("Ingrese su nombre:");
            String ClienteUserNameAux = in.readLine();
            System.out.println("Ingrese su correo:");
            String ClienteEmailUserAux = in.readLine();
            System.out.println("Ingrese su teléfono:");
            String ClientePhoneNumberAux = in.readLine();
            System.out.println("Ingrese su Contraseña:");
            String ClientePasswordUserAux = in.readLine();

            Cliente clienteNew;
            clienteNew = new Cliente(ClienteIDAux,ClienteUserNameAux,
                   ClienteEmailUserAux, ClientePhoneNumberAux,
                    ClientePasswordUserAux,"2023/20/21",0);

            System.out.println("Datos ingresados= "+ clienteNew);
            clienteNew.setUserID(null);
            clienteNew.setNameUser(null);
            clienteNew.setEmailUser(null);
            clienteNew.setPhoneNumber(null);
            clienteNew.setResgisterDate(null);
            clienteNew.setPasswordUser(null);
            System.out.println("Nuevos datos = "+ clienteNew);
        }
    }
}