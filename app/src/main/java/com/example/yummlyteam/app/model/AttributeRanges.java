
package com.example.yummlyteam.app.model;

import com.google.gson.annotations.SerializedName;

public class AttributeRanges {

    @SerializedName("flavor-piquant")
    private FlavorPiquant flavorPiquant;

    public FlavorPiquant getFlavorPiquant() {
        return flavorPiquant;
    }

    public void setFlavorPiquant(FlavorPiquant flavorPiquant) {
        this.flavorPiquant = flavorPiquant;
    }

}
