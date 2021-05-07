
package com.example.yummlyteam.app.model;

import com.google.gson.annotations.Expose;

public class Attribution {

    @Expose
    private String html;
    @Expose
    private String url;
    @Expose
    private String text;
    @Expose
    private String logo;

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

}
