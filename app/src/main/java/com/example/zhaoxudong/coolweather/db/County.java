package com.example.zhaoxudong.coolweather.db;

/**
 * Created by 赵旭东 on 2018/4/29.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;//县名字
    private String weatherId;
    private int cityId;
    public int getId(){
        return id;
    }
    public void setId(int id){//id修改器
        this.id=id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){//县的名字的修改器
        this.countyName=countyName;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(String weatherId){
        this.weatherId=weatherId;
    }

}
