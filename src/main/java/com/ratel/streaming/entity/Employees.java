package com.ratel.streaming.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @业务描述：
 * @package_name： com.ratel.mapper.entity
 * @project_name： poi-easypoi
 * @author： ratelfu@qq.com
 * @create_time： 2019-12-05 10:04
 * @copyright (c) ratelfu 版权所有
 */
public class Employees {

    private Integer id;
    private String fname;
    private String lname;
    private LocalDateTime birth;
    private LocalDate hired;
    private LocalDate separated;
    private Integer jobCode;
    private Integer storeId;

    public Employees() {
    }

    public Employees(Integer id, String fname, String lname, LocalDateTime birth, LocalDate hired, LocalDate separated, Integer jobCode, Integer storeId) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.birth = birth;
        this.hired = hired;
        this.separated = separated;
        this.jobCode = jobCode;
        this.storeId = storeId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public LocalDateTime getBirth() {
        return birth;
    }

    public void setBirth(LocalDateTime birth) {
        this.birth = birth;
    }

    public LocalDate getHired() {
        return hired;
    }

    public void setHired(LocalDate hired) {
        this.hired = hired;
    }

    public LocalDate getSeparated() {
        return separated;
    }

    public void setSeparated(LocalDate separated) {
        this.separated = separated;
    }

    public Integer getJobCode() {
        return jobCode;
    }

    public void setJobCode(Integer jobCode) {
        this.jobCode = jobCode;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", birth=" + birth +
                ", hired=" + hired +
                ", separated=" + separated +
                ", jobCode=" + jobCode +
                ", storeId=" + storeId +
                '}';
    }
}
