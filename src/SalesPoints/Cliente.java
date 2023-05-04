package SalesPoints;

import java.io.Serializable;

public class Cliente extends User implements Serializable {

    protected String resgisterDate;
    public Cliente(String userID, String nameUser, String emailUser, String passwordUser, String resgisterDate) {
        super(userID,nameUser,emailUser,passwordUser);
        this.resgisterDate= resgisterDate;
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
    public String getPasswordUser() {
        return super.getPasswordUser();
    }
    @Override
    public void setPasswordUser(String passwordUser) {
        super.setPasswordUser(passwordUser);
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
    public boolean verifyLogin(String userID, String password) {
        return false;
    }

}
