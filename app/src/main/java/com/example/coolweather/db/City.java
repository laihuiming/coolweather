package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

//市
public class City extends LitePalSupport {
    private int id;
    private String cityName;//市的名字
    private int cityCode;//市的代号
    private int provinceId;//所属省的id值
    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }

    public String getCityName(){
        return cityName;
    }
    public void setCityName(){
        this.cityName = cityName;
    }

    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(){
        this.cityCode = cityCode;
    }

    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(){
        this.provinceId = provinceId;
    }
}
