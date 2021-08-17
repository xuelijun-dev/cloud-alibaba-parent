package com.xue.dto;

import java.util.List;

public class DbServiceKitVo {
    private int a;
    private String str;
    private DdOrgVo dbOrgVo;
    private List<String> areaIds;


    public DbServiceKitVo() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public DdOrgVo getDbOrgVo() {
        return dbOrgVo;
    }

    public void setDbOrgVo(DdOrgVo dbOrgVo) {
//        this.dbOrgVo = dbOrgVo;
    }

    public List<String> getAreaIds() {
        return areaIds;
    }

    public void setAreaIds(List<String> areaIds) {
        this.areaIds = areaIds;
    }

    @Override
    public String toString() {
        return "DbServiceKitVo{" +
                "a=" + a +
                ", str='" + str + '\'' +
                ", dbOrgVo=" + dbOrgVo +
                ", areaIds=" + areaIds +
                '}';
    }
}
