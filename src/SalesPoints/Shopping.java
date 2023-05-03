package SalesPoints;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shopping {
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));


    private String shoppingCode;
    private String shoppingDate;
    private float value;
    private float bonoPoints;
    public Shopping(String shoppingCode, String shoppingDate, float value, float bonoPoints) {
        this.shoppingCode = shoppingCode;
        this.shoppingDate = shoppingDate;
        this.value = value;
        this.bonoPoints = bonoPoints;
    }

    public static String getShoppingCode() {
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
