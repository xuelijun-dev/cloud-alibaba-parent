package com.xue.dto;

import java.util.Date;

public class DdOrgVo {
    private int orgId;
    private String orgStr;
    private Long orgLong;
    private Date crtTm;
    private Date updTm;

    public DdOrgVo() {
        this.orgId = 12;
        this.orgStr = "orgStr";
        this.orgLong = 13L;
        this.crtTm = new Date();
        this.updTm = new Date();
    }

    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }

    public String getOrgStr() {
        return orgStr;
    }

    public void setOrgStr(String orgStr) {
        this.orgStr = orgStr;
    }

    public Long getOrgLong() {
        return orgLong;
    }

    public void setOrgLong(Long orgLong) {
        this.orgLong = orgLong;
    }

    public Date getCrtTm() {
        return crtTm;
    }

    public void setCrtTm(Date crtTm) {
        this.crtTm = crtTm;
    }

    public Date getUpdTm() {
        return updTm;
    }

    public void setUpdTm(Date updTm) {
        this.updTm = updTm;
    }

    @Override
    public String toString() {
        return "DdOrgVo{" +
                "orgId=" + orgId +
                ", orgStr='" + orgStr + '\'' +
                ", orgLong=" + orgLong +
                ", crtTm=" + crtTm +
                ", updTm=" + updTm +
                '}';
    }
}
