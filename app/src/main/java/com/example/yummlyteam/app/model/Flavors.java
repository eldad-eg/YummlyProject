
package com.example.yummlyteam.app.model;

import com.google.gson.annotations.Expose;

public class Flavors {

    @Expose
    private Double salty;
    @Expose
    private Double sour;
    @Expose
    private Double sweet;
    @Expose
    private Double bitter;
    @Expose
    private Double meaty;
    @Expose
    private Double piquant;

    public Double getSalty() {
        return salty;
    }

    public void setSalty(Double salty) {
        this.salty = salty;
    }

    public Double getSour() {
        return sour;
    }

    public void setSour(Double sour) {
        this.sour = sour;
    }

    public Double getSweet() {
        return sweet;
    }

    public void setSweet(Double sweet) {
        this.sweet = sweet;
    }

    public Double getBitter() {
        return bitter;
    }

    public void setBitter(Double bitter) {
        this.bitter = bitter;
    }

    public Double getMeaty() {
        return meaty;
    }

    public void setMeaty(Double meaty) {
        this.meaty = meaty;
    }

    public Double getPiquant() {
        return piquant;
    }

    public void setPiquant(Double piquant) {
        this.piquant = piquant;
    }

}
