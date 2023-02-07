package com.example.myapplication;

public class NOTEMODEL {
    String BRAND;
    String MODEL;
    int SIZE;
    String DESCRIPTION;

    public NOTEMODEL(String BRAND, String MODEL, int SIZE, String DESCRIPTION) {
        this.BRAND = BRAND;
        this.MODEL = MODEL;
        this.SIZE = SIZE;
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getBRAND() {
        return BRAND;
    }

    public void setBRAND(String BRAND) {
        this.BRAND = BRAND;
    }

    public String getMODEL() {
        return MODEL;
    }

    public void setMODEL(String MODEL) {
        this.MODEL = MODEL;
    }

    public int getSIZE() {
        return SIZE;
    }

    public void setSIZE(int SIZE) {
        this.SIZE = SIZE;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
}
