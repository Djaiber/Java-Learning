package SalesPoints;

import java.io.*;

public class Admin extends User implements Serializable{


    public Admin (String userID, String nameUser, String emailUser, String passwordUser) {
        super (userID,nameUser,emailUser,passwordUser);
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
    public void setPasswordUser(String passwordUser) {
        super.setPasswordUser(passwordUser);
    }
    @Override
    public String getPasswordUser() {
        return super.getPasswordUser();
    }
    @Override
    public int login(String userNameAux, String passwordAuxAux) throws IOException {

        System.out.println("Ingresó como ADMINISTRADOR");
        System.out.println("------------------ MENÚ ADMINISTRADOR --------------------");
        System.out.println("Digite 1 para CHECK SALES y 2 para  SALIR:");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int menu =0;
        menu = CommonMethods.ExceptionMenuMain(menu);
        return menu;
    }
    public int checkSales(int lookSales) throws IOException, ClassNotFoundException {
        System.out.println("REVISANDO LAS VENTAS");
        //Leer fichero ObjectCliente
        FileInputStream fileInputStreamCliente = new FileInputStream("C:\\Users\\JAIBER DÌAZ\\IdeaProjects\\Java-Learning\\Ficheros\\ObjetoCliente.txt");//Método para leer los atributos del admin
        ObjectInputStream objectInputStreamCliente = new ObjectInputStream(fileInputStreamCliente);
        Cliente savedcliente = (Cliente) objectInputStreamCliente.readObject();
        System.out.println("----------------CLIENTES REGISTRADOS-----------------");
        //Método para mostrar todos los clientes registrados

        System.out.println(savedcliente);
        objectInputStreamCliente.close();
        System.out.println("\tDigite 2 para SALIR:");
        int menu =0;
        menu = CommonMethods.ExceptionMenuAdmin(menu);
        return menu;
    }
    //Formato CSV
    @Override
    public String toString() {
        return  userID +
                ';' + nameUser +
                ';' + passwordUser +
                ";" + emailUser;
    }
}
