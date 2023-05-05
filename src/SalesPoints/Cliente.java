package SalesPoints;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

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

    public String registerUser(){
        System.out.println("REGISTRAR NUEVO CLIENTE");
        System.out.println("Ingrese su nombre:");
        return null;
    }
    public String getResgisterDate() {
        return resgisterDate;
    }
    public void setResgisterDate(String resgisterDate) {
        this.resgisterDate = resgisterDate;
    }
    @Override
    public int login(String userID, String password) throws IOException {
        System.out.println("Ingresó como CLIENTE");
        System.out.println("------------------ MENÚ CLIENTE --------------------");
        System.out.println("Digite 1 para CHECK SALES y 2 para  SALIR:");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int optionCliente = Integer.parseInt(in.readLine());
        return optionCliente;
    }

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
