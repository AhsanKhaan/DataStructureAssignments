/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht_sepchain_str;


/**
 *
 * @author prompt
 */
public class HashTable {
   
       private Linklist[] hashtable;
    private int maxsize;
    private int currentsize;
    
    public int getmaxsize(){
    return this.maxsize;
    }
    public Linklist[] gethashtable(){
    return this.hashtable;
    }
    
    public HashTable(int temp){
    this.maxsize=temp;
    this.currentsize=0;
    this.hashtable=new Linklist[maxsize];
        for (int i = 0; i < this.maxsize; i++) {
            hashtable[i]=new Linklist();
        }
    
    }
    
    public void insert(String key){
    int v=hashfunction(key);
    hashtable[v].insertatend(key);
    }
    
    
    
    public String find(String key)throws StringIndexOutOfBoundsException{
    int v=hashfunction(key);
   if(this.hashtable[v]!=null){
    // hashtable[v].find(key);
    return hashtable[v].find(key);
    }else{
   return "no value ";
   }
    }
    
    
    
    public int hashfunction(String key){
    int hashval=key.charAt(0)-96;
        for (int i = 1; i < key.length(); i++) {
         int letter=key.charAt(i)-96;
         hashval=hashval*27+letter;
        }
        return hashval%this.maxsize;
    }
    
    
    public void display(){
        for (int i = 0; i < maxsize; i++) {
            System.out.println("i: "+i);
            this.hashtable[i].displaylist();
            System.out.println();
        }
    
    }
  public String toString(){
  String result=" ";
      for (int i = 0; i < 10; i++) {
          result+=this.hashtable[i].toString() +"\n";
      }
  return result;
  
  }  
};
