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
public class Linklist {
  private node root;
 
  public Linklist(){
  this.root=null;
   }
  public boolean isemphty(){
  return (this.root==null);
  }
 public void insertatfirst(String val){
 node newnode=new node(val);
 newnode.setnode(this.root);
 root=newnode;
    }
 public void insertatend(String val){
 node current=this.root;
 node newnode=new node(val);
 if(!isemphty()){
 while(current.getnode()!=null){
 current=current.getnode();
 }
 current.setnode(newnode);
 }else{this.root=newnode;}
 }
 public void displaylist(){
 node current=this.root;
 while(current!=null){
   current.display();
   current=current.getnode();
 }
 }

   public String find(String data) {
        node current=root;
        node temp=null;
try{        while(!current.equals(temp)&&!current.getdata().equals(data)){
        current=current.getnode();
        }}catch(NullPointerException e){}
        if(current==null){
        return "no value";
        }else{
        return current.getdata();}
    }
   public void display(){
node current=root;
       //System.out.println(" "+current.getData());
   while(current!=null){
       System.out.println(" hh");
   current.display();
   current=current.getnode();
   }
    }
};
