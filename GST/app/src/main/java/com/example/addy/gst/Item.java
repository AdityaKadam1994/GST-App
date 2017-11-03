package com.example.addy.gst;

/**
 * Created by Aditya on 11/2/2017.
 */

public class Item {
    int id;
    String type;
    String description;
    String rate;
    String hsn;
    String lang;
    public Item(int id, String type, String description, String rate, String hsn, String lang) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.rate = rate;
        this.hsn = hsn;
        this.lang = lang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getHsn() {
        return hsn;
    }

    public void setHsn(String hsn) {
        this.hsn = hsn;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}

