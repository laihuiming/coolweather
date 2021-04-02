package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

//市
public class City extends LitePalSupport {
    private int id;
    private String cityName;//市的名字
    private int cityCode;//市的代号
    private int provinceId;//所属省的id值

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
