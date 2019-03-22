package com.zjw.po;

import java.io.Serializable;
import java.util.Date;

public class Wzlist implements Serializable {
    private Integer wid;

    private String wname;

    private Integer wprice;

    private Integer wfz;

    private Date wtime;

    private String wzt;

    private Integer jid;
    private String jname;

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname == null ? null : wname.trim();
    }

    public Integer getWprice() {
        return wprice;
    }

    public void setWprice(Integer wprice) {
        this.wprice = wprice;
    }

    public Integer getWfz() {
        return wfz;
    }

    public void setWfz(Integer wfz) {
        this.wfz = wfz;
    }

    public Date getWtime() {
        return wtime;
    }

    public void setWtime(Date wtime) {
        this.wtime = wtime;
    }

    public String getWzt() {
        return wzt;
    }

    public void setWzt(String wzt) {
        this.wzt = wzt == null ? null : wzt.trim();
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }
}