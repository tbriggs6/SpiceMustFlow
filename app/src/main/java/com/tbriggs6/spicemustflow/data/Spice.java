package com.tbriggs6.spicemustflow.data;

import java.util.Objects;

public class Spice {
    int spiceID;

    String spiceName;
    String spiceDescription;

    int spiceImageID;

    public Spice( )
    {
        spiceID = -1;
        spiceName = null;
        spiceDescription = null;
        spiceImageID = -1;
    }

    public Spice(int spiceID, String spiceName, String spiceDescription, int spiceImageID) {
        this.spiceID = spiceID;
        this.spiceName = spiceName;
        this.spiceDescription = spiceDescription;
        this.spiceImageID = spiceImageID;
    }

    public int getSpiceID() {
        return spiceID;
    }

    public void setSpiceID(int spiceID) {
        this.spiceID = spiceID;
    }

    public String getSpiceName() {
        return spiceName;
    }

    public void setSpiceName(String spiceName) {
        this.spiceName = spiceName;
    }

    public String getSpiceDescription() {
        return spiceDescription;
    }

    public void setSpiceDescription(String spiceDescription) {
        this.spiceDescription = spiceDescription;
    }

    public int getSpiceImageID() {
        return spiceImageID;
    }

    public void setSpiceImageID(int spiceImageID) {
        this.spiceImageID = spiceImageID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spice spice = (Spice) o;
        return spiceID == spice.spiceID && spiceImageID == spice.spiceImageID && Objects.equals(spiceName, spice.spiceName) && Objects.equals(spiceDescription, spice.spiceDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spiceID, spiceName, spiceDescription, spiceImageID);
    }

    @Override
    public String toString() {
        return "Spice{" +
                "spiceID=" + spiceID +
                ", spiceName='" + spiceName + '\'' +
                ", spiceDescription='" + spiceDescription + '\'' +
                ", spiceImageID=" + spiceImageID +
                '}';
    }
}
