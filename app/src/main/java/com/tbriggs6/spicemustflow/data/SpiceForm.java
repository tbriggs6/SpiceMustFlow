package com.tbriggs6.spicemustflow.data;

import java.util.Objects;

public class SpiceForm {
    int spiceFormID;
    int spiceID;
    String formName;
    double formAmount;


    public SpiceForm(int spiceFormID, int spiceID, String formName, double amount) {
        this.spiceID = spiceID;
        this.spiceFormID = spiceFormID;
        this.formName = formName;
        this.formAmount = amount;
    }


    public int getSpiceFormID() {
        return spiceFormID;
    }

    public void setSpiceFormID(int spiceFormID) {
        this.spiceFormID = spiceFormID;
    }

    public int getSpiceID() {
        return spiceID;
    }

    public void setSpiceID(int spiceID) {
        this.spiceID = spiceID;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public double getFormAmount() {
        return formAmount;
    }

    public void setFormAmount(double formAmount) {
        this.formAmount = formAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpiceForm that = (SpiceForm) o;
        return spiceFormID == that.spiceFormID && spiceID == that.spiceID && Double.compare(that.formAmount, formAmount) == 0 && Objects.equals(formName, that.formName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spiceFormID, spiceID, formName, formAmount);
    }

    @Override
    public String toString() {
        return "SpiceForms{" +
                "spiceFormID=" + spiceFormID +
                ", spiceID=" + spiceID +
                ", formName='" + formName + '\'' +
                ", formAmount=" + formAmount +
                '}';
    }
}
