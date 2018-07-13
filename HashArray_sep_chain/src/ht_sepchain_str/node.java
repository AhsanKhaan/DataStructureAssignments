/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht_sepchain_str;

/**
 *
 * @author M.Ahsan
 */
public class node {
    private node next;
    private String data;
    public node(){
    }
    public node(String val){
    this.data=val;
    }
    public String getdata(){
    return this.data;
    }
    public node getnode(){
    return this.next;
    }
    public void setnode(node node){
    this.next=node;}
    
    public void display(){
        System.out.println(" "+this.data);
     
    }
}
