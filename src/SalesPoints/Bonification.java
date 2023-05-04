package SalesPoints;

import java.io.Serializable;

public class Bonification extends Shopping implements Serializable {
    float redeemedPoints;
    int bonoType;
    public Bonification(String userID,float bonoPoints, float redeemedPoints,int bonoType ) {
        super(userID, bonoPoints);
        this.redeemedPoints = redeemedPoints;
        this.bonoType = bonoType;
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
    public float getBonoPoints() {
        return super.getBonoPoints();
    }
    @Override
    public void setBonoPoints(float bonoPoints) {
        super.setBonoPoints(bonoPoints);
    }
    public int pickUpBono(){
        return (int) getBonoPoints();//casquear un método para que me devuelva un valor
    }
}
