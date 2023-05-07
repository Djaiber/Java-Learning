package SalesPoints;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente extends User implements Serializable {

    protected String phoneNumber;
    protected String resgisterDate;
    protected float bonoPoints;
    private final String userId1;


    public Cliente(String userID, String nameUser, String emailUser, String passwordUser, String phoneNumber, String resgisterDate, float bonoPoints) {
        super(userID,nameUser,emailUser,passwordUser);
        this.phoneNumber = phoneNumber;
        this.resgisterDate= resgisterDate;
        this.bonoPoints = bonoPoints;
        this.userId1 = "";

    }

    public Cliente(String userID, float bonoPoints) {
        super(userID);
        this.userId1 = "";
        this.bonoPoints = bonoPoints;
    }

    @Override
    public String getUserID() {
        return super.getUserID();
    }
    @Override
    public void setUserID(String userID) {
        super.setUserID(userID);
    }
    @Override
    public String getNameUser() {
        return super.getNameUser();
    }
    @Override
    public void setNameUser(String nameUser) {
        super.setNameUser(nameUser);
    }

    @Override
    public String getEmailUser() {
        return super.getEmailUser();
    }

    @Override
    public void setEmailUser(String emailUser) {
        super.setEmailUser(emailUser);
    }
    @Override
    public String getPasswordUser() {
        return super.getPasswordUser();
    }
    @Override
    public void setPasswordUser(String passwordUser) {
        super.setPasswordUser(passwordUser);
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getBonoPoints() {
        return bonoPoints;
    }

    public void setBonoPoints(float bonoPoints) {
        this.bonoPoints = bonoPoints;
}

    public String getResgisterDate() { return resgisterDate;}
    public void setResgisterDate(String resgisterDate) {this.resgisterDate = resgisterDate;}

    //Método para registrar un nuevo cliente
    public static Cliente registerCliente(int goodOption) throws IOException, ClassNotFoundException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int randomUserID = (int) (Math.random() * 999999);
        String ClienteIDAux = Integer.toString(randomUserID);
        System.out.println("Ingrese su nombre:");
        String ClienteUserNameAux = in.readLine();
        System.out.println("Ingrese su correo:");
        String ClienteEmailUserAux = in.readLine();
        System.out.println("Ingrese su Contraseña:");
        String ClientePasswordUserAux = in.readLine();
        System.out.println("Ingrese su teléfono:");
        String ClientePhoneNumberAux = in.readLine();

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
        System.out.println("------CLIENTE REGISTRADO------");
        System.out.println(savedcliente);
        objectInputStreamCliente.close();

        return clienteNew;
    }

    //Método para ingresar como cliente
    @Override
    public int login(String userID, String password) throws IOException {
        System.out.println("Ingresó como CLIENTE");
        System.out.println("------------------ MENÚ CLIENTE --------------------");
        System.out.println("Digite 1 para REGISTER BUY; 2 para SHOW HISTORIAL; 3 para UPDATE PROFILE y 4 para SALIR:");
        System.out.println("1. REGISTER BUY");
        System.out.println("2. SHOW HISTORIAL");
        System.out.println("3. UPDATE PROFILE");
        System.out.println("4. SALIR");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int menu =0;
        menu = CommonMethods.ExceptionMenuCliente(menu);
        return menu;
    }
    //Formato CSV
    @Override
    public String toString() {
        return userID +
                ";" + nameUser +
                ";" + emailUser +
                ";" + phoneNumber +
                ";" + passwordUser +
                ";" + resgisterDate +
                ";"+ bonoPoints;
    }
}
