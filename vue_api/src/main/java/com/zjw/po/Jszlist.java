package com.zjw.po;

import java.io.Serializable;
import java.util.Date;

public class Jszlist implements Serializable {
    private Integer jid;

    private String jname;

    private String sex;

    private String onecity;

    private String twocity;

    private String therecity;

    private Date time;

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname == null ? null : jname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getOnecity() {
        return onecity;
    }

    public void setOnecity(String onecity) {
        this.onecity = onecity == null ? null : onecity.trim();
    }

    public String getTwocity() {
        return twocity;
    }

    public void setTwocity(String twocity) {
        this.twocity = twocity == null ? null : twocity.trim();
    }

    public String getTherecity() {
        return therecity;
    }

    public void setTherecity(String therecity) {
        this.therecity = therecity == null ? null : therecity.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}