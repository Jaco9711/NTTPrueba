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
public class ModelRequest implements Serializable {
    private int id;
    private char t_doc;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the t_doc
     */
    public char getT_doc() {
        return t_doc;
    }

    /**
     * @param t_doc the t_doc to set
     */
    public void setT_doc(char t_doc) {
        this.t_doc = t_doc;
    }


}
