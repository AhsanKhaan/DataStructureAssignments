/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver_linklist;

/**
 *
 * @author M.Ahsan
 */
public class Dnode {

    private Dnode prevnode;
    private int idata;
    private Dnode nextnode;
    //null constructor 

    public Dnode() {
    }

    //1-parameterized constructor
    public Dnode(int data) {
        this.idata = data;
    }
    //3-parametre constructor

    public Dnode(Dnode prenode, int data, Dnode postnode) {
        this.prevnode = prenode;
        this.idata = data;
        this.nextnode = postnode;
    }
    //setter 

    public void setprevnode(Dnode prenode) {
        this.prevnode = prenode;
    }

    public void setdata(int data) {
        this.idata = data;
    }

    public void setnextnode(Dnode postnode) {
        this.nextnode = postnode;
    }
    //getter

    public Dnode getprevnode() {
        return this.prevnode;
    }

    public int getdata() {
        return this.idata;
    }

    public Dnode getnextnode() {
        return this.nextnode;
    }

    public void show() {
        String node = "";
        node += "node is to be shown in" + this.idata;
    }

    @Override
    public String toString() {
        String node = "";
        node += "Node Contains data(" + this.idata + ")";
        return node;
    }
    public Object Clone() throws CloneNotSupportedException {
        Dnode Cloned = new Dnode();
        Cloned.prevnode=this.prevnode;
        Cloned.idata=this.idata;
        Cloned.nextnode=this.nextnode;
        return Cloned;
    }
};
