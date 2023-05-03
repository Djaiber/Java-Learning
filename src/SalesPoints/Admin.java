package SalesPoints;

public class Admin extends User {
    protected static String adminName = "Martha";
    protected String adminEmail;
    public Admin (String adminName, String adminEmail, String password) {
        super (password);
        this.adminName = adminName;
        this.adminEmail = adminEmail;

    }


    public static String getAdminName() {
        return adminName;
    }
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }
    public String getAdminEmail() {
        return adminEmail;
    }


    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }


    public void checkSales(){
    }

    @Override
    public boolean verifyLogin(String adminNameAux, String adminEmailAux) {
        if (adminNameAux == getAdminName()&& adminEmailAux==adminEmail) {
           System.out.println("HA INGRESADO AL SISTEMA");
        }
        return true;
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }
}
