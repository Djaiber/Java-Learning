package SalesPoints;

import java.io.Serializable;

public class Admin extends User implements Serializable {


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
    public boolean verifyLogin(String adminNameAux, String adminPasswordAux) {
        if (adminNameAux == getNameUser()&& adminPasswordAux== getPasswordUser()) {
           System.out.println("HA INGRESADO AL SISTEMA");
        }
        return true;
    }


}
