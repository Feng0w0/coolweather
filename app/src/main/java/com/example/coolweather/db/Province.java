package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport {
    public int getId() {
        return id;
    }

    public String getProvincenName() {
        return provincenName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvincenName(String provincenName) {
        this.provincenName = provincenName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    private int id;
    private String provincenName;
    private  int provinceCode;

}
