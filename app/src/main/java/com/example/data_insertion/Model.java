package com.example.data_insertion;

public class Model {
    private String fxn;
    private String name;
    private int regNo;
    private int phone;
    private int year;
    private String branch;
    private String size;
    private int amtPaid;

    public Model(String fxn, String name, int regNo, int phone, int year, String branch, String size, int amtPaid) {
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

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
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

    public int getAmtPaid() {
        return amtPaid;
    }

    public void setAmtPaid(int amtPaid) {
        this.amtPaid = amtPaid;
    }
}
