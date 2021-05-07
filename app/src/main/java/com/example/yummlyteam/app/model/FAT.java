
package com.example.yummlyteam.app.model;

import com.google.gson.annotations.Expose;

public class FAT {

    @Expose
    private Integer min;
    @Expose
    private Integer max;

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

}
