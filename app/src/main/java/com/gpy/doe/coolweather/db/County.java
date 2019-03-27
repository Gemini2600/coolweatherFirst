package com.gpy.doe.coolweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {

    private int id;

    private String countyName;//记录县的名字

    private String weatherId;//记录县对应的天气的Id

    private int cityId;//当前县所属市的Id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

}
