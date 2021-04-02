package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

//县
public class County extends LitePalSupport {
    private int id;
    private String countyName;//县的名字
    private String weatherId;//县的id
    private int cityId;//所属市的id

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
