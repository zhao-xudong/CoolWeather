package com.example.zhaoxudong.coolweather.db;

/**
 * Created by 赵旭东 on 2018/4/29.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;//省份名字
    private int provinceCode;//省份代码
    public int getId(){//Id
        return id;
    }
    public void setId(int id){//id修改器
        this.id=id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){//provinceName修改器
        this.provinceName=provinceName;
    }
    public  int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){//provinceCode修改器
        this.provinceCode=provinceCode;
    }
    //最后一个花括号分界线
}
