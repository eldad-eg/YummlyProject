
package com.example.yummlyteam.app.model;

import com.google.gson.annotations.SerializedName;

public class NutritionRestrictions {

    @SerializedName("FAT")
    private FAT fAT;

    public FAT getFAT() {
        return fAT;
    }

    public void setFAT(FAT fAT) {
        this.fAT = fAT;
    }

}
