package com.example.data_insertion;

public class Model {
    private String fxn;
    private String name;
    private String regNo;
    private String phone;
    private String year;
    private String branch;
    private String size;
    private String amtPaid;

    public Model(String fxn, String name, String regNo, String phone, String year, String branch, String size, String amtPaid) {
        this.fxn = fxn;
        this.name = name;
        this.regNo = regNo;
        this.phone = phone;
        this.year = year;
        this.branch = branch;
        this.size = size;
        this.amtPaid = amtPaid;

    }

    public String getFxn() {
        return fxn;
    }

    public void setFxn(String fxn) {
        this.fxn = fxn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAmtPaid() {
        return amtPaid;
    }

    public void setAmtPaid(String amtPaid) {
        this.amtPaid = amtPaid;
    }
}
