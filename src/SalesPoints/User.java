package SalesPoints;

public abstract class User {
    protected String userID;
    protected String nameUser;
    protected  String emailUser;
    protected String passwordUser;
    public User(String userID, String nameUser,String emailUser, String passwordUser) {
        this.userID = userID;
        this.nameUser= nameUser;
        this.emailUser = emailUser;
        this.passwordUser = passwordUser;

    }
    public String getUserID() {
        return userID;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }
    public String getNameUser() {
        return nameUser;
    }
    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }
    public String getPasswordUser() {
        return passwordUser;
    }
    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }
    public abstract boolean verifyLogin(String userID, String password);
}