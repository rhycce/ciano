/*
 * (c) Copyright Selerity, Inc. 2009-2015. All rights reserved. This source code is confidential and proprietary information of Selerity Inc. and may be used only by a recipient designated by and for the purposes permitted by Selerity Inc. in writing.  Reproduction of, dissemination of, modifications to or creation of derivative works from this source code, whether in source or binary forms, by any means and in any form or manner, is expressly prohibited, except with the prior written permission of Selerity Inc..  THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A PARTICULAR PURPOSE. This notice may not be removed from the software by any user thereof.
 */

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
