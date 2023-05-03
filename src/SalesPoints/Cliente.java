package SalesPoints;

public class Cliente extends User{
    protected String customerName;
    protected String customerEmail;
    protected String customerPhone;

    Cliente(String customerName, String customerEmail, String customerPhone, String password) {

        super(password);
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }


    public  String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName) {

        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
    public String registerUser(){
        System.out.println("REGISTRAR NUEVO CLIENTE");
        System.out.println("Ingrese su nombre:\n");
        return null;
    }
    @Override
    public boolean verifyLogin(String userID, String password) {
        return false;
    }

}
