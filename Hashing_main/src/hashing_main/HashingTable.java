/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing_main;

/**
 *
 * @author prompt
 */
public class HashingTable {
    
    public int[] hasharray;
    private int arraysize;
    
    
    public HashingTable(int temp){
    
    hasharray=new int[temp];
    arraysize=temp;
    }
    
    public int hashfunction(int temp){
    
    return temp % arraysize;
    }
    
    public void insert(int val){
    
    int v=hashfunction(val);
    int temp=0;
    if(hasharray[v]==0)
        hasharray[v]=val;
    
    else{
    while(hasharray[v]!=0 && temp!=arraysize){
    v++;
    temp++;
    if(hasharray[v]==0){
        hasharray[v]=val;
        break;}
    }//while ends
    
    } //else ends
    }// function ends
    
    public void display(){
     
        for (int i = 0; i < arraysize; i++) {
            //if(hasharray[i]!=0)
                System.out.println("    "+hasharray[i]);
        }
    
    }
    
    public int find(int finder){
    
    int v=hashfunction(finder);
    int temp=0;
    int tem=0;
    if(hasharray[v]==finder)
        temp=v;
    else{
    while(hasharray[v]!=finder && temp!=arraysize){
    v++;
    temp++;  
    }
    if(hasharray[v]==finder){
        tem=v;
    }//
    
    }//else ends
    
    return tem;
    }
    
    public void delete(int valdel){
    
    int v=find(valdel);
    hasharray[v]=0;
    
    }
    
}
