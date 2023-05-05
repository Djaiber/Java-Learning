package SalesPoints;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;


public class Shopping extends Cliente implements Serializable {
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

    private String shoppingCode;
    private String shoppingDate;
    private float value;

    public Shopping(String userID, String shoppingCode, String shoppingDate, float value, float bonoPoints) {
        super(userID, bonoPoints);//Tengo que heredar todos los atributos? Solamente necesito un atributo
        this.shoppingCode = shoppingCode;
        this.shoppingDate = shoppingDate;
        this.value = value;

    }

    public Shopping(String userID, float bonoPoints) {
        super(userID, bonoPoints);
    }

    public String getShoppingCode() {
        return shoppingCode;
    }

    public void setShoppingCode(String shoppingCode) {
        this.shoppingCode = shoppingCode;
    }

    public String getShoppingDate() {
        return shoppingDate;
    }

    public void setShoppingDate(String shoppingDate) {
        this.shoppingDate = shoppingDate;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public float getBonoPoints() {
        return bonoPoints;
    }

    public void setBonoPoints(float bonoPoints) {
        this.bonoPoints = bonoPoints;
    }
    public String registerBuy()  {

        return null;
    }
}
