package com.phone.model;

public class Country {
    private String name;
    private String code;
    private String phoneCode;

    public Country(String name, String code, String phoneCode) {
        this.name = name;
        this.code = code;
        this.phoneCode = phoneCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }
}
