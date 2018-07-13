/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasharray_sep_chain;

/**
 *
 * @author prompt
 */
public class HashTable {
   
       private LinkList[] hashtable;
    private int maxsize;
    private int currentsize;
    
    
    
    public HashTable(int temp){
    this.maxsize=temp;
    this.currentsize=0;
    this.hashtable=new LinkList[maxsize];
        for (int i = 0; i < this.maxsize; i++) {
            hashtable[i]=new LinkList();
        }
    
    }
    
    public void insert(int key){
    int v=hashfunction(key);
    hashtable[v].insertatend(key);
        
   
    }
    
    
    
    public Node find(int key){
    int v=hashfunction(key);
    return hashtable[v].find(key);
    
    }
    
    
    
    public int hashfunction(int key){
    return key%maxsize;
    }
    
    
    public void display(){
        for (int i = 0; i < maxsize; i++) {
            System.out.println("i: "+i);
            this.hashtable[i].displayList();
            System.out.println();
        }
    
    }
    
}
