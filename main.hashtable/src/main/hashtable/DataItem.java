/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.hashtable;

/**
 *
 * @author M.Ahsan
 */
public class DataItem {

    private int idata;

    public DataItem() {

    }

    public DataItem(int key) {
        this.idata = key;
    }

    public int getdata() {
        return this.idata;
    }

    public void setdata(int key) {
        this.idata = key;
    }
};
