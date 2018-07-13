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
public class Node {
    private int idata;
    private Node nextnode;
    //null constructor
    public Node(){
    
    }
    //parametrized constructor
    public Node(int val){
    this.idata=val;
    }
    //parametrized constructor
    public Node(int val,Node next){
    this.idata=val;
    this.nextnode=next;
    }
    //settter for attributes
    public void setdata(int idata){
    this.idata=idata;
    }
    public void setnextnode(Node next){
    this.nextnode=next;
    }
    //getter for attributes
    public int getdata(){
    return this.idata;
    }
    public Node getnextnode(){
    return this.nextnode;
    }   
    public String toString(){
     
        String node="";
        if (node==null) {
            return node+="no value ";
        }
        node+=("Node consist of:(data:\t"+this.idata+" )");
    //node+=("nextnode:"+this.nextnode+")");
    return node;
    }
};
