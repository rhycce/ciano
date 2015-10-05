
package com.vangh.Vangh.datatype;

import com.google.gson.annotations.SerializedName;

/**
 * Created by janet on 10/2/15.
 */
public class Package {
    @SerializedName("packageid")private int id;
    @SerializedName("weight")private double weight;
    @SerializedName("ordernumber")private int ordernumber;
    @SerializedName("content")private int content;
    @SerializedName("perishable")private boolean perishable;
    @SerializedName("fragile")private boolean fragile;
    @SerializedName("insured")private boolean insured;

    public Package(int id, double weight, int ordernumber, int content, boolean perishable, boolean fragile, boolean insured) {
        this.id = id;
        this.weight = weight;
        this.ordernumber = ordernumber;
        this.content = content;
        this.perishable = perishable;
        this.fragile = fragile;
        this.insured = insured;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(int ordernumber) {
        this.ordernumber = ordernumber;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public boolean isPerishable() {
        return perishable;
    }

    public void setPerishable(boolean perishable) {
        this.perishable = perishable;
    }

    public boolean isFragile() {
        return fragile;
    }

    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }

    public boolean isInsured() {
        return insured;
    }

    public void setInsured(boolean insured) {
        this.insured = insured;
    }


}
