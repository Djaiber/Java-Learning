package SalesPoints;

public abstract class User {
    protected String userID;
    protected String nameUser;
    protected String password;
    protected String registerDate;


    public User(String userID, String nameUser, String password, String registerDate) {
        this.userID = userID;
        this.nameUser= nameUser;
        this.password = password;
        this.registerDate = registerDate;
    }

    protected User(String password) {
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
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public abstract boolean verifyLogin(String userID, String password);
}