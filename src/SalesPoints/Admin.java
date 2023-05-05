package SalesPoints;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public class Admin extends User implements Serializable{


    public Admin (String userID, String nameUser, String emailUser, String password) {
        super (userID,nameUser,emailUser,password);
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
        int optionAdmin = Integer.parseInt(in.readLine());
        while (optionAdmin != 1 && optionAdmin != 2) {
            System.out.println("!Opción no válida");
            System.out.println("Ingrese una nueva opción:");
            optionAdmin = Integer.parseInt(in.readLine());
        }
        return optionAdmin;
    }
    public int checkSales(int lookSales) throws IOException{
        System.out.println("REVISANDO LAS VENTAS");
        System.out.println("\tDigite 2 para SALIR:");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int optionAdmin = Integer.parseInt(in.readLine());
        while (optionAdmin != 2) {
            System.out.println("!Opción no válida");
            System.out.println("Ingrese una nueva opción:");
            optionAdmin = Integer.parseInt(in.readLine());
        }
        return optionAdmin;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "userID='" + userID + '\'' +
                ", nameUser='" + nameUser + '\'' +
                ", emailUser='" + emailUser + '\'' +
                '}';
    }
}
