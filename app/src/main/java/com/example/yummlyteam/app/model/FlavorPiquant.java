
package com.example.yummlyteam.app.model;

import com.google.gson.annotations.Expose;

public class FlavorPiquant {

    @Expose
    private Double min;
    @Expose
    private Integer max;

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

}
