/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nttdata.JRestService.model;

import java.io.Serializable;

/**
 *
 * @author AndresOsorio
 */
public class ModelResponse implements Serializable{
    private String f_name="Jhonatan";
    private String s_name="Andres";
    private String fl_name;
    private String sl_name;
    private String phone;
    private String dir;
    private String city;

    /**
     * @return the f_name
     */
    public String getF_name() {
        return f_name;
    }

    /**
     * @param f_name the f_name to set
     */
    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    /**
     * @return the s_name
     */
    public String getS_name() {
        return s_name;
    }

    /**
     * @param s_name the s_name to set
     */
    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    /**
     * @return the fl_name
     */
    public String getFl_name() {
        return fl_name;
    }

    /**
     * @param fl_name the fl_name to set
     */
    public void setFl_name(String fl_name) {
        this.fl_name = fl_name;
    }

    /**
     * @return the sl_name
     */
    public String getSl_name() {
        return sl_name;
    }

    /**
     * @param sl_name the sl_name to set
     */
    public void setSl_name(String sl_name) {
        this.sl_name = sl_name;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the dir
     */
    public String getDir() {
        return dir;
    }

    /**
     * @param dir the dir to set
     */
    public void setDir(String dir) {
        this.dir = dir;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    
}
